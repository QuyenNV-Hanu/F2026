import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class IntegerLinkedList extends LinkedList<Integer> {

	/*
	 * Returns an Iterator that traverses only
	 * the even elements of this list.
	 */
	public Iterator<Integer> evenIterator() {

		return new Iterator<Integer>() {

			// Iterator used to traverse the original list.
			private Iterator<Integer> iterator = IntegerLinkedList.super.iterator();

			// Stores the next even number to be returned.
			private Integer nextEven = null;

			// Indicates whether nextEven has already been found.
			private boolean nextEvenReady = false;

			/*
			 * Finds the next even element in the list.
			 */
			private void findNextEven() {

				while (!nextEvenReady && iterator.hasNext()) {

					Integer value = iterator.next();

					if (value % 2 == 0) {
						nextEven = value;
						nextEvenReady = true;
					}
				}
			}

			/*
			 * Checks whether there is another even element.
			 */
			@Override
			public boolean hasNext() {
				findNextEven();
				return nextEvenReady;
			}

			/*
			 * Returns the next even element.
			 */
			@Override
			public Integer next() {

				findNextEven();

				if (!nextEvenReady) {
					throw new NoSuchElementException();
				}

				Integer result = nextEven;

				// Reset the state so that the next even element
				// can be searched for.
				nextEven = null;
				nextEvenReady = false;

				return result;
			}
		};
	}

	public static void main(String[] args) {

		// Create an IntegerLinkedList.
		IntegerLinkedList list = new IntegerLinkedList();

		// Add some integers to the list.
		list.add(10);
		list.add(15);
		list.add(22);
		list.add(31);
		list.add(40);
		list.add(51);
		list.add(64);

		// Print the original list.
		System.out.println("Original list:");
		System.out.println(list);

		// Create an iterator for even elements.
		Iterator<Integer> evenIterator = list.evenIterator();

		// Print only even elements.
		System.out.println("Even elements:");

		while (evenIterator.hasNext()) {
			System.out.print(evenIterator.next() + " ");
		}
	}
}