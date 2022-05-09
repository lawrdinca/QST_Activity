package ro.ase.cts.design.patterns.flyweight;

import java.util.HashMap;

public class Models3DFactory {

	private static HashMap<String, FlyweightInterface> models = new HashMap<>();

	public static FlyweightInterface get3DModel(String fileName) {
		FlyweightInterface model = models.get(fileName);
		if (model == null) {
			model = new Model3D(fileName);
			models.put(fileName, model);
		}
		return model;
	}

}
