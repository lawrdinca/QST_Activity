package ro.ase.cts.design.patterns.superheroes;

import ro.ase.cts.design.patterns.superheroes.disney.DisneyHero;
import ro.ase.cts.design.patterns.superheroes.disney.IDisneyHero;
import ro.ase.cts.design.patterns.superheroes.disney.Test;

public class Main {

	public static void main(String[] args) {
		IACMESuperHero superman = new SuperHero("Superman", 100);
		superman.run(500);

		IDisneyHero vader = new DisneyHero("Vader");
		
		new Test();
		IACMESuperHero vaderHero = 
				new Disney2AcmeAdaptor(vader);
		vaderHero.heal(100);
		vaderHero.run(300);
		
		IACMESuperHero luke = new Disney2AcmeAdaptor(new DisneyHero("Luke"));
	}

}
