package inheritance;

public class Employee {
	protected String name;
	protected int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void print() {
		System.out.println(this.name + " " + this.salary);
	}

	public int getSalary() {
		return this.salary;
	}
}

class Manager extends Employee {
	protected int hra;

	public Manager(String name, int salary, int hra) {
		super(name, salary); // calling super class constructor
		this.hra = hra;
	}

	// overriding super class print method
	@Override
	public void print() {
		super.print(); // name, salary statements from super class
		System.out.println(this.hra);
	}
}

class SeniorManager extends Manager {
	protected int da;

	public SeniorManager(String name, int salary, int hra, int da) {
		super(name, salary, hra);
		this.da = da;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.da);
	}
}

class MarketingExceutive extends Employee {
	protected int ta;

	public MarketingExceutive(String name, int salary, int ta) {
		super(name, salary);
		this.ta = ta;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.ta);
	}

}
