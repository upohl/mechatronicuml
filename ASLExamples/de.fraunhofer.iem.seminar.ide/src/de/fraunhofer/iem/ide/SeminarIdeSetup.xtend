/*
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.ide

import com.google.inject.Guice
import de.fraunhofer.iem.SeminarRuntimeModule
import de.fraunhofer.iem.SeminarStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SeminarIdeSetup extends SeminarStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SeminarRuntimeModule, new SeminarIdeModule))
	}
	
}