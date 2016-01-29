public class PhoneNumber {
	private String phNum;
	
	public PhoneNumber(String number) {
		phNum = formatNumber (number);
	}
	
	public String getNumber() {
		return phNum;
	}
	
	public String getAreaCode() {
		return phNum.substring(0,3);
	}
	
	public String pretty() {
		return "(" + phNum.substring(0, 3) + ") " + phNum.substring(3, 6) + "-" + phNum.substring(6, 10);
	}
	
	private String formatNumber(String number) {
		number = number.replaceAll("[^0-9]","").trim();
		System.out.println(number);
		
		switch (number.length()) {
			case 10:
				return number;
			case 11:
				if (number.startsWith("1")) {
					return number.substring(1, 11);
				}
			default:
				return "0000000000";
		}
	}
}