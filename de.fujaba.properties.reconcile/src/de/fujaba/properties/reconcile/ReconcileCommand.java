package de.fujaba.properties.reconcile;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.fujaba.properties.CustomTransformation;
import de.fujaba.properties.PropertyGenerator;
import de.fujaba.properties.Reconciler;
import de.fujaba.properties.TransformationPosition;

public class ReconcileCommand extends ChangeCommand {

	private PropertyGenerator generator;

	public ReconcileCommand(PropertyGenerator generator) {
		super(generator.eResource());
		setLabel("Reconcile Model");
		this.generator = generator;
	}

	public boolean hasChanged() {
		ChangeDescription description = getChangeDescription();
		if (description != null) {
			return !description.getObjectChanges().isEmpty();
		}
		return false;
	}

	@Override
	protected boolean prepare() {
		// Prevent execution if reconciler is not present or disabled
		if (generator.getReconciler() == null) {
			return false;
		}
		if (generator.getReconciler().isEnabled() == false) {
			return false;
		}
		return super.prepare();
	}

	@Override
	protected void doExecute() {
		Reconciler reconciler = generator.getReconciler();

		// pre reconcile transformations
		for (CustomTransformation transformation : reconciler
				.getCustomTransformations()) {
			if (transformation.getPosition() == TransformationPosition.PRE_RECONCILE
					&& transformation.isEnabled()
					&& transformation.getUri() != null) {

				URI uri = URI.createPlatformResourceURI(
						transformation.getUri(), true);
				transform(PropertiesReconcilePlugin.getDefault()
						.createTransformationExecutor(uri));
			}
		}

		// reconcile
		transform(PropertiesReconcilePlugin.getDefault()
				.getDefaultTransformationExecutor(false));

		// post reconcile transformations
		for (CustomTransformation transformation : reconciler
				.getCustomTransformations()) {
			if (transformation.getPosition() == TransformationPosition.POST_RECONCILE
					&& transformation.isEnabled()
					&& transformation.getUri() != null) {

				URI uri = URI.createPlatformResourceURI(
						transformation.getUri(), true);
				transform(PropertiesReconcilePlugin.getDefault()
						.createTransformationExecutor(uri));
			}
		}
	}

	private void transform(TransformationExecutor transformationExecutor) {
		if (transformationExecutor == null) {
			return;
		}

		// Bind componentInstance to input
		ModelExtent input = new BasicModelExtent(
				Collections.singletonList(generator));

		// Create execution context
		ExecutionContextImpl context = new ExecutionContextImpl();

		// Execute transformation
		ExecutionDiagnostic result = transformationExecutor.execute(context,
				input);

		if (result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out
					.println("QVT-O ERROR on rule transformation. Message was:");
			System.out.println(result.getMessage());
		}
	}
}
