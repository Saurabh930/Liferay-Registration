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

package com.entryservice.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Employ service. Represents a row in the &quot;Employ&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.entryservice.model.impl.EmployModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.entryservice.model.impl.EmployImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employ
 * @generated
 */
@ProviderType
public interface EmployModel extends BaseModel<Employ> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employ model instance should use the {@link Employ} interface instead.
	 */

	/**
	 * Returns the primary key of this employ.
	 *
	 * @return the primary key of this employ
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employ.
	 *
	 * @param primaryKey the primary key of this employ
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sid of this employ.
	 *
	 * @return the sid of this employ
	 */
	public long getSid();

	/**
	 * Sets the sid of this employ.
	 *
	 * @param sid the sid of this employ
	 */
	public void setSid(long sid);

	/**
	 * Returns the name of this employ.
	 *
	 * @return the name of this employ
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this employ.
	 *
	 * @param name the name of this employ
	 */
	public void setName(String name);

	/**
	 * Returns the email of this employ.
	 *
	 * @return the email of this employ
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this employ.
	 *
	 * @param email the email of this employ
	 */
	public void setEmail(String email);

	/**
	 * Returns the aadhar of this employ.
	 *
	 * @return the aadhar of this employ
	 */
	@AutoEscape
	public String getAadhar();

	/**
	 * Sets the aadhar of this employ.
	 *
	 * @param aadhar the aadhar of this employ
	 */
	public void setAadhar(String aadhar);

	/**
	 * Returns the pan of this employ.
	 *
	 * @return the pan of this employ
	 */
	@AutoEscape
	public String getPan();

	/**
	 * Sets the pan of this employ.
	 *
	 * @param pan the pan of this employ
	 */
	public void setPan(String pan);

}