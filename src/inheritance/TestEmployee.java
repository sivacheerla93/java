package inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Steve", 100000);
		Manager m = new Manager("Bill", 80000, 3000);
		SeniorManager sm = new SeniorManager("Premji", 50000, 10000, 5000);
		MarketingExceutive me = new MarketingExceutive("Siva", 25000, 5000);

		System.out.println("Employee: ");
		print(e);
		System.out.println();
		System.out.println("Manager: ");
		print(m);
		System.out.println();
		System.out.println("Senior Manager: ");
		print(sm);
		System.out.println();
		System.out.println("Marketing Executive: ");
		print(me);
	}

	public static void print(Employee e) {
		e.print();
	}
}
