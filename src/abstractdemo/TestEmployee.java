package abstractdemo;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Employee class can't instantiate as it is abstract, but we can create
		// reference
		Employee e = null;
		Manager m = new Manager("Bill", 80000, 3000);
		// print(e);
		System.out.println();
		print(m);
	}

	public static void print(Employee e) {
		e.print();

		// calling getSalary() of Manager here! 'e' calls 'm' at runtime
		System.out.println(e.getSalary());
	}
}
