import java.util.HashMap;
import java.util.Map;

public class Scrabble {
	private static final Map<Character, Integer> sVals;
	static
	{
		sVals = new HashMap<Character, Integer>();
		sVals.put('A', 1);
		sVals.put('B', 3);
		sVals.put('C', 3);
		sVals.put('D', 2);
		sVals.put('E', 1);
		sVals.put('F', 4);
		sVals.put('G', 2);
		sVals.put('H', 4);
		sVals.put('I', 1);
		sVals.put('J', 8);
		sVals.put('K', 5);
		sVals.put('L', 1);
		sVals.put('M', 3);
		sVals.put('N', 1);
		sVals.put('O', 1);
		sVals.put('P', 3);
		sVals.put('Q',10);
		sVals.put('R', 1);
		sVals.put('S', 1);
		sVals.put('T', 1);
		sVals.put('U', 1);
		sVals.put('V', 4);
		sVals.put('W', 4);
		sVals.put('X', 8);
		sVals.put('Y', 4);
		sVals.put('Z',10);
	}
	
	private String sWord;
	
	public Scrabble (String input) {
		if (input == null)
			sWord = "";
		else
			sWord = input;
	}
	
	public int getScore() {
		if (sWord.isEmpty()) 
			return 0;
		
		int score = 0;
		for (char i: sWord.toUpperCase().toCharArray()) {
			if (sVals.containsKey(i))
				score = score + sVals.get(i);
		}
		
		return score;
	}
}
