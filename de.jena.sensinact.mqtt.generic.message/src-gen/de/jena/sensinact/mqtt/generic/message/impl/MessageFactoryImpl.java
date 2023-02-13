/**
 */
package de.jena.sensinact.mqtt.generic.message.impl;

import de.jena.sensinact.mqtt.generic.message.*;

import java.time.Instant;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class MessageFactoryImpl extends EFactoryImpl implements MessageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageFactory init() {
		try {
			MessageFactory theMessageFactory = (MessageFactory)EPackage.Registry.INSTANCE.getEFactory(MessagePackage.eNS_URI);
			if (theMessageFactory != null) {
				return theMessageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MessageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFactoryImpl() {
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
			case MessagePackage.STRING_VALUE_UPDATE: return createStringValueUpdate();
			case MessagePackage.DOUBLE_VALUE_UPDATE: return createDoubleValueUpdate();
			case MessagePackage.INTEGER_VALUE_UPDATE: return createIntegerValueUpdate();
			case MessagePackage.LONG_VALUE_UPDATE: return createLongValueUpdate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MessagePackage.EINSTANT:
				return createEInstantFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MessagePackage.EINSTANT:
				return convertEInstantToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueUpdate createStringValueUpdate() {
		StringValueUpdateImpl stringValueUpdate = new StringValueUpdateImpl();
		return stringValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValueUpdate createDoubleValueUpdate() {
		DoubleValueUpdateImpl doubleValueUpdate = new DoubleValueUpdateImpl();
		return doubleValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueUpdate createIntegerValueUpdate() {
		IntegerValueUpdateImpl integerValueUpdate = new IntegerValueUpdateImpl();
		return integerValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongValueUpdate createLongValueUpdate() {
		LongValueUpdateImpl longValueUpdate = new LongValueUpdateImpl();
		return longValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createEInstant(final String it) {
		return Instant.parse(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createEInstantFromString(EDataType eDataType, String initialValue) {
		return createEInstant(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInstant(final Instant it) {
		return it.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInstantToString(EDataType eDataType, Object instanceValue) {
		return convertEInstant((Instant)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePackage getMessagePackage() {
		return (MessagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MessagePackage getPackage() {
		return MessagePackage.eINSTANCE;
	}

} //MessageFactoryImpl
