package finalblocks;

public class FinalDemo {
	int amount;

	// final variable
	private static final int v = 100;

	public void getFinalAmount(int amount) {
		this.amount = amount;
		System.out.println(this.amount + v);
	}

	// final parameters
	public void addValue(final int amount) {
		this.amount += amount;
	}

	// final method
	// note: sub classes can't override final methods
	public final void getFinalValue() {
		System.out.println(v);
	}
}
