/**
 */
package decobat.impl;

import decobat.DecobatPackage;
import decobat.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link decobat.impl.ServiceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link decobat.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link decobat.impl.ServiceImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link decobat.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link decobat.impl.ServiceImpl#getHourlyCostPrice <em>Hourly Cost Price</em>}</li>
 *   <li>{@link decobat.impl.ServiceImpl#getHourlyBilledPrice <em>Hourly Billed Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHourlyCostPrice() <em>Hourly Cost Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourlyCostPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double HOURLY_COST_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHourlyCostPrice() <em>Hourly Cost Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourlyCostPrice()
	 * @generated
	 * @ordered
	 */
	protected Double hourlyCostPrice = HOURLY_COST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHourlyBilledPrice() <em>Hourly Billed Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourlyBilledPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double HOURLY_BILLED_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHourlyBilledPrice() <em>Hourly Billed Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourlyBilledPrice()
	 * @generated
	 * @ordered
	 */
	protected Double hourlyBilledPrice = HOURLY_BILLED_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecobatPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.SERVICE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortDescription(String newShortDescription) {
		String oldShortDescription = shortDescription;
		shortDescription = newShortDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.SERVICE__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHourlyCostPrice() {
		return hourlyCostPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourlyCostPrice(Double newHourlyCostPrice) {
		Double oldHourlyCostPrice = hourlyCostPrice;
		hourlyCostPrice = newHourlyCostPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.SERVICE__HOURLY_COST_PRICE, oldHourlyCostPrice, hourlyCostPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHourlyBilledPrice() {
		return hourlyBilledPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourlyBilledPrice(Double newHourlyBilledPrice) {
		Double oldHourlyBilledPrice = hourlyBilledPrice;
		hourlyBilledPrice = newHourlyBilledPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.SERVICE__HOURLY_BILLED_PRICE, oldHourlyBilledPrice, hourlyBilledPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecobatPackage.SERVICE__CODE:
				return getCode();
			case DecobatPackage.SERVICE__NAME:
				return getName();
			case DecobatPackage.SERVICE__SHORT_DESCRIPTION:
				return getShortDescription();
			case DecobatPackage.SERVICE__DESCRIPTION:
				return getDescription();
			case DecobatPackage.SERVICE__HOURLY_COST_PRICE:
				return getHourlyCostPrice();
			case DecobatPackage.SERVICE__HOURLY_BILLED_PRICE:
				return getHourlyBilledPrice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DecobatPackage.SERVICE__CODE:
				setCode((String)newValue);
				return;
			case DecobatPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case DecobatPackage.SERVICE__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
				return;
			case DecobatPackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DecobatPackage.SERVICE__HOURLY_COST_PRICE:
				setHourlyCostPrice((Double)newValue);
				return;
			case DecobatPackage.SERVICE__HOURLY_BILLED_PRICE:
				setHourlyBilledPrice((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DecobatPackage.SERVICE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DecobatPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DecobatPackage.SERVICE__SHORT_DESCRIPTION:
				setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
				return;
			case DecobatPackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DecobatPackage.SERVICE__HOURLY_COST_PRICE:
				setHourlyCostPrice(HOURLY_COST_PRICE_EDEFAULT);
				return;
			case DecobatPackage.SERVICE__HOURLY_BILLED_PRICE:
				setHourlyBilledPrice(HOURLY_BILLED_PRICE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DecobatPackage.SERVICE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DecobatPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DecobatPackage.SERVICE__SHORT_DESCRIPTION:
				return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
			case DecobatPackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DecobatPackage.SERVICE__HOURLY_COST_PRICE:
				return HOURLY_COST_PRICE_EDEFAULT == null ? hourlyCostPrice != null : !HOURLY_COST_PRICE_EDEFAULT.equals(hourlyCostPrice);
			case DecobatPackage.SERVICE__HOURLY_BILLED_PRICE:
				return HOURLY_BILLED_PRICE_EDEFAULT == null ? hourlyBilledPrice != null : !HOURLY_BILLED_PRICE_EDEFAULT.equals(hourlyBilledPrice);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", shortDescription: ");
		result.append(shortDescription);
		result.append(", description: ");
		result.append(description);
		result.append(", hourlyCostPrice: ");
		result.append(hourlyCostPrice);
		result.append(", hourlyBilledPrice: ");
		result.append(hourlyBilledPrice);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
