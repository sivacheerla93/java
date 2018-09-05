package interfaces;

public class OneCounter implements Counter {

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

}
