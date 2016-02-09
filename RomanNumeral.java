import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {
	private static final LinkedHashMap<String, Integer> romVals;
	static
	{
		romVals = new LinkedHashMap<String, Integer>();
		romVals.put("M", 1000);
		romVals.put("CM", 900);
		romVals.put("D", 500);
		romVals.put("CD", 400);
		romVals.put("C", 100);
		romVals.put("XC", 90);
		romVals.put("L", 50);
		romVals.put("XL", 40);
		romVals.put("X", 10);
		romVals.put("IX", 9);
		romVals.put("V", 5);
		romVals.put("IV", 4);
		romVals.put("I", 1);
	}
	private int numToConv = 0;
	
	public RomanNumeral(int number)
	{
		numToConv = number;
	}
	
	public String getRomanNumeral() {
		String romNum = "";
		int tempNum = numToConv;
		for(Map.Entry<String, Integer> entry : romVals.entrySet()) {
			int repeats = tempNum/entry.getValue();
			romNum = romNum + multipleLets(entry.getKey(), repeats);
			tempNum = tempNum % entry.getValue();
		}
		return romNum;
	}
	
	private String multipleLets(String romNum, int numMatch) {
		if (romNum == null)
			return null;
		String multiRomNum = "";
		for (int i = 0; i<numMatch; i++)
			multiRomNum = multiRomNum.concat(romNum);
		return multiRomNum;
	}
}
