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

package com.entryservice.service.persistence.impl;

import com.entryservice.exception.NoSuchEmployException;
import com.entryservice.model.Employ;
import com.entryservice.model.impl.EmployImpl;
import com.entryservice.model.impl.EmployModelImpl;
import com.entryservice.service.persistence.EmployPersistence;
import com.entryservice.service.persistence.impl.constants.FOOPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the employ service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EmployPersistence.class)
public class EmployPersistenceImpl
	extends BasePersistenceImpl<Employ> implements EmployPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EmployUtil</code> to access the employ persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EmployImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public EmployPersistenceImpl() {
		setModelClass(Employ.class);

		setModelImplClass(EmployImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the employ in the entity cache if it is enabled.
	 *
	 * @param employ the employ
	 */
	@Override
	public void cacheResult(Employ employ) {
		entityCache.putResult(EmployImpl.class, employ.getPrimaryKey(), employ);
	}

	/**
	 * Caches the employs in the entity cache if it is enabled.
	 *
	 * @param employs the employs
	 */
	@Override
	public void cacheResult(List<Employ> employs) {
		for (Employ employ : employs) {
			if (entityCache.getResult(
					EmployImpl.class, employ.getPrimaryKey()) == null) {

				cacheResult(employ);
			}
		}
	}

	/**
	 * Clears the cache for all employs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EmployImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employ.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Employ employ) {
		entityCache.removeResult(EmployImpl.class, employ);
	}

	@Override
	public void clearCache(List<Employ> employs) {
		for (Employ employ : employs) {
			entityCache.removeResult(EmployImpl.class, employ);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EmployImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new employ with the primary key. Does not add the employ to the database.
	 *
	 * @param sid the primary key for the new employ
	 * @return the new employ
	 */
	@Override
	public Employ create(long sid) {
		Employ employ = new EmployImpl();

		employ.setNew(true);
		employ.setPrimaryKey(sid);

		return employ;
	}

	/**
	 * Removes the employ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ that was removed
	 * @throws NoSuchEmployException if a employ with the primary key could not be found
	 */
	@Override
	public Employ remove(long sid) throws NoSuchEmployException {
		return remove((Serializable)sid);
	}

	/**
	 * Removes the employ with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employ
	 * @return the employ that was removed
	 * @throws NoSuchEmployException if a employ with the primary key could not be found
	 */
	@Override
	public Employ remove(Serializable primaryKey) throws NoSuchEmployException {
		Session session = null;

		try {
			session = openSession();

			Employ employ = (Employ)session.get(EmployImpl.class, primaryKey);

			if (employ == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(employ);
		}
		catch (NoSuchEmployException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Employ removeImpl(Employ employ) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employ)) {
				employ = (Employ)session.get(
					EmployImpl.class, employ.getPrimaryKeyObj());
			}

			if (employ != null) {
				session.delete(employ);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (employ != null) {
			clearCache(employ);
		}

		return employ;
	}

	@Override
	public Employ updateImpl(Employ employ) {
		boolean isNew = employ.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(employ);
			}
			else {
				employ = (Employ)session.merge(employ);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(EmployImpl.class, employ, false, true);

		if (isNew) {
			employ.setNew(false);
		}

		employ.resetOriginalValues();

		return employ;
	}

	/**
	 * Returns the employ with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employ
	 * @return the employ
	 * @throws NoSuchEmployException if a employ with the primary key could not be found
	 */
	@Override
	public Employ findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployException {

		Employ employ = fetchByPrimaryKey(primaryKey);

		if (employ == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return employ;
	}

	/**
	 * Returns the employ with the primary key or throws a <code>NoSuchEmployException</code> if it could not be found.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ
	 * @throws NoSuchEmployException if a employ with the primary key could not be found
	 */
	@Override
	public Employ findByPrimaryKey(long sid) throws NoSuchEmployException {
		return findByPrimaryKey((Serializable)sid);
	}

	/**
	 * Returns the employ with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sid the primary key of the employ
	 * @return the employ, or <code>null</code> if a employ with the primary key could not be found
	 */
	@Override
	public Employ fetchByPrimaryKey(long sid) {
		return fetchByPrimaryKey((Serializable)sid);
	}

	/**
	 * Returns all the employs.
	 *
	 * @return the employs
	 */
	@Override
	public List<Employ> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Employ> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Employ> findAll(
		int start, int end, OrderByComparator<Employ> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Employ> findAll(
		int start, int end, OrderByComparator<Employ> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Employ> list = null;

		if (useFinderCache) {
			list = (List<Employ>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EMPLOY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOY;

				sql = sql.concat(EmployModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Employ>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the employs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Employ employ : findAll()) {
			remove(employ);
		}
	}

	/**
	 * Returns the number of employs.
	 *
	 * @return the number of employs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_EMPLOY);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "sid";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EMPLOY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EmployModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the employ persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new EmployModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Employ.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(EmployImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EMPLOY =
		"SELECT employ FROM Employ employ";

	private static final String _SQL_COUNT_EMPLOY =
		"SELECT COUNT(employ) FROM Employ employ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "employ.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Employ exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		EmployPersistenceImpl.class);

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class EmployModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			EmployModelImpl employModelImpl = (EmployModelImpl)baseModel;

			long columnBitmask = employModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(employModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |= employModelImpl.getColumnBitmask(
						columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(employModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			EmployModelImpl employModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = employModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = employModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}