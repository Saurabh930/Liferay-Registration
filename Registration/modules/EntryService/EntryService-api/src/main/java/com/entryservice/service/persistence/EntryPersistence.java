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

import com.entryservice.exception.NoSuchEntryException;
import com.entryservice.model.Entry;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntryUtil
 * @generated
 */
@ProviderType
public interface EntryPersistence extends BasePersistence<Entry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EntryUtil} to access the entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the entry in the entity cache if it is enabled.
	 *
	 * @param entry the entry
	 */
	public void cacheResult(Entry entry);

	/**
	 * Caches the entries in the entity cache if it is enabled.
	 *
	 * @param entries the entries
	 */
	public void cacheResult(java.util.List<Entry> entries);

	/**
	 * Creates a new entry with the primary key. Does not add the entry to the database.
	 *
	 * @param sid the primary key for the new entry
	 * @return the new entry
	 */
	public Entry create(long sid);

	/**
	 * Removes the entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sid the primary key of the entry
	 * @return the entry that was removed
	 * @throws NoSuchEntryException if a entry with the primary key could not be found
	 */
	public Entry remove(long sid) throws NoSuchEntryException;

	public Entry updateImpl(Entry entry);

	/**
	 * Returns the entry with the primary key or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param sid the primary key of the entry
	 * @return the entry
	 * @throws NoSuchEntryException if a entry with the primary key could not be found
	 */
	public Entry findByPrimaryKey(long sid) throws NoSuchEntryException;

	/**
	 * Returns the entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sid the primary key of the entry
	 * @return the entry, or <code>null</code> if a entry with the primary key could not be found
	 */
	public Entry fetchByPrimaryKey(long sid);

	/**
	 * Returns all the entries.
	 *
	 * @return the entries
	 */
	public java.util.List<Entry> findAll();

	/**
	 * Returns a range of all the entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entries
	 * @param end the upper bound of the range of entries (not inclusive)
	 * @return the range of entries
	 */
	public java.util.List<Entry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entries
	 * @param end the upper bound of the range of entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entries
	 */
	public java.util.List<Entry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entries
	 * @param end the upper bound of the range of entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entries
	 */
	public java.util.List<Entry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of entries.
	 *
	 * @return the number of entries
	 */
	public int countAll();

}