package programs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num;
		boolean prime = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = sc.nextInt();
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println("Prime number!");
		} else {
			System.out.println("Not prime number!");
		}
	}

}
