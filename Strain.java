import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Strain {
	public static <someOb> List<someOb> keep(List<someOb> obList, Predicate <someOb> testP) {
		List<someOb> keepList = new ArrayList<someOb>();
		
		for (someOb obToTest : obList) {
			if(testP.test(obToTest))
				keepList.add(obToTest);
		}
		
		return keepList;
	}
	
	public static <someOb> List<someOb> discard(List<someOb> obList, Predicate <someOb> testP) {
		List<someOb> discList = new ArrayList<someOb>();
		
		for (someOb obToTest : obList) {
			if(!testP.test(obToTest))
				discList.add(obToTest);
		}
		
		return discList;
	}
}