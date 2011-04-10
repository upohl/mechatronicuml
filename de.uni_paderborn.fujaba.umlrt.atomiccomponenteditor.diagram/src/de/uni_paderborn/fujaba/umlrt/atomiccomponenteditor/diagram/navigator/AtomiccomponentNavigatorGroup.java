package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator;

import java.util.Collection;
import java.util.LinkedList;

/**
 * @generated
 */
public class AtomiccomponentNavigatorGroup
		extends
		de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator.AtomiccomponentAbstractNavigatorItem {

	/**
	 * @generated
	 */
	private String myGroupName;

	/**
	 * @generated
	 */
	private String myIcon;

	/**
	 * @generated
	 */
	private Collection myChildren = new LinkedList();

	/**
	 * @generated
	 */
	AtomiccomponentNavigatorGroup(String groupName, String icon, Object parent) {
		super(parent);
		myGroupName = groupName;
		myIcon = icon;
	}

	/**
	 * @generated
	 */
	public String getGroupName() {
		return myGroupName;
	}

	/**
	 * @generated
	 */
	public String getIcon() {
		return myIcon;
	}

	/**
	 * @generated
	 */
	public Object[] getChildren() {
		return myChildren.toArray();
	}

	/**
	 * @generated
	 */
	public void addChildren(Collection children) {
		myChildren.addAll(children);
	}

	/**
	 * @generated
	 */
	public void addChild(Object child) {
		myChildren.add(child);
	}

	/**
	 * @generated
	 */
	public boolean isEmpty() {
		return myChildren.size() == 0;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup) {
			de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup anotherGroup = (de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup) obj;
			if (getGroupName().equals(anotherGroup.getGroupName())) {
				return getParent().equals(anotherGroup.getParent());
			}
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return getGroupName().hashCode();
	}

}
