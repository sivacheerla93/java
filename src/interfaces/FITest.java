package interfaces;

public class FITest {
	public static void main(String[] args) {
		Printable p = new Print();
		p.print("Hello");
		Printable p2 = FITest::print;
		p2.print("Using Method Reference");
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}