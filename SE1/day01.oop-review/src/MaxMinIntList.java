import java.util.ArrayList;
import java.util.Collection;

public class MaxMinIntList extends ArrayList<Integer> {

	// Default constructor
	public MaxMinIntList() {
		super();
	}

	// Constructor with initial capacity
	public MaxMinIntList(int initialCapacity) {
		super(initialCapacity);
	}

	// Constructor from another collection
	public MaxMinIntList(Collection<Integer> collection) {
		super(collection);
	}

	// Return the smallest element
	public int min() {
		if (this.isEmpty()) {
			throw new IllegalStateException("The list is empty.");
		}

		int minValue = this.get(0);

		for (int i = 1; i < this.size(); i++) {
			if (this.get(i) < minValue) {
				minValue = this.get(i);
			}
		}

		return minValue;
	}

	// Return the largest element
	public int max() {
		if (this.isEmpty()) {
			throw new IllegalStateException("The list is empty.");
		}

		int maxValue = this.get(0);

		for (int i = 1; i < this.size(); i++) {
			if (this.get(i) > maxValue) {
				maxValue = this.get(i);
			}
		}

		return maxValue;
	}
}