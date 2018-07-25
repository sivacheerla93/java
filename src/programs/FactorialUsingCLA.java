package programs;

public class FactorialUsingCLA {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		int i, fact;
		fact = 1;

		if (a.length == 0) {
			System.out.println("Number not given!");
			return;
		}

		int num = Integer.parseInt(a[0]);

		for (i = 2; i <= num; i++) {
			fact *= i;
		}
		System.out.printf("Factorial of %d is: %d", num, fact);
	}
}
