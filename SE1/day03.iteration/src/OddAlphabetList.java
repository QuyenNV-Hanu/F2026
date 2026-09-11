import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabetList {

	public static void main(String[] args) {

		// Create a list to store letters
		// whose character codes are odd numbers.
		List<Character> letters = new ArrayList<>();

		/*
		 * Add all English alphabet letters whose
		 * character codes are odd numbers.
		 */
		for (char c = 'A'; c <= 'Z'; c++) {
			if (c % 2 != 0) {
				letters.add(c);
			}
		}

		/*
		 * Create an Iterator for traversing the list.
		 */
		Iterator<Character> iterator = letters.iterator();

		// Print the elements using the iterator.
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}