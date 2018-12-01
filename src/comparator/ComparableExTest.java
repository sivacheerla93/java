// Comparing with balances using comparator
package comparator;

import java.util.Arrays;
import encapsulation.Account;

public class ComparableExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accounts[] = { new Account(1, "ABC", 10000), new Account(3, "XYZ", 5000), new Account(2, "DEF", 2000) };

		Arrays.sort(accounts, new ComparableEx());

		for (Account a : accounts)
			System.out.println(a);
	}

}
