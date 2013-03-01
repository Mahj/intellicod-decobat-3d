/**
 */
package decobat.impl;

import decobat.Customer;
import decobat.DecobatPackage;
import decobat.Plan;
import decobat.Project;
import decobat.ProjectCategory;

import decobat.ProjectRevision;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link decobat.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link decobat.impl.ProjectImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link decobat.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link decobat.impl.ProjectImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link decobat.impl.ProjectImpl#getClosed <em>Closed</em>}</li>
 *   <li>{@link decobat.impl.ProjectImpl#getProjectRevisions <em>Project Revisions</em>}</li>
 *   <li>{@link decobat.impl.ProjectImpl#getProjectCategories <em>Project Categories</em>}</li>
 *   <li>{@link decobat.impl.ProjectImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link decobat.impl.ProjectImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
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
	 * The default value of the '{@link #getClosed() <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosed()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosed() <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosed()
	 * @generated
	 * @ordered
	 */
	protected Date closed = CLOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjectRevisions() <em>Project Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectRevision> projectRevisions;

	/**
	 * The cached value of the '{@link #getProjectCategories() <em>Project Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectCategories()
	 * @generated
	 * @ordered
	 */
	protected ProjectCategory projectCategories;

	/**
	 * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected Plan plans;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecobatPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getClosed() {
		return closed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosed(Date newClosed) {
		Date oldClosed = closed;
		closed = newClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__CLOSED, oldClosed, closed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectRevision> getProjectRevisions() {
		if (projectRevisions == null) {
			projectRevisions = new EObjectContainmentEList<ProjectRevision>(ProjectRevision.class, this, DecobatPackage.PROJECT__PROJECT_REVISIONS);
		}
		return projectRevisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectCategory getProjectCategories() {
		return projectCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectCategories(ProjectCategory newProjectCategories, NotificationChain msgs) {
		ProjectCategory oldProjectCategories = projectCategories;
		projectCategories = newProjectCategories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__PROJECT_CATEGORIES, oldProjectCategories, newProjectCategories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectCategories(ProjectCategory newProjectCategories) {
		if (newProjectCategories != projectCategories) {
			NotificationChain msgs = null;
			if (projectCategories != null)
				msgs = ((InternalEObject)projectCategories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecobatPackage.PROJECT__PROJECT_CATEGORIES, null, msgs);
			if (newProjectCategories != null)
				msgs = ((InternalEObject)newProjectCategories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecobatPackage.PROJECT__PROJECT_CATEGORIES, null, msgs);
			msgs = basicSetProjectCategories(newProjectCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__PROJECT_CATEGORIES, newProjectCategories, newProjectCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan getPlans() {
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlans(Plan newPlans, NotificationChain msgs) {
		Plan oldPlans = plans;
		plans = newPlans;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__PLANS, oldPlans, newPlans);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlans(Plan newPlans) {
		if (newPlans != plans) {
			NotificationChain msgs = null;
			if (plans != null)
				msgs = ((InternalEObject)plans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecobatPackage.PROJECT__PLANS, null, msgs);
			if (newPlans != null)
				msgs = ((InternalEObject)newPlans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecobatPackage.PROJECT__PLANS, null, msgs);
			msgs = basicSetPlans(newPlans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__PLANS, newPlans, newPlans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DecobatPackage.PROJECT__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecobatPackage.PROJECT__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecobatPackage.PROJECT__PROJECT_REVISIONS:
				return ((InternalEList<?>)getProjectRevisions()).basicRemove(otherEnd, msgs);
			case DecobatPackage.PROJECT__PROJECT_CATEGORIES:
				return basicSetProjectCategories(null, msgs);
			case DecobatPackage.PROJECT__PLANS:
				return basicSetPlans(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecobatPackage.PROJECT__NAME:
				return getName();
			case DecobatPackage.PROJECT__SHORT_DESCRIPTION:
				return getShortDescription();
			case DecobatPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case DecobatPackage.PROJECT__CREATED:
				return getCreated();
			case DecobatPackage.PROJECT__CLOSED:
				return getClosed();
			case DecobatPackage.PROJECT__PROJECT_REVISIONS:
				return getProjectRevisions();
			case DecobatPackage.PROJECT__PROJECT_CATEGORIES:
				return getProjectCategories();
			case DecobatPackage.PROJECT__PLANS:
				return getPlans();
			case DecobatPackage.PROJECT__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DecobatPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case DecobatPackage.PROJECT__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
				return;
			case DecobatPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DecobatPackage.PROJECT__CREATED:
				setCreated((Date)newValue);
				return;
			case DecobatPackage.PROJECT__CLOSED:
				setClosed((Date)newValue);
				return;
			case DecobatPackage.PROJECT__PROJECT_REVISIONS:
				getProjectRevisions().clear();
				getProjectRevisions().addAll((Collection<? extends ProjectRevision>)newValue);
				return;
			case DecobatPackage.PROJECT__PROJECT_CATEGORIES:
				setProjectCategories((ProjectCategory)newValue);
				return;
			case DecobatPackage.PROJECT__PLANS:
				setPlans((Plan)newValue);
				return;
			case DecobatPackage.PROJECT__CUSTOMER:
				setCustomer((Customer)newValue);
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
			case DecobatPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DecobatPackage.PROJECT__SHORT_DESCRIPTION:
				setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
				return;
			case DecobatPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DecobatPackage.PROJECT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case DecobatPackage.PROJECT__CLOSED:
				setClosed(CLOSED_EDEFAULT);
				return;
			case DecobatPackage.PROJECT__PROJECT_REVISIONS:
				getProjectRevisions().clear();
				return;
			case DecobatPackage.PROJECT__PROJECT_CATEGORIES:
				setProjectCategories((ProjectCategory)null);
				return;
			case DecobatPackage.PROJECT__PLANS:
				setPlans((Plan)null);
				return;
			case DecobatPackage.PROJECT__CUSTOMER:
				setCustomer((Customer)null);
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
			case DecobatPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DecobatPackage.PROJECT__SHORT_DESCRIPTION:
				return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
			case DecobatPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DecobatPackage.PROJECT__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case DecobatPackage.PROJECT__CLOSED:
				return CLOSED_EDEFAULT == null ? closed != null : !CLOSED_EDEFAULT.equals(closed);
			case DecobatPackage.PROJECT__PROJECT_REVISIONS:
				return projectRevisions != null && !projectRevisions.isEmpty();
			case DecobatPackage.PROJECT__PROJECT_CATEGORIES:
				return projectCategories != null;
			case DecobatPackage.PROJECT__PLANS:
				return plans != null;
			case DecobatPackage.PROJECT__CUSTOMER:
				return customer != null;
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
		result.append(", closed: ");
		result.append(closed);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
