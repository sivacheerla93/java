package exceptionhandling;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method("5");
		method("abc");
		method("0");
	}

	private static void method(String value) {
		// TODO Auto-generated method stub
		try {
			int n = Integer.parseInt(value);
			System.out.println(100 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} finally {
			System.out.println("Finally Block!");
		}
		System.out.println("*****Method Completed*****");
	}

}
