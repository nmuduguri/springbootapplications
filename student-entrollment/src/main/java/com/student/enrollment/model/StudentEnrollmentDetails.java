package com.student.enrollment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "student_enrollment")
public class StudentEnrollmentDetails {
	
	@javax.persistence.Id
	@GeneratedValue
	private Integer Id;
	private String firstName;
	private String lastName;
	private String gender;
	private String emailId;
	private String branch;
	private String country;
	private String state;
	private String district;
	private String city;
	private String mobile;
	private String alterNativeMobile;
	private String address;
	private String fatherName;
	private String motherName;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAlterNativeMobile() {
		return alterNativeMobile;
	}
	public void setAlterNativeMobile(String alterNativeMobile) {
		this.alterNativeMobile = alterNativeMobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "StudentEnrollmentDetails [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", emailId=" + emailId + ", branch=" + branch + ", country=" + country
				+ ", state=" + state + ", district=" + district + ", city=" + city + ", mobile=" + mobile
				+ ", alterNativeMobile=" + alterNativeMobile + ", address=" + address + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + "]";
	}
	
}
