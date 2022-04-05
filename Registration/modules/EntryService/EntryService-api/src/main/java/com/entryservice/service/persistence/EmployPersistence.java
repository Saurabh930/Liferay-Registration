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

import com.entryservice.exception.NoSuchEmployException;
import com.entryservice.model.Employ;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the employ service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployUtil
 * @generated
 */
@ProviderType
public interface EmployPersistence extends BasePersistence<Employ> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployUtil} to access the employ persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the employ in the entity cache if it is enabled.
	 *
	 * @param employ the employ
	 */
	public void cacheResult(Employ employ);

	/**
	 * Caches the employs in the entity cache if it is enabled.
	 *
	 * @param employs the employs
	 */
	public void cacheResult(java.util.List<Employ> employs);

	/**
	 * Creates a new employ with the primary key. Does not add the employ to the database.
	 *
	 * @param sid the primary key for the new employ
	 * @return the new employ
	 */
	public Employ create(long sid);

	/**
	 * Removes the employ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ that was removed
	 * @throws NoSuchEmployException if a employ with the primary key could not be found
	 */
	public Employ remove(long sid) throws NoSuchEmployException;

	public Employ updateImpl(Employ employ);

	/**
	 * Returns the employ with the primary key or throws a <code>NoSuchEmployException</code> if it could not be found.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ
	 * @throws NoSuchEmployException if a employ with the primary key could not be found
	 */
	public Employ findByPrimaryKey(long sid) throws NoSuchEmployException;

	/**
	 * Returns the employ with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ, or <code>null</code> if a employ with the primary key could not be found
	 */
	public Employ fetchByPrimaryKey(long sid);

	/**
	 * Returns all the employs.
	 *
	 * @return the employs
	 */
	public java.util.List<Employ> findAll();

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
	public java.util.List<Employ> findAll(int start, int end);

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
	public java.util.List<Employ> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employ>
			orderByComparator);

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
	public java.util.List<Employ> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employ>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the employs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of employs.
	 *
	 * @return the number of employs
	 */
	public int countAll();

}