package upcasting;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		Manager m = new Manager("Siva Cheerla", 15000, 2000);

		// upcasting
		e = m;
		e.print();
	}
}
