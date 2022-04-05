/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.entryservice.service.persistence;

import com.entryservice.model.Employ;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the employ service. This utility wraps <code>com.entryservice.service.persistence.impl.EmployPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployPersistence
 * @generated
 */
public class EmployUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Employ employ) {
		getPersistence().clearCache(employ);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Employ> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Employ> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Employ> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Employ> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Employ> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Employ update(Employ employ) {
		return getPersistence().update(employ);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Employ update(Employ employ, ServiceContext serviceContext) {
		return getPersistence().update(employ, serviceContext);
	}

	/**
	 * Caches the employ in the entity cache if it is enabled.
	 *
	 * @param employ the employ
	 */
	public static void cacheResult(Employ employ) {
		getPersistence().cacheResult(employ);
	}

	/**
	 * Caches the employs in the entity cache if it is enabled.
	 *
	 * @param employs the employs
	 */
	public static void cacheResult(List<Employ> employs) {
		getPersistence().cacheResult(employs);
	}

	/**
	 * Creates a new employ with the primary key. Does not add the employ to the database.
	 *
	 * @param sid the primary key for the new employ
	 * @return the new employ
	 */
	public static Employ create(long sid) {
		return getPersistence().create(sid);
	}

	/**
	 * Removes the employ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ that was removed
	 * @throws NoSuchEmployException if a employ with the primary key could not be found
	 */
	public static Employ remove(long sid)
		throws com.entryservice.exception.NoSuchEmployException {

		return getPersistence().remove(sid);
	}

	public static Employ updateImpl(Employ employ) {
		return getPersistence().updateImpl(employ);
	}

	/**
	 * Returns the employ with the primary key or throws a <code>NoSuchEmployException</code> if it could not be found.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ
	 * @throws NoSuchEmployException if a employ with the primary key could not be found
	 */
	public static Employ findByPrimaryKey(long sid)
		throws com.entryservice.exception.NoSuchEmployException {

		return getPersistence().findByPrimaryKey(sid);
	}

	/**
	 * Returns the employ with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ, or <code>null</code> if a employ with the primary key could not be found
	 */
	public static Employ fetchByPrimaryKey(long sid) {
		return getPersistence().fetchByPrimaryKey(sid);
	}

	/**
	 * Returns all the employs.
	 *
	 * @return the employs
	 */
	public static List<Employ> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the employs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employs
	 * @param end the upper bound of the range of employs (not inclusive)
	 * @return the range of employs
	 */
	public static List<Employ> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the employs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employs
	 * @param end the upper bound of the range of employs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employs
	 */
	public static List<Employ> findAll(
		int start, int end, OrderByComparator<Employ> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employs
	 * @param end the upper bound of the range of employs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of employs
	 */
	public static List<Employ> findAll(
		int start, int end, OrderByComparator<Employ> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the employs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of employs.
	 *
	 * @return the number of employs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EmployPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EmployPersistence, EmployPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EmployPersistence.class);

		ServiceTracker<EmployPersistence, EmployPersistence> serviceTracker =
			new ServiceTracker<EmployPersistence, EmployPersistence>(
				bundle.getBundleContext(), EmployPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}