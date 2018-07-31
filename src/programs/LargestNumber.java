package programs;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		// take numbers from user
		Scanner s = new Scanner(System.in);
		int num, largest = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter a number : ");
			num = s.nextInt();
			if (num > largest)
				largest = num;
		}
		System.out.println("Largest Number : " + largest);
	}
}