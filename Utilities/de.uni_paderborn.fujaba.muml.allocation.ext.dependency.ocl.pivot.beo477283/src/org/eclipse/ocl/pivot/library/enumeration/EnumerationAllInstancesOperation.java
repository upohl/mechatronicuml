/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.enumeration;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.EnumerationLiteral;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractUnaryOperation;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * EnumerationAllInstancesOperation realises the Enumeration::allInstances() library operation.
 */
public class EnumerationAllInstancesOperation extends AbstractUnaryOperation
{
	public static final @NonNull EnumerationAllInstancesOperation INSTANCE = new EnumerationAllInstancesOperation();

	@Override
	public @NonNull SetValue evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @Nullable Object sourceVal) {
		Type sourceType = asType(sourceVal);
		Set<Object> results = new HashSet<Object>();
		if (sourceType instanceof Enumeration) {
			for (EnumerationLiteral instance : ((Enumeration)sourceType).getOwnedLiterals()) {
				if (instance != null) {
					results.add(instance.getEnumerationLiteralId());
				}
			}
		}
		return createSetValue((CollectionTypeId)returnTypeId, results);
	}
}
