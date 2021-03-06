/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>String To Parameter Map</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link java.util.Map.Entry#getTypedKey <em>Key</em>}</li>
 * <li>{@link java.util.Map.Entry#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getStringToParameterMap()
 * @model keyDataType="org.eclipse.emf.ecore.EString"
 *        valueType="net.thwack.eclipse.apiblueprint.java_generator.model.Parameter"
 *        valueContainment="true" valueRequired="true"
 * @generated
 */
public class StringToParameterMap extends MinimalEObjectImpl.Container
		implements BasicEMap.Entry<String, Parameter> {
	/**
	 * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected Parameter value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StringToParameterMap() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APIBlueprintModelPackage.Literals.STRING_TO_PARAMETER_MAP;
	}

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setTypedKey(String)
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getStringToParameterMap_Key()
	 * @model
	 * @generated
	 */
	public String getTypedKey() {
		return key;
	}

	/**
	 * Sets the value of the '{@link java.util.Map.Entry#getTypedKey
	 * <em>Key</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Key</em>' attribute.
	 * @see #getTypedKey()
	 * @generated
	 */
	public void setTypedKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__KEY,
					oldKey, key));
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setTypedValue(Parameter)
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getStringToParameterMap_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public Parameter getTypedValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTypedValue(Parameter newValue,
			NotificationChain msgs) {
		Parameter oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE,
					oldValue, newValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link java.util.Map.Entry#getTypedValue
	 * <em>Value</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' containment reference.
	 * @see #getTypedValue()
	 * @generated
	 */
	public void setTypedValue(Parameter newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE,
								null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE,
								null, msgs);
			msgs = basicSetTypedValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE,
					newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE:
			return basicSetTypedValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__KEY:
			return getTypedKey();
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE:
			return getTypedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__KEY:
			setTypedKey((String) newValue);
			return;
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE:
			setTypedValue((Parameter) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__KEY:
			setTypedKey(KEY_EDEFAULT);
			return;
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE:
			setTypedValue((Parameter) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__KEY:
			return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT
					.equals(key);
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP__VALUE:
			return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKey(String key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter setValue(Parameter value) {
		Parameter oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, Parameter> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<String, Parameter>) container
				.eGet(eContainmentFeature());
	}

} // StringToParameterMap
