package programs;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {

		// take numbers from user
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
	}
}