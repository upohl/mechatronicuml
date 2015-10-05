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
package org.eclipse.ocl.pivot.library.oclany;

import org.eclipse.jdt.annotation.NonNull;

/**
 * GreaterThanEqualOperation realises the >=() library operation.
 */
public class OclComparableGreaterThanEqualOperation extends OclComparableComparisonOperation
{
	public static final @NonNull OclComparableGreaterThanEqualOperation INSTANCE = new OclComparableGreaterThanEqualOperation();

	@Override
	protected boolean getResultValue(Integer comparison) {
		return comparison >= 0;
	}
}
