package ro.ase.cts.design.patterns.observer;

public class BackupModule implements ConnectionStatusInterface {

	@Override
	public void lostConnectionNotification(long timeStamp) {
		System.out.println("Backing up the game data");

	}

}
