/*
 * generated by Xtext 2.10.0
 */
package de.fraunhofer.iem.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ProjectPlanningAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/fraunhofer/iem/parser/antlr/internal/InternalProjectPlanning.tokens");
	}
}
