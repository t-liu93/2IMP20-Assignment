/**
 * generated by Xtext 2.11.0
 */
package glt.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import glt.RobotDSLRuntimeModule;
import glt.RobotDSLStandaloneSetup;
import glt.ide.RobotDSLIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RobotDSLIdeSetup extends RobotDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    RobotDSLRuntimeModule _robotDSLRuntimeModule = new RobotDSLRuntimeModule();
    RobotDSLIdeModule _robotDSLIdeModule = new RobotDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_robotDSLRuntimeModule, _robotDSLIdeModule));
  }
}