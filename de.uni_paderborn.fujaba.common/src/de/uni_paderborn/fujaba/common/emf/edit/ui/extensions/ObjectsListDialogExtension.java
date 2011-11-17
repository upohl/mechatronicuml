package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;

public class ObjectsListDialogExtension extends AbstractDialogExtension
		implements IObjectsListDialogExtension {
	private Adapter hookAdapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			if (objectsTableViewer != null && !objectsTableViewer.getControl().isDisposed()) {
				objectsTableViewer.refresh();
			}
		}
	};
	
	private Button btnUp;
	private Button btnDown;
	private Button btnRemove;

	private ITextualDialogExtension textualDialogExtension;

	private IPropertiesListDialogExtension propertiesListDialogExtension;

	/**
	 * A SelectionChangedListener, which is notified about selection changes in
	 * the Parameter List and updates the Parameter-Line Textfield selection
	 * accordingly.
	 */
	private ISelectionChangedListener objectsSelectionToRangeListener;

	/**
	 * A ModifyListener, which is notified when the Parameter-Line Text was
	 * edited by the user.
	 */
	private ModifyListener txtParameterLineModifyListener;

	/**
	 * A CaretListener, which is notified when the user changes the
	 * Caret-Position in the Parameter-Line Textfield.
	 */
	private CaretListener txtParameterLineCaretListener;

	/**
	 * The result, which can be accessed using getResult(), after the dialog was
	 * closed.
	 */
	private EList<?> result;

	/**
	 * Stores the Parameters currently set; they can be accessed using
	 * values.getChildren().
	 */
	private ItemProvider values;

	/**
	 * The Parameters-List TableViewer.
	 */
	private TableViewer objectsTableViewer;

	public ObjectsListDialogExtension(ExtensibleCreationDialog creationDialog,
			AdapterFactory adapterFactory, Collection<?> currentValues) {
		super(creationDialog);
//		currentValues = EcoreUtil.copyAll(currentValues);
		this.values = new ItemProvider(adapterFactory, currentValues);
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void createMainArea(Composite parent) {
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Label lblParameterList = new Label(parent, SWT.NONE);
		GridData gdLblParameterList = new GridData(SWT.LEFT, SWT.TOP, false,
				false, 1, 1);
		gdLblParameterList.verticalIndent = 7;
		lblParameterList.setLayoutData(gdLblParameterList);
		lblParameterList.setText("&List:");

		objectsTableViewer = new TableViewer(parent, SWT.BORDER | SWT.V_SCROLL);
		Table tblParameterTable = objectsTableViewer.getTable();
		tblParameterTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		// Create SelectionListener for objectsTableViewer to update text
		// selection accordingly
		objectsSelectionToRangeListener = new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) event
							.getSelection();
					Object selectedElement = selection.getFirstElement();
					if (selectedElement != null) {
						textualDialogExtension
								.setTextRange((EObject) selectedElement);
					}
				}
			}
		};
		objectsTableViewer
				.addSelectionChangedListener(objectsSelectionToRangeListener);

		// Create SelectionListener for objectsTableViewer to update
		// Button-enablement accordingly
		objectsTableViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						ISelection selection = event.getSelection();
						propertiesListDialogExtension.setInput(selection);
						if (event.getSelection() instanceof IStructuredSelection) {
							IStructuredSelection ssel = (IStructuredSelection) event
									.getSelection();
							EObject selectedElement = (EObject) ssel
									.getFirstElement();
							if (selectedElement != null) {
								int index = values.getChildren().indexOf(
										selectedElement);
								btnUp.setEnabled(index > 0);
								btnDown.setEnabled(index < values.getChildren()
										.size() - 1);
							} else {
								btnUp.setEnabled(false);
								btnDown.setEnabled(false);
							}
							btnRemove.setEnabled(selectedElement != null);
						}
					}
				});

		// Initialize objectsTableViewer
		objectsTableViewer.setContentProvider(getCreationDialog()
				.getContentProvider());

		objectsTableViewer.setLabelProvider(getCreationDialog()
				.getLabelProvider());
		objectsTableViewer.setInput(values);
	}

	@Override
	public void createButtonArea(Composite composite) {

		EStructuralFeature feature = getStructuralFeature();

		GridData firstLayoutData = new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1);

		firstLayoutData.verticalIndent = 20;

		btnRemove = new Button(composite, SWT.NONE);
		btnRemove.setLayoutData(firstLayoutData);
		btnRemove.setText("&Remove");

		btnUp = new Button(composite, SWT.NONE);
		GridData gdBtnUp = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gdBtnUp.verticalIndent = 10;
		btnUp.setLayoutData(gdBtnUp);
		btnUp.setText("&Up");
		btnUp.setVisible(feature.isOrdered());
		

		btnDown = new Button(composite, SWT.NONE);
		btnDown.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		btnDown.setText("&Down");
		btnDown.setVisible(feature.isOrdered());

		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject previouslySelectedObject = getListSelection();
				if (previouslySelectedObject != null) {
					int index = values.getChildren().indexOf(
							previouslySelectedObject);
					
					// Unhook from the model element
					previouslySelectedObject.eAdapters().remove(hookAdapter);
					

					values.getChildren().remove(previouslySelectedObject);
					textualDialogExtension.rebuildTextualString();

					int objectsCount = values.getChildren().size();
					if (index >= objectsCount) {
						index = objectsCount - 1;
					}

					// Update visuals
					objectsTableViewer.refresh();
					if (index >= 0) {
						Object newlySelectedObject = values.getChildren().get(
								index);
						objectsTableViewer
								.setSelection(new StructuredSelection(
										new Object[] { newlySelectedObject }));
					}
				}
			}
		});

		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject firstObject = getListSelection();
				int index = values.getChildren().indexOf(firstObject);
				if (index > 0) {
					Object secondObject = (EObject) values.getChildren().get(
							index - 1);
					values.getChildren().set(index - 1, firstObject);
					values.getChildren().set(index, secondObject);
					textualDialogExtension.rebuildTextualString();

					// Update visuals
					objectsTableViewer.refresh();
					objectsTableViewer.setSelection(new StructuredSelection(
							new Object[] { firstObject }));
				}
			}
		});

		btnDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				EObject firstObject = getListSelection();
				int index = values.getChildren().indexOf(firstObject);
				if (index < values.getChildren().size() - 1) {
					Object secondObject = (EObject) values.getChildren().get(
							index + 1);
					values.getChildren().set(index + 1, firstObject);
					values.getChildren().set(index, secondObject);
					textualDialogExtension.rebuildTextualString();

					// Update visuals
					objectsTableViewer.refresh();
					objectsTableViewer.setSelection(new StructuredSelection(
							new Object[] { firstObject }));
				}
			}
		});

		// Create an empty selection.
		objectsTableViewer
				.setSelection(new StructuredSelection(new Object[] {}));
	}

	/**
	 * Returns the parameter currently selected within the Parameter-List.
	 * 
	 * @return The parameter currently selgected, or <code>null</code> if none
	 *         is selected.
	 */
	public EObject getListSelection() {
		if (objectsTableViewer.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) objectsTableViewer
					.getSelection();
			return (EObject) selection.getFirstElement();
		}
		return null;
	}

	/**
	 * Selects the given parameter within the Parameters-List without firing
	 * notifications, which are only useful, if the users selects a parameter.
	 * 
	 * @param parameterSelection
	 *            The parameter to select.
	 */
	public void setListSelection(ISelection parameterSelection) {
		objectsTableViewer
				.removeSelectionChangedListener(objectsSelectionToRangeListener);
		objectsTableViewer.setSelection(parameterSelection);
		objectsTableViewer
				.addSelectionChangedListener(objectsSelectionToRangeListener);
	}

	@Override
	public void okPressed() {
		result = new BasicEList<Object>(values.getChildren());
	}

	/**
	 * Returns the results that should be applied to the structuralFeature.
	 * 
	 * @return Returns the parameters to set, or <code>null</code>, if cancel
	 *         was clicked.
	 */
	public EList<?> getResult() {
		return result;
	}

	public List<Object> getCurrentListItems() {
		return values.getChildren();
	}

	public void addListItem(EObject newObject) {
		// Hook into the model element
		newObject.eAdapters().add(hookAdapter);
		
		// Add the element to the list
		values.getChildren().add(newObject);
	}

	public TableViewer getTableViewer() {
		return objectsTableViewer;
	}

	public void setPropertiesListDialogExtension(
			IPropertiesListDialogExtension propertiesListDialogExtension) {
		this.propertiesListDialogExtension = propertiesListDialogExtension;
	}

	public void setTextualDialogExtension(
			ITextualDialogExtension textualDialogExtension) {
		this.textualDialogExtension = textualDialogExtension;
	}
}
