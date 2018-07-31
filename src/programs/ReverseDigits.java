package programs;

import java.util.Scanner;

public class ReverseDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();

		while (num != 0) {
			System.out.print(num % 10);
			num /= 10;
		}
	}
}