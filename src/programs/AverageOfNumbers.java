package programs;

public class AverageOfNumbers {

	public static void main(String[] args) {
		System.out.println(average(10, 20, 45, 33));
		System.out.println(average(12, 22, 88));
	}

	public static int average(int... numbers) {
		int total = 0;
		for (int n : numbers)
			total += n;

		return total / numbers.length;
	}
}