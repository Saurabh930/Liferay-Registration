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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.entryservice.service.http.EmployServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class EmploySoap implements Serializable {

	public static EmploySoap toSoapModel(Employ model) {
		EmploySoap soapModel = new EmploySoap();

		soapModel.setSid(model.getSid());
		soapModel.setName(model.getName());
		soapModel.setEmail(model.getEmail());
		soapModel.setAadhar(model.getAadhar());
		soapModel.setPan(model.getPan());

		return soapModel;
	}

	public static EmploySoap[] toSoapModels(Employ[] models) {
		EmploySoap[] soapModels = new EmploySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmploySoap[][] toSoapModels(Employ[][] models) {
		EmploySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmploySoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmploySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmploySoap[] toSoapModels(List<Employ> models) {
		List<EmploySoap> soapModels = new ArrayList<EmploySoap>(models.size());

		for (Employ model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmploySoap[soapModels.size()]);
	}

	public EmploySoap() {
	}

	public long getPrimaryKey() {
		return _sid;
	}

	public void setPrimaryKey(long pk) {
		setSid(pk);
	}

	public long getSid() {
		return _sid;
	}

	public void setSid(long sid) {
		_sid = sid;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getAadhar() {
		return _aadhar;
	}

	public void setAadhar(String aadhar) {
		_aadhar = aadhar;
	}

	public String getPan() {
		return _pan;
	}

	public void setPan(String pan) {
		_pan = pan;
	}

	private long _sid;
	private String _name;
	private String _email;
	private String _aadhar;
	private String _pan;

}