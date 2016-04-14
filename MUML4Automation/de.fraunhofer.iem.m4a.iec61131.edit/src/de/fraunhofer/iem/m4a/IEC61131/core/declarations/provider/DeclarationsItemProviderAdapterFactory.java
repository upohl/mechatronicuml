/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.provider;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.util.DeclarationsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationsItemProviderAdapterFactory extends DeclarationsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputVarContainerItemProvider inputVarContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputVarContainerAdapter() {
		if (inputVarContainerItemProvider == null) {
			inputVarContainerItemProvider = new InputVarContainerItemProvider(this);
		}

		return inputVarContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputVarContainerItemProvider outputVarContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputVarContainerAdapter() {
		if (outputVarContainerItemProvider == null) {
			outputVarContainerItemProvider = new OutputVarContainerItemProvider(this);
		}

		return outputVarContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputVarContainerItemProvider inputOutputVarContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputOutputVarContainerAdapter() {
		if (inputOutputVarContainerItemProvider == null) {
			inputOutputVarContainerItemProvider = new InputOutputVarContainerItemProvider(this);
		}

		return inputOutputVarContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarDeclarationContainerItemProvider varDeclarationContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVarDeclarationContainerAdapter() {
		if (varDeclarationContainerItemProvider == null) {
			varDeclarationContainerItemProvider = new VarDeclarationContainerItemProvider(this);
		}

		return varDeclarationContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalVarContainerItemProvider externalVarContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalVarContainerAdapter() {
		if (externalVarContainerItemProvider == null) {
			externalVarContainerItemProvider = new ExternalVarContainerItemProvider(this);
		}

		return externalVarContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalVarDeclarationItemProvider externalVarDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalVarDeclarationAdapter() {
		if (externalVarDeclarationItemProvider == null) {
			externalVarDeclarationItemProvider = new ExternalVarDeclarationItemProvider(this);
		}

		return externalVarDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TempVarDeclarationContainerItemProvider tempVarDeclarationContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTempVarDeclarationContainerAdapter() {
		if (tempVarDeclarationContainerItemProvider == null) {
			tempVarDeclarationContainerItemProvider = new TempVarDeclarationContainerItemProvider(this);
		}

		return tempVarDeclarationContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomplLocatedVarContainerItemProvider incomplLocatedVarContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIncomplLocatedVarContainerAdapter() {
		if (incomplLocatedVarContainerItemProvider == null) {
			incomplLocatedVarContainerItemProvider = new IncomplLocatedVarContainerItemProvider(this);
		}

		return incomplLocatedVarContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedVarDeclarationContainerItemProvider locatedVarDeclarationContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocatedVarDeclarationContainerAdapter() {
		if (locatedVarDeclarationContainerItemProvider == null) {
			locatedVarDeclarationContainerItemProvider = new LocatedVarDeclarationContainerItemProvider(this);
		}

		return locatedVarDeclarationContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramAccessContainerItemProvider programAccessContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAccessContainerAdapter() {
		if (programAccessContainerItemProvider == null) {
			programAccessContainerItemProvider = new ProgramAccessContainerItemProvider(this);
		}

		return programAccessContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionVarContainerItemProvider functionVarContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionVarContainerAdapter() {
		if (functionVarContainerItemProvider == null) {
			functionVarContainerItemProvider = new FunctionVarContainerItemProvider(this);
		}

		return functionVarContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVarDeclarationContainerItemProvider globalVarDeclarationContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalVarDeclarationContainerAdapter() {
		if (globalVarDeclarationContainerItemProvider == null) {
			globalVarDeclarationContainerItemProvider = new GlobalVarDeclarationContainerItemProvider(this);
		}

		return globalVarDeclarationContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessVarContainerItemProvider accessVarContainerItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAccessVarContainerAdapter() {
		if (accessVarContainerItemProvider == null) {
			accessVarContainerItemProvider = new AccessVarContainerItemProvider(this);
		}

		return accessVarContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSpecificVarContainterItemProvider instanceSpecificVarContainterItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstanceSpecificVarContainterAdapter() {
		if (instanceSpecificVarContainterItemProvider == null) {
			instanceSpecificVarContainterItemProvider = new InstanceSpecificVarContainterItemProvider(this);
		}

		return instanceSpecificVarContainterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeDeclarationItemProvider edgeDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEdgeDeclarationAdapter() {
		if (edgeDeclarationItemProvider == null) {
			edgeDeclarationItemProvider = new EdgeDeclarationItemProvider(this);
		}

		return edgeDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Var1SpecInitDeclItemProvider var1SpecInitDeclItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVar1SpecInitDeclAdapter() {
		if (var1SpecInitDeclItemProvider == null) {
			var1SpecInitDeclItemProvider = new Var1SpecInitDeclItemProvider(this);
		}

		return var1SpecInitDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleByteStringSpecInitItemProvider singleByteStringSpecInitItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleByteStringSpecInitAdapter() {
		if (singleByteStringSpecInitItemProvider == null) {
			singleByteStringSpecInitItemProvider = new SingleByteStringSpecInitItemProvider(this);
		}

		return singleByteStringSpecInitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleByteStringSpecInitItemProvider doubleByteStringSpecInitItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoubleByteStringSpecInitAdapter() {
		if (doubleByteStringSpecInitItemProvider == null) {
			doubleByteStringSpecInitItemProvider = new DoubleByteStringSpecInitItemProvider(this);
		}

		return doubleByteStringSpecInitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpec} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleByteStringSpecItemProvider singleByteStringSpecItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleByteStringSpecAdapter() {
		if (singleByteStringSpecItemProvider == null) {
			singleByteStringSpecItemProvider = new SingleByteStringSpecItemProvider(this);
		}

		return singleByteStringSpecItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpec} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleByteStringSpecItemProvider doubleByteStringSpecItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoubleByteStringSpecAdapter() {
		if (doubleByteStringSpecItemProvider == null) {
			doubleByteStringSpecItemProvider = new DoubleByteStringSpecItemProvider(this);
		}

		return doubleByteStringSpecItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolicAccessPathItemProvider symbolicAccessPathItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolicAccessPathAdapter() {
		if (symbolicAccessPathItemProvider == null) {
			symbolicAccessPathItemProvider = new SymbolicAccessPathItemProvider(this);
		}

		return symbolicAccessPathItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSpecificFBItemProvider instanceSpecificFBItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstanceSpecificFBAdapter() {
		if (instanceSpecificFBItemProvider == null) {
			instanceSpecificFBItemProvider = new InstanceSpecificFBItemProvider(this);
		}

		return instanceSpecificFBItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedVarDeclarationItemProvider locatedVarDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocatedVarDeclarationAdapter() {
		if (locatedVarDeclarationItemProvider == null) {
			locatedVarDeclarationItemProvider = new LocatedVarDeclarationItemProvider(this);
		}

		return locatedVarDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomplLocatedVarDeclarationItemProvider incomplLocatedVarDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIncomplLocatedVarDeclarationAdapter() {
		if (incomplLocatedVarDeclarationItemProvider == null) {
			incomplLocatedVarDeclarationItemProvider = new IncomplLocatedVarDeclarationItemProvider(this);
		}

		return incomplLocatedVarDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlyNamedGlobalVarItemProvider onlyNamedGlobalVarItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOnlyNamedGlobalVarAdapter() {
		if (onlyNamedGlobalVarItemProvider == null) {
			onlyNamedGlobalVarItemProvider = new OnlyNamedGlobalVarItemProvider(this);
		}

		return onlyNamedGlobalVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedGlobalVarItemProvider locatedGlobalVarItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocatedGlobalVarAdapter() {
		if (locatedGlobalVarItemProvider == null) {
			locatedGlobalVarItemProvider = new LocatedGlobalVarItemProvider(this);
		}

		return locatedGlobalVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Var2SpecInitDeclItemProvider var2SpecInitDeclItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVar2SpecInitDeclAdapter() {
		if (var2SpecInitDeclItemProvider == null) {
			var2SpecInitDeclItemProvider = new Var2SpecInitDeclItemProvider(this);
		}

		return var2SpecInitDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramAccessDeclarationItemProvider programAccessDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAccessDeclarationAdapter() {
		if (programAccessDeclarationItemProvider == null) {
			programAccessDeclarationItemProvider = new ProgramAccessDeclarationItemProvider(this);
		}

		return programAccessDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBInstanceItemProvider fbInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFBInstanceAdapter() {
		if (fbInstanceItemProvider == null) {
			fbInstanceItemProvider = new FBInstanceItemProvider(this);
		}

		return fbInstanceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (inputVarContainerItemProvider != null) inputVarContainerItemProvider.dispose();
		if (outputVarContainerItemProvider != null) outputVarContainerItemProvider.dispose();
		if (inputOutputVarContainerItemProvider != null) inputOutputVarContainerItemProvider.dispose();
		if (varDeclarationContainerItemProvider != null) varDeclarationContainerItemProvider.dispose();
		if (externalVarContainerItemProvider != null) externalVarContainerItemProvider.dispose();
		if (tempVarDeclarationContainerItemProvider != null) tempVarDeclarationContainerItemProvider.dispose();
		if (incomplLocatedVarContainerItemProvider != null) incomplLocatedVarContainerItemProvider.dispose();
		if (locatedVarDeclarationContainerItemProvider != null) locatedVarDeclarationContainerItemProvider.dispose();
		if (programAccessContainerItemProvider != null) programAccessContainerItemProvider.dispose();
		if (functionVarContainerItemProvider != null) functionVarContainerItemProvider.dispose();
		if (globalVarDeclarationContainerItemProvider != null) globalVarDeclarationContainerItemProvider.dispose();
		if (accessVarContainerItemProvider != null) accessVarContainerItemProvider.dispose();
		if (instanceSpecificVarContainterItemProvider != null) instanceSpecificVarContainterItemProvider.dispose();
		if (edgeDeclarationItemProvider != null) edgeDeclarationItemProvider.dispose();
		if (var1SpecInitDeclItemProvider != null) var1SpecInitDeclItemProvider.dispose();
		if (singleByteStringSpecInitItemProvider != null) singleByteStringSpecInitItemProvider.dispose();
		if (doubleByteStringSpecInitItemProvider != null) doubleByteStringSpecInitItemProvider.dispose();
		if (locatedVarDeclarationItemProvider != null) locatedVarDeclarationItemProvider.dispose();
		if (incomplLocatedVarDeclarationItemProvider != null) incomplLocatedVarDeclarationItemProvider.dispose();
		if (onlyNamedGlobalVarItemProvider != null) onlyNamedGlobalVarItemProvider.dispose();
		if (locatedGlobalVarItemProvider != null) locatedGlobalVarItemProvider.dispose();
		if (var2SpecInitDeclItemProvider != null) var2SpecInitDeclItemProvider.dispose();
		if (programAccessDeclarationItemProvider != null) programAccessDeclarationItemProvider.dispose();
		if (fbInstanceItemProvider != null) fbInstanceItemProvider.dispose();
		if (externalVarDeclarationItemProvider != null) externalVarDeclarationItemProvider.dispose();
		if (singleByteStringSpecItemProvider != null) singleByteStringSpecItemProvider.dispose();
		if (doubleByteStringSpecItemProvider != null) doubleByteStringSpecItemProvider.dispose();
		if (symbolicAccessPathItemProvider != null) symbolicAccessPathItemProvider.dispose();
		if (instanceSpecificFBItemProvider != null) instanceSpecificFBItemProvider.dispose();
	}

}