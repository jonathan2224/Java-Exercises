
public class Luhn {
	private int[] luhn;
	
	public Luhn (long input) {
		String tempStr = Long.toString(input);
		luhn = new int[tempStr.length()];
		for (int i=0;i<tempStr.length();i++)
			luhn[i] = Character.getNumericValue(tempStr.charAt(i));
	}
	
	public int getCheckDigit() {
		return luhn[luhn.length-1];
	}
	
	public int[] getAddends() {
		int result[] = new int[luhn.length];
		int cntP = 0;
		
		for(int i=luhn.length-1;i>=0;i--) {
			result[i] = luhn[i];
			if (cntP % 2 == 1) {
				result[i] *= 2;
				if (result[i] > 9) 
					result[i] -=9;
			}
			cntP++;
		}
		return result;
	}
	
	public int getCheckSum() {
		int result = 0;
		for (int i=0;i<luhn.length;i++)
			result += getAddends()[i];
		return result;
	}
	
	public boolean isValid() {
		return (getCheckSum() / 10.0 == getCheckSum() / 10);
	}
	
	public static long create(long input) {
		for (long i = input*10;i<(input*10+10);i++) {
			Luhn testL = new Luhn(i);
			if (testL.isValid())
				return i;
		}
		return 0;
	}
}
