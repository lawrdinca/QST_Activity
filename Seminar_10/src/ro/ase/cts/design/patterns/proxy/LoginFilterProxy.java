package ro.ase.cts.design.patterns.proxy;

import java.util.HashMap;

public class LoginFilterProxy implements LoginInterface {

	
	private LoginInterface loginModule;
	
	public LoginFilterProxy(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}
	
	@Override
	public boolean checkCredentials(String userName, String password) {
		HashMap<String, Integer> loginCounter = new HashMap<>();
		Integer noAttempts = loginCounter.get(userName);
		if(noAttempts != null) {
			loginCounter.put(userName, 0);
			noAttempts = 0;
		}
	}

}
