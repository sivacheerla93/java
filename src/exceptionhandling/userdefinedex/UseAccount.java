package exceptionhandling.userdefinedex;

public class UseAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("1001", 10000);

		try {
			a.deposit(1000);
			System.out.println("Deposited 1000");
			a.deposit(50);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		try {
			a.withdraw(5000);
			System.out.println("Withdrew 5000/-");
			a.withdraw(8000);
			System.out.println("Withdrew 8000/-");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Transactions completed!");
	}

}
