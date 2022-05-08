package ro.ase.cts.design.patterns.weapons;

public class Pistol implements IWeapon {

	public static final boolean NOT_USING_WATER = false;
	String model;
	boolean isUsingWater;
	
	
	public Pistol(String model, boolean isUsingWater) {
		this.model = model;
		this.isUsingWater = isUsingWater;
	}

	@Override
	public void reload(int ammo) {
		System.out.println("Reload pistol");
		
	}

	@Override
	public void shoot() {
		 System.out.println("Pew pew ------->");
		
	}

}
