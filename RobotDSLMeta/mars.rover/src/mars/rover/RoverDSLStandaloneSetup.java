/*
 * generated by Xtext
 */
package mars.rover;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RoverDSLStandaloneSetup extends RoverDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new RoverDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

