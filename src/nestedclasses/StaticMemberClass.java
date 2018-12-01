package nestedclasses;

class StaticMemberClass {
	static public class InnerClass {
		public void print() {
			System.out.println("Inner Class");
		}
	}

	public void print() {
		System.out.println("Outer Class");
	}
}
