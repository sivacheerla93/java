package arrays;

public class TestArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e[];
		e = new Employee[5];

		e[0] = new Employee("Siva Cheerla", 12345);
		e[1] = new Employee("Raju Chikkireddy", 123456);
		e[2] = new Employee("Naveen", 98745);
		e[3] = new Employee("Animesh", 45362);
		e[4] = new Employee("Kiran", 456321);

		for (Employee i : e) {
			System.out.printf("%-17s: %d\n", i.name, i.num);
		}
	}
}
