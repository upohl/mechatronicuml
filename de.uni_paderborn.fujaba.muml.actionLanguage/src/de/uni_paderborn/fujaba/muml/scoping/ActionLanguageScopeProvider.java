/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.storydriven.core.expressions.Expression;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelInstancePlugin;
import de.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Block;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression;
import de.uni_paderborn.fujaba.muml.model.behavior.TypedNamedElement;
import de.uni_paderborn.fujaba.muml.model.behavior.Operation;
import de.uni_paderborn.fujaba.muml.model.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.model.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.model.behavior.Variable;
import de.uni_paderborn.fujaba.muml.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.types.DataType;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class ActionLanguageScopeProvider extends AbstractDeclarativeScopeProvider {
	private List<TypedNamedElement> typedNamedElementList;
	private List<DataType> typeList;
	private List<Operation> operationList;
	private List<MessageType> messageTypeList;
	
	// TODO: make this string public in class TypeCategoryInitializer
	private static final String TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";
	
	public ActionLanguageScopeProvider() {
		super();
		initLists();
	}
	
	List<TypedNamedElement> getLocalVariables(EObject object) {
		List<TypedNamedElement> localVariableList = new ArrayList<TypedNamedElement>();
		EObject container = object;
		EObject containedExpression = null;
		while (container != null) {
			if (container instanceof Block) {
				// add all local variable declarations which were defined
				// before the containedExpression
				for (Expression expression : ((Block) container).getExpressions()) {
					if (expression == containedExpression) {
						break;
					} else if (expression instanceof LocalVariableDeclarationStatement) {
						localVariableList.add(((LocalVariableDeclarationStatement) expression).getVariable());
					}
				}
			}
			containedExpression = container;
			container = container.eContainer();
		}
		return localVariableList;
	}
	
	IScope scope_TypedNamedElement(EObject object, EReference ref) {
		List<TypedNamedElement> localVariableList = getLocalVariables(object);
		localVariableList.addAll(typedNamedElementList);
		return createScope(localVariableList);
	}
	
	IScope scope_DataType(Variable variable, EReference ref) {
		return createScope(typeList);
	}
	
	IScope scope_Operation(Object object, EReference ref) {
		return createScope(operationList);
	}
	
	IScope scope_MessageType(Object object, EReference ref) {
		return createScope(messageTypeList);
	}
	
	IScope scope_Parameter(Object object, EReference ref) {
		/*if (!(object instanceof ParameterBinding)
				|| !(((ParameterBinding) object).eContainer() instanceof OperationCall)) {
			return IScope.NULLSCOPE;
		}*/
		if (!(object instanceof EObject)) {
			return IScope.NULLSCOPE;
		}
		EObject eObject = (EObject) object;
		List<Parameter> parameterList = Collections.<Parameter>emptyList();
		if ((eObject instanceof ParameterBinding) && eObject.eContainer() instanceof OperationCall) {
			OperationCall operationCall = (OperationCall) ((EObject) object).eContainer();
			parameterList = getScopeForOperationCall(operationCall);
		} else if (eObject instanceof TriggerMessageExpression) {
			parameterList = getScopeForTriggerMessageExpression((TriggerMessageExpression) eObject);
		}
		return createScope(parameterList);
	}
	
	/*public void setAttributeList(List<Attribute> attributeList) {
		this.attributeList = attributeList;
	}*/
	
	public void setScopeForEObject(EObject object) {
		initLists();
		if (object instanceof StateEvent) {
			setScopeForEObject((StateEvent) object);
		} else if (object instanceof Transition) {
			setScopeForEObject((Transition) object);
		} else if (object instanceof Message) {
			setScopeForEObject((Message) object);
		} else if (object instanceof Synchronization) {
			setScopeForEObject((Synchronization) object);
		} else if (object instanceof ParameterBinding) {
			setScopeForEObject((ParameterBinding) object);
		} else if (object instanceof RealtimeStatechart) {
			setScopeForRTSC((RealtimeStatechart) object);
		} else {
			throw new IllegalArgumentException("scope requested for unsupported object" + object);
		}
	}
	
	public void setScopeForEObject(StateEvent event) {
		// expected: doevent, entry- and exitevent
		setScopeForRTSC(event.eContainer().eContainer());
	}
	
	public void setScopeForEObject(Transition transition) {
		setScopeForRTSC(transition.getStatechart());
		if (transition.getTriggerMessageEvent() != null
				&& transition.getTriggerMessageEvent().getMessage() != null) {
			messageTypeList = new ArrayList<MessageType>();
			messageTypeList.add(transition.getTriggerMessageEvent().getMessage().getInstanceOf());
		}
	}
	
	public void setScopeForEObject(Message message) {
		// expected: a raise or trigger message
		// this should be a transition
		setScopeForEObject(message.eContainer().eContainer());
	}
	
	public void setScopeForEObject(Synchronization synchronization) {
		// expected: synchronization for a transition
		// this should be a transition
		setScopeForEObject(synchronization.eContainer());
	}
	
	public void setScopeForEObject(ParameterBinding parameterBinding) {
		// either a transition or rtsc
		setScopeForEObject(parameterBinding.eContainer().eContainer().eContainer());
	}
	
	private void setScopeForRTSC(EObject object) {
		if (!(object instanceof RealtimeStatechart)) {
			throw new IllegalArgumentException("object is no rtsc: " + object);
		}
		RealtimeStatechart rtsc = (RealtimeStatechart) object;
		typedNamedElementList = new ArrayList<TypedNamedElement>();
		typedNamedElementList.addAll(rtsc.getAllAvailableVariables());
		addHybridPorts(rtsc);
		operationList = rtsc.getAllAvailableOperations();
		initDataTypes(rtsc);
	}
	
	private void addHybridPorts(RealtimeStatechart rtsc) {
		if (rtsc.getBehavioralElement() instanceof AtomicComponent) {
			AtomicComponent atomicComponent = (AtomicComponent) rtsc.getBehavioralElement();
			for (Port port : atomicComponent.getPorts()) {
				if (port instanceof HybridPort) {
					typedNamedElementList.add((TypedNamedElement) port);
				}
			}
		}
	}
	
	private void initDataTypes(EObject object) {
		while (!(object instanceof RootNode)) {
			object = object.eContainer();
		}
		RootNode rootNode = (RootNode) object;
		typeList = new ArrayList<DataType>();
		ModelElementCategory modelElementCategory = ModelInstancePlugin.getInstance()
				.getModelElementCategoryRegistry()
				.getModelElementCategory(rootNode, TYPES_CATEGORY_KEY);
		for (EObject type : modelElementCategory.getModelElements()) {
			typeList.add((DataType) type);
		}
	}
	
	private List<Parameter> getScopeForOperationCall(OperationCall operationCall) {
		if (operationCall.getOperation() == null) {
			// should not happen
			return Collections.<Parameter>emptyList();
		}
		return operationCall.getOperation().getParameters();
	}
	
	private List<Parameter> getScopeForTriggerMessageExpression(TriggerMessageExpression triggerMessageExpression) {
		if (triggerMessageExpression.getMessageType() == null) {
			// should not happen
			return Collections.<Parameter>emptyList();
		}
		return triggerMessageExpression.getMessageType().getParameters();
	}
	
	private IScope createScope(List<? extends EObject> list) {
		if (list.isEmpty()) {
			return IScope.NULLSCOPE;
		}
		return Scopes.scopeFor(list);
	}
	
	private void initLists() {
		typedNamedElementList = Collections.<TypedNamedElement>emptyList();
		operationList = Collections.<Operation>emptyList();
		messageTypeList = Collections.<MessageType>emptyList();
	}

}
