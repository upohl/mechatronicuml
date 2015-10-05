/*******************************************************************************
 * Copyright (c) 2012, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.library.executor;

import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.ExternalCrossReferencer;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.CompleteEnvironment;
import org.eclipse.ocl.pivot.CompleteInheritance;
import org.eclipse.ocl.pivot.CompletePackage;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.EnumerationLiteral;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.IdVisitor;
import org.eclipse.ocl.pivot.ids.LambdaTypeId;
import org.eclipse.ocl.pivot.ids.MapTypeId;
import org.eclipse.ocl.pivot.ids.NestedPackageId;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.OclInvalidTypeId;
import org.eclipse.ocl.pivot.ids.OclVoidTypeId;
import org.eclipse.ocl.pivot.ids.OperationId;
import org.eclipse.ocl.pivot.ids.PackageId;
import org.eclipse.ocl.pivot.ids.PrimitiveTypeId;
import org.eclipse.ocl.pivot.ids.PropertyId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TemplateBinding;
import org.eclipse.ocl.pivot.ids.TemplateParameterId;
import org.eclipse.ocl.pivot.ids.TemplateableTypeId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.ids.UnspecifiedId;
import org.eclipse.ocl.pivot.internal.executor.ExecutorTuplePart;
import org.eclipse.ocl.pivot.internal.values.BagImpl;
import org.eclipse.ocl.pivot.internal.values.OrderedSetImpl;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.Bag;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.MapValue;
import org.eclipse.ocl.pivot.values.OCLValue;
import org.eclipse.ocl.pivot.values.OrderedSet;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.Unlimited;
import org.eclipse.ocl.pivot.values.UnlimitedNaturalValue;
import org.eclipse.ocl.pivot.values.Value;

import com.google.common.collect.Iterables;

public abstract class AbstractIdResolver implements IdResolver
{
	public static final class Id2InstanceVisitor implements IdVisitor<Object>
	{
		protected final @NonNull String stringValue;

		private Id2InstanceVisitor(@NonNull String stringValue) {
			this.stringValue = stringValue;
		}

		@Override
		public @Nullable Object visitClassId(@NonNull ClassId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitCollectionTypeId(@NonNull CollectionTypeId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitDataTypeId(@NonNull DataTypeId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitEnumerationId(@NonNull EnumerationId id) {
			return id.getEnumerationLiteralId(stringValue);
		}

		@Override
		public @Nullable Object visitEnumerationLiteralId(@NonNull EnumerationLiteralId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitInvalidId(@NonNull OclInvalidTypeId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitLambdaTypeId(@NonNull LambdaTypeId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitMapTypeId(@NonNull MapTypeId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitNestedPackageId(@NonNull NestedPackageId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitNsURIPackageId(@NonNull NsURIPackageId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitNullId(@NonNull OclVoidTypeId id) {
			return null;
		}

		@Override
		public @Nullable Object visitOperationId(@NonNull OperationId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitPrimitiveTypeId(@NonNull PrimitiveTypeId id) {
			if (id == TypeId.BOOLEAN) {
				return Boolean.valueOf(stringValue);
			}
			else if (id == TypeId.STRING) {
				return stringValue;
			}
			else if (id == TypeId.INTEGER) {
				return ValueUtil.integerValueOf(stringValue);
			}
			else if (id == TypeId.REAL) {
				return ValueUtil.realValueOf(stringValue);
			}
			else if (id == TypeId.UNLIMITED_NATURAL) {
				return ValueUtil.integerValueOf(stringValue);
			}
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitPropertyId(@NonNull PropertyId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitRootPackageId(@NonNull RootPackageId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitTemplateBinding(@NonNull TemplateBinding id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitTemplateParameterId(@NonNull TemplateParameterId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitTemplateableTypeId(@NonNull TemplateableTypeId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitTuplePartId(@NonNull TuplePartId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitTupleTypeId(@NonNull TupleTypeId id) {
			throw new UnsupportedOperationException();
		}

		@Override
		public @Nullable Object visitUnspecifiedId(@NonNull UnspecifiedId id) {
			throw new UnsupportedOperationException();
		}
	}

	protected final @NonNull CompleteEnvironment environment;
	protected final @NonNull StandardLibrary standardLibrary;
	private final @NonNull Set<EObject> directRoots = new HashSet<EObject>();
	private boolean directRootsProcessed = false;
	private boolean crossReferencedRootsProcessed = false;
	private final @NonNull Map<Object, org.eclipse.ocl.pivot.Class> key2type = new HashMap<Object, org.eclipse.ocl.pivot.Class>();	// Concurrent puts are duplicates
	private /*@LazyNonNull*/ Map<EnumerationLiteralId, Enumerator> enumerationLiteral2enumerator = null;	// Concurrent puts are duplicates
	private /*@LazyNonNull*/ Map<Enumerator, EnumerationLiteralId> enumerator2enumerationLiteralId = null;	// Concurrent puts are duplicates

	/**
	 * Mapping from name to list of correspondingly named types for definition of tuple parts. This cache is used to provide the
	 * required part definitions to construct a tuple type in the lightweight execution environment. This cache may remain
	 * unused when using the full pivot environment.
	 */
	private Map<String, Map<Type, WeakReference<TypedElement>>> tupleParts = null;		// Lazily created

	/**
	 * Mapping from package URI to corresponding Pivot Package. (used to resolve NsURIPackageId).
	 */
	protected final @NonNull  Map<String, org.eclipse.ocl.pivot.Package> nsURI2package = new HashMap<String, org.eclipse.ocl.pivot.Package>();

	/**
	 * Mapping from root package name to corresponding Pivot Package. (used to resolve RootPackageId).
	 */
	protected final @NonNull  Map<String, org.eclipse.ocl.pivot.Package> roots2package = new HashMap<String, org.eclipse.ocl.pivot.Package>();
	
	public AbstractIdResolver(@NonNull CompleteEnvironment environment) {
		this.environment = environment;
		this.standardLibrary = environment.getOwnedStandardLibrary();
	}

	protected abstract @NonNull org.eclipse.ocl.pivot.Package addEPackage(@NonNull EPackage ePackage);

	private void addPackage(@NonNull org.eclipse.ocl.pivot.Package userPackage) {
		String nsURI = userPackage.getURI();
		if (nsURI != null) {
			nsURI2package.put(nsURI, userPackage);
			EPackage ePackage = userPackage.getEPackage();
			if (ePackage != null) {
				if (ClassUtil.basicGetMetamodelAnnotation(ePackage) != null) {
					if (roots2package.get(PivotConstants.METAMODEL_NAME) == null) {
						roots2package.put(PivotConstants.METAMODEL_NAME, userPackage);
					}
				}
			}
			else {
				for (org.eclipse.ocl.pivot.Class asType : userPackage.getOwnedClasses()) {
					if ("Boolean".equals(asType.getName())) {			// FIXME Check PrimitiveType //$NON-NLS-1$
						if (roots2package.get(PivotConstants.METAMODEL_NAME) == null) {
							roots2package.put(PivotConstants.METAMODEL_NAME, userPackage);
						}
						break;
					}
				}
			}
		}
		else {
			String name = userPackage.getName();
			if (name != null) {
				roots2package.put(name, userPackage);
			}
		}
		addPackages(userPackage.getOwnedPackages());
	}

	private void addPackages(/*@NonNull*/ Iterable<? extends org.eclipse.ocl.pivot.Package> userPackages) {
		for (org.eclipse.ocl.pivot.Package userPackage : userPackages) {
			assert userPackage != null;
			addPackage(userPackage);
		}
	}

	@Override
	public void addRoot(@NonNull EObject eObject) {
		directRoots.add(eObject);
	}

	@Override
	public @Nullable Object boxedValueOf(@Nullable Object unboxedValue) {
		if (unboxedValue == null) {
			return unboxedValue;
		}
		else if (unboxedValue instanceof Value) {
			return unboxedValue;
		}
		else if (unboxedValue instanceof Boolean) {
			return unboxedValue;
		}
		else if (unboxedValue instanceof String) {
			return unboxedValue;
		}
		else if (unboxedValue instanceof Number) {
			if ((unboxedValue instanceof Integer) || (unboxedValue instanceof Long) || (unboxedValue instanceof Short) || (unboxedValue instanceof Byte)) {
				return ValueUtil.integerValueOf(((Number) unboxedValue).longValue());
			}
			if ((unboxedValue instanceof Float) || (unboxedValue instanceof Double)) {
				return ValueUtil.realValueOf(((Number) unboxedValue).doubleValue());
			}
			if (unboxedValue instanceof BigDecimal) {
				return ValueUtil.realValueOf((BigDecimal) unboxedValue);
			}
			if (unboxedValue instanceof BigInteger) {
				return ValueUtil.integerValueOf((BigInteger) unboxedValue);
			}			
			if (unboxedValue instanceof Unlimited) {
				return unboxedValue;
			}			
		}
		else if (unboxedValue instanceof Character) {
			return ValueUtil.integerValueOf(((Character) unboxedValue).charValue());
		}			
		else if (unboxedValue.getClass().isArray()) {
			try {
				Object[] unboxedValues = (Object[])unboxedValue;
				Type dynamicType = getDynamicTypeOf(unboxedValues);
				if (dynamicType == null) {
					dynamicType = standardLibrary.getOclInvalidType();
				}
				TypeId elementTypeId = dynamicType.getTypeId();
				CollectionTypeId collectedTypeId = TypeId.SEQUENCE.getSpecializedId(elementTypeId);
				return createSequenceOfEach(collectedTypeId, (Object[])unboxedValue);
			} 
			catch (IllegalArgumentException e) {}
		}
		else if (unboxedValue instanceof Iterable<?>) {
			Iterable<?> unboxedValues = (Iterable<?>)unboxedValue;
			Type dynamicType = getDynamicTypeOf(unboxedValues);
			if (dynamicType == null) {
				dynamicType = standardLibrary.getOclInvalidType();
			}
			TypeId elementTypeId = dynamicType.getTypeId();
			CollectionTypeId collectedTypeId = TypeId.SEQUENCE.getSpecializedId(elementTypeId);
			if ((unboxedValue instanceof LinkedHashSet) || (unboxedValue instanceof OrderedSet)) {
				return createOrderedSetOfAll(collectedTypeId, unboxedValues);
			}
			else if (unboxedValue instanceof Bag) {
				return createBagOfAll(collectedTypeId, unboxedValues);
			}
			else if (unboxedValue instanceof Set) {
				return createSetOfAll(collectedTypeId, unboxedValues);
			}
			else {
				return createSequenceOfAll(collectedTypeId, unboxedValues);
			}
		}
/*		else if (unboxedValue instanceof EEnumLiteral) {
			return ValuesUtil.createEnumerationLiteralValue((EEnumLiteral)unboxedValue);
		} */
		else if (unboxedValue instanceof Type) {
			return unboxedValue;
		}
		else if (unboxedValue instanceof EnumerationLiteral) {
			return ((EnumerationLiteral) unboxedValue).getEnumerationLiteralId();
		}
		else if (unboxedValue instanceof EEnumLiteral) {
			return IdManager.getEnumerationLiteralId((EEnumLiteral) unboxedValue);
		}
		else if (unboxedValue instanceof EObject) {
			return unboxedValue;
		}
		else if (unboxedValue instanceof Element) {
			return unboxedValue;
		}
		else if (unboxedValue instanceof EnumerationLiteralId) {		// ?? shouldn't happen
			return unboxedValue;
		}	 
		else if (unboxedValue instanceof Enumerator) {
			return boxedValueOfEnumerator((Enumerator) unboxedValue);
		}
		return unboxedValue;
	}

	@Override
	public @Nullable Object boxedValueOf(@NonNull Object unboxedValue, @Nullable EClassifier eClassifier) {
		if (unboxedValue instanceof Value) {
			return unboxedValue;		
		}
		else if (eClassifier instanceof EEnum) {
			EEnum eEnum = (EEnum)eClassifier;
			String name = ClassUtil.nonNullModel(((Enumerator)unboxedValue).getName());
			EnumerationId enumId = IdManager.getEnumerationId(eEnum);
			EnumerationLiteralId enumerationLiteralId = enumId.getEnumerationLiteralId(name);
			return enumerationLiteralId;		
		}
		else {
			return boxedValueOf(unboxedValue);
		}
	}

	@Override
	public @Nullable Object boxedValueOf(@NonNull Object unboxedValue, @NonNull ETypedElement eFeature, @Nullable TypeId typeId) {
		EClassifier eClassifier = eFeature.getEType();
		if (typeId instanceof CollectionTypeId) {
			Collection<?> unboxedValues = (Collection<?>) unboxedValue;
			if (eClassifier instanceof EDataType) {
				ArrayList<Object> values = new ArrayList<Object>(unboxedValues.size());
				for (Object eVal : unboxedValues) {
					if (eVal != null) {
						values.add(boxedValueOf(eVal, eClassifier));
					}
				}
				unboxedValues = values;
			}
			return createCollectionOfAll((CollectionTypeId)typeId, unboxedValues);
		}
		else {
			return boxedValueOf(unboxedValue, eClassifier);
		}
	}

	public @Nullable Object boxedValueOfEnumerator(@NonNull Enumerator unboxedValue) {
		Map<Enumerator, EnumerationLiteralId> enumerator2enumerationLiteralId2 = enumerator2enumerationLiteralId;
		if (enumerator2enumerationLiteralId2 == null) {
			synchronized (this) {
				enumerator2enumerationLiteralId2 = enumerator2enumerationLiteralId;
				if (enumerator2enumerationLiteralId2 == null) {
					enumerator2enumerationLiteralId = enumerator2enumerationLiteralId2 = new HashMap<Enumerator, EnumerationLiteralId>();
					for (CompletePackage dPackage : standardLibrary.getAllCompletePackages()) {
						for (org.eclipse.ocl.pivot.Class dType : dPackage.getAllClasses()) {
							if (dType instanceof Enumeration) {
								for (EnumerationLiteral dEnumerationLiteral : ((Enumeration) dType).getOwnedLiterals()) {
									Enumerator enumerator = dEnumerationLiteral.getEnumerator();
									EnumerationLiteralId enumerationLiteralId = dEnumerationLiteral.getEnumerationLiteralId();
									enumerator2enumerationLiteralId.put(enumerator, enumerationLiteralId);
								}
							}
						}
					}
				}
			}		
		}
		EnumerationLiteralId enumerationLiteralId = enumerator2enumerationLiteralId2.get(unboxedValue);
		if (enumerationLiteralId == null) {
			throw new InvalidValueException("Unknown enumeration " + unboxedValue.getName()); //$NON-NLS-1$
		}
		return enumerationLiteralId;
	}

	@Override
	public @NonNull BagValue createBagOfAll(@NonNull CollectionTypeId typeId, @NonNull Iterable<? extends Object> unboxedValues) {
		Bag<Object> boxedValues = new BagImpl<Object>();
		for (Object unboxedValue : unboxedValues) {
			boxedValues.add(boxedValueOf(unboxedValue));
		}
		return ValueUtil.createBagValue(typeId, boxedValues);
	}
	
	@Override
	public @NonNull BagValue createBagOfEach(@NonNull CollectionTypeId typeId, @NonNull Object... unboxedValues) {
		Bag<Object> boxedValues = new BagImpl<Object>();
		for (Object unboxedValue : unboxedValues) {
			boxedValues.add(boxedValueOf(unboxedValue));
		}
		return ValueUtil.createBagValue(typeId, boxedValues);
	}
	   
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @param unboxedValues the required collection contents
	 * @return the new collection
	 */
	@Override
	public @NonNull CollectionValue createCollectionOfAll(boolean isOrdered, boolean isUnique, @NonNull TypeId elementTypeId, @NonNull Iterable<? extends Object> unboxedValues) {
		if (isOrdered) {
			if (isUnique) {
				return createOrderedSetOfAll(TypeId.ORDERED_SET.getSpecializedId(elementTypeId), unboxedValues);
			}
			else {
				return createSequenceOfAll(TypeId.SEQUENCE.getSpecializedId(elementTypeId), unboxedValues);
			}
		}
		else {
			if (isUnique) {
				return createSetOfAll(TypeId.SET.getSpecializedId(elementTypeId), unboxedValues);
			}
			else {
				return createBagOfAll(TypeId.BAG.getSpecializedId(elementTypeId), unboxedValues);
			}
		}
	}

	@Override
	public @NonNull CollectionValue createCollectionOfAll(@NonNull CollectionTypeId collectedId, @NonNull Iterable<?> unboxedValues) {
		CollectionTypeId collectionId = collectedId.getGeneralizedId();
		if (collectionId == TypeId.BAG) {
			return createBagOfAll(collectedId, unboxedValues);
		}
		else if (collectionId == TypeId.ORDERED_SET) {
			return createOrderedSetOfAll(collectedId, unboxedValues);
		}
		else if (collectionId == TypeId.SEQUENCE) {
			return createSequenceOfAll(collectedId, unboxedValues);
		}
		else /*if (collectionId == TypeId.SET)*/ {
			return createSetOfAll(collectedId, unboxedValues);
		}
	} 

	@Override
	public @Nullable Object createInstance(@NonNull TypeId typeId, @NonNull String stringValue) {
		Id2InstanceVisitor visitor = new Id2InstanceVisitor(stringValue);
		return typeId.accept(visitor);
	}

	@Override
	public @NonNull MapValue createMapOfAll(@NonNull TypeId keyTypeId, @NonNull TypeId valueTypeId, @NonNull Map<Object, Object> unboxedValues) {
		Map<Object, Object> boxedValues = new HashMap<Object, Object>();
		for (Map.Entry<Object, Object> unboxedValue : unboxedValues.entrySet()) {
			boxedValues.put(boxedValueOf(unboxedValue.getKey()), boxedValueOf(unboxedValue.getValue()));
		}
		return ValueUtil.createMapValue(keyTypeId, valueTypeId, boxedValues);
	}

	@Override
	public @NonNull OrderedSetValue createOrderedSetOfAll(@NonNull CollectionTypeId typeId, @NonNull Iterable<? extends Object> unboxedValues) {
		OrderedSet<Object> boxedValues = new OrderedSetImpl<Object>();
		for (Object unboxedValue : unboxedValues) {
			boxedValues.add(boxedValueOf(unboxedValue));
		}
		return ValueUtil.createOrderedSetValue(typeId, boxedValues);
	}

	@Override
	public @NonNull OrderedSetValue createOrderedSetOfEach(@NonNull CollectionTypeId typeId, @NonNull Object... unboxedValues) {
		OrderedSet<Object> boxedValues = new OrderedSetImpl<Object>();
		for (Object unboxedValue : unboxedValues) {
			boxedValues.add(boxedValueOf(unboxedValue));
		}
		return ValueUtil.createOrderedSetValue(typeId, boxedValues);
	}

	@Override
	public @NonNull SequenceValue createSequenceOfAll(@NonNull CollectionTypeId typeId, @NonNull Iterable<? extends Object> unboxedValues) {
		List<Object> boxedValues = new ArrayList<Object>();
		for (Object unboxedValue : unboxedValues) {
			boxedValues.add(boxedValueOf(unboxedValue));
		}
		return ValueUtil.createSequenceValue(typeId, boxedValues);
	}

	@Override
	public @NonNull SequenceValue createSequenceOfEach(@NonNull CollectionTypeId typeId, @NonNull Object... unboxedValues) {
		List<Object> boxedValues = new ArrayList<Object>();
		for (Object unboxedValue : unboxedValues) {
			boxedValues.add(boxedValueOf(unboxedValue));
		}
		return ValueUtil.createSequenceValue(typeId, boxedValues);
	}

	@Override
	public @NonNull SetValue createSetOfAll(@NonNull CollectionTypeId typeId, @NonNull Iterable<? extends Object> unboxedValues) {
		Set<Object> boxedValues = new HashSet<Object>();
		for (Object unboxedValue : unboxedValues) {
			boxedValues.add(boxedValueOf(unboxedValue));
		}
		return ValueUtil.createSetValue(typeId, boxedValues);
	}

	@Override
	public @NonNull SetValue createSetOfEach(@NonNull CollectionTypeId typeId, @NonNull Object... unboxedValues) {
		Set<Object> boxedValues = new HashSet<Object>();
		for (Object unboxedValue : unboxedValues) {
			boxedValues.add(boxedValueOf(unboxedValue));
		}
		return ValueUtil.createSetValue(typeId, boxedValues);
	}

	@Override
	public void dispose() {
		tupleParts = null;
		key2type.clear();
		enumerationLiteral2enumerator = null;
		enumerator2enumerationLiteralId = null;
	}

	@Override
	public @Nullable Object ecoreValueOf(@Nullable Class<?> instanceClass, @Nullable Object value) {
		if (value instanceof Value) {
			return ((Value)value).asEcoreObject(this, instanceClass);
		}
		else if (value instanceof Number) {
			Number number = (Number)value;
			if ((instanceClass == Double.class) || (instanceClass == double.class)) {
				return number.doubleValue();
			}
			else if ((instanceClass == Float.class) || (instanceClass == float.class)) {
				return number.floatValue();
			}
			else if ((instanceClass == Short.class) || (instanceClass == short.class)) {
				return number.shortValue();
			}
			else if ((instanceClass == Integer.class) || (instanceClass == int.class)) {
				return number.intValue();
			}
			else if ((instanceClass == Long.class) || (instanceClass == long.class)) {
				return number.longValue();
			}
			else if (instanceClass == BigDecimal.class) {
				return BigDecimal.valueOf(number.doubleValue());
			}
			else if (instanceClass == BigInteger.class) {
				return BigInteger.valueOf(number.longValue());
			}
			else {					// instanceClass is null, make a best guess
				if ((number instanceof BigDecimal) || (number instanceof Double) || (number instanceof Float)) {
					return number.doubleValue();
				}
				else {
					return number.intValue();
				}
			}
		}
		else if (value instanceof EnumerationLiteralId) {
			return unboxedValueOf((EnumerationLiteralId)value);
		}
		else if (value instanceof EEnumLiteral) {
			return ((EEnumLiteral)value).getInstance();
		}
		else if (value instanceof Iterable<?>) {
			if (value instanceof EcoreEList.UnmodifiableEList<?>) {
				return value;
			}
			else {
				@SuppressWarnings("unchecked") Iterable<Object> values = (Iterable<Object>)value;
				return ecoreValuesOfAll(instanceClass, values);
			}
	}
		else {
			return value;
		}
	}

	@Override
	public @NonNull EList<Object> ecoreValuesOfAll(@Nullable Class<?> instanceClass, @NonNull Iterable<Object> values) {
		
		Object[] ecoreValues = new Object[Iterables.size(values)];
		int i= 0;
		for (Object value : values) {
			ecoreValues[i++] = ecoreValueOf(instanceClass, value);
		}
		return new EcoreEList.UnmodifiableEList<Object>(null, null, ecoreValues.length, ecoreValues);
	}

	@Override
	public @NonNull EList<Object> ecoreValuesOfEach(@Nullable Class<?> instanceClass, @NonNull Object... values) {
		Object[] ecoreValues = new Object[values.length];
		int i= 0;
		for (Object value : values) {
			ecoreValues[i++] = ecoreValueOf(instanceClass, value);
		}
		return new EcoreEList.UnmodifiableEList<Object>(null, null, ecoreValues.length, ecoreValues);
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getClass(@NonNull TypeId typeId, @Nullable Object context) {
		Element type = typeId.accept(this);
		assert type != null;
		return (org.eclipse.ocl.pivot.Class)type;
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getCollectionType(@NonNull CollectionTypeId typeId) {
		return getCollectionType(typeId, false, null, null);
	}

	public @NonNull org.eclipse.ocl.pivot.Class getCollectionType(@NonNull CollectionTypeId typeId, boolean isNullFree, @Nullable IntegerValue lower, @Nullable UnlimitedNaturalValue upper) {
		CollectionTypeId generalizedId = typeId.getGeneralizedId();
		if ((typeId == generalizedId) && !isNullFree && (lower == null) && (upper == null)) {
			if (generalizedId == TypeId.BAG) {
				return standardLibrary.getBagType();
			}
			else if (generalizedId == TypeId.COLLECTION) {
				return standardLibrary.getCollectionType();
			}
			else if (generalizedId == TypeId.ORDERED_SET) {
				return standardLibrary.getOrderedSetType();
			}
			else if (generalizedId == TypeId.SEQUENCE) {
				return standardLibrary.getSequenceType();
			}
			else if (generalizedId == TypeId.SET) {
				return standardLibrary.getSetType();
			}
			else if (generalizedId == TypeId.UNIQUE_COLLECTION) {
				return standardLibrary.getUniqueCollectionType();
			}
			else {
				throw new UnsupportedOperationException();
			}
		}
		else {
			TypeId elementTypeId = typeId.getElementTypeId();
			Type elementType = getType(elementTypeId, null);
			if (generalizedId == TypeId.BAG) {
				return environment.getBagType(elementType, isNullFree, lower, upper);
			}
			else if (generalizedId == TypeId.COLLECTION) {
				return environment.getCollectionType(standardLibrary.getCollectionType(), elementType, isNullFree, lower, upper);
			}
			else if (generalizedId == TypeId.ORDERED_SET) {
				return environment.getOrderedSetType(elementType, isNullFree, lower, upper);
			}
			else if (generalizedId == TypeId.SEQUENCE) {
				return environment.getSequenceType(elementType, isNullFree, lower, upper);
			}
			else if (generalizedId == TypeId.SET) {
				return environment.getSetType(elementType, isNullFree, lower, upper);
			}
			else {
				throw new UnsupportedOperationException();
			}
		}
	}
	
	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getDynamicTypeOf(@Nullable Object value) {
		if (value instanceof CollectionValue) {
			CollectionValue collectionValue = (CollectionValue) value;
			Type elementType = getDynamicTypeOf(collectionValue.iterable());
			if (elementType == null) {
				elementType = getType(collectionValue.getTypeId().getElementTypeId(), null);
			}
			CollectionTypeId collectedId = collectionValue.getTypeId();
			CollectionTypeId collectionId = collectedId.getGeneralizedId();
			TypeId elementTypeId = elementType.getTypeId();
			collectedId = collectionId.getSpecializedId(elementTypeId);
			final IntegerValue size = collectionValue.size();
			return getCollectionType(collectedId, false, size, size.asUnlimitedNaturalValue());		// FIXME dynamic isNullFree
		}
		else {
			return getStaticTypeOf(value);
		}
	}
	
	@Override
	public @Nullable Type getDynamicTypeOf(@NonNull Object... values) {
		Type elementType = null;
		for (Object value : values) {
			org.eclipse.ocl.pivot.Class valueType = getDynamicTypeOf(value);
			if (elementType == null) {
				elementType = valueType;
			}
			else {
				elementType = elementType.getCommonType(this, valueType);
			}
		}
		if (elementType == null) {
			elementType = standardLibrary.getOclInvalidType();
		}
		return elementType;
	}
	
	@Override
	public @Nullable Type getDynamicTypeOf(@NonNull Iterable<?> values) {
		Type elementType = null;
		for (Object value : values) {
			org.eclipse.ocl.pivot.Class valueType = getDynamicTypeOf(value);
			if (elementType == null) {
				elementType = valueType;
			}
			else {
				elementType = elementType.getCommonType(this, valueType);
			}
		}
		return elementType;
	}

	@Override
	public @NonNull CompleteEnvironment getEnvironment() {
		return environment;
	}

	@Override
	public synchronized @NonNull org.eclipse.ocl.pivot.Class getJavaType(@NonNull Class<?> javaClass) {
		org.eclipse.ocl.pivot.Class type = key2type.get(javaClass);
		if (type != null) {
			return type;
		}
/*		if (javaClass == Boolean.class) {
			type = standardLibrary.getBooleanType();
		}
		else if (javaClass == String.class) {
			type = standardLibrary.getStringType();
		}
		else { */
			type = new JavaType(javaClass);
//		}
		key2type.put(javaClass, type);
		return type;
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getMapType(@NonNull MapTypeId typeId) {
		MapTypeId generalizedId = typeId.getGeneralizedId();
		if (typeId == generalizedId) {
			if (generalizedId == TypeId.MAP) {
				return standardLibrary.getMapType();
			}
			else {
				throw new UnsupportedOperationException();
			}
		}
		else {
			TypeId keyTypeId = typeId.getKeyTypeId();
			TypeId valueTypeId = typeId.getValueTypeId();
			Type keyType = getType(keyTypeId, null);
			Type valueType = getType(valueTypeId, null);
			if (generalizedId == TypeId.MAP) {
				return environment.getMapType(standardLibrary.getMapType(), keyType, valueType);
			}
			else {
				throw new UnsupportedOperationException();
			}
		}
	}

	@Override
	public @NonNull Operation getOperation(@NonNull OperationId operationId) {
		Element element = operationId.accept(this);
		if (element instanceof Operation) {
			return (Operation) element;
		}
		throw new IllegalStateException("No " + operationId); //$NON-NLS-1$
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Package getPackage(@NonNull PackageId packageId) {
		Element element = packageId.accept(this);
		if (element instanceof org.eclipse.ocl.pivot.Package) {
			return (org.eclipse.ocl.pivot.Package) element;
		}
		throw new IllegalStateException("No " + packageId); //$NON-NLS-1$
	}

	@Override
	public @NonNull Property getProperty(@NonNull PropertyId propertyId) {
		Element element = propertyId.accept(this);
		if (element instanceof Property) {
			return (Property) element;
		}
		throw new IllegalStateException("No " + propertyId); //$NON-NLS-1$
	}

	@Override
	public @NonNull StandardLibrary getStandardLibrary() {
		return standardLibrary;
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getStaticTypeOf(@Nullable Object value) {
		if (value instanceof Type) {
			org.eclipse.ocl.pivot.Class type = key2type.get(value);
			if (type == null) {
				type = standardLibrary.getMetaclass((Type) value);
				assert type != null;
				key2type.put(value, type);
			}
			return type;
		}
		else if (value instanceof EObject) {
			EClass eClass = ((EObject)value).eClass();
			assert eClass != null;
			org.eclipse.ocl.pivot.Class type = key2type.get(eClass);
			if (type == null) {
				type = getInheritance(eClass).getPivotClass();
				assert type != null;
				key2type.put(eClass, type);
			}
			return type;
		}
		else if (value instanceof Value) {
			TypeId typeId = ((Value)value).getTypeId();			
			org.eclipse.ocl.pivot.Class type = key2type.get(typeId);
			if (type == null) {
				type = (org.eclipse.ocl.pivot.Class) typeId.accept(this);
				assert type != null;
				key2type.put(typeId, type);
			}
			return type;
		}
		else if (value == null) {
			return standardLibrary.getOclVoidType();
		}
		if (value instanceof Boolean) {
			return standardLibrary.getBooleanType();
		}
		else if (value instanceof String) {
			return standardLibrary.getStringType();
		}
		else if (value instanceof Number) {
			if ((value instanceof BigDecimal) || (value instanceof Double) || (value instanceof Float)) {
				return standardLibrary.getRealType();
			}
			if ((value instanceof BigInteger) || (value instanceof Byte) || (value instanceof Integer) || (value instanceof Long) || (value instanceof Short)) {
				return standardLibrary.getIntegerType();
			}
		}
		else if (value instanceof EnumerationLiteralId) {
			EnumerationLiteral enumLiteral = (EnumerationLiteral) ((EnumerationLiteralId)value).accept(this);
			assert enumLiteral != null;
			Enumeration enumeration = enumLiteral.getOwningEnumeration();
			assert enumeration != null;
			return enumeration;
		}
		Class<?> jClass = value.getClass();
		assert jClass != null;
		return getJavaType(jClass);
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getStaticTypeOf(@Nullable Object value, Object... values) {
		Object bestTypeId = getTypeKeyOf(value);
		org.eclipse.ocl.pivot.Class bestType = key2type.get(bestTypeId);
		assert bestType != null;
		Collection<Object> assessedTypeKeys = null;
		int count = 0;
		for (Object anotherValue : values) {
			Object anotherTypeId = getTypeKeyOf(anotherValue);
			if ((assessedTypeKeys == null) ? (anotherTypeId != bestTypeId) : !assessedTypeKeys.contains(anotherTypeId)) {
				org.eclipse.ocl.pivot.Class anotherType = key2type.get(anotherTypeId);
				assert anotherType != null;
				Type commonType = bestType.getCommonType(this, anotherType);
				if ((commonType != bestType) && (commonType instanceof org.eclipse.ocl.pivot.Class)) {
					if (assessedTypeKeys == null) {
						assessedTypeKeys = new ArrayList<Object>();
						assessedTypeKeys.add(bestTypeId);
					}
					else if (count++ == 4) {
						assessedTypeKeys = new HashSet<Object>(assessedTypeKeys);
					}
					assessedTypeKeys.add(anotherTypeId);
					bestType = (org.eclipse.ocl.pivot.Class)commonType;
					bestTypeId = anotherTypeId;
				}
			}
		}		
		return bestType;
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getStaticTypeOf(@Nullable Object value, @NonNull Iterable<?> values) {
		Object bestTypeKey = getTypeKeyOf(value);
		org.eclipse.ocl.pivot.Class bestType = key2type.get(bestTypeKey);
		assert bestType != null;
		Collection<Object> assessedTypeKeys = null;
		int count = 0;
		for (Object anotherValue : values) {
			assert anotherValue != null;
			Object anotherTypeKey = getTypeKeyOf(anotherValue);
			if ((assessedTypeKeys == null) ? (anotherTypeKey != bestTypeKey) : !assessedTypeKeys.contains(anotherTypeKey)) {
				org.eclipse.ocl.pivot.Class anotherType = key2type.get(anotherTypeKey);
				assert anotherType != null;
				Type commonType = bestType.getCommonType(this, anotherType);
				if (commonType != bestType) {
					if (assessedTypeKeys == null) {
						assessedTypeKeys = new ArrayList<Object>();
						assessedTypeKeys.add(bestTypeKey);
					}
					else if (count++ == 4) {
						assessedTypeKeys = new HashSet<Object>(assessedTypeKeys);
					}
					assessedTypeKeys.add(anotherTypeKey);
				}
			}
		}		
		return bestType;
	}
	
	@Override
	public @NonNull TypedElement getTuplePart(@NonNull String name, @NonNull TypeId typeId) {
		return getTuplePart(name, getType(typeId, null));
	}

	public synchronized @NonNull TypedElement getTuplePart(@NonNull String name, @NonNull Type type) {
		if (tupleParts == null) {
			tupleParts = new WeakHashMap<String, Map<Type, WeakReference<TypedElement>>>();
		}
		Map<Type, WeakReference<TypedElement>> typeMap = tupleParts.get(name);
		if (typeMap == null) {
			typeMap = new WeakHashMap<Type, WeakReference<TypedElement>>();
			tupleParts.put(name, typeMap);
		}
		TypedElement tupleProperty = weakGet(typeMap, type);
		if (tupleProperty == null) {
			tupleProperty = new ExecutorTuplePart(type, name);
			typeMap.put(type, new WeakReference<TypedElement>(tupleProperty));
		}
		return tupleProperty;
	}

	@Override
	public abstract @NonNull TupleType getTupleType(@NonNull TupleTypeId typeId);

	@Override
	public @NonNull Type getType(@NonNull TypeId typeId, @Nullable Object context) {
		Element type = typeId.accept(this);
		assert type != null;
		return (Type)type;
	}

	private @NonNull Object getTypeKeyOf(@Nullable Object value) {
		/*if (value instanceof DomainType) {
			DomainType type = (DomainType) id2element.get(value);
			if (type == null) {
				type = standardLibrary.getMetaclass((DomainType) value);
				assert type != null;
				id2element.put(value, type);
			}
			return value;
		}
		else*/ if (value instanceof EObject) {
			EClass typeKey = ((EObject)value).eClass();
			assert typeKey != null;
			org.eclipse.ocl.pivot.Class type = key2type.get(typeKey);
			if (type == null) {
				type = getInheritance(typeKey).getPivotClass();
				assert type != null;
				key2type.put(typeKey, type);
			}
			return typeKey;
		}
		else if (value instanceof Value) {
			TypeId typeKey = ((Value)value).getTypeId();			
			org.eclipse.ocl.pivot.Class type = key2type.get(typeKey);
			if (type == null) {
				type = (org.eclipse.ocl.pivot.Class) typeKey.accept(this);
				assert type != null;
				key2type.put(typeKey, type);
			}
			return typeKey;
		}
		else if (value == null) {
			TypeId typeKey = TypeId.OCL_VOID;			
			key2type.put(typeKey, standardLibrary.getOclVoidType());
			return typeKey;
		}
		else {
			Class<?> typeKey = value.getClass();
			assert typeKey != null;
			org.eclipse.ocl.pivot.Class type = key2type.get(typeKey);
			if (type != null) {
				return typeKey;
			}
			if (value instanceof Boolean) {
				type = standardLibrary.getBooleanType();
			}
			else if (value instanceof String) {
				type = standardLibrary.getStringType();
			}
			if (type != null) {
				key2type.put(typeKey, type);
				return typeKey;
			}
		}
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean oclEquals(@Nullable Object thisValue, @Nullable Object thatValue) {
		if (thisValue == thatValue) {
			return true;
		}
		else if (thisValue instanceof OCLValue) {
			if (thatValue instanceof OCLValue) {
				return ((OCLValue)thisValue).oclEquals((OCLValue)thatValue);
			}
			else {
				thatValue = boxedValueOf(thatValue);
				if (thatValue instanceof OCLValue) {
					return ((OCLValue)thisValue).oclEquals((OCLValue)thatValue);
				}
				else {
					return false;
				}
			}
		}
		else if (thatValue instanceof OCLValue) {
			thisValue = boxedValueOf(thisValue);
			if (thisValue instanceof OCLValue) {
				return ((OCLValue)thisValue).oclEquals((OCLValue)thatValue);
			}
			else {
				return false;
			}
		}
		else if (thisValue != null) {
			if (thatValue != null) {
				return thisValue.equals(thatValue);
			}
			else {
				return false;
			}
		}
		else {
			return thatValue == null;
		}
	}

	protected synchronized void processCrossReferencedRoots() {
		if (crossReferencedRootsProcessed ) {
			return;
		}
		crossReferencedRootsProcessed = true;
		new ExternalCrossReferencer(directRoots)
		{
			private static final long serialVersionUID = 1L;
			
			private Set<EObject> moreRoots = new HashSet<EObject>();

			{ findExternalCrossReferences(); }

			@Override
			protected boolean crossReference(EObject eObject, EReference eReference, EObject crossReferencedEObject) {
				EObject root = EcoreUtil.getRootContainer(crossReferencedEObject);
				if (moreRoots.add(root) && !directRoots.contains(root)) {
					if (root instanceof Model) {
						addPackages(((Model)root).getOwnedPackages());
					}
					else if (root instanceof org.eclipse.ocl.pivot.Package) {					// Perhaps this is only needed for a lazy JUnit test
						addPackage((org.eclipse.ocl.pivot.Package)root);
					}
				}
				return false;
			}
		};
	}

	protected synchronized void processDirectRoots() {
		if (directRootsProcessed) {
			return;
		}
		directRootsProcessed = true;
		Set<EPackage> ePackages = new HashSet<EPackage>();
		for (EObject eObject : directRoots) {
			if (eObject instanceof Model) {
				addPackages(((Model)eObject).getOwnedPackages());
			}
//			else if (eObject instanceof org.eclipse.ocl.pivot.Package) {							// Perhaps this is only needed for a lazy JUnit test
//				addPackage((org.eclipse.ocl.pivot.Package)eObject);
//			}
			else {
				ePackages.add(eObject.eClass().getEPackage());
			}
		}
		for (@SuppressWarnings("null")@NonNull EPackage ePackage : ePackages) {
			addEPackage(ePackage);
		}
	}

	@Override
	public @Nullable Object unboxedValueOf(@Nullable Object boxedValue) {
		if (boxedValue instanceof Value) {
			return ((Value)boxedValue).asUnboxedObject(this);
		}
		else if (boxedValue instanceof EnumerationLiteralId) {
			return unboxedValueOf((EnumerationLiteralId)boxedValue);
		}
		else {
			return boxedValue;
		}
	}

	@Override
	public @NonNull Enumerator unboxedValueOf(@NonNull EnumerationLiteralId enumerationLiteralId) {
		if (enumerationLiteral2enumerator == null) {
			synchronized (this) {
				if (enumerationLiteral2enumerator == null) {
					enumerationLiteral2enumerator = new HashMap<EnumerationLiteralId, Enumerator>();
				}
			}
		}
		Enumerator enumerator = enumerationLiteral2enumerator.get(enumerationLiteralId);
		if (enumerator == null) {
			synchronized (enumerationLiteral2enumerator) {
				enumerator = enumerationLiteral2enumerator.get(enumerationLiteralId);
				if (enumerator == null) {
					EnumerationLiteral enumerationLiteral = (EnumerationLiteral) enumerationLiteralId.accept(this);
					if (enumerationLiteral != null) {
						enumerator = enumerationLiteral.getEnumerator();
						enumerationLiteral2enumerator.put(enumerationLiteralId, enumerator);
					}
					if (enumerator == null) {
						throw new UnsupportedOperationException();		// FIXME
					}
				}
			}
		}
		return enumerator;
	}

	@Override
	public @NonNull EList<Object> unboxedValuesOfAll(@NonNull Collection<? extends Object> boxedValues) {
		Object[] unboxedValues = new Object[boxedValues.size()];
		int i= 0;
		for (Object boxedValue : boxedValues) {
			unboxedValues[i++] = unboxedValueOf(boxedValue);
		}
		return new EcoreEList.UnmodifiableEList<Object>(null, null, i, unboxedValues);
	}

	@Override
	public @NonNull EList<Object> unboxedValuesOfEach(@NonNull Object... boxedValues) {
		Object[] unboxedValues = new Object[boxedValues.length];
		int i= 0;
		for (Object boxedValue : boxedValues) {
			unboxedValues[i++] = unboxedValueOf(boxedValue);
		}
		return new EcoreEList.UnmodifiableEList<Object>(null, null, boxedValues.length, unboxedValues);
	}

	@Override
	public @NonNull Type visitClassId(@NonNull ClassId id) {
		org.eclipse.ocl.pivot.Package parentPackage = (org.eclipse.ocl.pivot.Package) id.getParent().accept(this);
		assert parentPackage != null;
		Type nestedType = environment.getNestedType(parentPackage, id.getName());
		if (nestedType == null) {
			nestedType = environment.getNestedType(parentPackage, id.getName());
			throw new UnsupportedOperationException();
		}
		return nestedType;
	}
	
	public @NonNull Type visitCollectedId(@NonNull CollectionTypeId id) {
		Type elementType = (Type) id.getElementTypeId().accept(this);
		if (elementType == null) {
			throw new UnsupportedOperationException();
		}
		CollectionTypeId collectionTypeId = id.getGeneralizedId();
		org.eclipse.ocl.pivot.Class collectionType = getCollectionType(collectionTypeId);
		return environment.getCollectionType(collectionType, elementType, false, null, null);
	}

	@Override
	public @NonNull Type visitCollectionTypeId(@NonNull CollectionTypeId id) {
		return getCollectionType(id);
	}

	@Override
	public @NonNull Type visitDataTypeId(@NonNull DataTypeId id) {
		org.eclipse.ocl.pivot.Package parentPackage = (org.eclipse.ocl.pivot.Package) id.getParent().accept(this);
		assert parentPackage != null;
		Type nestedType = environment.getNestedType(parentPackage, id.getName());
		if (nestedType == null) {
			nestedType = environment.getNestedType(parentPackage, id.getName());
			if (nestedType == null) {
				throw new UnsupportedOperationException();
			}
		}
		return nestedType;
	}
	
	@Override
	public @NonNull Enumeration visitEnumerationId(@NonNull EnumerationId id) {
		org.eclipse.ocl.pivot.Package parentPackage = (org.eclipse.ocl.pivot.Package) id.getParent().accept(this);
		assert parentPackage != null;
		Type nestedType = environment.getNestedType(parentPackage, id.getName());
		if (nestedType == null) {
			nestedType = environment.getNestedType(parentPackage, id.getName());
			throw new UnsupportedOperationException();
		}
		if (!(nestedType instanceof Enumeration)) {
			throw new UnsupportedOperationException();
		}
		return (Enumeration) nestedType;
	}

	@Override
	public @NonNull EnumerationLiteral visitEnumerationLiteralId(@NonNull EnumerationLiteralId id) {
		Element parent = id.getParentId().accept(this);
		if (!(parent instanceof Enumeration)) {
			throw new UnsupportedOperationException();
		}
		EnumerationLiteral enumerationLiteral = ((Enumeration)parent).getEnumerationLiteral(id.getName());
		if (enumerationLiteral == null) {
			throw new UnsupportedOperationException();
		}
		return enumerationLiteral;
	}

	@Override
	public @NonNull Type visitInvalidId(@NonNull OclInvalidTypeId id) {
		return standardLibrary.getOclInvalidType();
	}

	@Override
	public @NonNull Type visitLambdaTypeId(@NonNull LambdaTypeId id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public @NonNull Type visitMapTypeId(@NonNull MapTypeId id) {
		return getMapType(id);
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Package visitNestedPackageId(@NonNull NestedPackageId packageId) {
		org.eclipse.ocl.pivot.Package parentPackage = (org.eclipse.ocl.pivot.Package) packageId.getParent().accept(this);
		assert parentPackage != null;
		org.eclipse.ocl.pivot.Package nestedPackage = environment.getNestedPackage(parentPackage, packageId.getName());
		if (nestedPackage == null) {
			throw new UnsupportedOperationException();
		}
		return nestedPackage;
	}

/*	@Override
	public @NonNull org.eclipse.ocl.pivot.Package visitNsURIPackageId(@NonNull NsURIPackageId id) {
		org.eclipse.ocl.pivot.Package nsURIPackage = standardLibrary.getNsURIPackage(id.getNsURI());
		if (nsURIPackage == null) {
			throw new UnsupportedOperationException();
		}
		return nsURIPackage;
	} */

	@Override
	public synchronized @NonNull org.eclipse.ocl.pivot.Package visitNsURIPackageId(@NonNull NsURIPackageId id) {
		String nsURI = id.getNsURI();
		org.eclipse.ocl.pivot.Package knownPackage = nsURI2package.get(nsURI);
		if (knownPackage != null) {
			return knownPackage;
		}
		org.eclipse.ocl.pivot.Package libraryPackage = standardLibrary.getNsURIPackage(nsURI);
		if (libraryPackage != null) {
			nsURI2package.put(nsURI, libraryPackage);
			return libraryPackage;
		}
		if (!directRootsProcessed) {
			processDirectRoots();
			knownPackage = nsURI2package.get(nsURI);
			if (knownPackage != null) {
				return knownPackage;
			}
		}
		if (!crossReferencedRootsProcessed) {
			processCrossReferencedRoots();
			knownPackage = nsURI2package.get(nsURI);
			if (knownPackage != null) {
				return knownPackage;
			}
		}
		EPackage ePackage = id.getEPackage();
		if (ePackage != null) {
			org.eclipse.ocl.pivot.Package asPackage = addEPackage(ePackage);
/*			EcoreReflectivePackage ecoreExecutorPackage = new EcoreReflectivePackage(ePackage, this, id);
//			EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
//			EcoreReflectiveType[] types = new EcoreReflectiveType[eClassifiers.size()];
//			for (int i = 0; i < types.length; i++) {
//				types[i] = new EcoreReflectiveType(eClassifiers.get(i), ecoreExecutorPackage, 0);
//			}
//			ecoreExecutorPackage.init((ExecutorStandardLibrary) standardLibrary, types);
			nsURI2package.put(nsURI, ecoreExecutorPackage); */
			return asPackage;
		}
		throw new UnsupportedOperationException();
	}

	@Override
	public @NonNull Type visitNullId(@NonNull OclVoidTypeId id) {
		return standardLibrary.getOclVoidType();
	}

	@Override
	public @NonNull Operation visitOperationId(@NonNull OperationId id) {
		org.eclipse.ocl.pivot.Class domainType = (org.eclipse.ocl.pivot.Class) id.getParent().accept(this);
		if (domainType == null) {
			throw new UnsupportedOperationException();
		}
		CompleteInheritance inheritance = standardLibrary.getInheritance(domainType);
		Operation memberOperation = inheritance.getMemberOperation(id);
		if (memberOperation == null) {
			throw new UnsupportedOperationException();
		}
		return memberOperation;
	}

	@Override
	public @NonNull Type visitPrimitiveTypeId(@NonNull PrimitiveTypeId id) {
		Type primitiveType = standardLibrary.getPrimitiveType(id);
		if (primitiveType == null) {
			throw new UnsupportedOperationException();
		}
		return primitiveType;
	}

	@Override
	public @NonNull Property visitPropertyId(@NonNull PropertyId id) {
		org.eclipse.ocl.pivot.Class domainType = (org.eclipse.ocl.pivot.Class) id.getParent().accept(this);
		if (domainType == null) {
			throw new UnsupportedOperationException();
		}
		CompleteInheritance inheritance = standardLibrary.getInheritance(domainType);
		Property memberProperty = inheritance.getMemberProperty(id.getName());
		if (memberProperty == null) {
			throw new UnsupportedOperationException();
		}
		return memberProperty;
	}

/*	@Override
	public @NonNull org.eclipse.ocl.pivot.Package visitRootPackageId(@NonNull RootPackageId id) {
		String completeURIorName = id.getName();
		org.eclipse.ocl.pivot.Package rootPackage = standardLibrary.getRootPackage(completeURIorName);
		if (rootPackage == null) {
			throw new UnsupportedOperationException();
		}
		return rootPackage;
	} */

	@Override
	public @NonNull org.eclipse.ocl.pivot.Package visitRootPackageId(@NonNull RootPackageId id) {
		if (id == IdManager.METAMODEL) {
			return ClassUtil.nonNullState(getStandardLibrary().getPackage());
		}
		String name = id.getName();
		org.eclipse.ocl.pivot.Package knownPackage = roots2package.get(name);
		if (knownPackage != null) {
			return knownPackage;
		}
//		org.eclipse.ocl.pivot.Package libraryPackage = standardLibrary.getNsURIPackage(nsURI);
//		if (libraryPackage != null) {
//			nsURI2package.put(nsURI, libraryPackage);
//			return libraryPackage;
//		}
		if (!directRootsProcessed) {
			processDirectRoots();
			knownPackage = roots2package.get(name);
			if (knownPackage != null) {
				return knownPackage;
			}
		}
		if (!crossReferencedRootsProcessed) {
			processCrossReferencedRoots();
			knownPackage = roots2package.get(name);
			if (knownPackage != null) {
				return knownPackage;
			}
		}
		throw new UnsupportedOperationException();
	}

	@Override
	public @NonNull Element visitTemplateBinding(@NonNull TemplateBinding id) {
		return id.getTemplateParameter();
	}

	@Override
	public @NonNull Element visitTemplateParameterId(@NonNull TemplateParameterId id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public @NonNull Type visitTemplateableTypeId(@NonNull TemplateableTypeId id) {
		return getType(id, null);
	}

	@Override
	public @NonNull TypedElement visitTuplePartId(@NonNull TuplePartId id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public @NonNull Type visitTupleTypeId(@NonNull TupleTypeId id) {
		return getTupleType(id);
	}

	@Override
	public @NonNull Type visitUnspecifiedId(@NonNull UnspecifiedId id) {
		return (Type) id.getSpecifier();
	}

	/**
	 * Return the map.get(key).get() entry if there is one or null if not, removing any stale
	 * entry that may be encountered.
	 */
	protected <K, V> V weakGet(@NonNull Map<K, WeakReference<V>> map, @NonNull K key) {
		WeakReference<V> ref = map.get(key);
		if (ref == null) {
			return null;
		}
		V value = ref.get();
		if (value == null) {
			map.remove(key);
		}
		return value;
	}
}
