package ro.ase.cts.design.patterns.superheroes.disney;

public class DisneyHero implements IDisneyHero {

	String heroName;
	int lifePoints = 100;

	public DisneyHero(String heroName){
		super();
		this.heroName = heroName;
	}

	@Override
	public void recoverPoints(int points) {
		System.out.println("Recover points");

	}

	@Override
	public void move(int distance, float speed) {
		System.out.println("Move");

	}

}
