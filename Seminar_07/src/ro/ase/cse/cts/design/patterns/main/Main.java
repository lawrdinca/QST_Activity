package ro.ase.cse.cts.design.patterns.main;

import ro.ase.cse.cts.design.patterns.models.SuperPower;
import ro.ase.cse.cts.design.patterns.models.Superhero;

public class Main {

	public static void main(String[] args) {
		
		Superhero superman = new Superhero.SuperheroBuilder("Superman", "superman.3d")
				.setPositive()
				.setLifePoints()
				.setSuperPower(SuperPower.RICH)
				.build();
		Superhero superman2 = (Superhero) superman.clone();
		//Superhero superman = new Superhero();

	}

}
