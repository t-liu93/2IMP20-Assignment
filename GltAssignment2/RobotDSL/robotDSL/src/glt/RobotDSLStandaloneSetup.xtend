/*
 * generated by Xtext 2.11.0
 */
package glt


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RobotDSLStandaloneSetup extends RobotDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new RobotDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
