package comparator;

import java.util.Arrays;
import java.util.Comparator;

import encapsulation.Account;

public class ComparatorWithAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accounts[] = { new Account(1, "ABC", 10000), new Account(3, "XYZ", 5000), new Account(2, "DEF", 2000) };

		// Sort by balance
		Comparator<Account> compareObj = new Comparator<Account>() {

			@Override
			public int compare(Account a1, Account a2) {
				// TODO Auto-generated method stub
				return (int) (a1.getBalance() - a2.getBalance());
			}
		};

		Arrays.sort(accounts, compareObj);
		System.out.println("Sort by balance!");
		for (Account a : accounts)
			System.out.println(a);

		// Sort by acno
		Arrays.sort(accounts, new Comparator<Account>() {

			@Override
			public int compare(Account a1, Account a2) {
				// TODO Auto-generated method stub
				return a1.getAcno() - a2.getAcno();
			}

		});
		System.out.println("\nSort by acno!");
		for (Account a : accounts)
			System.out.println(a);
	}

}
