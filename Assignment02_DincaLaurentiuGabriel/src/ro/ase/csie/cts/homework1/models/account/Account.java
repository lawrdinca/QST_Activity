package ro.ase.csie.cts.homework1.models.account;

import ro.ase.csie.cts.homework1.interfaces.InterestRateInterface;

public class Account implements InterestRateInterface {
	private double loanValue;
	private double interestRate;
	private int daysActive;
	private AccountType accountType;

	private static final int YEAR_DAYS = 365;
	private static final float BROKER_FEE = 0.125f;

	public Account(double loanValue, double interestRate, int daysActive, AccountType accountType) {
		this.loanValue = loanValue;
		this.interestRate = interestRate;
		this.daysActive = daysActive;
		this.accountType = accountType;
	}

	public double getLoan() {
		return this.loanValue;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public void setValue(double value) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loanValue = value;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account {\nValue:");
		builder.append(this.loanValue);
		builder.append("\nInterest Rate:");
		builder.append(this.interestRate);
		builder.append("\nDuration:");
		builder.append(this.daysActive);
		builder.append("\nType:");
		builder.append(this.accountType);
		builder.append("}");
		return builder.toString();
	}

	public static double calculate(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		int temp = 365;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
				totalFee += BROKER_FEE * ( // 1.25% broker's fee
				account.loanValue * Math.pow(account.interestRate, (account.daysActive / YEAR_DAYS))
						- account.loanValue); // interest-principal
		}
		return totalFee;
	}

	public Account(double value, double rate, AccountType account_Type) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loanValue = value;
		}
		this.interestRate = rate;
		this.accountType = account_Type;
	}

	@Override
	public double getMonthlyInterestRate(double loanValue, double interestRate) {

		return loanValue * interestRate;
	}

}
