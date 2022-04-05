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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employ}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employ
 * @generated
 */
public class EmployWrapper
	extends BaseModelWrapper<Employ> implements Employ, ModelWrapper<Employ> {

	public EmployWrapper(Employ employ) {
		super(employ);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sid", getSid());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("aadhar", getAadhar());
		attributes.put("pan", getPan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sid = (Long)attributes.get("sid");

		if (sid != null) {
			setSid(sid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String aadhar = (String)attributes.get("aadhar");

		if (aadhar != null) {
			setAadhar(aadhar);
		}

		String pan = (String)attributes.get("pan");

		if (pan != null) {
			setPan(pan);
		}
	}

	/**
	 * Returns the aadhar of this employ.
	 *
	 * @return the aadhar of this employ
	 */
	@Override
	public String getAadhar() {
		return model.getAadhar();
	}

	/**
	 * Returns the email of this employ.
	 *
	 * @return the email of this employ
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the name of this employ.
	 *
	 * @return the name of this employ
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the pan of this employ.
	 *
	 * @return the pan of this employ
	 */
	@Override
	public String getPan() {
		return model.getPan();
	}

	/**
	 * Returns the primary key of this employ.
	 *
	 * @return the primary key of this employ
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sid of this employ.
	 *
	 * @return the sid of this employ
	 */
	@Override
	public long getSid() {
		return model.getSid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the aadhar of this employ.
	 *
	 * @param aadhar the aadhar of this employ
	 */
	@Override
	public void setAadhar(String aadhar) {
		model.setAadhar(aadhar);
	}

	/**
	 * Sets the email of this employ.
	 *
	 * @param email the email of this employ
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the name of this employ.
	 *
	 * @param name the name of this employ
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the pan of this employ.
	 *
	 * @param pan the pan of this employ
	 */
	@Override
	public void setPan(String pan) {
		model.setPan(pan);
	}

	/**
	 * Sets the primary key of this employ.
	 *
	 * @param primaryKey the primary key of this employ
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sid of this employ.
	 *
	 * @param sid the sid of this employ
	 */
	@Override
	public void setSid(long sid) {
		model.setSid(sid);
	}

	@Override
	protected EmployWrapper wrap(Employ employ) {
		return new EmployWrapper(employ);
	}

}