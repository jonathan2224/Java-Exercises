import java.util.List;
import java.util.ArrayList;

public class Sieve {
	private List<Integer> primeList;
	private final int maxSieve;
	
	public Sieve (int input) {
		this.maxSieve = input;
		primeList = primeList();
	}
	
	public List<Integer> getPrimes() {
		return primeList;
	}
	
	private List<Integer> primeList() {
		List<Integer> results = new ArrayList<Integer>();
		List<Integer> pList = buildPossibles();
		
		while(!pList.isEmpty()) {
			Integer cVal = pList.remove(0);
			results.add(cVal);
			if(!pList.isEmpty() && cVal*2<=pList.get(pList.size()-1))		
				for (Integer i = cVal*2;i<=pList.get(pList.size()-1);i+=cVal)
					pList.remove(i);
					
		}
		
		return results;
	}
	
	private List<Integer> buildPossibles() {
		List<Integer> results = new ArrayList<Integer>();
		
		for(int i=2;i<=maxSieve;i++)
			results.add(i);
		
		return results;
	}
}