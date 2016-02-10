public class Binary {
	String binString;
	
	public Binary (String input) {
		binString = input;
	}
	
	public int getDecimal() {
		if (binString == null || 0 != binString.trim().replaceAll("1", "").replaceAll("0", "").length())
			return 0;
		
		String tempStr = binString.trim();
		int convNum = 0;
		for (int i = 0; i < binString.trim().length(); i++) {
			convNum += (Math.pow(2, tempStr.length()-1) * Character.getNumericValue(tempStr.charAt(0)));
			tempStr = tempStr.substring(1);
		}
		
		return convNum;
	}
}