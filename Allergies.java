import java.util.List;
import java.util.ArrayList;

public class Allergies {
	private final int score;
	
	public Allergies(int number) {
		this.score = number;
	}
	
	public boolean isAllergicTo (Allergen aTest) {
		return getList().contains(aTest);
	}
	
	public List<Allergen> getList() {
		List<Allergen> aList = new ArrayList<Allergen>();
		
		for (Allergen a : Allergen.values())
			if((score & a.getScore()) != 0)
				aList.add(a);
		
		return aList;
	}
}