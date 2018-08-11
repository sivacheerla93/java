package encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(101, "Bill Gates", 10000);
		a1.print();
		a1.deposit(10000);
		a1.withdraw(15000);
		a1.print();

		System.out.println();
		Account a2 = new Account(102, "Steve", 10000);
		a2.deposit(10000);
		System.out.println(a2.getBalance());

		// toString()
		System.out.println(a1);
		System.out.println(a2);

		System.out.println(a1.equals(a2));
	}
}
