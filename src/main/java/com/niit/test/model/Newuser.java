package com.niit.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

@Entity(name = "USER")
@Component
public class Newuser implements Serializable {

	private static final long serialVersionUID = 4657462015039726030L;

	@Column
	private boolean enable;

	public boolean getEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	@Column
	private String fname;
	@Column
	private String email;
	@Column
	private String age;
	@Id
	@Column
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column
	private String password;
	@Column
	@Transient
	private String cPassword;
	@Length(max = 10, min = 10, message = "Phone number is not valid. Should be of length 10.")
	@Column
	private String phnumber;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

}