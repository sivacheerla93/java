package programs;

public class VariableNoOfArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(10));
		System.out.println(getSum(20, 30));
		System.out.println(getSum(40, 50, 60));
	}

	public static int getSum(int... i) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int n : i) {
			total += n;
		}
		return total;
	}
}
