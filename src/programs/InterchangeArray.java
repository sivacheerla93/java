package programs;

import java.util.Scanner;

public class InterchangeArray {
	public static void main(String[] args) {
		int a[] = new int[10];

		Scanner s = new Scanner(System.in);
		// read values from keyboard into array
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Enter a number for [%d] element :", i);
			a[i] = s.nextInt();
		}

		System.out.println("Orginal Array:");
		printArray(a);

		// interchange array
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}

		System.out.println("\nInterchanged Array:");
		printArray(a);
	}

	public static void printArray(int[] a) {
		for (int n : a) {
			System.out.printf("%5d", n);
		}
	}
}
