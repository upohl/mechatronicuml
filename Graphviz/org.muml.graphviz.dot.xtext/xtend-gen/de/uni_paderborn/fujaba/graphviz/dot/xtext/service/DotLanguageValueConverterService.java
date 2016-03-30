package de.uni_paderborn.fujaba.graphviz.dot.xtext.service;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.graphviz.dot.xtext.conversion.DotIDValueConverter;

@SuppressWarnings("all")
public class DotLanguageValueConverterService extends Ecore2XtextTerminalConverters {
  @Inject
  private DotIDValueConverter dotStringValueConverter;
  
  @ValueConverter(rule = "DotID")
  public IValueConverter<String> getDotID() {
    return this.dotStringValueConverter;
  }
}
