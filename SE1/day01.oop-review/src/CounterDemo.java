public class CounterDemo {
	public static void main(String[] args) {
		Counter c = new Counter();
		for (int i = 1; i <= 100; i++) {
			c.incr();
		}
		System.out.println(c.get());

		Counter2 counter2 = new Counter2();

		System.out.println(counter2.get()); // 0

		counter2.incr();

		System.out.println(counter2.get()); // 0

		// Set count to a non-zero value for demonstration
		counter2.count = 5;

		counter2.incr();

		System.out.println(counter2.get()); // 10
	}
}
