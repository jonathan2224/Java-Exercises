import java.util.HashMap;
import java.util.Map;

public class WordCount {
  public Map<String, Integer> phrase(String userPhrase) {
    Map<String, Integer> tempPhrase = new HashMap<String,Integer>();
    userPhrase = userPhrase.replaceAll("[^a-zA-Z0-9\\s]", "").replaceAll("\\s+", " ");
    userPhrase = userPhrase.toLowerCase();
    String tempS = "";
    
    while (userPhrase.indexOf(" ") != -1) {
      tempS = userPhrase.substring(0, userPhrase.indexOf(" "));
      
      if (tempPhrase.containsKey(tempS)) {
        tempPhrase.put(tempS, tempPhrase.get(tempS)+1);
      } else {
        tempPhrase.put(tempS, 1);
      }
      
      userPhrase = userPhrase.substring(userPhrase.indexOf(" ")+1, userPhrase.length());
    }
    
    if (tempPhrase.containsKey(userPhrase)) {
      tempPhrase.put(userPhrase, tempPhrase.get(userPhrase)+1);
    } else {
      tempPhrase.put(userPhrase, 1);
    }
    return tempPhrase;
  }
}
