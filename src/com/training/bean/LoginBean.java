package com.training.bean;

public class LoginBean {
	//private String userName;
	//private String password;
	private String login;
	private int amount;
	private String description;
	private String memberlogin;


	public LoginBean() {
	}

	public LoginBean(String userName, String password) {
		super();
		//this.userName = userName;
		//this.password = password;
		this.login = login;
		this.amount = amount;
		this.description = description;
		this.memberlogin = memberlogin;

	}
/*
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
*/
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMemberlogin() {
		return memberlogin;
	}

	public void setMemberlogin(String memberlogin) {
		this.memberlogin = memberlogin;
	}
	
	@Override
	public String toString() {
		return "LoginBean [login" + login + ",amount" +amount+ ",description"+description+",memberlogin"+memberlogin+"]";
	}

}
