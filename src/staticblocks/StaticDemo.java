package staticblocks;

public class StaticDemo {
	private int acno;
	private String name;
	private double bal;
	private static double minbal = 1000;

	public StaticDemo(int acno, String name, double bal) {
		super();
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}

	public void deposit(double bal) {
		this.bal = bal;
	}

	public void withdraw(double bal) {
		if (this.bal - StaticDemo.minbal >= bal) {
			this.bal -= bal;
			System.out.println(bal + " Withdrawn!");
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

	public static double getMinBal() {
		return StaticDemo.minbal;
	}

	public static void setMinBal(double minbal) {
		StaticDemo.minbal = minbal;
	}
}
