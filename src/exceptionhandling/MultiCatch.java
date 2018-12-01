package exceptionhandling;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = Integer.parseInt("abc");

			if (99 % n == 0)
				System.out.printf("%d is a factor of 99", n);
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid Number or Array bounds exception!");
		}
	}

}
