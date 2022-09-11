package com.student.enrollment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student_registration")
public class StudentRegistrationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "first_name", nullable = false)
	@NotEmpty
	@Size(min = 1, message = "First Name Should Not be Empty")
	private String firstName;
	@Column(name = "last_name", nullable = false)
	@NotEmpty
	@Size(min = 1, message = "Last Name Should Not be Empty")
	private String lastName;
	@Column(name = "mobile", nullable = false)
	@NotEmpty
	@Size(min = 10, max=10, message = "Mobile Number Should Not be Empty and Should be Valid")
	private String mobile;
	@Column(name = "gender", nullable = false)
	@NotEmpty
	@Size(min = 1, message = "Gender Should Not be Empty")
	private String gender;
	@Column(name = "email_id", nullable = false)
	@NotEmpty
	@Size(min = 1, message = "EmaiID Should Not be Empty")
	@Email
	private String emailId;
	@Column(name = "password", nullable = false)
	@NotEmpty
	@Size(min = 4, message = "Password Should Not be Empty and Should be Grater then 4 Characters")
	private String password;
	@Column(name = "confirm_password", nullable = false)
	@NotEmpty
	@Size(min = 4, message = "Confirm Password Should Not be Empty and Should be Grater then 4 Characters")
	private String confirmPassword;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "StudentRegistrationDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobile=" + mobile + ", gender=" + gender + ", emailId=" + emailId + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}
	
}
