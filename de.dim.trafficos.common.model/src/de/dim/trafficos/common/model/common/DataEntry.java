/*
 */
package de.dim.trafficos.common.model.common;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.common.model.common.DataEntry#getValue <em>Value</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.DataEntry#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.DataEntry#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getDataEntry()
 * @model
 * @generated
 */
@ProviderType
public interface DataEntry extends AbstractDataEntry {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.common.model.common.DataValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getDataEntry_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataValue> getValue();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getDataEntry_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.DataEntry#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getDataEntry_Device()
	 * @model
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.DataEntry#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

} // DataEntry