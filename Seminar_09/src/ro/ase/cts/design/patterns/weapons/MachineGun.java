package ro.ase.cts.design.patterns.weapons;

public class MachineGun implements IWeapon {

	String model;
	int strength;
	int noBullets;

	public MachineGun(String model, int strength, int noBullets) {
		super();
		this.model = model;
		this.strength = strength;
		this.noBullets = noBullets;
	}

	@Override
	public void reload(int ammo) {
		System.out.println("Reloading machine gun");

	}

	@Override
	public void shoot() {
		System.out.println("---->---->----> Ta Ta Ta Ta ");

	}

}
