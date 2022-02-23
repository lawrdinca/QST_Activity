package ro.ase.cts.g1098.lab1.main;

import ro.ase.cts.g1098.lab1.main.exceptions.InsufficientFundsException;
import ro.ase.cts.g1098.lab1.main.interfaces.Profitable;

public class Main {

	public static void main(String[] args) {

		// syso for Eclipse
		// sout for IntelliJ

		System.out.println("Hello. 1st Laboratory");

		// We cannot do this: Profitable object = new Profitable()!!!!!!!

		// use the interface as a reference type
		Profitable reference;

		try {
			throw new InsufficientFundsException("You need a top-up");
		} catch (InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Houston, we have a problem!");
		} finally {
			System.out.println("Exceptions example");
		}
	}

}
