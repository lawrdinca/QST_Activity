package ro.ase.cts.design.patterns.flyweight;

public class Model3D implements FlyweightInterface {

	String fileName;
	int points[];

	public Model3D(String fileName) {
		super();
		this.fileName = fileName;
		System.out.println("Loading the 3D model from " + this.fileName);
		this.points = new int[(int) 1e6];
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void display(DisplaySettings displaySettings) {
		System.out.println("Generating the model based on points array");
		System.out.println(String.format("Coordinates %d, %d", displaySettings.getX(), displaySettings.getY()));
		System.out.println("Building color: " + displaySettings.getTextureColor());
	}
	// implement clone() for Prototype

}
