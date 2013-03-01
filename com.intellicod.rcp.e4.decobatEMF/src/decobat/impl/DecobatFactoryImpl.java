/**
 */
package decobat.impl;

import decobat.Customer;
import decobat.DecobatFactory;
import decobat.DecobatPackage;
import decobat.Level;
import decobat.Library;
import decobat.LibraryCategory;
import decobat.Plan;
import decobat.Product;
import decobat.Project;
import decobat.ProjectCategory;
import decobat.ProjectRevision;
import decobat.Service;
import decobat.Supplier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecobatFactoryImpl extends EFactoryImpl implements DecobatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecobatFactory init() {
		try {
			DecobatFactory theDecobatFactory = (DecobatFactory)EPackage.Registry.INSTANCE.getEFactory("http://com/intellicod/rcp/e4/decobat"); 
			if (theDecobatFactory != null) {
				return theDecobatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DecobatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecobatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DecobatPackage.PROJECT: return createProject();
			case DecobatPackage.PROJECT_CATEGORY: return createProjectCategory();
			case DecobatPackage.PROJECT_REVISION: return createProjectRevision();
			case DecobatPackage.LIBRARY: return createLibrary();
			case DecobatPackage.LIBRARY_CATEGORY: return createLibraryCategory();
			case DecobatPackage.PRODUCT: return createProduct();
			case DecobatPackage.SUPPLIER: return createSupplier();
			case DecobatPackage.SERVICE: return createService();
			case DecobatPackage.PLAN: return createPlan();
			case DecobatPackage.LEVEL: return createLevel();
			case DecobatPackage.OBJECT: return createObject();
			case DecobatPackage.CUSTOMER: return createCustomer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectCategory createProjectCategory() {
		ProjectCategoryImpl projectCategory = new ProjectCategoryImpl();
		return projectCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectRevision createProjectRevision() {
		ProjectRevisionImpl projectRevision = new ProjectRevisionImpl();
		return projectRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryCategory createLibraryCategory() {
		LibraryCategoryImpl libraryCategory = new LibraryCategoryImpl();
		return libraryCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier createSupplier() {
		SupplierImpl supplier = new SupplierImpl();
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan createPlan() {
		PlanImpl plan = new PlanImpl();
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decobat.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecobatPackage getDecobatPackage() {
		return (DecobatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DecobatPackage getPackage() {
		return DecobatPackage.eINSTANCE;
	}

} //DecobatFactoryImpl
