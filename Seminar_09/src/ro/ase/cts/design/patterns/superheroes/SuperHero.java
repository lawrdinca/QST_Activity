package ro.ase.cts.design.patterns.superheroes;

public class SuperHero implements IACMESuperHero {

	String name;
	int lifePoints;

	public SuperHero(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	@Override
	public void run(int distance) {
		System.out.println(this.name + " is running");

	}

	@Override
	public void defend(int points) {
		System.out.println(this.name + " is hit");
		this.lifePoints -= points;

	}

	@Override
	public void heal(int points) {
		System.out.println(this.name + " is healing");
		this.lifePoints += points;

	}

}
