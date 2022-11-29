package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int id;
	@NotNull(message = "sid should not be null")
	private int sid;
	@NotBlank(message = "fristName should not be empty")
	private String fristName;
	@NotBlank(message = "lastName should not be empty")
	private String lastName;
	@NotBlank(message = "branch should not be empty")
	private String branch;
	@NotBlank(message = "mobile should not be empty")
	private String mobile;
	@NotBlank(message = "email should not be empty")
	private String email;
	
	public Student() {
		super();
	}

	public Student(int sid, String fristName, String lastName, String branch, String mobile, String email) {
		super();
		this.sid = sid;
		this.fristName = fristName;
		this.lastName = lastName;
		this.branch = branch;
		this.mobile = mobile;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fristName=" + fristName + ", lastName=" + lastName
				+ ", branch=" + branch + ", mobile=" + mobile + ", email=" + email + "]";
	}

}
