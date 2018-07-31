package programs;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, a, b = 0, c = 1;
		for (i = 0; i <= 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
	}

}
