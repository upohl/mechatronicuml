/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.Bus;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusTest extends CommunicationMediaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusTest.class);
	}

	/**
	 * Constructs a new Bus test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Bus getFixture() {
		return (Bus)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwresourceFactory.eINSTANCE.createBus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BusTest
