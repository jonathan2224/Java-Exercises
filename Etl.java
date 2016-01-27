import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {
	public Map<String, Integer> transform(Map<Integer, List<String>> old) {		
		Map<String, Integer> temp = new HashMap<String, Integer>();
		for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
			Integer score = entry.getKey();
			List<String> tempList = entry.getValue();
			
			for(String character: tempList) {
				temp.put(character.toLowerCase(), score);
			}
		}
		return temp;
	}
}
