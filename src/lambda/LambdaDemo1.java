package lambda;

interface Test {
	boolean eval(int n1, int n2);
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// With Anonymous inner class
		Test t = new Test() {
			@Override
			public boolean eval(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1 > n2;
			}
		};
		System.out.println(t.eval(20, 10));

		// With Lambda expression
		Test t2 = (int n1, int n2) -> n1 > n2;
		System.out.println(t2.eval(20, 10));

		// With Lamda and type inference, no need to mention data types
		Test t3 = (n1, n2) -> n1 > n2;
		System.out.println(t3.eval(20, 10));
	}

}
