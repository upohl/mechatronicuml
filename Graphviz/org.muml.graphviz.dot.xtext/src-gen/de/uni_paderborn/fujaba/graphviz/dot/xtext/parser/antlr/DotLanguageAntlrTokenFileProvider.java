/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.graphviz.dot.xtext.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DotLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.tokens");
	}
}
