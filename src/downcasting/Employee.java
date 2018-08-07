package downcasting;

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