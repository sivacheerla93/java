package programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1000; i <= 2000; i++) {
			int n = i, r, temp = 0;
			while (n > 0) {
				r = n % 10;
				temp = (temp * 10) + r;
				n = n / 10;
			}
			if (i == temp) {
				System.out.println(i);
			}
		}
	}
}
