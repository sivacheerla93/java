package programs;

import java.util.Scanner;

public class GCDOfTwoNumbers {
	public static void main(String[] args) {
		// take numbers from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int first = s.nextInt();
		int second = s.nextInt();

		int i = first < second ? first : second;

		for (; i > 0; i--) {
			if (first % i == 0 && second % i == 0) {
				System.out.println("GCD = " + i);
				break;
			}
		}
	}
}
