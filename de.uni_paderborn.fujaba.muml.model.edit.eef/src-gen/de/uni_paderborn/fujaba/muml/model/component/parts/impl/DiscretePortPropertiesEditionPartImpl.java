/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;


// End of user code

/**
 * 
 * 
 */
public class DiscretePortPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DiscretePortPropertiesEditionPart {

	protected Text name;
	protected Text comment;
	protected ReferencesTable incomingConnectors;
	protected List<ViewerFilter> incomingConnectorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingConnectorsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outgoingConnectors;
	protected List<ViewerFilter> outgoingConnectorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outgoingConnectorsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer component;
	protected EObjectFlatComboViewer behavior;
	protected EObjectFlatComboViewer refines;
	protected EObjectFlatComboViewer senderMessageInterface;
	protected EObjectFlatComboViewer receiverMessageInterface;
	protected EObjectFlatComboViewer adaptationBehavior;
	protected EObjectFlatComboViewer roleAndAdaptationBehavior;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DiscretePortPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence discretePortStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = discretePortStep.addStep(ComponentViewsRepository.DiscretePort.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.name);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.comment);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.incomingConnectors);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.component_);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.behavior);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.refines);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior);
		
		
		composer = new PartComposer(discretePortStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.DiscretePort.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.name) {
					return createNameText(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.incomingConnectors) {
					return createIncomingConnectorsAdvancedReferencesTable(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors) {
					return createOutgoingConnectorsAdvancedReferencesTable(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.component_) {
					return createComponentFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.behavior) {
					return createBehaviorFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.refines) {
					return createRefinesFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface) {
					return createSenderMessageInterfaceFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface) {
					return createReceiverMessageInterfaceFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior) {
					return createAdaptationBehaviorFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior) {
					return createRoleAndAdaptationBehaviorFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ComponentMessages.DiscretePortPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.name, ComponentViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ComponentViewsRepository.DiscretePort.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.name, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.comment, ComponentViewsRepository.SWT_KIND));
		comment = new Text(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		comment.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ComponentViewsRepository.DiscretePort.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.comment, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingConnectorsAdvancedReferencesTable(Composite parent) {
		this.incomingConnectors = new ReferencesTable(ComponentMessages.DiscretePortPropertiesEditionPart_IncomingConnectorsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIncomingConnectors(); }
			public void handleEdit(EObject element) { editIncomingConnectors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingConnectors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingConnectors(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingConnectors.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.incomingConnectors, ComponentViewsRepository.SWT_KIND));
		this.incomingConnectors.createControls(parent);
		this.incomingConnectors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.incomingConnectors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingConnectorsData = new GridData(GridData.FILL_HORIZONTAL);
		incomingConnectorsData.horizontalSpan = 3;
		this.incomingConnectors.setLayoutData(incomingConnectorsData);
		this.incomingConnectors.disableMove();
		incomingConnectors.setID(ComponentViewsRepository.DiscretePort.Properties.incomingConnectors);
		incomingConnectors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncomingConnectors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incomingConnectors.getInput(), incomingConnectorsFilters, incomingConnectorsBusinessFilters,
		"incomingConnectors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.incomingConnectors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incomingConnectors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncomingConnectors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.incomingConnectors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingConnectors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingConnectors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.incomingConnectors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incomingConnectors.refresh();
	}

	/**
	 * 
	 */
	protected void editIncomingConnectors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incomingConnectors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutgoingConnectorsAdvancedReferencesTable(Composite parent) {
		this.outgoingConnectors = new ReferencesTable(ComponentMessages.DiscretePortPropertiesEditionPart_OutgoingConnectorsLabel, new ReferencesTableListener() {
			public void handleAdd() { addOutgoingConnectors(); }
			public void handleEdit(EObject element) { editOutgoingConnectors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingConnectors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingConnectors(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingConnectors.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors, ComponentViewsRepository.SWT_KIND));
		this.outgoingConnectors.createControls(parent);
		this.outgoingConnectors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingConnectorsData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingConnectorsData.horizontalSpan = 3;
		this.outgoingConnectors.setLayoutData(outgoingConnectorsData);
		this.outgoingConnectors.disableMove();
		outgoingConnectors.setID(ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors);
		outgoingConnectors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoingConnectors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoingConnectors.getInput(), outgoingConnectorsFilters, outgoingConnectorsBusinessFilters,
		"outgoingConnectors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoingConnectors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoingConnectors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingConnectors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingConnectors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoingConnectors.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoingConnectors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoingConnectors.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createComponentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_ComponentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.component_, ComponentViewsRepository.SWT_KIND));
		component = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.component_, ComponentViewsRepository.SWT_KIND));
		component.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		component.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.component_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getComponent()));
			}

		});
		GridData componentData = new GridData(GridData.FILL_HORIZONTAL);
		component.setLayoutData(componentData);
		component.setID(ComponentViewsRepository.DiscretePort.Properties.component_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.component_, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_BehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.behavior, ComponentViewsRepository.SWT_KIND));
		behavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.behavior, ComponentViewsRepository.SWT_KIND));
		behavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		behavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.behavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBehavior()));
			}

		});
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behavior.setLayoutData(behaviorData);
		behavior.setID(ComponentViewsRepository.DiscretePort.Properties.behavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.behavior, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRefinesFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_RefinesLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.refines, ComponentViewsRepository.SWT_KIND));
		refines = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.refines, ComponentViewsRepository.SWT_KIND));
		refines.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		refines.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.refines, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRefines()));
			}

		});
		GridData refinesData = new GridData(GridData.FILL_HORIZONTAL);
		refines.setLayoutData(refinesData);
		refines.setID(ComponentViewsRepository.DiscretePort.Properties.refines);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.refines, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSenderMessageInterfaceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_SenderMessageInterfaceLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface, ComponentViewsRepository.SWT_KIND));
		senderMessageInterface = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface, ComponentViewsRepository.SWT_KIND));
		senderMessageInterface.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		senderMessageInterface.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSenderMessageInterface()));
			}

		});
		GridData senderMessageInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		senderMessageInterface.setLayoutData(senderMessageInterfaceData);
		senderMessageInterface.setID(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createReceiverMessageInterfaceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_ReceiverMessageInterfaceLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface, ComponentViewsRepository.SWT_KIND));
		receiverMessageInterface = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface, ComponentViewsRepository.SWT_KIND));
		receiverMessageInterface.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		receiverMessageInterface.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReceiverMessageInterface()));
			}

		});
		GridData receiverMessageInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		receiverMessageInterface.setLayoutData(receiverMessageInterfaceData);
		receiverMessageInterface.setID(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createAdaptationBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_AdaptationBehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior, ComponentViewsRepository.SWT_KIND));
		adaptationBehavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior, ComponentViewsRepository.SWT_KIND));
		adaptationBehavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		adaptationBehavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getAdaptationBehavior()));
			}

		});
		GridData adaptationBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		adaptationBehavior.setLayoutData(adaptationBehaviorData);
		adaptationBehavior.setID(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRoleAndAdaptationBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.DiscretePortPropertiesEditionPart_RoleAndAdaptationBehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior, ComponentViewsRepository.SWT_KIND));
		roleAndAdaptationBehavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior, ComponentViewsRepository.SWT_KIND));
		roleAndAdaptationBehavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		roleAndAdaptationBehavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartImpl.this, ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRoleAndAdaptationBehavior()));
			}

		});
		GridData roleAndAdaptationBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		roleAndAdaptationBehavior.setLayoutData(roleAndAdaptationBehaviorData);
		roleAndAdaptationBehavior.setID(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initIncomingConnectors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncomingConnectors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingConnectors.setContentProvider(contentProvider);
		incomingConnectors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#updateIncomingConnectors()
	 * 
	 */
	public void updateIncomingConnectors() {
	incomingConnectors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterIncomingConnectors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingConnectors(ViewerFilter filter) {
		incomingConnectorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterIncomingConnectors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingConnectors(ViewerFilter filter) {
		incomingConnectorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#isContainedInIncomingConnectorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingConnectorsTable(EObject element) {
		return ((ReferencesTableSettings)incomingConnectors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initOutgoingConnectors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoingConnectors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoingConnectors.setContentProvider(contentProvider);
		outgoingConnectors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#updateOutgoingConnectors()
	 * 
	 */
	public void updateOutgoingConnectors() {
	outgoingConnectors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterOutgoingConnectors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingConnectors(ViewerFilter filter) {
		outgoingConnectorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterOutgoingConnectors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingConnectors(ViewerFilter filter) {
		outgoingConnectorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#isContainedInOutgoingConnectorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingConnectorsTable(EObject element) {
		return ((ReferencesTableSettings)outgoingConnectors.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getComponent()
	 * 
	 */
	public EObject getComponent() {
		if (component.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) component.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initComponent(EObjectFlatComboSettings)
	 */
	public void initComponent(EObjectFlatComboSettings settings) {
		component.setInput(settings);
		if (current != null) {
			component.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setComponent(EObject newValue)
	 * 
	 */
	public void setComponent(EObject newValue) {
		if (newValue != null) {
			component.setSelection(new StructuredSelection(newValue));
		} else {
			component.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentButtonMode(ButtonsModeEnum newValue) {
		component.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponent(ViewerFilter filter) {
		component.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponent(ViewerFilter filter) {
		component.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getBehavior()
	 * 
	 */
	public EObject getBehavior() {
		if (behavior.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) behavior.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initBehavior(EObjectFlatComboSettings)
	 */
	public void initBehavior(EObjectFlatComboSettings settings) {
		behavior.setInput(settings);
		if (current != null) {
			behavior.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setBehavior(EObject newValue)
	 * 
	 */
	public void setBehavior(EObject newValue) {
		if (newValue != null) {
			behavior.setSelection(new StructuredSelection(newValue));
		} else {
			behavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBehaviorButtonMode(ButtonsModeEnum newValue) {
		behavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter) {
		behavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter) {
		behavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getRefines()
	 * 
	 */
	public EObject getRefines() {
		if (refines.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) refines.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initRefines(EObjectFlatComboSettings)
	 */
	public void initRefines(EObjectFlatComboSettings settings) {
		refines.setInput(settings);
		if (current != null) {
			refines.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setRefines(EObject newValue)
	 * 
	 */
	public void setRefines(EObject newValue) {
		if (newValue != null) {
			refines.setSelection(new StructuredSelection(newValue));
		} else {
			refines.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setRefinesButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRefinesButtonMode(ButtonsModeEnum newValue) {
		refines.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterRefines(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRefines(ViewerFilter filter) {
		refines.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterRefines(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRefines(ViewerFilter filter) {
		refines.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getSenderMessageInterface()
	 * 
	 */
	public EObject getSenderMessageInterface() {
		if (senderMessageInterface.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) senderMessageInterface.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initSenderMessageInterface(EObjectFlatComboSettings)
	 */
	public void initSenderMessageInterface(EObjectFlatComboSettings settings) {
		senderMessageInterface.setInput(settings);
		if (current != null) {
			senderMessageInterface.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setSenderMessageInterface(EObject newValue)
	 * 
	 */
	public void setSenderMessageInterface(EObject newValue) {
		if (newValue != null) {
			senderMessageInterface.setSelection(new StructuredSelection(newValue));
		} else {
			senderMessageInterface.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setSenderMessageInterfaceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSenderMessageInterfaceButtonMode(ButtonsModeEnum newValue) {
		senderMessageInterface.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterSenderMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSenderMessageInterface(ViewerFilter filter) {
		senderMessageInterface.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterSenderMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSenderMessageInterface(ViewerFilter filter) {
		senderMessageInterface.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getReceiverMessageInterface()
	 * 
	 */
	public EObject getReceiverMessageInterface() {
		if (receiverMessageInterface.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) receiverMessageInterface.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initReceiverMessageInterface(EObjectFlatComboSettings)
	 */
	public void initReceiverMessageInterface(EObjectFlatComboSettings settings) {
		receiverMessageInterface.setInput(settings);
		if (current != null) {
			receiverMessageInterface.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setReceiverMessageInterface(EObject newValue)
	 * 
	 */
	public void setReceiverMessageInterface(EObject newValue) {
		if (newValue != null) {
			receiverMessageInterface.setSelection(new StructuredSelection(newValue));
		} else {
			receiverMessageInterface.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setReceiverMessageInterfaceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReceiverMessageInterfaceButtonMode(ButtonsModeEnum newValue) {
		receiverMessageInterface.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterReceiverMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReceiverMessageInterface(ViewerFilter filter) {
		receiverMessageInterface.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterReceiverMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReceiverMessageInterface(ViewerFilter filter) {
		receiverMessageInterface.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getAdaptationBehavior()
	 * 
	 */
	public EObject getAdaptationBehavior() {
		if (adaptationBehavior.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) adaptationBehavior.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initAdaptationBehavior(EObjectFlatComboSettings)
	 */
	public void initAdaptationBehavior(EObjectFlatComboSettings settings) {
		adaptationBehavior.setInput(settings);
		if (current != null) {
			adaptationBehavior.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setAdaptationBehavior(EObject newValue)
	 * 
	 */
	public void setAdaptationBehavior(EObject newValue) {
		if (newValue != null) {
			adaptationBehavior.setSelection(new StructuredSelection(newValue));
		} else {
			adaptationBehavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setAdaptationBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdaptationBehaviorButtonMode(ButtonsModeEnum newValue) {
		adaptationBehavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdaptationBehavior(ViewerFilter filter) {
		adaptationBehavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdaptationBehavior(ViewerFilter filter) {
		adaptationBehavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getRoleAndAdaptationBehavior()
	 * 
	 */
	public EObject getRoleAndAdaptationBehavior() {
		if (roleAndAdaptationBehavior.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) roleAndAdaptationBehavior.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initRoleAndAdaptationBehavior(EObjectFlatComboSettings)
	 */
	public void initRoleAndAdaptationBehavior(EObjectFlatComboSettings settings) {
		roleAndAdaptationBehavior.setInput(settings);
		if (current != null) {
			roleAndAdaptationBehavior.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setRoleAndAdaptationBehavior(EObject newValue)
	 * 
	 */
	public void setRoleAndAdaptationBehavior(EObject newValue) {
		if (newValue != null) {
			roleAndAdaptationBehavior.setSelection(new StructuredSelection(newValue));
		} else {
			roleAndAdaptationBehavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum newValue) {
		roleAndAdaptationBehavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterRoleAndAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRoleAndAdaptationBehavior(ViewerFilter filter) {
		roleAndAdaptationBehavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterRoleAndAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRoleAndAdaptationBehavior(ViewerFilter filter) {
		roleAndAdaptationBehavior.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.DiscretePort_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
