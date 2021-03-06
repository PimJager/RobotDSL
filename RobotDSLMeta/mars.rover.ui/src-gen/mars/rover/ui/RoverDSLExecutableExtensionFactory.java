/*
 * generated by Xtext
 */
package mars.rover.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import mars.rover.ui.internal.RoverDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RoverDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RoverDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RoverDSLActivator.getInstance().getInjector(RoverDSLActivator.MARS_ROVER_ROVERDSL);
	}
	
}
