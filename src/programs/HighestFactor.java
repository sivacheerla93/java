package programs;

import java.util.Scanner;

public class HighestFactor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();

		for (int i = num / 2; i > 0; i--) {
			if (num % i == 0) {
				System.out.printf("Highest Factor : %d\n", i);
				break;
			}
		}
	}
}