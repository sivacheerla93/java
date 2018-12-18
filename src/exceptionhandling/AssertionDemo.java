package exceptionhandling;

public class AssertionDemo {

	private void print(int count) {
		assert count > 0 : "Invalid count for print()";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssertionDemo a = new AssertionDemo();
		a.print(1);
		a.print(0);
	}

}
