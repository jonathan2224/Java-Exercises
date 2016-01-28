public class Hamming {
  public static int compute(String s1, String s2) {
    if (s1.length() != s2.length()) {
      throw new IllegalArgumentException();
    }
    
    int cnt=0;
    
    for(int i=0; i<s1.length();i++) {
      if(s1.charAt(i) != s2.charAt(i)) {
        cnt++;
      }
    }
	  
    return cnt;
  }
}