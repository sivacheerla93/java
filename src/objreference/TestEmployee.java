package objreference;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Siva Cheerla", 10000);
		Employee e2 = new Employee("Siva Cheerla", 10000);

		// Here we get Not equal, because only e1 & e2 are compared! Not objects
		if (e1 == e2) {
			System.out.println("Equal!");
		} else {
			System.out.println("Not equal!");
		}

		if (e1 != e2) {
			System.out.println("Condition passed");
		}

		// Assignment operator
		e1 = e2; // Now e1 is referencing to e2 obj. old e1 obj will be gone
	}

}
