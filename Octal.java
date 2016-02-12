import java.util.Map;
import java.util.HashMap;

public class Octal {
	private final Map<Character, Integer> OCTAL;
	{
		OCTAL = new HashMap<Character, Integer>();
		OCTAL.put('0', 0);
		OCTAL.put('1', 1);
		OCTAL.put('2', 2);
		OCTAL.put('3', 3);
		OCTAL.put('4', 4);
		OCTAL.put('5', 5);
		OCTAL.put('6', 6);
		OCTAL.put('7', 7);
	}
	
	private final String Octal;
	
	public Octal(String input) {
		this.Octal = input;
	}
	
	public int getDecimal() {
		if(Octal == null || Octal.trim().replaceAll("[0-7]", "").length()!=0)
			return 0;
		
		String tempStr = Octal.trim();
		int result = 0;
		
		for(int i=0;i<Octal.trim().length();i++) {
			result += Math.pow(8, tempStr.length()-1) * convOct(tempStr.charAt(0));
			tempStr = tempStr.substring(1);
		}
		
		return result;
	}
	
	private int convOct(char octNum) {
		return OCTAL.get(octNum);
	}
}
