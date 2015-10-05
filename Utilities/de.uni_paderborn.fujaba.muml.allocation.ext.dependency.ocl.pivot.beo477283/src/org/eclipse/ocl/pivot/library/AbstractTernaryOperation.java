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

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.TypeId;

/**
 * AbstractTernaryOperation defines the default implementation of a ternary operation redirecting the
 * call-expression invocation to the return type-id form.
 */
public abstract class AbstractTernaryOperation extends AbstractOperation implements LibraryTernaryOperation
{
	@Override
	public @Nullable Object dispatch(@NonNull Evaluator evaluator, @NonNull OperationCallExp callExp, @Nullable Object sourceValue) {
		List<? extends OCLExpression> arguments = callExp.getOwnedArguments();
		OCLExpression argument0 = arguments.get(0);
		OCLExpression argument1 = arguments.get(1);
		assert argument0 != null;
		assert argument1 != null;
		Object firstArgument = evaluator.evaluate(argument0);
		Object secondArgument = evaluator.evaluate(argument1);
		return evaluate(evaluator, callExp.getTypeId(), sourceValue, firstArgument, secondArgument);
	}

	// Redundant declaration avoids @Override dilemma for 1.5/1.6
	@Override
	public abstract @Nullable /*@Thrown*/ Object evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @Nullable Object sourceValue, @Nullable Object firstArgumentValue, @Nullable Object secondArgumentValue);
}
