package oops.abstractdemo;

// the class should be abstract if we use abstract method
public abstract class Employee {
	protected String name;
	protected int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void print() {
		System.out.println(this.name + " " + this.salary);
	}

	// abstract method
	public abstract int getSalary();
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

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return this.salary + this.hra;
	}
}
