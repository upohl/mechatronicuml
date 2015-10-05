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
package org.eclipse.ocl.pivot.library;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.TypeId;

/**
 * AbstractUntypedUnaryOperation defines the default implementation of a unary operation redirecting the
 * type-id invocation to the type-id-less form.
 */
public abstract class AbstractUntypedUnaryOperation extends AbstractUnaryOperation implements LibraryUntypedUnaryOperation
{
	@Override
	public @Nullable Object dispatch(@NonNull Evaluator evaluator, @NonNull OperationCallExp callExp, @Nullable Object sourceValue) {
		return evaluate(evaluator, sourceValue);
	}

	@Override
	public @Nullable Object evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @Nullable Object sourceValue) {
		return evaluate(evaluator, sourceValue);
	}

	// Redundant declaration avoids @Override dilemma for 1.5/1.6
	@Override
	public abstract @Nullable /*@Thrown*/ Object evaluate(@NonNull Evaluator evaluator, @Nullable Object sourceValue);
}
