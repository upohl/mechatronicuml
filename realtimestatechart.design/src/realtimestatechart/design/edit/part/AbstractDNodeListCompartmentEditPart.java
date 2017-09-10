/*******************************************************************************
 * Copyright (c) 2011, 2015 THALES GLOBAL SERVICES and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package realtimestatechart.design.edit.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.INotableEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.ui.edit.api.part.ISiriusEditPart;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.LaunchToolEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.NodeCreationEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.SiriusContainerDropPolicy;
import org.eclipse.sirius.diagram.ui.tools.api.requests.RequestConstants;

import com.google.common.collect.Iterables;

/**
 * <p>
 * Abstract {@link EditPart} representing the Compartment zone of a DNodeList.
 * </p>
 * 
 * @see {@link ListCompartmentEditPart}
 * @author <a href="mailto:esteban.dugueperoux@obeo.fr">Esteban Dugueperoux</a>
 */
public abstract class AbstractDNodeListCompartmentEditPart extends ListCompartmentEditPart implements INotableEditPart, ISiriusEditPart {

//    private boolean isSupportingViewActions = false;

//    private static class DNodeListElementComparisonHelper extends ComparisonHelper {
//        private DNodeList self;
//
//        public DNodeListElementComparisonHelper(DNodeList self) {
//            this.self = self;
//        }
//
//        @Override
//        protected List<? extends DRepresentationElement> getDElementsToSort() {
//            return self.getOwnedElements();
//        }
//
//        @Override
//        protected List<? extends RepresentationElementMapping> getMappingsToSort() {
//            return self.getActualMapping().getAllNodeMappings();
//        }
//    }

    /**
     * Creates a new AbstractDNodeListCompartmentEditPart.
     * 
     * @param view
     *            the view controlled by this editpart
     */
    public AbstractDNodeListCompartmentEditPart(View view) {
        super(view);
    }

    @Override
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
//        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DNodeListViewNodeListCompartmentItemSemanticEditPolicy());
        installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
        installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new SiriusContainerDropPolicy());
        installEditPolicy(EditPolicy.CONTAINER_ROLE, new NodeCreationEditPolicy());
        installEditPolicy(RequestConstants.REQ_LAUNCH_TOOL, new LaunchToolEditPolicy());
//        installEditPolicy(EditPolicyRoles.PROPERTY_HANDLER_ROLE, new RegionCollapseAwarePropertyHandlerEditPolicy());
    }

    @Override
    protected boolean hasModelChildrenChanged(Notification evt) {
        return false;
    }

    @Override
    public IFigure createFigure() {
        ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
        boolean isRegion = false;
//        boolean isRegion = new DDiagramElementContainerExperimentalQuery((DDiagramElementContainer) resolveSemanticElement()).isRegion();
//        if (isRegion) {
//            // Use a NestableResizableCompartmentFigure to have collapsed Region
//            // to have only the label area visible
//            ResizableCompartmentFigure nrcf = new NestedResizableCompartmentFigure(getMapMode());
//            // Configure the text pane layout manager to be the same as the non-region case.
//            nrcf.getContentPane().setLayoutManager(result.getContentPane().getLayoutManager());
//            // Get the viewport border computed for the non-region case to keep
//            // the same margin:
//            Border border = result.getScrollPane().getContents().getBorder();
//            if (border instanceof MarginBorder) {
//                Insets insets = border.getInsets(nrcf);
//                border = new MarginBorder(0, insets.left, 0, insets.right);
//                nrcf.getScrollPane().getContents().setBorder(border);
//            }
//            result = nrcf;
//        }

        result.setTitleVisibility(false);
        result.setToolTip((IFigure) null);

        configureBorder(result);

        // Now that the border size is taken into account to calculate border
        // margin; reduce the scroll pane insets to retrieve the previous
        // minimum/preferred size, scroll-bar visibility condition for one pixel
        // borders. Impact only horizontal insets for regions.
        IFigure contentPane = result.getContentPane();
        if (contentPane != null && contentPane.getBorder() instanceof MarginBorder) {
            Insets insets = contentPane.getBorder().getInsets(result);
            Insets legacyBorderCompensation = new Insets(0, -1, isRegion ? 0 : -1, -1);
            contentPane.setBorder(new MarginBorder(insets.getAdded(legacyBorderCompensation)));
        }
        return result;
    }

    private void configureBorder(ResizableCompartmentFigure rcf) {
        if (hasLabelBorderStyle() || isLabelHidden() || isCollapsed()) {
            if (rcf.getBorder() instanceof LineBorder || rcf.getBorder() == null) {
                // Do not draw the top line border for free form containers.
                rcf.setBorder(new MarginBorder(getMapMode().DPtoLP(1), 0, 0, 0));
            }
        } else if (rcf.getBorder() instanceof MarginBorder || rcf.getBorder() == null) {
            rcf.setBorder(new OneLineBorder(getMapMode().DPtoLP(1), PositionConstants.TOP));
        }
    }

    private boolean isCollapsed() {
        DrawerStyle style = (DrawerStyle) ((View) getModel()).getStyle(NotationPackage.eINSTANCE.getDrawerStyle());
        return style == null ? false : style.isCollapsed();
    }

    private boolean isLabelHidden() {
        EObject element = resolveSemanticElement();
        if (element instanceof DDiagramElement) {
            return new DDiagramElementQuery((DDiagramElement) element).isLabelHidden();
        }
        return false;
    }

    private boolean hasLabelBorderStyle() {
//        EObject element = resolveSemanticElement();
//        if (element instanceof DDiagramElementContainer) {
//            Option<LabelBorderStyleDescription> labelBorderStyle = new DDiagramElementContainerExperimentalQuery((DDiagramElementContainer) element).getLabelBorderStyle();
//            return labelBorderStyle.some() && !LabelBorderStyleIds.LABEL_FULL_BORDER_STYLE_FOR_CONTAINER_ID.equals(labelBorderStyle.get().getId());
//        }
        return false;
    }

    @Override
    protected void refreshVisuals() {
        if (getFigure() instanceof ResizableCompartmentFigure) {
            ResizableCompartmentFigure rcf = (ResizableCompartmentFigure) getFigure();
            configureBorder(rcf);
        }
        super.refreshVisuals();
    }

    @Override
    protected void setRatio(Double ratio) {
        if (getFigure().getParent() != null && getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
            super.setRatio(ratio);
        }
    }

//    /*
//     * hide non visible elements
//     */
//    @Override
//    protected List<?> getModelChildren() {
//        @SuppressWarnings("unchecked")
//        List<View> modelChildren = Lists.newArrayList(super.getModelChildren());
//        DiagramElementEditPartOperation.removeInvisibleElements(modelChildren);
//        EObject semanticElement = resolveSemanticElement();
//        if (semanticElement instanceof DNodeList) {
//            new DNodeListElementComparisonHelper((DNodeList) semanticElement).sort(modelChildren);
//        }
//        return modelChildren;
//    }

    @Override
    public boolean canAttachNote() {
        return true;
    }

    @Override
    public DragTracker getDragTracker(Request request) {
        return getParent().getDragTracker(request);
    }

    /**
     * This method searches an edit part for a child that is a border item edit
     * part
     * 
     * @not-generated : need for copy/paste support
     * @param parent
     *            part needed to search
     * @param set
     *            to be modified of border item edit parts that are direct
     *            children of the parent
     */
//    private void getBorderItemEditParts(EditPart parent, Set retval) {
//
//        Iterator iter = parent.getChildren().iterator();
//        while (iter.hasNext()) {
//            EditPart child = (EditPart) iter.next();
//            if (child instanceof IBorderItemEditPart) {
//                retval.add(child);
//                retval.addAll(child.getChildren());
//            }
//            getBorderItemEditParts(child, retval);
//        }
//    }

    /**
     * Overridden to refresh DNodeListElementEditPart for example to refresh label alignment.
     */
    @Override
    public void refresh() {
        super.refresh();

        Iterable<EditPart> children = Iterables.filter(getChildren(), EditPart.class);
        for (EditPart childEditPart : children) {
            childEditPart.refresh();
        }
    }
//
//    @Override
//    public Command getCommand(Request _request) {
//        RequestQuery requestQuery = new RequestQuery(_request);
//        if (requestQuery.isNoteCreationRequest() || requestQuery.isTextCreationRequest() || requestQuery.isNoteDropRequest() || requestQuery.isTextDropRequest()) {
//            return UnexecutableCommand.INSTANCE;
//        }
//        return super.getCommand(_request);
//    }

    @Override
    protected void setCollapsed(boolean collapsed, boolean animate) {
        // Always disable the animation.
        super.setCollapsed(collapsed, false);
    }
}