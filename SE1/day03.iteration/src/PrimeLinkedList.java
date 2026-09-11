import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PrimeLinkedList extends LinkedList<Integer> {

	/**
	 * Returns true if n is a prime number.
	 */
	private boolean isPrime(int n) {
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

	/**
	 * Returns an Iterator that iterates only over
	 * the prime elements of this list.
	 */
	public Iterator<Integer> primeIterator() {

		return new Iterator<Integer>() {

			private int currentIndex = 0;
			private int nextPrimeIndex = findNextPrime(0);

			/**
			 * Finds the index of the next prime element
			 * starting from startIndex.
			 */
			private int findNextPrime(int startIndex) {
				for (int i = startIndex; i < size(); i++) {
					if (isPrime(get(i))) {
						return i;
					}
				}

				return -1;
			}

			@Override
			public boolean hasNext() {
				return nextPrimeIndex != -1;
			}

			@Override
			public Integer next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}

				Integer result = get(nextPrimeIndex);

				currentIndex = nextPrimeIndex + 1;
				nextPrimeIndex = findNextPrime(currentIndex);

				return result;
			}
		};
	}
}