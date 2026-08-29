public class MaxMinIntListDemo {
	public static void main(String[] args) {

		// Create a MaxMinIntList object
		MaxMinIntList numbers = new MaxMinIntList();

		// Add elements
		numbers.add(10);
		numbers.add(5);
		numbers.add(25);
		numbers.add(-3);
		numbers.add(18);

		// Display the list
		System.out.println("List: " + numbers);

		// Test min() and max()
		System.out.println("Minimum value: " + numbers.min());
		System.out.println("Maximum value: " + numbers.max());
	}
}