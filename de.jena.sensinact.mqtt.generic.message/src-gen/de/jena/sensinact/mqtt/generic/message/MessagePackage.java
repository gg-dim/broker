/*
 */
package de.jena.sensinact.mqtt.generic.message;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.mqtt.generic.message.MessageFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
public interface MessagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "message";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://upd.jena.de/model/sensinact/mqtt/message/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "message";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessagePackage eINSTANCE = de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.sensinact.mqtt.generic.message.UpdateMessage <em>Update Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.mqtt.generic.message.UpdateMessage
	 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getUpdateMessage()
	 * @generated
	 */
	int UPDATE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_MESSAGE__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_MESSAGE__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Update Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Update Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.mqtt.generic.message.impl.StringValueUpdateImpl <em>String Value Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.mqtt.generic.message.impl.StringValueUpdateImpl
	 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getStringValueUpdate()
	 * @generated
	 */
	int STRING_VALUE_UPDATE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_UPDATE__TIMESTAMP = UPDATE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_UPDATE__RESOURCE = UPDATE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_UPDATE__OLD_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_UPDATE__NEW_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_UPDATE_FEATURE_COUNT = UPDATE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_UPDATE_OPERATION_COUNT = UPDATE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.mqtt.generic.message.impl.DoubleValueUpdateImpl <em>Double Value Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.mqtt.generic.message.impl.DoubleValueUpdateImpl
	 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getDoubleValueUpdate()
	 * @generated
	 */
	int DOUBLE_VALUE_UPDATE = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_UPDATE__TIMESTAMP = UPDATE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_UPDATE__RESOURCE = UPDATE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_UPDATE__OLD_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_UPDATE__NEW_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Double Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_UPDATE_FEATURE_COUNT = UPDATE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Double Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_UPDATE_OPERATION_COUNT = UPDATE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.mqtt.generic.message.impl.IntegerValueUpdateImpl <em>Integer Value Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.mqtt.generic.message.impl.IntegerValueUpdateImpl
	 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getIntegerValueUpdate()
	 * @generated
	 */
	int INTEGER_VALUE_UPDATE = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_UPDATE__TIMESTAMP = UPDATE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_UPDATE__RESOURCE = UPDATE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_UPDATE__OLD_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_UPDATE__NEW_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_UPDATE_FEATURE_COUNT = UPDATE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_UPDATE_OPERATION_COUNT = UPDATE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.mqtt.generic.message.impl.LongValueUpdateImpl <em>Long Value Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.mqtt.generic.message.impl.LongValueUpdateImpl
	 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getLongValueUpdate()
	 * @generated
	 */
	int LONG_VALUE_UPDATE = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_UPDATE__TIMESTAMP = UPDATE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_UPDATE__RESOURCE = UPDATE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_UPDATE__OLD_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_UPDATE__NEW_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Long Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_UPDATE_FEATURE_COUNT = UPDATE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Long Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_UPDATE_OPERATION_COUNT = UPDATE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.mqtt.generic.message.impl.BooleanValueUpdateImpl <em>Boolean Value Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.mqtt.generic.message.impl.BooleanValueUpdateImpl
	 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getBooleanValueUpdate()
	 * @generated
	 */
	int BOOLEAN_VALUE_UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_UPDATE__TIMESTAMP = UPDATE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_UPDATE__RESOURCE = UPDATE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_UPDATE__OLD_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_UPDATE__NEW_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_UPDATE_FEATURE_COUNT = UPDATE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_UPDATE_OPERATION_COUNT = UPDATE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.mqtt.generic.message.impl.ObjectValueUpdateImpl <em>Object Value Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.mqtt.generic.message.impl.ObjectValueUpdateImpl
	 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getObjectValueUpdate()
	 * @generated
	 */
	int OBJECT_VALUE_UPDATE = 6;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_UPDATE__TIMESTAMP = UPDATE_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_UPDATE__RESOURCE = UPDATE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_UPDATE__OLD_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_UPDATE__NEW_VALUE = UPDATE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_UPDATE_FEATURE_COUNT = UPDATE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Value Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_UPDATE_OPERATION_COUNT = UPDATE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>EInstant</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getEInstant()
	 * @generated
	 */
	int EINSTANT = 7;


	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.mqtt.generic.message.UpdateMessage <em>Update Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Message</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.UpdateMessage
	 * @generated
	 */
	EClass getUpdateMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.UpdateMessage#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.UpdateMessage#getTimestamp()
	 * @see #getUpdateMessage()
	 * @generated
	 */
	EAttribute getUpdateMessage_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.UpdateMessage#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.UpdateMessage#getResource()
	 * @see #getUpdateMessage()
	 * @generated
	 */
	EAttribute getUpdateMessage_Resource();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.mqtt.generic.message.StringValueUpdate <em>String Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value Update</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.StringValueUpdate
	 * @generated
	 */
	EClass getStringValueUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.StringValueUpdate#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.StringValueUpdate#getOldValue()
	 * @see #getStringValueUpdate()
	 * @generated
	 */
	EAttribute getStringValueUpdate_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.StringValueUpdate#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.StringValueUpdate#getNewValue()
	 * @see #getStringValueUpdate()
	 * @generated
	 */
	EAttribute getStringValueUpdate_NewValue();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate <em>Double Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Value Update</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate
	 * @generated
	 */
	EClass getDoubleValueUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate#getOldValue()
	 * @see #getDoubleValueUpdate()
	 * @generated
	 */
	EAttribute getDoubleValueUpdate_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate#getNewValue()
	 * @see #getDoubleValueUpdate()
	 * @generated
	 */
	EAttribute getDoubleValueUpdate_NewValue();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate <em>Integer Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Update</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate
	 * @generated
	 */
	EClass getIntegerValueUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate#getOldValue()
	 * @see #getIntegerValueUpdate()
	 * @generated
	 */
	EAttribute getIntegerValueUpdate_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate#getNewValue()
	 * @see #getIntegerValueUpdate()
	 * @generated
	 */
	EAttribute getIntegerValueUpdate_NewValue();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.mqtt.generic.message.LongValueUpdate <em>Long Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Value Update</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.LongValueUpdate
	 * @generated
	 */
	EClass getLongValueUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.LongValueUpdate#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.LongValueUpdate#getOldValue()
	 * @see #getLongValueUpdate()
	 * @generated
	 */
	EAttribute getLongValueUpdate_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.LongValueUpdate#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.LongValueUpdate#getNewValue()
	 * @see #getLongValueUpdate()
	 * @generated
	 */
	EAttribute getLongValueUpdate_NewValue();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate <em>Boolean Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Update</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate
	 * @generated
	 */
	EClass getBooleanValueUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate#isOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate#isOldValue()
	 * @see #getBooleanValueUpdate()
	 * @generated
	 */
	EAttribute getBooleanValueUpdate_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate#isNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate#isNewValue()
	 * @see #getBooleanValueUpdate()
	 * @generated
	 */
	EAttribute getBooleanValueUpdate_NewValue();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate <em>Object Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Value Update</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate
	 * @generated
	 */
	EClass getObjectValueUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate#getOldValue()
	 * @see #getObjectValueUpdate()
	 * @generated
	 */
	EAttribute getObjectValueUpdate_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate#getNewValue()
	 * @see #getObjectValueUpdate()
	 * @generated
	 */
	EAttribute getObjectValueUpdate_NewValue();

	/**
	 * Returns the meta object for data type '{@link java.time.Instant <em>EInstant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInstant</em>'.
	 * @see java.time.Instant
	 * @model instanceClass="java.time.Instant"
	 * @generated
	 */
	EDataType getEInstant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MessageFactory getMessageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.sensinact.mqtt.generic.message.UpdateMessage <em>Update Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.mqtt.generic.message.UpdateMessage
		 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getUpdateMessage()
		 * @generated
		 */
		EClass UPDATE_MESSAGE = eINSTANCE.getUpdateMessage();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_MESSAGE__TIMESTAMP = eINSTANCE.getUpdateMessage_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_MESSAGE__RESOURCE = eINSTANCE.getUpdateMessage_Resource();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.mqtt.generic.message.impl.StringValueUpdateImpl <em>String Value Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.mqtt.generic.message.impl.StringValueUpdateImpl
		 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getStringValueUpdate()
		 * @generated
		 */
		EClass STRING_VALUE_UPDATE = eINSTANCE.getStringValueUpdate();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE_UPDATE__OLD_VALUE = eINSTANCE.getStringValueUpdate_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE_UPDATE__NEW_VALUE = eINSTANCE.getStringValueUpdate_NewValue();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.mqtt.generic.message.impl.DoubleValueUpdateImpl <em>Double Value Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.mqtt.generic.message.impl.DoubleValueUpdateImpl
		 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getDoubleValueUpdate()
		 * @generated
		 */
		EClass DOUBLE_VALUE_UPDATE = eINSTANCE.getDoubleValueUpdate();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_VALUE_UPDATE__OLD_VALUE = eINSTANCE.getDoubleValueUpdate_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_VALUE_UPDATE__NEW_VALUE = eINSTANCE.getDoubleValueUpdate_NewValue();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.mqtt.generic.message.impl.IntegerValueUpdateImpl <em>Integer Value Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.mqtt.generic.message.impl.IntegerValueUpdateImpl
		 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getIntegerValueUpdate()
		 * @generated
		 */
		EClass INTEGER_VALUE_UPDATE = eINSTANCE.getIntegerValueUpdate();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_UPDATE__OLD_VALUE = eINSTANCE.getIntegerValueUpdate_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_UPDATE__NEW_VALUE = eINSTANCE.getIntegerValueUpdate_NewValue();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.mqtt.generic.message.impl.LongValueUpdateImpl <em>Long Value Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.mqtt.generic.message.impl.LongValueUpdateImpl
		 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getLongValueUpdate()
		 * @generated
		 */
		EClass LONG_VALUE_UPDATE = eINSTANCE.getLongValueUpdate();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_VALUE_UPDATE__OLD_VALUE = eINSTANCE.getLongValueUpdate_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_VALUE_UPDATE__NEW_VALUE = eINSTANCE.getLongValueUpdate_NewValue();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.mqtt.generic.message.impl.BooleanValueUpdateImpl <em>Boolean Value Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.mqtt.generic.message.impl.BooleanValueUpdateImpl
		 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getBooleanValueUpdate()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_UPDATE = eINSTANCE.getBooleanValueUpdate();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_UPDATE__OLD_VALUE = eINSTANCE.getBooleanValueUpdate_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_UPDATE__NEW_VALUE = eINSTANCE.getBooleanValueUpdate_NewValue();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.mqtt.generic.message.impl.ObjectValueUpdateImpl <em>Object Value Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.mqtt.generic.message.impl.ObjectValueUpdateImpl
		 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getObjectValueUpdate()
		 * @generated
		 */
		EClass OBJECT_VALUE_UPDATE = eINSTANCE.getObjectValueUpdate();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VALUE_UPDATE__OLD_VALUE = eINSTANCE.getObjectValueUpdate_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_VALUE_UPDATE__NEW_VALUE = eINSTANCE.getObjectValueUpdate_NewValue();

		/**
		 * The meta object literal for the '<em>EInstant</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Instant
		 * @see de.jena.sensinact.mqtt.generic.message.impl.MessagePackageImpl#getEInstant()
		 * @generated
		 */
		EDataType EINSTANT = eINSTANCE.getEInstant();

	}

} //MessagePackage