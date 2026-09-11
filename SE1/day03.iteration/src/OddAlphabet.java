import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabet {

	public static void main(String[] args) {

		// Create l1 to store the character codes
		// of all English alphabet letters.
		List<Integer> l1 = new ArrayList<>();

		/*
		 * Add the character codes of letters A to Z
		 * to l1.
		 *
		 * In Java:
		 * 'A' = 65, 'B' = 66, ..., 'Z' = 90
		 */
		for (char c = 'A'; c <= 'Z'; c++) {
			l1.add((int) c);
		}

		// Create l2 to store the odd character codes.
		List<Integer> l2 = new ArrayList<>();

		/*
		 * Create an Iterator of l1.
		 *
		 * The iterator is used to traverse l1
		 * without directly accessing its elements by index.
		 */
		Iterator<Integer> iterator = l1.iterator();

		/*
		 * Traverse l1 using the Iterator.
		 */
		while (iterator.hasNext()) {

			// Get the next character code from l1.
			int code = iterator.next();

			// If the character code is odd, add it to l2.
			if (code % 2 != 0) {
				l2.add(code);
			}
		}

		// Print all character codes in l1.
		System.out.println("l1 = " + l1);

		// Print the odd character codes in l2.
		System.out.println("l2 = " + l2);
	}
}