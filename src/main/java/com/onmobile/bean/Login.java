package com.onmobile.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	private String userId;
	private String pass;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", pass=" + pass + "]";
	}
	
}
