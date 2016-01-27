import java.util.Map;
import java.util.HashMap;

public class DNA {
  String dnaString;
  
  public DNA (String userString) {
    dnaString = userString;
  }

  public int count(char nucleotide) {
	char[] usableDna = new char[dnaString.length()];
    usableDna = dnaString.toCharArray();
	int nucleotideCnt = 0;
	
	switch (nucleotide){
	case 'A':;
	case 'C':;
	case 'T':;
	case 'G':;
	  for(int i = 0; i<dnaString.length(); i++) {
	    if (usableDna[i] == nucleotide) {
	      nucleotideCnt++;
	    }		  
	  }
	  break;
	  default: 
        throw new IllegalArgumentException();
	}
	
    return nucleotideCnt;
  }

  public Map<Character, Integer> nucleotideCounts() {
    Map<Character, Integer> temp = new HashMap<Character, Integer>();
    
	temp.put('A', count('A'));
	temp.put('C', count('C'));
	temp.put('T', count('T'));
	temp.put('G', count('G'));
  
  return temp;
  }
}
