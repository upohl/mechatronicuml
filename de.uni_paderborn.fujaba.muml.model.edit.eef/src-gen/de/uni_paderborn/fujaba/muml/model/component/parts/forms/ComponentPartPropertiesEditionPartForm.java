/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;


// End of user code

/**
 * 
 * 
 */
public class ComponentPartPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ComponentPartPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer componentType;
	protected EObjectFlatComboViewer parentComponent;
		protected ReferencesTable fromRev;
		protected List<ViewerFilter> fromRevBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> fromRevFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable toRev;
		protected List<ViewerFilter> toRevBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> toRevFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable delegation;
		protected List<ViewerFilter> delegationBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> delegationFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ComponentPartPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence componentPartStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = componentPartStep.addStep(ComponentViewsRepository.ComponentPart.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.ComponentPart.Properties.comment);
		propertiesStep.addStep(ComponentViewsRepository.ComponentPart.Properties.componentType);
		propertiesStep.addStep(ComponentViewsRepository.ComponentPart.Properties.parentComponent);
		propertiesStep.addStep(ComponentViewsRepository.ComponentPart.Properties.fromRev);
		propertiesStep.addStep(ComponentViewsRepository.ComponentPart.Properties.toRev);
		propertiesStep.addStep(ComponentViewsRepository.ComponentPart.Properties.delegation);
		
		
		composer = new PartComposer(componentPartStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.ComponentPart.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.ComponentPart.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.ComponentPart.Properties.componentType) {
					return createComponentTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.ComponentPart.Properties.parentComponent) {
					return createParentComponentFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.ComponentPart.Properties.fromRev) {
					return createFromRevReferencesTable(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.ComponentPart.Properties.toRev) {
					return createToRevReferencesTable(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.ComponentPart.Properties.delegation) {
					return createDelegationReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(ComponentMessages.ComponentPartPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.ComponentPartPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.ComponentPart.Properties.comment, ComponentViewsRepository.FORM_KIND));
		comment = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comment.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}
		});
		comment.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, ComponentViewsRepository.ComponentPart.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ComponentPart.Properties.comment, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createComponentTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.ComponentPartPropertiesEditionPart_ComponentTypeLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.ComponentPart.Properties.componentType, ComponentViewsRepository.FORM_KIND));
		componentType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.ComponentPart.Properties.componentType, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(componentType);
		componentType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData componentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		componentType.setLayoutData(componentTypeData);
		componentType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.componentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponentType()));
			}

		});
		componentType.setID(ComponentViewsRepository.ComponentPart.Properties.componentType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ComponentPart.Properties.componentType, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createParentComponentFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.ComponentPartPropertiesEditionPart_ParentComponentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.ComponentPart.Properties.parentComponent, ComponentViewsRepository.FORM_KIND));
		parentComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.ComponentPart.Properties.parentComponent, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(parentComponent);
		parentComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parentComponentData = new GridData(GridData.FILL_HORIZONTAL);
		parentComponent.setLayoutData(parentComponentData);
		parentComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.parentComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParentComponent()));
			}

		});
		parentComponent.setID(ComponentViewsRepository.ComponentPart.Properties.parentComponent);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ComponentPart.Properties.parentComponent, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createFromRevReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.fromRev = new ReferencesTable(ComponentMessages.ComponentPartPropertiesEditionPart_FromRevLabel, new ReferencesTableListener	() {
			public void handleAdd() { addFromRev(); }
			public void handleEdit(EObject element) { editFromRev(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFromRev(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFromRev(element); }
			public void navigateTo(EObject element) { }
		});
		this.fromRev.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ComponentPart.Properties.fromRev, ComponentViewsRepository.FORM_KIND));
		this.fromRev.createControls(parent, widgetFactory);
		this.fromRev.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.fromRev, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData fromRevData = new GridData(GridData.FILL_HORIZONTAL);
		fromRevData.horizontalSpan = 3;
		this.fromRev.setLayoutData(fromRevData);
		this.fromRev.disableMove();
		fromRev.setID(ComponentViewsRepository.ComponentPart.Properties.fromRev);
		fromRev.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFromRev() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(fromRev.getInput(), fromRevFilters, fromRevBusinessFilters,
		"fromRev", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.fromRev,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				fromRev.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFromRev(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.fromRev, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		fromRev.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFromRev(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.fromRev, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		fromRev.refresh();
	}

	/**
	 * 
	 */
	protected void editFromRev(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				fromRev.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createToRevReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.toRev = new ReferencesTable(ComponentMessages.ComponentPartPropertiesEditionPart_ToRevLabel, new ReferencesTableListener	() {
			public void handleAdd() { addToRev(); }
			public void handleEdit(EObject element) { editToRev(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveToRev(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromToRev(element); }
			public void navigateTo(EObject element) { }
		});
		this.toRev.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ComponentPart.Properties.toRev, ComponentViewsRepository.FORM_KIND));
		this.toRev.createControls(parent, widgetFactory);
		this.toRev.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.toRev, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData toRevData = new GridData(GridData.FILL_HORIZONTAL);
		toRevData.horizontalSpan = 3;
		this.toRev.setLayoutData(toRevData);
		this.toRev.disableMove();
		toRev.setID(ComponentViewsRepository.ComponentPart.Properties.toRev);
		toRev.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addToRev() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(toRev.getInput(), toRevFilters, toRevBusinessFilters,
		"toRev", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.toRev,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				toRev.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveToRev(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.toRev, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		toRev.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromToRev(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.toRev, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		toRev.refresh();
	}

	/**
	 * 
	 */
	protected void editToRev(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				toRev.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegationReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.delegation = new ReferencesTable(ComponentMessages.ComponentPartPropertiesEditionPart_DelegationLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDelegation(); }
			public void handleEdit(EObject element) { editDelegation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegation(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegation.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ComponentPart.Properties.delegation, ComponentViewsRepository.FORM_KIND));
		this.delegation.createControls(parent, widgetFactory);
		this.delegation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.delegation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegationData = new GridData(GridData.FILL_HORIZONTAL);
		delegationData.horizontalSpan = 3;
		this.delegation.setLayoutData(delegationData);
		this.delegation.disableMove();
		delegation.setID(ComponentViewsRepository.ComponentPart.Properties.delegation);
		delegation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDelegation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(delegation.getInput(), delegationFilters, delegationBusinessFilters,
		"delegation", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.delegation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				delegation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDelegation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.delegation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComponentPartPropertiesEditionPartForm.this, ComponentViewsRepository.ComponentPart.Properties.delegation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		delegation.refresh();
	}

	/**
	 * 
	 */
	protected void editDelegation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				delegation.refresh();
			}
		}
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#getComponentType()
	 * 
	 */
	public EObject getComponentType() {
		if (componentType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) componentType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#initComponentType(EObjectFlatComboSettings)
	 */
	public void initComponentType(EObjectFlatComboSettings settings) {
		componentType.setInput(settings);
		if (current != null) {
			componentType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#setComponentType(EObject newValue)
	 * 
	 */
	public void setComponentType(EObject newValue) {
		if (newValue != null) {
			componentType.setSelection(new StructuredSelection(newValue));
		} else {
			componentType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#setComponentTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentTypeButtonMode(ButtonsModeEnum newValue) {
		componentType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addFilterComponentType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponentType(ViewerFilter filter) {
		componentType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addBusinessFilterComponentType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponentType(ViewerFilter filter) {
		componentType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#getParentComponent()
	 * 
	 */
	public EObject getParentComponent() {
		if (parentComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parentComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#initParentComponent(EObjectFlatComboSettings)
	 */
	public void initParentComponent(EObjectFlatComboSettings settings) {
		parentComponent.setInput(settings);
		if (current != null) {
			parentComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#setParentComponent(EObject newValue)
	 * 
	 */
	public void setParentComponent(EObject newValue) {
		if (newValue != null) {
			parentComponent.setSelection(new StructuredSelection(newValue));
		} else {
			parentComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#setParentComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentComponentButtonMode(ButtonsModeEnum newValue) {
		parentComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addFilterParentComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentComponent(ViewerFilter filter) {
		parentComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addBusinessFilterParentComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentComponent(ViewerFilter filter) {
		parentComponent.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#initFromRev(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFromRev(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fromRev.setContentProvider(contentProvider);
		fromRev.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#updateFromRev()
	 * 
	 */
	public void updateFromRev() {
	fromRev.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addFilterFromRev(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromRev(ViewerFilter filter) {
		fromRevFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addBusinessFilterFromRev(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromRev(ViewerFilter filter) {
		fromRevBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#isContainedInFromRevTable(EObject element)
	 * 
	 */
	public boolean isContainedInFromRevTable(EObject element) {
		return ((ReferencesTableSettings)fromRev.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#initToRev(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initToRev(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		toRev.setContentProvider(contentProvider);
		toRev.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#updateToRev()
	 * 
	 */
	public void updateToRev() {
	toRev.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addFilterToRev(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToRev(ViewerFilter filter) {
		toRevFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addBusinessFilterToRev(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToRev(ViewerFilter filter) {
		toRevBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#isContainedInToRevTable(EObject element)
	 * 
	 */
	public boolean isContainedInToRevTable(EObject element) {
		return ((ReferencesTableSettings)toRev.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#initDelegation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDelegation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		delegation.setContentProvider(contentProvider);
		delegation.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#updateDelegation()
	 * 
	 */
	public void updateDelegation() {
	delegation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addFilterDelegation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegation(ViewerFilter filter) {
		delegationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#addBusinessFilterDelegation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegation(ViewerFilter filter) {
		delegationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart#isContainedInDelegationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegationTable(EObject element) {
		return ((ReferencesTableSettings)delegation.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.ComponentPart_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
