package com.backend.tamnun.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.backend.tamnun.entities.AbstractEntity;

@Entity
@Table(name="user")
public class User extends AbstractEntity{
	@Column(name="userrole")
	private String role;
	
	@Column(name="username")
	private String userName;
	@Column(name="userpassword")
	private String password;
	@Column(name="email")	
	private String email;
	@Column(name="site_id")	
	private int siteId;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	@Override
	public String toString() {
		return "User [role=" + role + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", siteId=" + siteId + "]";
	}
	
	

}
