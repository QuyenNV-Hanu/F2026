import java.util.Iterator;

public class PrimeLinkedListDemo {

	public static void main(String[] args) {

		PrimeLinkedList list = new PrimeLinkedList();

		list.add(10);
		list.add(7);
		list.add(4);
		list.add(13);
		list.add(20);
		list.add(17);
		list.add(8);
		list.add(1);
		list.add(23);

		System.out.println("Original list:");
		System.out.println(list);

		System.out.println("Prime elements:");

		Iterator<Integer> it = list.primeIterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}