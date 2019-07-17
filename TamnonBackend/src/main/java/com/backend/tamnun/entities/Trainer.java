package com.backend.tamnun.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

public class Trainer extends AbstractEntity {
	@Column(name="is_signed")
	private boolean isSigned;
	
	private String	phone;
	
	private String state;
	@Column(name="e_mail")
	private String email;
	@Column(name="fname")
	private String firstName;
	@Column(name="lname")
	private String lastName;
	@Column(name="user_name")
	private String userName;
	@Column(name="site_id")
	private int siteId;
	
	// annotation to set to JPA Hibernate that this is large object
	@Lob
	@Column(name="img")
	private byte[] image;
	
	
	@OneToOne
	private User user;


	public boolean isSigned() {
		return isSigned;
	}


	public void setSigned(boolean isSigned) {
		this.isSigned = isSigned;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getSiteId() {
		return siteId;
	}


	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Trainer [isSigned=" + isSigned + ", phone=" + phone + ", state=" + state + ", email=" + email
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", siteId="
				+ siteId + ", image=" + Arrays.toString(image) + ", user=" + user + "]";
	}
	
	

}
