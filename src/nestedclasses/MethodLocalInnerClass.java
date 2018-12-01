package nestedclasses;

public class MethodLocalInnerClass {
	private int v = 10;

	public void test() {
		class LocalClass {
			public void print() {
				System.out.printf("Local Class Outer Class value %d\n", v);
			}
		}
		LocalClass lc = new LocalClass();
		lc.print();
	}
}
