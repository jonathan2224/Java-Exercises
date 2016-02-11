public class Trinary {
	public static int toDecimal(String triNum) {
		if(triNum == null || triNum.trim().replaceAll("1", "").replaceAll("2", "").replaceAll("0", "").length()!=0)
			return 0;
		
		String tempStr = triNum.trim();
		int result = 0;
		
		for(int i=0; i<triNum.length();i++) {
			result += (Math.pow(3,  tempStr.length()-1))*Character.getNumericValue(tempStr.charAt(0));
			tempStr = tempStr.substring(1);
		}
		
		return result;
	}
}