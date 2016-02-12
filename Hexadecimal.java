import java.util.Map;
import java.util.HashMap;

public class Hexadecimal {
	private static final Map<Character, Integer> HEXADECIMAL;
	static
	{
		HEXADECIMAL = new HashMap<Character, Integer>();
		HEXADECIMAL.put('0', 0);
		HEXADECIMAL.put('1', 1);
		HEXADECIMAL.put('2', 2);
		HEXADECIMAL.put('3', 3);
		HEXADECIMAL.put('4', 4);
		HEXADECIMAL.put('5', 5);
		HEXADECIMAL.put('6', 6);
		HEXADECIMAL.put('7', 7);
		HEXADECIMAL.put('8', 8);
		HEXADECIMAL.put('9', 9);
		HEXADECIMAL.put('A', 10);
		HEXADECIMAL.put('B', 11);
		HEXADECIMAL.put('C', 12);
		HEXADECIMAL.put('D', 13);
		HEXADECIMAL.put('E', 14);
		HEXADECIMAL.put('F', 15);
	}
	
	public static int toDecimal(String input) {
		if(input == null || input.toUpperCase().trim().replaceAll("[0-9A-F]", "").length()!=0)
			return 0;
		
		String tempStr = input.toUpperCase().trim().replaceAll("[^0-9A-F]", "");
		int result = 0;
		int sLength = tempStr.length();
		
		for (int i=0;i<sLength;i++) {
			result += (int) Math.pow(16, tempStr.length()-1)* convHex(tempStr.charAt(0));
			tempStr = tempStr.substring(1);
		}
		
		return result;
	}
	
	private static int convHex(char value) {
		return HEXADECIMAL.get(value);
	}
}
