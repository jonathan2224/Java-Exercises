import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class School {
	private Map<Integer, List<String>> school = new HashMap<Integer, List<String>>();
	
	public Map<Integer, List<String>> db() {
		return school;
	}
	
	public void add(String student, Integer grade) {
		List<String> temp = grade(grade);
		temp.add(student);
		school.put(grade, temp);
	}
	
	public List<String> grade(Integer grade) {
		if(school.containsKey(grade))
			return school.get(grade);
		
		return new ArrayList<String>();
	}
	
	public Map<Integer, List<String>> sort() {
		for(Integer i : school.keySet()) {
			List<String> temp = school.get(i);
			Collections.sort(temp);
		}
		
		return school;
	}
}
