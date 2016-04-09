package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramUpdater;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramNodeDescriptor;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;

/**
 * @generated
 */
public class ComponentStoryPatternComponentStoryPatternCompartment2CanonicalEditPolicy extends CanonicalEditPolicy {
	private boolean canonicalNodes = true;

	public ComponentStoryPatternComponentStoryPatternCompartment2CanonicalEditPolicy() {
	}

	public ComponentStoryPatternComponentStoryPatternCompartment2CanonicalEditPolicy(boolean canonicalNodes) {
		this.canonicalNodes = canonicalNodes;
	}

	/**
	* @generated
	*/
	private List<String> noConnectionViews = new ArrayList<String>();

	/**
	 * @generated
	 */
	public void addNoConnectionView(String type) {
		noConnectionViews.add(type);
	}

	/**
	 * @generated
	 */
	public void removeNoConnectionView(String type) {
		noConnectionViews.remove(type);
	}

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected EStructuralFeature getFeatureToSynchronize() {
		return ComponentstorypatternPackage.eINSTANCE.getComponentStoryPattern_ThisVariable();
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		List<ComponentStoryDiagramNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<EObject> result = new LinkedList<EObject>();
		for (ComponentStoryDiagramNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */

	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenViewDescriptors() {
		// Begin added to switch off toplevel canonical behavior:
		if (!canonicalNodes) {
			View containerView = (View) getHost().getModel();
			List<View> childViews = containerView.getChildren();
			List<ComponentStoryDiagramNodeDescriptor> result = new LinkedList<ComponentStoryDiagramNodeDescriptor>();

			for (View childView : childViews) {
				EObject childElement = childView.getElement();
				int visualID = ComponentStoryDiagramVisualIDRegistry.getVisualID(childView);
				List<Integer> visualIDs = Arrays.asList(new Integer[] { ComponentVariable2EditPart.VISUAL_ID });

				// Note: childElement can be null, for diagram annotations!
				if (childElement == null
						|| childElement.eContainer() == containerView.getElement() && visualIDs.contains(visualID)) {
					result.add(new ComponentStoryDiagramNodeDescriptor(childElement, visualID));
					continue;
				}
			}
			return result;
		}
		// End added

		View viewObject = (View) getHost().getModel();
		return ComponentStoryDiagramDiagramUpdater
				.getComponentStoryPatternComponentStoryPatternCompartment_7012SemanticChildren(viewObject);

	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		return ComponentVariable2EditPart.VISUAL_ID == ComponentStoryDiagramVisualIDRegistry.getVisualID(view);
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<ComponentStoryDiagramNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<ComponentStoryDiagramNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			ComponentStoryDiagramNodeDescriptor next = descriptorsIterator.next();
			String hint = ComponentStoryDiagramVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();

				// Note: semanticElement can be null, for diagram annotations!
				if (semanticElement != null && semanticElement.equals(next.getModelElement())) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (ComponentStoryDiagramNodeDescriptor next : childDescriptors) {
			String hint = ComponentStoryDiagramVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")

			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		makeViewsImmutable(createdViews);
	}
}
