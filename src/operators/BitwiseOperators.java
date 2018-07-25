package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10, b = 15;
		System.out.printf("%d & %d = %d\n", a, b, a & b);
		System.out.printf("%d | %d = %d\n", a, b, a | b);
		System.out.printf("%d >> 2 = %d\n", a, a >> 2);
		System.out.printf("%d << 2 = %d\n", a, a << 2);
	}
}
