package ro.ase.cts.design.patterns.main;

import java.io.IOException;

import ro.ase.cts.design.patterns.interfaces.ILogging;
import ro.ase.cts.design.patterns.models.LoggerGenerator;
import ro.ase.cts.design.patterns.models.LoggerType;

public class Main {

	public static void main(String[] args) throws IOException {
		ILogging errorLog = LoggerGenerator.getLogger(LoggerType.ERROR);
		errorLog.log("Hello!");
		
		ILogging infoLog = LoggerGenerator.getLogger(LoggerType.INFO);
		infoLog.log("Hello!");
		
		
		//we have a bug
		//we can't have the singleton and the singleton registry in 2 different classes
		
		System.out.println("The end!");

	}

}
