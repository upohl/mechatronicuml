/**
 * generated by Xtext
 */
package de.uni_paderborn.uppaal.formatting;

import com.google.inject.Inject;
import de.uni_paderborn.uppaal.services.UppaalXMLGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class UppaalXMLFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private UppaalXMLGrammarAccess _uppaalXMLGrammarAccess;
  
  protected void configureFormatting(final FormattingConfig c) {
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this._uppaalXMLGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        Keyword _first = pair.getFirst();
        Keyword _second = pair.getSecond();
        c.setIndentation(_first, _second);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(1);
        Keyword _first_1 = pair.getFirst();
        _setLinewrap.before(_first_1);
        FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(1);
        Keyword _first_2 = pair.getFirst();
        _setLinewrap_1.after(_first_2);
        FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(1);
        Keyword _second_1 = pair.getSecond();
        _setLinewrap_2.before(_second_1);
        FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap(1);
        Keyword _second_2 = pair.getSecond();
        _setLinewrap_3.after(_second_2);
      }
    }
    List<Keyword> _findKeywords = this._uppaalXMLGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(comma);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(comma);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap_1 = c.setNoLinewrap();
        _setNoLinewrap_1.after(comma);
      }
    }
    List<Keyword> _findKeywords_1 = this._uppaalXMLGrammarAccess.findKeywords(".");
    for (final Keyword period : _findKeywords_1) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(period);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(period);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        _setNoSpace_1.after(period);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap_1 = c.setNoLinewrap();
        _setNoLinewrap_1.after(period);
      }
    }
    List<Keyword> _findKeywords_2 = this._uppaalXMLGrammarAccess.findKeywords(";");
    for (final Keyword semi : _findKeywords_2) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(semi);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(semi);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(1);
        _setLinewrap.after(semi);
      }
    }
    List<Keyword> _findKeywords_3 = this._uppaalXMLGrammarAccess.findKeywords("=");
    for (final Keyword equality : _findKeywords_3) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(equality);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap_1 = c.setNoLinewrap();
        _setNoLinewrap_1.after(equality);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(equality);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        _setNoSpace_1.after(equality);
      }
    }
    List<Pair<Keyword, Keyword>> _findKeywordPairs_1 = this._uppaalXMLGrammarAccess.findKeywordPairs("<", ">");
    for (final Pair<Keyword, Keyword> pair_1 : _findKeywordPairs_1) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        Keyword _first = pair_1.getFirst();
        _setNoLinewrap.before(_first);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(1);
        Keyword _second = pair_1.getSecond();
        _setLinewrap.after(_second);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _first_1 = pair_1.getFirst();
        _setNoSpace.before(_first_1);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _second_1 = pair_1.getSecond();
        _setNoSpace_1.before(_second_1);
        FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        Keyword _first_2 = pair_1.getFirst();
        _setNoSpace_2.after(_first_2);
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        Keyword _second_2 = pair_1.getSecond();
        _setNoSpace_3.after(_second_2);
      }
    }
    List<Pair<Keyword, Keyword>> _findKeywordPairs_2 = this._uppaalXMLGrammarAccess.findKeywordPairs("[", "]");
    for (final Pair<Keyword, Keyword> pair_2 : _findKeywordPairs_2) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        Keyword _first = pair_2.getFirst();
        _setNoLinewrap.before(_first);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap_1 = c.setNoLinewrap();
        Keyword _first_1 = pair_2.getFirst();
        _setNoLinewrap_1.after(_first_1);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap_2 = c.setNoLinewrap();
        Keyword _second = pair_2.getSecond();
        _setNoLinewrap_2.before(_second);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap_3 = c.setNoLinewrap();
        Keyword _second_1 = pair_2.getSecond();
        _setNoLinewrap_3.after(_second_1);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _first_2 = pair_2.getFirst();
        _setNoSpace.before(_first_2);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _second_2 = pair_2.getSecond();
        _setNoSpace_1.before(_second_2);
        FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        Keyword _first_3 = pair_2.getFirst();
        _setNoSpace_2.after(_first_3);
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        Keyword _second_3 = pair_2.getSecond();
        _setNoSpace_3.after(_second_3);
      }
    }
    List<Pair<Keyword, Keyword>> _findKeywordPairs_3 = this._uppaalXMLGrammarAccess.findKeywordPairs("</", ">");
    for (final Pair<Keyword, Keyword> pair_3 : _findKeywordPairs_3) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        Keyword _first = pair_3.getFirst();
        _setNoLinewrap.before(_first);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(1);
        Keyword _second = pair_3.getSecond();
        _setLinewrap.after(_second);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _first_1 = pair_3.getFirst();
        _setNoSpace.before(_first_1);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _second_1 = pair_3.getSecond();
        _setNoSpace_1.before(_second_1);
        FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        Keyword _first_2 = pair_3.getFirst();
        _setNoSpace_2.after(_first_2);
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        Keyword _second_2 = pair_3.getSecond();
        _setNoSpace_3.after(_second_2);
      }
    }
    List<Pair<Keyword, Keyword>> _findKeywordPairs_4 = this._uppaalXMLGrammarAccess.findKeywordPairs("<", "/>");
    for (final Pair<Keyword, Keyword> pair_4 : _findKeywordPairs_4) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        Keyword _first = pair_4.getFirst();
        _setNoLinewrap.before(_first);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(1);
        Keyword _second = pair_4.getSecond();
        _setLinewrap.after(_second);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _first_1 = pair_4.getFirst();
        _setNoSpace.before(_first_1);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _second_1 = pair_4.getSecond();
        _setNoSpace_1.before(_second_1);
        FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        Keyword _first_2 = pair_4.getFirst();
        _setNoSpace_2.after(_first_2);
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        Keyword _second_2 = pair_4.getSecond();
        _setNoSpace_3.after(_second_2);
      }
    }
  }
}
