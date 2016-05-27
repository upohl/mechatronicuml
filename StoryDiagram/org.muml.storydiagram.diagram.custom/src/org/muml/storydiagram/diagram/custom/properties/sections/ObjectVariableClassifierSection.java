package org.muml.storydiagram.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.muml.core.CorePackage;
import org.muml.storydiagram.diagram.custom.ResourceManager;
import org.muml.storydiagram.diagram.custom.dialogs.SelectEClassDialog;
import org.muml.storydiagram.diagram.custom.util.ActivityUtil;
import org.muml.storydiagram.diagram.custom.util.EcoreTextUtil;
import org.muml.storydiagram.patterns.ObjectVariable;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class ObjectVariableClassifierSection extends AbstractComboSection<EClass> {
	private SelectEClassDialog dialog;

	public ObjectVariableClassifierSection() {
		dialog = new SelectEClassDialog();
	}

	@Override
	protected void handleButtonClicked() {
		dialog.setActivity(ActivityUtil.getActivity(getElement()));
		ObjectVariable objectVariable = ((ObjectVariable) getElement());
		if (objectVariable.getClassifier() instanceof EClass) {
			dialog.setSelectedElement((EClass) objectVariable.getClassifier());
			if (dialog.open() == Window.OK) {
				EClass result = dialog.getElement();
				set(result);
				refresh();
			}
		}
	}

	@Override
	protected EStructuralFeature getFeature() {
		return EcorePackage.Literals.EGENERIC_TYPE__ECLASSIFIER;
	}
	
	@Override
	protected EObject getElement() {
		if(super.getElement() instanceof ObjectVariable){
			ObjectVariable objectVariable = (ObjectVariable) super.getElement();
			if(objectVariable.getGenericType() == null){
				objectVariable.setGenericType(EcoreFactory.eINSTANCE.createEGenericType());
			}
			return objectVariable.getGenericType();
		}
		return super.getElement();
	}
	
//	@Override
//	protected void hookWidgetListeners() {
//		super.getCombo()ombo.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				set(map.get(combo.getSelectionIndex()));
//				validate();
//			}
//		});
//
//		if (shouldShowButton()) {
//			button.addSelectionListener(new SelectionAdapter() {
//				@Override
//				public void widgetSelected(SelectionEvent e) {
//					handleButtonClicked();
//				}
//			});
//		}
//	}
	
	@Override
	protected List<EClass> getItems() {
		List<EClass> items = new ArrayList<EClass>();
		items.add(null);
		items.addAll(ResourceManager.get(ActivityUtil.getActivity(getElement())).getEClasses());
		return items;
	}

	@Override
	protected String getLabelText() {
		return "Type";
	}

	@Override
	protected boolean shouldShowButton() {
		return true;
	}

	@Override
	protected String getText(EClass element) {
		return EcoreTextUtil.getQualifiedText(element);
	}
}
