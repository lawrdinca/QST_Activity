package ro.ase.cts.design.patterns.observer;

public class NotificationModule implements ConnectionStatusInterface{

	@Override
	public void lostConnectionNotification(long timeStamp) {
		System.out.println("Notify player!");
		
	}

}
