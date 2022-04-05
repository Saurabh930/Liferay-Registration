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

package com.entryservice.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployLocalService
 * @generated
 */
public class EmployLocalServiceWrapper
	implements EmployLocalService, ServiceWrapper<EmployLocalService> {

	public EmployLocalServiceWrapper(EmployLocalService employLocalService) {
		_employLocalService = employLocalService;
	}

	/**
	 * Adds the employ to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employ the employ
	 * @return the employ that was added
	 */
	@Override
	public com.entryservice.model.Employ addEmploy(
		com.entryservice.model.Employ employ) {

		return _employLocalService.addEmploy(employ);
	}

	/**
	 * Creates a new employ with the primary key. Does not add the employ to the database.
	 *
	 * @param sid the primary key for the new employ
	 * @return the new employ
	 */
	@Override
	public com.entryservice.model.Employ createEmploy(long sid) {
		return _employLocalService.createEmploy(sid);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the employ from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employ the employ
	 * @return the employ that was removed
	 */
	@Override
	public com.entryservice.model.Employ deleteEmploy(
		com.entryservice.model.Employ employ) {

		return _employLocalService.deleteEmploy(employ);
	}

	/**
	 * Deletes the employ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sid the primary key of the employ
	 * @return the employ that was removed
	 * @throws PortalException if a employ with the primary key could not be found
	 */
	@Override
	public com.entryservice.model.Employ deleteEmploy(long sid)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employLocalService.deleteEmploy(sid);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.entryservice.model.impl.EmployModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _employLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.entryservice.model.impl.EmployModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _employLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _employLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.entryservice.model.Employ fetchEmploy(long sid) {
		return _employLocalService.fetchEmploy(sid);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _employLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the employ with the primary key.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ
	 * @throws PortalException if a employ with the primary key could not be found
	 */
	@Override
	public com.entryservice.model.Employ getEmploy(long sid)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employLocalService.getEmploy(sid);
	}

	/**
	 * Returns a range of all the employs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.entryservice.model.impl.EmployModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employs
	 * @param end the upper bound of the range of employs (not inclusive)
	 * @return the range of employs
	 */
	@Override
	public java.util.List<com.entryservice.model.Employ> getEmploys(
		int start, int end) {

		return _employLocalService.getEmploys(start, end);
	}

	/**
	 * Returns the number of employs.
	 *
	 * @return the number of employs
	 */
	@Override
	public int getEmploysCount() {
		return _employLocalService.getEmploysCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _employLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the employ in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employ the employ
	 * @return the employ that was updated
	 */
	@Override
	public com.entryservice.model.Employ updateEmploy(
		com.entryservice.model.Employ employ) {

		return _employLocalService.updateEmploy(employ);
	}

	@Override
	public EmployLocalService getWrappedService() {
		return _employLocalService;
	}

	@Override
	public void setWrappedService(EmployLocalService employLocalService) {
		_employLocalService = employLocalService;
	}

	private EmployLocalService _employLocalService;

}