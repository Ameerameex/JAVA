package com.training.business;

public class User {

	String userName,password;
	int userType;
	//int status;
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
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public User() {
		super();
		
	}

	
	public User(String userName, String password, int userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", userType=" + userType 
				+ "]";
	}
	
	
	
}
