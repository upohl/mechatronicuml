/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms;

// Start of user code for imports


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class AsynchronousMessageEventPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AsynchronousMessageEventPropertiesEditionPart {

	protected EMFComboViewer kind;
	protected ReferencesTable message;
	protected List<ViewerFilter> messageBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> messageFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AsynchronousMessageEventPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence asynchronousMessageEventStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = asynchronousMessageEventStep.addStep(RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.kind);
		propertiesStep.addStep(RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message);
		
		
		composer = new PartComposer(asynchronousMessageEventStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.kind) {
					return createKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message) {
					return createMessageTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(RealtimestatechartMessages.AsynchronousMessageEventPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.AsynchronousMessageEventPropertiesEditionPart_KindLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.kind, RealtimestatechartViewsRepository.FORM_KIND));
		kind = new EMFComboViewer(parent);
		kind.setContentProvider(new ArrayContentProvider());
		kind.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.getCombo().setLayoutData(kindData);
		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AsynchronousMessageEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.kind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.kind, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMessageTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.message = new ReferencesTable(RealtimestatechartMessages.AsynchronousMessageEventPropertiesEditionPart_MessageLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AsynchronousMessageEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				message.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AsynchronousMessageEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				message.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AsynchronousMessageEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				message.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AsynchronousMessageEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				message.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.messageFilters) {
			this.message.addFilter(filter);
		}
		this.message.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message, RealtimestatechartViewsRepository.FORM_KIND));
		this.message.createControls(parent, widgetFactory);
		this.message.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AsynchronousMessageEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData messageData = new GridData(GridData.FILL_HORIZONTAL);
		messageData.horizontalSpan = 3;
		this.message.setLayoutData(messageData);
		this.message.setLowerBound(1);
		this.message.setUpperBound(1);
		message.setID(RealtimestatechartViewsRepository.AsynchronousMessageEvent.Properties.message);
		message.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart#getKind()
	 * 
	 */
	public Enumerator getKind() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) kind.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart#initKind(EEnum eenum, Enumerator current)
	 */
	public void initKind(EEnum eenum, Enumerator current) {
		kind.setInput(eenum.getELiterals());
		kind.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart#setKind(Enumerator newValue)
	 * 
	 */
	public void setKind(Enumerator newValue) {
		kind.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart#initMessage(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMessage(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		message.setContentProvider(contentProvider);
		message.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart#updateMessage()
	 * 
	 */
	public void updateMessage() {
	message.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart#addFilterMessage(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMessage(ViewerFilter filter) {
		messageFilters.add(filter);
		if (this.message != null) {
			this.message.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart#addBusinessFilterMessage(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMessage(ViewerFilter filter) {
		messageBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AsynchronousMessageEventPropertiesEditionPart#isContainedInMessageTable(EObject element)
	 * 
	 */
	public boolean isContainedInMessageTable(EObject element) {
		return ((ReferencesTableSettings)message.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.AsynchronousMessageEvent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
