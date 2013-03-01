/**
 */
package decobat.impl;

import decobat.DecobatPackage;
import decobat.Product;
import decobat.Supplier;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link decobat.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getUnitCostPrice <em>Unit Cost Price</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getUnitBilledPrice <em>Unit Billed Price</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getUnitWeight <em>Unit Weight</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link decobat.impl.ProductImpl#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends EObjectImpl implements Product {
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
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected Date update = UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitCostPrice() <em>Unit Cost Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCostPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double UNIT_COST_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitCostPrice() <em>Unit Cost Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCostPrice()
	 * @generated
	 * @ordered
	 */
	protected Double unitCostPrice = UNIT_COST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitBilledPrice() <em>Unit Billed Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBilledPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double UNIT_BILLED_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitBilledPrice() <em>Unit Billed Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBilledPrice()
	 * @generated
	 * @ordered
	 */
	protected Double unitBilledPrice = UNIT_BILLED_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitWeight() <em>Unit Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double UNIT_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitWeight() <em>Unit Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitWeight()
	 * @generated
	 * @ordered
	 */
	protected Double unitWeight = UNIT_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected Double depth = DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Supplier supplier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecobatPackage.Literals.PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(Date newUpdate) {
		Date oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUnitCostPrice() {
		return unitCostPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitCostPrice(Double newUnitCostPrice) {
		Double oldUnitCostPrice = unitCostPrice;
		unitCostPrice = newUnitCostPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__UNIT_COST_PRICE, oldUnitCostPrice, unitCostPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUnitBilledPrice() {
		return unitBilledPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitBilledPrice(Double newUnitBilledPrice) {
		Double oldUnitBilledPrice = unitBilledPrice;
		unitBilledPrice = newUnitBilledPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__UNIT_BILLED_PRICE, oldUnitBilledPrice, unitBilledPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUnitWeight() {
		return unitWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitWeight(Double newUnitWeight) {
		Double oldUnitWeight = unitWeight;
		unitWeight = newUnitWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__UNIT_WEIGHT, oldUnitWeight, unitWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		Double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Double newWidth) {
		Double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(Double newDepth) {
		Double oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (Supplier)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DecobatPackage.PRODUCT__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(Supplier newSupplier) {
		Supplier oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PRODUCT__SUPPLIER, oldSupplier, supplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecobatPackage.PRODUCT__NAME:
				return getName();
			case DecobatPackage.PRODUCT__SHORT_DESCRIPTION:
				return getShortDescription();
			case DecobatPackage.PRODUCT__DESCRIPTION:
				return getDescription();
			case DecobatPackage.PRODUCT__CREATED:
				return getCreated();
			case DecobatPackage.PRODUCT__UPDATE:
				return getUpdate();
			case DecobatPackage.PRODUCT__UNIT_COST_PRICE:
				return getUnitCostPrice();
			case DecobatPackage.PRODUCT__UNIT_BILLED_PRICE:
				return getUnitBilledPrice();
			case DecobatPackage.PRODUCT__UNIT_WEIGHT:
				return getUnitWeight();
			case DecobatPackage.PRODUCT__HEIGHT:
				return getHeight();
			case DecobatPackage.PRODUCT__WIDTH:
				return getWidth();
			case DecobatPackage.PRODUCT__DEPTH:
				return getDepth();
			case DecobatPackage.PRODUCT__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
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
			case DecobatPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case DecobatPackage.PRODUCT__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
				return;
			case DecobatPackage.PRODUCT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DecobatPackage.PRODUCT__CREATED:
				setCreated((Date)newValue);
				return;
			case DecobatPackage.PRODUCT__UPDATE:
				setUpdate((Date)newValue);
				return;
			case DecobatPackage.PRODUCT__UNIT_COST_PRICE:
				setUnitCostPrice((Double)newValue);
				return;
			case DecobatPackage.PRODUCT__UNIT_BILLED_PRICE:
				setUnitBilledPrice((Double)newValue);
				return;
			case DecobatPackage.PRODUCT__UNIT_WEIGHT:
				setUnitWeight((Double)newValue);
				return;
			case DecobatPackage.PRODUCT__HEIGHT:
				setHeight((Double)newValue);
				return;
			case DecobatPackage.PRODUCT__WIDTH:
				setWidth((Double)newValue);
				return;
			case DecobatPackage.PRODUCT__DEPTH:
				setDepth((Double)newValue);
				return;
			case DecobatPackage.PRODUCT__SUPPLIER:
				setSupplier((Supplier)newValue);
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
			case DecobatPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__SHORT_DESCRIPTION:
				setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__UPDATE:
				setUpdate(UPDATE_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__UNIT_COST_PRICE:
				setUnitCostPrice(UNIT_COST_PRICE_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__UNIT_BILLED_PRICE:
				setUnitBilledPrice(UNIT_BILLED_PRICE_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__UNIT_WEIGHT:
				setUnitWeight(UNIT_WEIGHT_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case DecobatPackage.PRODUCT__SUPPLIER:
				setSupplier((Supplier)null);
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
			case DecobatPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DecobatPackage.PRODUCT__SHORT_DESCRIPTION:
				return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
			case DecobatPackage.PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DecobatPackage.PRODUCT__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case DecobatPackage.PRODUCT__UPDATE:
				return UPDATE_EDEFAULT == null ? update != null : !UPDATE_EDEFAULT.equals(update);
			case DecobatPackage.PRODUCT__UNIT_COST_PRICE:
				return UNIT_COST_PRICE_EDEFAULT == null ? unitCostPrice != null : !UNIT_COST_PRICE_EDEFAULT.equals(unitCostPrice);
			case DecobatPackage.PRODUCT__UNIT_BILLED_PRICE:
				return UNIT_BILLED_PRICE_EDEFAULT == null ? unitBilledPrice != null : !UNIT_BILLED_PRICE_EDEFAULT.equals(unitBilledPrice);
			case DecobatPackage.PRODUCT__UNIT_WEIGHT:
				return UNIT_WEIGHT_EDEFAULT == null ? unitWeight != null : !UNIT_WEIGHT_EDEFAULT.equals(unitWeight);
			case DecobatPackage.PRODUCT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case DecobatPackage.PRODUCT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case DecobatPackage.PRODUCT__DEPTH:
				return DEPTH_EDEFAULT == null ? depth != null : !DEPTH_EDEFAULT.equals(depth);
			case DecobatPackage.PRODUCT__SUPPLIER:
				return supplier != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", shortDescription: ");
		result.append(shortDescription);
		result.append(", description: ");
		result.append(description);
		result.append(", created: ");
		result.append(created);
		result.append(", update: ");
		result.append(update);
		result.append(", unitCostPrice: ");
		result.append(unitCostPrice);
		result.append(", unitBilledPrice: ");
		result.append(unitBilledPrice);
		result.append(", unitWeight: ");
		result.append(unitWeight);
		result.append(", height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(", depth: ");
		result.append(depth);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
