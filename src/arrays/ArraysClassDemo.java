package arrays;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a[] = new long[5];
		for (int i = 0; i < 5; i++) {
			a[i] = Math.round(Math.random() * 100);
		}
		Arrays.sort(a);
		for (long n : a) {
			System.out.println(n);
		}

		int pos = Arrays.binarySearch(a, 30);
		if (pos >= 0) {
			System.out.printf("Found at : %d", pos);
		} else {
			System.out.println("Not found!");
		}
	}

}
