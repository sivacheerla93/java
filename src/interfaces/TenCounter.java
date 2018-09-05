package interfaces;

public class TenCounter implements Counter {
	private int value;

	@Override
	public void increment() {
		// TODO Auto-generated method stub
		value += getIncrement();
	}

	@Override
	public void decrement() {
		// TODO Auto-generated method stub
		value -= getIncrement();
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	// overrides default getIncrement() method in Counter interface
	@Override
	public int getIncrement() {
		return 10;
	}

}
