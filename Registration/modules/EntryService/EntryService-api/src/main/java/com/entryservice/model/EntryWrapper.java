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
 * This class is a wrapper for {@link Entry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entry
 * @generated
 */
public class EntryWrapper
	extends BaseModelWrapper<Entry> implements Entry, ModelWrapper<Entry> {

	public EntryWrapper(Entry entry) {
		super(entry);
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
	 * Returns the aadhar of this entry.
	 *
	 * @return the aadhar of this entry
	 */
	@Override
	public String getAadhar() {
		return model.getAadhar();
	}

	/**
	 * Returns the email of this entry.
	 *
	 * @return the email of this entry
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the name of this entry.
	 *
	 * @return the name of this entry
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the pan of this entry.
	 *
	 * @return the pan of this entry
	 */
	@Override
	public String getPan() {
		return model.getPan();
	}

	/**
	 * Returns the primary key of this entry.
	 *
	 * @return the primary key of this entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sid of this entry.
	 *
	 * @return the sid of this entry
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
	 * Sets the aadhar of this entry.
	 *
	 * @param aadhar the aadhar of this entry
	 */
	@Override
	public void setAadhar(String aadhar) {
		model.setAadhar(aadhar);
	}

	/**
	 * Sets the email of this entry.
	 *
	 * @param email the email of this entry
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the name of this entry.
	 *
	 * @param name the name of this entry
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the pan of this entry.
	 *
	 * @param pan the pan of this entry
	 */
	@Override
	public void setPan(String pan) {
		model.setPan(pan);
	}

	/**
	 * Sets the primary key of this entry.
	 *
	 * @param primaryKey the primary key of this entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sid of this entry.
	 *
	 * @param sid the sid of this entry
	 */
	@Override
	public void setSid(long sid) {
		model.setSid(sid);
	}

	@Override
	protected EntryWrapper wrap(Entry entry) {
		return new EntryWrapper(entry);
	}

}