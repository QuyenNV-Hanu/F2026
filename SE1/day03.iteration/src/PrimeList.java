import java.util.ArrayList;

public class PrimeList extends ArrayList<Integer> {

	/**
	 * Creates a PrimeList containing the first n prime numbers.
	 */
	public PrimeList(int n) {

		int number = 2;

		while (size() < n) {

			if (isPrime(number)) {
				add(number);
			}

			number++;
		}
	}

	/**
	 * Determines whether an integer is prime.
	 */
	public static boolean isPrime(int n) {

		if (n < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}