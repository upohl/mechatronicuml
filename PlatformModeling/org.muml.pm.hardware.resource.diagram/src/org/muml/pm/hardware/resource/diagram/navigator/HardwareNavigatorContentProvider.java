package org.muml.pm.hardware.resource.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.DeviceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.resource.diagram.part.Messages;

/**
 * @generated
 */
public class HardwareNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public HardwareNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<HardwareNavigatorItem> result = new ArrayList<HardwareNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, ResourceRepositoryEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof HardwareNavigatorGroup) {
			HardwareNavigatorGroup group = (HardwareNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof HardwareNavigatorItem) {
			HardwareNavigatorItem navigatorItem = (HardwareNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (HardwareVisualIDRegistry.getVisualID(view)) {

		case ResourceRepositoryEditPart.VISUAL_ID: {
			LinkedList<HardwareAbstractNavigatorItem> result = new LinkedList<HardwareAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			HardwareNavigatorGroup links = new HardwareNavigatorGroup(
					Messages.NavigatorGroupName_ResourceRepository_1000_links, "icons/linksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(DeviceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(StructuredResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(CommunicationProtocolRepositoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(ProcessorOwnedCacheEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case DeviceEditPart.VISUAL_ID: {
			LinkedList<HardwareAbstractNavigatorItem> result = new LinkedList<HardwareAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(CommunicationResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case StructuredResourceEditPart.VISUAL_ID: {
			LinkedList<HardwareAbstractNavigatorItem> result = new LinkedList<HardwareAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), HardwareVisualIDRegistry
					.getType(StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HardwareVisualIDRegistry.getType(CommunicationResource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HardwareVisualIDRegistry
					.getType(StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HardwareVisualIDRegistry.getType(CacheEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HardwareVisualIDRegistry
					.getType(StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HardwareVisualIDRegistry.getType(ProcessorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HardwareVisualIDRegistry
					.getType(StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HardwareVisualIDRegistry.getType(ProgrammableLogicDeviceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HardwareVisualIDRegistry
					.getType(StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HardwareVisualIDRegistry.getType(MemoryResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case CommunicationProtocolRepositoryEditPart.VISUAL_ID: {
			LinkedList<HardwareAbstractNavigatorItem> result = new LinkedList<HardwareAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), HardwareVisualIDRegistry
					.getType(CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HardwareVisualIDRegistry.getType(BusProtocolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HardwareVisualIDRegistry
					.getType(CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HardwareVisualIDRegistry.getType(LinkProtocolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case CacheEditPart.VISUAL_ID: {
			LinkedList<HardwareAbstractNavigatorItem> result = new LinkedList<HardwareAbstractNavigatorItem>();
			Node sv = (Node) view;
			HardwareNavigatorGroup incominglinks = new HardwareNavigatorGroup(
					Messages.NavigatorGroupName_Cache_3013_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(ProcessorOwnedCacheEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ProcessorEditPart.VISUAL_ID: {
			LinkedList<HardwareAbstractNavigatorItem> result = new LinkedList<HardwareAbstractNavigatorItem>();
			Node sv = (Node) view;
			HardwareNavigatorGroup outgoinglinks = new HardwareNavigatorGroup(
					Messages.NavigatorGroupName_Processor_3014_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(ProcessorOwnedCacheEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ProcessorOwnedCacheEditPart.VISUAL_ID: {
			LinkedList<HardwareAbstractNavigatorItem> result = new LinkedList<HardwareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HardwareNavigatorGroup target = new HardwareNavigatorGroup(
					Messages.NavigatorGroupName_ProcessorOwnedCache_4002_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			HardwareNavigatorGroup source = new HardwareNavigatorGroup(
					Messages.NavigatorGroupName_ProcessorOwnedCache_4002_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(CacheEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HardwareVisualIDRegistry.getType(ProcessorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ResourceRepositoryEditPart.MODEL_ID.equals(HardwareVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<HardwareNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<HardwareNavigatorItem> result = new ArrayList<HardwareNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new HardwareNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof HardwareAbstractNavigatorItem) {
			HardwareAbstractNavigatorItem abstractNavigatorItem = (HardwareAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
