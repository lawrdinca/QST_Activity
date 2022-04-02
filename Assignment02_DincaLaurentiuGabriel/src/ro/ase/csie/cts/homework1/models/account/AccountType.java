package ro.ase.csie.cts.homework1.models.account;

public enum AccountType {

	STANDARD(0), BUDGET(1), PREMIUM(2), SUPER_PREMIUM(3);

	private final int type;

	private AccountType(int type) {
		this.type = type;
	}

	public int getType() {
		return this.type;
	}
}
