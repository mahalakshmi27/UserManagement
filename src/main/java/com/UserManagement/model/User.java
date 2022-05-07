package com.UserManagement.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	
	@Id
	private String id;
	private String name;
	private Date dob;
	private String address;
	private String desc;
	@CreatedDate
	private Date createdAt;
	
	public User() {
	}

	public User(String name, Date dob, String address, String desc) {
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

	public String getDesc() {
		return desc;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", desc=" + desc
				+ ", createdAt=" + createdAt + "]";
	}
	
}