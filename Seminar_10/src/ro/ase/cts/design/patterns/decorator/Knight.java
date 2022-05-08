package ro.ase.cts.design.patterns.decorator;

public class Knight extends AbstractHero {

	public Knight(String name, int points) {
		super(name, points);
	}

	@Override
	public void move(int distance) {
		System.out.println(this.name + " is running.");

	}

	@Override
	public void defend(int hitPoints) {
		System.out.println(this.name + " took a hit of " + hitPoints + " points.");
		this.points -= hitPoints;
		if (this.points <= 0) {
			System.out.println("GAME OVER");
		}

	}

}
