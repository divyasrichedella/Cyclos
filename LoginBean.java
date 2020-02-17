package com.training.bean;

public class LoginBean {
	//private String userName;
	//private String password;
	private String Member_Login;
	private String Title_textbox;
	private String Price;
	private String Description;
	public LoginBean() {
	}

	public LoginBean(String userName, String password) {
		super();
		//this.userName = userName;
		//this.password = password;
		this.Member_Login = Member_Login;
		this.Title_textbox =Title_textbox;
		this.Price=Price;
		this.Description=Description;
		
	}

	/*public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}*/

	public String getMember_Login() {
		return Member_Login;
	}

	public void setMember_Login(String Member_Login) {
		this.Member_Login = Member_Login;
	}
	
	public String getTitle_textbox() {
		return Title_textbox;
	}

	public void setTitle_textbox(String Title_textbox) {
		this.Title_textbox =Title_textbox;
	}
	public String getPrice() {
		return Price;
	}

	public void setPrice(String Price) {
		this.Price =Price;
	}
	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description =Description;
	}

	
	/*public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}*/

	@Override
	public String toString() {
		return "LoginBean [Member_Login=" + Member_Login + ", Title_textbox=" + Title_textbox + ",Price=" + Price + ",Description=" + Description + "]";
	}

}
