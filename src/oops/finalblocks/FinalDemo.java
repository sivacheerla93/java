package oops.finalblocks;

public class FinalDemo {
	int amount;
	private static final int v = 100;

	public void getFinalValue(int value) {
		this.amount = amount;
		System.out.println(this.amount + v);
	}

	public void addValue(final int amount) {
		this.amount += amount;
	}
}
