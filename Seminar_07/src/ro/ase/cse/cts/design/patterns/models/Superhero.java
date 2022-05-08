package ro.ase.cse.cts.design.patterns.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ro.ase.cse.cts.design.patterns.interfaces.WeaponInterface;

public class Superhero implements Cloneable {

	String name;
	boolean isPositive;
	int lifePoints;
	boolean isCriticalWounded;

	WeaponInterface leftHandWeapon;
	WeaponInterface rightHandWeapon;

	SuperPower superPower;
	SuperPower ultimatePower;

	ArrayList<Point3D> points = null;
	String modelFile;

	private Superhero() {

	}

	private Superhero(String fileName) {
		System.out.println("Opening file " + fileName);
		final int noPoints = 50;
		Random random = new Random();
		this.points = new ArrayList<>();
		for (int i = 0; i < noPoints; i++) {
			this.points.add(new Point3D(random.nextInt(Point3D.LIMIT), random.nextInt(Point3D.LIMIT),
					random.nextInt(Point3D.LIMIT)));
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Model generated!");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// DON'T DO THISreturn new Superhero(this.modelFile);
		Superhero clone = new Superhero();
		clone.isCriticalWounded = this.isCriticalWounded;
		clone.isPositive = this.isPositive;
		clone.modelFile = this.modelFile;
		clone.points = (ArrayList<Point3D>) this.points.clone();
		clone.superPower = this.superPower;
		clone.ultimatePower = this.ultimatePower;
		if (this.leftHandWeapon != null) {
			clone.leftHandWeapon = this.leftHandWeapon.clone();
		}
		if (this.rightHandWeapon != null) {
			clone.rightHandWeapon = this.rightHandWeapon.clone();
		}
		return clone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPositive() {
		this.isPositive = true;
	}

	private void setNegative() {
		this.isPositive = false;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	public void setCriticalWounded() {
		this.isCriticalWounded = isCriticalWounded;
	}

	public void setLeftHandWeapon(WeaponInterface leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}

	public void setRightHandWeapon(WeaponInterface rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}

	public void setSuperPower(SuperPower superPower) {
		this.superPower = superPower;
	}

	public void setUltimatePower(SuperPower ultimatePower) {
		this.ultimatePower = ultimatePower;
	}

	public void setPoints(ArrayList<Point3D> points) {
		// NOT OK- SHALLOW COPY this.points = points;
		this.points = (ArrayList<Point3D>) points.clone();
	}

	public void setModelFile(String modelFile) {
		this.modelFile = modelFile;
	}

	public static class SuperheroBuilder {
		private Superhero superhero;

		public SuperheroBuilder(String name, String modelFile) {
			this.superhero = new Superhero();
			this.superhero.setName(name);
			this.superhero.setModelFile(modelFile);

		}

		public SuperheroBuilder setPositive() {
			this.superhero.setPositive();
			return this;
		}

		public SuperheroBuilder setCriticalWounded() {
			this.superhero.setCriticalWounded();
			return this;
		}

		public SuperheroBuilder setLifePoints(int points) {
			this.superhero.setLifePoints(points);
			return this;
		}

		public SuperheroBuilder setRightHandWeapon(WeaponInterface leftHandWeapon) {
			this.superhero.setLeftHandWeapon(leftHandWeapon);
			return this;
		}

		public SuperheroBuilder setLeftHandWeapon(WeaponInterface rightHandWeapon) {
			this.superhero.setRightHandWeapon(rightHandWeapon);
			return this;
		}

		public SuperheroBuilder setSuperPower(SuperPower superPower) {
			this.superhero.setSuperPower(superPower);
			return this;
		}

		public SuperheroBuilder setUltimatePower(SuperPower ultimatePower) {
			this.superhero.setUltimatePower(ultimatePower);
			return this;
		}

		public Superhero build() {
			return this.superhero;
		}
	}
}