public class Counter2 extends Counter{
	public Counter2(){
		super();
	}

	@Override
	public void incr(){
		this.count *= 2;
	}
}
