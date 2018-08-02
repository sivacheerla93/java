package oops.staticblocks;

public class TestStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s1 = new StaticDemo(12345, "Siva Cheerla", 10000);
		s1.withdraw(9000);
		s1.withdraw(1000);
		s1.deposit(5000);
		System.out.println(StaticDemo.getMinBal());
		StaticDemo.setMinBal(2000);
		System.out.println(StaticDemo.getMinBal());
	}

}
