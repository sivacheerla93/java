package programs;

public class PowerCLA {
	public static void main(String[] args) {
		int base = Integer.parseInt(args[0]);
		int power = Integer.parseInt(args[1]);
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result *= base;
		}
		System.out.printf("%d raised to %d = %d", base, power, result);
	}
}