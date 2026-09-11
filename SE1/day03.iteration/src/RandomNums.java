import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNums {

	public static void main(String[] args) {

		// Create a list to store 10 random numbers.
		List<Integer> numbers = new ArrayList<>();

		// Create a Random object.
		Random random = new Random();

		/*
		 * Generate 10 random numbers in the range [1, 100].
		 */
		for (int i = 0; i < 10; i++) {

			// nextInt(100) generates a number from 0 to 99.
			// Adding 1 changes the range to 1 to 100.
			int number = random.nextInt(100) + 1;

			// Add the random number to the list.
			numbers.add(number);
		}

		// Print the list.
		System.out.println(numbers);
	}
}