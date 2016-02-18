import java.util.HashSet;
import java.util.Set;


public class PigLatin {
	private static final Set<Character> VOWELS;
	static {
		VOWELS = new HashSet<Character>();
		VOWELS.add('a');
		VOWELS.add('e');
		VOWELS.add('i');
		VOWELS.add('o');
		VOWELS.add('u');
	}
	
	private static final Set<String> SPVOWELS;
	static {
		SPVOWELS = new HashSet<String>();
		SPVOWELS.add("yt");
		SPVOWELS.add("xr");
	}
	
	private static final Set<String> SPCONS;
	static {
		SPCONS = new HashSet<String>();
		SPCONS.add("ch");
		SPCONS.add("th");
		SPCONS.add("qu");
		SPCONS.add("thr");
		SPCONS.add("sch");
	}
	
	private static final String triQu = "qu";
	
	public static String translate(String input) {
		String[] words = input.trim().toLowerCase().split(" ");
		String results = "";
		
		for(String temp : words) {
			results += " " + tWord(temp);
		}
		
		return results.trim();
	}
	
	private static String tWord(String input) {
		
		if(VOWELS.contains(input.charAt(0)) || SPVOWELS.contains(input.substring(0, 2))) {
		  return (input+"ay");
		} else {
			int shiftLen = 1;
			if (input.length()>1) {
				if(SPCONS.contains(input.substring(0,2))) {
					shiftLen = 2;
				}
			}
			if (input.length()>2) {
				if(SPCONS.contains(input.substring(0,3)) || input.substring(1, 3).equals(triQu)) {
					shiftLen = 3;
				}
			}
			return (input.substring(shiftLen,input.length())+input.substring(0,shiftLen)+"ay");
		}
	}
}
