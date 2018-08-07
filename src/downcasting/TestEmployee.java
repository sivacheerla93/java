package downcasting;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Siva Cheerla", 15000);
		Manager m = new Manager("Raju Chikkireddy", 30000, 3000);

		// first we've to do upcasting
		e = m;

		// then downcasting follows
		m = (Manager) e;
		m.print();
	}
}
