/**
 */
package decobat;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link decobat.Project#getName <em>Name</em>}</li>
 *   <li>{@link decobat.Project#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link decobat.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link decobat.Project#getCreated <em>Created</em>}</li>
 *   <li>{@link decobat.Project#getClosed <em>Closed</em>}</li>
 *   <li>{@link decobat.Project#getProjectRevisions <em>Project Revisions</em>}</li>
 *   <li>{@link decobat.Project#getProjectCategories <em>Project Categories</em>}</li>
 *   <li>{@link decobat.Project#getPlans <em>Plans</em>}</li>
 * </ul>
 * </p>
 *
 * @see decobat.DecobatPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see decobat.DecobatPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link decobat.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see decobat.DecobatPackage#getProject_ShortDescription()
	 * @model
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link decobat.Project#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see decobat.DecobatPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link decobat.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see decobat.DecobatPackage#getProject_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link decobat.Project#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed</em>' attribute.
	 * @see #setClosed(Date)
	 * @see decobat.DecobatPackage#getProject_Closed()
	 * @model
	 * @generated
	 */
	Date getClosed();

	/**
	 * Sets the value of the '{@link decobat.Project#getClosed <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' attribute.
	 * @see #getClosed()
	 * @generated
	 */
	void setClosed(Date value);

	/**
	 * Returns the value of the '<em><b>Project Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link decobat.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Revisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Revisions</em>' containment reference list.
	 * @see decobat.DecobatPackage#getProject_ProjectRevisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjectRevisions();

	/**
	 * Returns the value of the '<em><b>Project Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Categories</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Categories</em>' containment reference.
	 * @see #setProjectCategories(ProjectCategory)
	 * @see decobat.DecobatPackage#getProject_ProjectCategories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProjectCategory getProjectCategories();

	/**
	 * Sets the value of the '{@link decobat.Project#getProjectCategories <em>Project Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Categories</em>' containment reference.
	 * @see #getProjectCategories()
	 * @generated
	 */
	void setProjectCategories(ProjectCategory value);

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference.
	 * @see #setPlans(Plan)
	 * @see decobat.DecobatPackage#getProject_Plans()
	 * @model containment="true"
	 * @generated
	 */
	Plan getPlans();

	/**
	 * Sets the value of the '{@link decobat.Project#getPlans <em>Plans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plans</em>' containment reference.
	 * @see #getPlans()
	 * @generated
	 */
	void setPlans(Plan value);

} // Project
