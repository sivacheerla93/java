package nestedclasses;

public class NonStaticMemberClass {
	private int m1 = 10;

	class InnerClass {
		private int m2 = 20;

		public void print() {
			System.out.printf("m1 = %d  m2 = %d", m1, m2);
		}
	}

	public void print() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
}
