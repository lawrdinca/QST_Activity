package ro.ase.cts.design.patterns.flyweight.initial;

public class Building3DModel {
	
	int[] points;
	String fileName;
	DisplaySettings displaySettings;
	public Building3DModel(String fileName, DisplaySettings displaySettings) {
		super();
		this.fileName = fileName;
		this.displaySettings = displaySettings;
		System.out.println("Loading 3D model...");
		this.points = new int[(int)1e6];
	}
	
	

}
