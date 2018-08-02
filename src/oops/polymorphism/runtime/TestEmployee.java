package oops.polymorphism.runtime;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Steve", 100000);
		Manager m = new Manager("Bill", 80000, 3000);
		print(e);
		System.out.println();
		print(m);
	}

	// Observe the runtime polymorphism here!
	public static void print(Employee e) {
		/*
		 * This calls which print either from Employee or Manager! Decides at
		 * runtime
		 */
		e.print();
	}
}
