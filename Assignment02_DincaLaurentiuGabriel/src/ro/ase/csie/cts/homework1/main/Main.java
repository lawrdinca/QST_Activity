package ro.ase.csie.cts.homework1.main;

import ro.ase.csie.cts.homework1.models.account.Account;
import ro.ase.csie.cts.homework1.models.account.AccountType;

public class Main {

	public static void main(String[] args) {
		Account account = new Account(1000, 10, 600, AccountType.PREMIUM);
		System.out.println(account.toString());

		double totalValue = account.computePrincipalDebt();
		System.out.println(totalValue);

	}

}
