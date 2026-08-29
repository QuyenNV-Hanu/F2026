public class Counter {
	protected int count;

	public Counter(){
		this.count = 0;
	}

	public int get(){
		return this.count;
	}

	public void incr(){
		this.count += 1;
	}
}
