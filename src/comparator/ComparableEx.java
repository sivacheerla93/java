package comparator;

import java.util.Comparator;
import encapsulation.Account;

public class ComparableEx implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		// TODO Auto-generated method stub
		if (a1.getBalance() == a2.getBalance())
			return 0;
		else if (a1.getBalance() > a2.getBalance())
			return 1;
		else
			return -1;
	}

}
