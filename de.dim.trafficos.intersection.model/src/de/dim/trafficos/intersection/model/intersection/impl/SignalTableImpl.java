/*
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.intersection.model.intersection.CacheDataEntry;
import de.dim.trafficos.intersection.model.intersection.SignalTable;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.SignalTableImpl#getCacheDataEntry <em>Cache Data Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalTableImpl extends MinimalEObjectImpl.Container implements SignalTable {
	/**
	 * The cached value of the '{@link #getCacheDataEntry() <em>Cache Data Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheDataEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<CacheDataEntry> cacheDataEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSIntersectionPackage.eINSTANCE.getSignalTable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CacheDataEntry> getCacheDataEntry() {
		if (cacheDataEntry == null) {
			cacheDataEntry = new EObjectContainmentEList<CacheDataEntry>(CacheDataEntry.class, this, TOSIntersectionPackage.SIGNAL_TABLE__CACHE_DATA_ENTRY);
		}
		return cacheDataEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSIntersectionPackage.SIGNAL_TABLE__CACHE_DATA_ENTRY:
				return ((InternalEList<?>)getCacheDataEntry()).basicRemove(otherEnd, msgs);
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
			case TOSIntersectionPackage.SIGNAL_TABLE__CACHE_DATA_ENTRY:
				return getCacheDataEntry();
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
			case TOSIntersectionPackage.SIGNAL_TABLE__CACHE_DATA_ENTRY:
				getCacheDataEntry().clear();
				getCacheDataEntry().addAll((Collection<? extends CacheDataEntry>)newValue);
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
			case TOSIntersectionPackage.SIGNAL_TABLE__CACHE_DATA_ENTRY:
				getCacheDataEntry().clear();
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
			case TOSIntersectionPackage.SIGNAL_TABLE__CACHE_DATA_ENTRY:
				return cacheDataEntry != null && !cacheDataEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SignalTableImpl