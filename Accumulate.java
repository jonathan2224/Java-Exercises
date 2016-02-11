import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Accumulate {
	public static <someOb> List<someOb> accumulate(List<someOb> iList, Function<someOb, someOb> uFunc) {
		List<someOb> rList = new ArrayList<someOb>();
		
		for(someOb fItem : iList) {
			rList.add(uFunc.apply(fItem));
		}
		
		return rList;
	}
}