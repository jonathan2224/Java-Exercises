import java.util.List;
import java.util.ArrayList;

public class Raindrops {
	private static List<Integer> getPrimes(int number) {
		List<Integer> primeList = new ArrayList<Integer>();
		
		if (number<2) 
			return primeList;
		
		int curPrime = number;
		int curInd = 2;
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
	
	public static String convert(int number) {
		List<Integer> primeList = getPrimes(number);
		
		String tempStr = "";
		if (primeList.contains(3))
			tempStr = tempStr+"Pling";
		if (primeList.contains(5))
			tempStr = tempStr+"Plang";
		if(primeList.contains(7))
			tempStr = tempStr+"Plong";
		
		if (tempStr.isEmpty())
			return String.valueOf(number);
		else
			return tempStr;
	}
}

