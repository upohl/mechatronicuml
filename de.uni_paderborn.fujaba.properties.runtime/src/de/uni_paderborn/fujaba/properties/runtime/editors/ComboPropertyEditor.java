package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;

public class ComboPropertyEditor extends AbstractStructuralFeaturePropertyEditor {
	
	protected boolean hasSearchButton;
	
	protected Label label;
	
	protected Composite composite;
	
	protected ComboViewer comboViewer;
	
	protected Button searchButton;
	
	public ComboPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		this(adapterFactory, feature, feature instanceof EReference);
	}

	public ComboPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature, boolean hasSearchButton) {
		super(adapterFactory, feature);
		if (hasSearchButton) {
			Assert.isLegal(feature instanceof EReference, "Currently, only references can be searched via search dialog.");
		}
		this.hasSearchButton = hasSearchButton;
	}

	@Override
	public void createControls(Composite parent,
			FormToolkit toolkit) {
		super.createControls(parent, toolkit);
		label = toolkit.createLabel(parent, getLabelText());
		if (parent.getLayout() instanceof GridLayout) {
			label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		}
		
		if (hasSearchButton) {
			composite = new Composite(parent, SWT.NONE) {
				public void layout (Control [] changed, int flags) {
					super.layout(changed, flags);
				}
			};
			parent = composite; // use the composite as parent from now on
			GridLayout compositeLayout = new GridLayout(2, false);
			compositeLayout.marginWidth = compositeLayout.marginHeight = 0;
			parent.setLayout(compositeLayout);
			parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		}

		Combo combo = new Combo(parent, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
		installTooltip(combo);
		installTooltip(label);
		comboViewer = new ComboViewer(combo);
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		comboViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		if (parent.getLayout() instanceof GridLayout) {
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
			combo.setLayoutData(gridData);
		}
		comboViewer.getCombo().addListener(SWT.MouseWheel, new Listener() {

		      @Override
		      public void handleEvent(final Event event) {
		    	// Remove possibility to use the scroll wheel in the ComboPropertyEditor to change values,
		    	// because it often happend accidently when the user only wanted to scroll
		    	// the complete properties page and accidently had a ComboBox under his mouse.
		        event.doit = false;
		      }
		    });

		comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object newSelection = null;
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) event
							.getSelection();
					if (!structuredSelection.isEmpty()) {
						newSelection = structuredSelection
								.iterator().next();
					}
				}
				ComboPropertyEditor.this.selectionChanged(newSelection);
			}

			
		});
		
		if (hasSearchButton) {
			searchButton = new Button(parent, SWT.PUSH);
			searchButton.setText("...");
			searchButton.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false));
			searchButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					search();
				}
			});
		}

		refresh();

	}

	protected void selectionChanged(Object newSelection) {
		setValue(newSelection);
	}

	@Override
	protected void inputChanged() {		
		super.inputChanged();
		setInput();
	}
	
	private void setInput() {
		Object value = this.value;

		Collection<?> choices = getChoices();

		// Problem: AbstractListViewer does not allow null!
		choices.remove(null);
		
		if (comboViewer != null) {
			comboViewer.setInput(choices);
		}

		applySelection(value);
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		applySelection(value);
	}
	

	private void applySelection(Object selection) {
		if (comboViewer == null) {
			return;
		}

		// Set selection
		Collection<?> comboInput = (Collection<?>) comboViewer.getInput();
		if (comboInput != null && comboInput.contains(selection) || selection == null) {
			ISelection sel;
			if (selection == null) {
				sel = new StructuredSelection();
			} else {
				sel = new StructuredSelection(selection);
			}
			comboViewer.setSelection(sel);
		}
	}

	
	@Override
	public void refresh() {
		super.refresh();
		if (comboViewer != null) {
			comboViewer.refresh();
		}
		setInput();
	}
	
	public void search() {
		@SuppressWarnings("unchecked")
		List<Object> selectedElements = RuntimePlugin.showReferenceElementDialog(adapterFactory, getChoices(), value, Collections.EMPTY_LIST, false);

		// Add object, if one was selected
		if (selectedElements != null && !selectedElements.isEmpty()) {
			setValue(selectedElements.get(0));
		}
	}

	@Override
	protected void doSetVisible(boolean visible) {
		List<Control> controls = new ArrayList<Control>();
		controls.addAll(Arrays.asList(new Control[] { label, searchButton, composite }));
		if ( comboViewer != null) {
			 controls.add(comboViewer.getCombo());
		}
		for (Control control : controls) {
			if (control != null && !control.isDisposed()) {
				control.setVisible(visible);
				if (control.getLayoutData() instanceof GridData) {
					((GridData) control.getLayoutData()).exclude = !visible;
				}
			}
		}
	}
	
	@Override
	public void setFocus() {
		if (comboViewer != null && !comboViewer.getCombo().isDisposed())
		comboViewer.getCombo().setFocus();
	}
}