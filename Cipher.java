import java.util.Random;

public class Cipher {
	private String key;
	private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public Cipher(String userKey) {
		if(userKey == null || userKey.trim().replaceAll("[a-z]", "").length()!=0 || userKey == "")
			throw new IllegalArgumentException();
		
		key = userKey;
	}
	
	public Cipher() {
		key = generateKey();
	}
	
	public String getKey() {
		return key;
	}
	
	public String encode(String input) {
		String result = "";
		
		for (int i=0;i<Math.min(key.length(), input.length());i++) {
			int encNum = ALPHABET.indexOf(input.charAt(i)) + ALPHABET.indexOf(key.charAt(i));
			while(encNum>=ALPHABET.length())
				encNum-=ALPHABET.length();
			result += ALPHABET.charAt(encNum);
		}
		
		return result;
	}
	
	public String decode(String input) {
		String result = "";
		
		for (int i=0;i<Math.min(key.length(), input.length());i++) {
			int decNum = ALPHABET.indexOf(input.charAt(i)) - ALPHABET.indexOf(key.charAt(i));
			while(decNum<0)
				decNum+=ALPHABET.length();
			result += ALPHABET.charAt(decNum);
		}
		
		return result;
	}
	
	private String generateKey() {
		Random rGen = new Random();
		String result = "";
		
		for(int i=0;i<100;i++)
			result += (char)(rGen.nextInt(26) + 'a');
		
		return result;
	}
}
