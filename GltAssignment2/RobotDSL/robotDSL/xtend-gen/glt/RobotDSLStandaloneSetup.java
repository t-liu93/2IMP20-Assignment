/**
 * generated by Xtext 2.11.0
 */
package glt;

import glt.RobotDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RobotDSLStandaloneSetup extends RobotDSLStandaloneSetupGenerated {
  public static void doSetup() {
    new RobotDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}