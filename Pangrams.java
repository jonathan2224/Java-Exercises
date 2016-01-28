public class Pangrams {
  public static boolean isPangram(String testPhrase) {
	testPhrase = testPhrase.toLowerCase();
	boolean isP = true;
	
	for(int i=97;i<=122;i++) {
	  if (testPhrase.indexOf((char) i) == -1) {
	    isP = false;
	  }
	}
	
    return isP;
  }
}