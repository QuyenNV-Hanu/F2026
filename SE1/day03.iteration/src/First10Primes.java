import java.util.ArrayList;
import java.util.List;

public class First10Primes {

	/*
	 * Checks whether a number is prime.
	 *
	 * A prime number is a number greater than 1
	 * that has only two divisors: 1 and itself.
	 */
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		// Create a list to store the first 10 prime numbers.
		List<Integer> primes = new ArrayList<>();

		int number = 2;

		/*
		 * Continue checking numbers until the list
		 * contains 10 prime numbers.
		 */
		while (primes.size() < 10) {

			// If number is prime, add it to the list.
			if (isPrime(number)) {
				primes.add(number);
			}

			// Check the next number.
			number++;
		}

		// Print the first 10 prime numbers.
		System.out.println(primes);
	}
}