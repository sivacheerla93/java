package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to get Factorial: ");
		int num = sc.nextInt();
		fact = 1;
		for (i = 2; i <= num; i++) {
			fact *= i;
		}
		System.out.printf("Factorial of %d is: %d", num, fact);
	}
}
