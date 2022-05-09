package ro.ase.cts.design.patterns.observer;

public class Main {

	public static void main(String[] args) {
		ConnectionModule conModule = new ConnectionModule();
		BackupModule backModule = new BackupModule();
		
		conModule.register(backModule);
		conModule.register(new BackupModule());
		conModule.register(new NotificationModule());
		conModule.openConnection();
		
		conModule.unregister(backModule);
		//conModule.unregister(backModule);

	}

}
