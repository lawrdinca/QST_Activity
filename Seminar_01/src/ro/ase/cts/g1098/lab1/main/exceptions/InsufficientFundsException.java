package ro.ase.cts.g1098.lab1.main.exceptions;

public class InsufficientFundsException extends Exception {
	// Checked exceptions versus runtime exceptions --> recap
	public InsufficientFundsException() {

	}

	public InsufficientFundsException(String message) {
		super(message);
	}
}
