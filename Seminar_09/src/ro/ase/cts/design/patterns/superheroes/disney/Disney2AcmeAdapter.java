package ro.ase.cts.design.patterns.superheroes.disney;



import ro.ase.cts.design.patterns.superheroes.IACMESuperHero;

public class Disney2AcmeAdapter implements IACMESuperHero {

	IDisneyHero disneyHero;

	public Disney2AcmeAdapter(IDisneyHero disneyHero) {
		super();
		this.disneyHero = disneyHero;
	}

	@Override
	public void run(int distance) {
		int defaultspeed = 10;
		this.disneyHero.move(distance, defaultspeed);

	}

	@Override
	public void defend(int points) {
		if (this.disneyHero instanceof DisneyHero) {
			DisneyHero hero = (DisneyHero) this.disneyHero;
			System.out.println(hero.heroName + " is defending");
			hero.lifePoints -= points;
		}

	}

	@Override
	public void heal(int points) {
		this.disneyHero.recoverPoints(points);

	}

}
