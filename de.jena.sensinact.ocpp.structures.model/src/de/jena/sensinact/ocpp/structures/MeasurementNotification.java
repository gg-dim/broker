/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.jena.sensinact.ocpp.structures;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getMeasurementNotification()
 * @model
 * @generated
 */
@ProviderType
public interface MeasurementNotification extends Notification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getMeasurementNotification_Value()
	 * @model
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"W"</code>.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.structures.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see de.jena.sensinact.ocpp.structures.Unit
	 * @see #setUnit(Unit)
	 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getMeasurementNotification_Unit()
	 * @model default="W"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see de.jena.sensinact.ocpp.structures.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // MeasurementNotification
