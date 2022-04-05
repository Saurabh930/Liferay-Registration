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

package com.entryservice.model.impl;

import com.entryservice.model.Employ;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employ in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployCacheModel implements CacheModel<Employ>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployCacheModel)) {
			return false;
		}

		EmployCacheModel employCacheModel = (EmployCacheModel)object;

		if (sid == employCacheModel.sid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{sid=");
		sb.append(sid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", aadhar=");
		sb.append(aadhar);
		sb.append(", pan=");
		sb.append(pan);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employ toEntityModel() {
		EmployImpl employImpl = new EmployImpl();

		employImpl.setSid(sid);

		if (name == null) {
			employImpl.setName("");
		}
		else {
			employImpl.setName(name);
		}

		if (email == null) {
			employImpl.setEmail("");
		}
		else {
			employImpl.setEmail(email);
		}

		if (aadhar == null) {
			employImpl.setAadhar("");
		}
		else {
			employImpl.setAadhar(aadhar);
		}

		if (pan == null) {
			employImpl.setPan("");
		}
		else {
			employImpl.setPan(pan);
		}

		employImpl.resetOriginalValues();

		return employImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sid = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		aadhar = objectInput.readUTF();
		pan = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sid);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (aadhar == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(aadhar);
		}

		if (pan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pan);
		}
	}

	public long sid;
	public String name;
	public String email;
	public String aadhar;
	public String pan;

}