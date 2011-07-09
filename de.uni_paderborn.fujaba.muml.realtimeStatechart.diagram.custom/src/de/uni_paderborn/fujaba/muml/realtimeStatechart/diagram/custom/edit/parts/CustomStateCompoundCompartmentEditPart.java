package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.SortingDirection;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartmentEditPart;

public class CustomStateCompoundCompartmentEditPart extends
		StateCompoundCompartmentEditPart {

	public static final String DEFAULT_SORTING_KEY = "default_sorting_key";

	public CustomStateCompoundCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	protected Comparator<Shape> getComparator(String name,
			SortingDirection direction) {
		if (DEFAULT_SORTING_KEY.equals(name)) {
			return new StateCompartmentComparator(direction);
		}
		return null;
	}

	public class StateCompartmentComparator implements Comparator<Shape> {

		private final SortingDirection direction;
		
		private final Class<?> order[] = { EntryEvent.class, DoEvent.class, ExitEvent.class };

		public StateCompartmentComparator(SortingDirection direction) {
			this.direction = direction;
		}

		@Override
		public int compare(Shape s1, Shape s2) {
			EObject o1 = s1.getElement();
			EObject o2 = s2.getElement();
			int value1 = Integer.MAX_VALUE;
			int value2 = Integer.MAX_VALUE;
			if (o1 != null) {
				value1 = getValue(o1);
				value2 = getValue(o2);
			}
			int result = value1 - value2;
			if (direction.getValue() == SortingDirection.DESCENDING) {
				result = -result;
			}
			return result;

		}

		private int getValue(EObject object) {
			int counter = 1;
			for (Class<?> clazz : order) {
				if (clazz.isAssignableFrom(object.getClass())) {
					return counter;
				}
				counter++;
			}
			return counter;
		}

	}

}
