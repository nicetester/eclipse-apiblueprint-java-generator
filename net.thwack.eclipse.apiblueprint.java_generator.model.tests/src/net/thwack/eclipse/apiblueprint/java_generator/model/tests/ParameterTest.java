/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model.tests;

import junit.textui.TestRunner;
import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelFactory;
import net.thwack.eclipse.apiblueprint.java_generator.model.Parameter;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Parameter</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ParameterTest extends BaseTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterTest.class);
	}

	/**
	 * Constructs a new Parameter test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Parameter getFixture() {
		return (Parameter) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE.createParameter());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} // ParameterTest
