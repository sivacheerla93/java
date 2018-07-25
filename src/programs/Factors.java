package programs;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get factors: ");
		num = sc.nextInt();
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

}
