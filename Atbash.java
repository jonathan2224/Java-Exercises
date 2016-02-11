public class Atbash {
	private static String STANDARD = "abcdefghijklmnopqrstuvwxyz";
	private static String CIPHER = "zyxwvutsrqponmlkjihgfedcba";
	
	public static void main(String[] args) {
		System.out.println(Atbash.encode("Hello my name is job123!?"));
	}
	
	
	public static String encode(String ePhrase) {
		String tStr = ePhrase.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		String rStr = "";
		
		for(int i=0; i< tStr.length(); i++) {
			if(i != 0 && i % 5 == 0)
				rStr += " ";
			rStr += ApplyCipher(tStr.charAt(i));
		}
		
		return rStr;
	}
	
	public static String decode(String ePhrase) {
		String tStr = ePhrase.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		String rStr = "";
		
		for(int i=0; i< tStr.length(); i++) {
			rStr += ApplyCipher(tStr.charAt(i));
		}
		
		return rStr;
	}
	
	private static char ApplyCipher(char c) {
		int index = STANDARD.indexOf(c);
		
		return index >= 0 ? CIPHER.charAt(index) : c;
	}
}