import java.util.List;

public class Prime {
	public static long nth(Integer input) {
		if (input < 1) throw new IllegalArgumentException();
		
		//note found an approximate limit thereom on wikipedia.
		double aLimit = input * Math.log(input) + input * Math.log(Math.log(input));
		
		if (aLimit < 20)
			aLimit = 20;
		
		List<Integer> primes;
		Sieve test = new Sieve((int) aLimit);
		primes = test.getPrimes();
		
		return primes.get(input-1);
	}
}