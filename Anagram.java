import java.util.List;
import java.util.ArrayList;

public class Anagram {
  public static List<String> aList;
  
  public Anagram(String userString) {
	aList = new ArrayList<String>();
    anag(userString.toLowerCase(), "");
    aList.remove(aList.size()-1);
  }
  
  public void anag(String s1, String s2)  {
    if(s1.length() == 0) {
      aList.add(s2);  
    }

    for(int i = 0; i < s1.length(); i++) {
      anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
    }
  }

  public List<String> match(List<String> userList) {
    List<String> temp = new ArrayList<String>();
    
    for(int i = 0; i< userList.size(); i++) {
      String tempS = userList.get(i).toLowerCase();
      if (aList.contains(tempS)) {
        if(temp.contains(tempS) == false) {
          temp.add(userList.get(i));
        }
      }
    }
    return temp;
  }
}
