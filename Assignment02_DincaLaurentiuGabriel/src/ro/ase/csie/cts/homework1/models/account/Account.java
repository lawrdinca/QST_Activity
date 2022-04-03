package ro.ase.csie.cts.homework1.models.account;

import ro.ase.csie.cts.homework1.exceptions.InvalidDaysException;
import ro.ase.csie.cts.homework1.exceptions.InvalidInterestRateException;
import ro.ase.csie.cts.homework1.exceptions.InvalidValueException;
import ro.ase.csie.cts.homework1.interfaces.InterestRateInterface;

public class Account implements InterestRateInterface {
	private double loanValue;
	private double interestRate;
	private int daysActive;
	private AccountType accountType;

	private static final int YEAR_DAYS = 365;
	private static final float BROKER_FEE = 0.125f;

	public Account(double loanValue, double interestRate, int daysActive, AccountType accountType) {
		if (loanValue < 0) {
			throw new InvalidValueException();
		} else {
			this.loanValue = loanValue;
		}
		if (interestRate < 0) {
			throw new InvalidInterestRateException();
		} else {
			this.interestRate = interestRate;
		}
		if (daysActive < 0) {
			throw new InvalidDaysException();
		} else {
			this.daysActive = daysActive;
		}
		this.accountType = accountType;
	}

	public double getLoan() {
		return this.loanValue;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public void setLoanValue(double loanValue) {
		if (loanValue < 0) {
			throw new InvalidValueException();
		} else {
			this.loanValue = loanValue;
		}
	}

	public static double computeTotalFee(Account[] accounts) {
		double totalFee = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].accountType == AccountType.PREMIUM
					|| accounts[i].accountType == AccountType.SUPER_PREMIUM) {
				totalFee += BROKER_FEE * (accounts[i].computeInterestPrincipal());
			}
		}
		return totalFee;
	}

	public double computePeriod() {
		return this.daysActive / YEAR_DAYS;
	}

	public double computeInterest() {
		return Math.pow(this.interestRate, computePeriod());
	}

	public double computeInterestPrincipal() {
		return this.loanValue * (computeInterest() - 1);
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

	@Override
	public double getMonthlyInterestRate(double loanValue, double interestRate) {

		return loanValue * interestRate;
	}

}
