package exceptionhandling;

class Ex1 extends Exception {

}

class Ex2 extends Exception {

}

public class MorePreciseRethrow {

	public static void main(String[] args) throws Ex1, Ex2 {
		// TODO Auto-generated method stub
		m1(10);
	}

	public static void m1(int v) throws Ex1, Ex2 {
		try {
			if (v < 100) {
				throw new Ex1();
			} else {
				throw new Ex2();
			}

		} catch (Exception e) {
			throw e;
		}
	}
}
