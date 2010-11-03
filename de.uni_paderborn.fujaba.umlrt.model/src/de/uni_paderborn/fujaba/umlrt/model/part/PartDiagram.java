/**
 * 
 */
/*
 * generated by Fujaba - CodeGen2
 */

package de.uni_paderborn.fujaba.umlrt.model.part;


import de.uni_paderborn.fujaba.umlrt.model.component.Component;


/**
 * @author chrome
 * @author Last editor: $Author: chrome $
 * @version $Revision: 2849 $ $Date: 2008-02-15 18:36:59 +0100 (Fr, 15 Feb 2008) $
 * 
 * @model
 */
public interface PartDiagram // extends ASGDiagram
{
	/**
	 * @model
	 */
   public Component getComponent ();

	/**
	 * @model
	 */
   public java.util.List<Part> getEmbeddedParts();

	/**
	 * @model
	 */
   public String getName ();

}

/*
 * $Log$
 * Revision 1.4  2008/02/15 17:36:44  chrome
 * last refactorings:
 * - renamed Composite -> Part
 * - SoftwareComponentVariable/Instance
 *
 * Revision 1.3  2008/01/31 21:19:03  chrome
 * - Updated Params and Arguments
 * - Introduced Composite as superclass of Parts and ConnectorTypes
 * - Mapping rules for Params and Aguments
 * Revision 1.2 2007/10/27 13:59:38 chrome changed many associations to
 * compositions - Delegation- and AssemlblyTypes are deleted if related Port(-Parts) are deleted -
 * Deleting a Component results in deleting all embedded and referencing Parts and ConnectorTypes
 * Revision 1.1 2007/10/19 13:37:35 chrome changed package structure
 * 
 * Revision 1.1 2007/10/18 14:12:50 chrome - Introduced PartDiagram - Changed responsibilities of
 * HierarchicalComponentDiagram
 * 
 * 
 */