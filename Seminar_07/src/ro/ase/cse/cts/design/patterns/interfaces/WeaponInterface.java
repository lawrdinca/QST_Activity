package ro.ase.cse.cts.design.patterns.interfaces;

public interface WeaponInterface extends Cloneable  {

	public abstract void shoot();
	public abstract void reload();
	public abstract WeaponInterface clone();
}
