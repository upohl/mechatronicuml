/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface SynchronizationChannelPropertiesEditionPart {

	/**
	 * @return the comment
	 * 
	 */
	public String getComment();

	/**
	 * Defines a new comment
	 * @param newValue the new comment to set
	 * 
	 */
	public void setComment(String newValue);




	/**
	 * Init the inParameter
	 * @param settings settings for the inParameter ReferencesTable 
	 */
	public void initInParameter(ReferencesTableSettings settings);

	/**
	 * Update the inParameter
	 * @param newValue the inParameter to update
	 * 
	 */
	public void updateInParameter();

	/**
	 * Adds the given filter to the inParameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInParameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the inParameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInParameter(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inParameter table
	 * 
	 */
	public boolean isContainedInInParameterTable(EObject element);




	/**
	 * Init the outParameter
	 * @param settings settings for the outParameter ReferencesTable 
	 */
	public void initOutParameter(ReferencesTableSettings settings);

	/**
	 * Update the outParameter
	 * @param newValue the outParameter to update
	 * 
	 */
	public void updateOutParameter();

	/**
	 * Adds the given filter to the outParameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutParameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the outParameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutParameter(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outParameter table
	 * 
	 */
	public boolean isContainedInOutParameterTable(EObject element);


	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the state
	 * 
	 */
	public EObject getState();

	/**
	 * Init the state
	 * @param settings the combo setting
	 */
	public void initState(EObjectFlatComboSettings settings);

	/**
	 * Defines a new state
	 * @param newValue the new state to set
	 * 
	 */
	public void setState(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setStateButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the state edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToState(ViewerFilter filter);

	/**
	 * Adds the given filter to the state edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToState(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}
