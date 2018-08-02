package oops.overriding;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Steve", 100000);
		Manager m = new Manager("Bill", 80000, 3000);

		e.print();
		System.out.println();
		m.print();
	}
}
