package encapsulation;

public class Account {
	// instance variables
	private int acno;
	private String customer;
	private double balance;

	// constructor
	public Account(int acno, String customer, double balance) {
		this.acno = acno;
		this.customer = customer;
		this.balance = balance;
	}

	// methods
	public void print() {
		System.out.println(this.acno); // compile-time polymorphism
		System.out.println(this.customer);
		System.out.println(this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	public double getBalance() {
		return this.balance;
	}

	public String getCustomer() {
		return this.customer;
	}
}
