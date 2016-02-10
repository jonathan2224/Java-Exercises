import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
	public static List<Long> getForNumber(long number) {
		List<Long> primeList = new ArrayList<Long>();
		
		if (number<2) 
			return primeList;
		
		long curPrime = number;
		long curInd = 2;
		while(curInd<curPrime) {
			if (curPrime%curInd == 0) {
				primeList.add(curInd);
				curPrime = curPrime / curInd;
			} else {
				curInd++;
			}
		}
		primeList.add(curPrime);
		return primeList;
	}
}
