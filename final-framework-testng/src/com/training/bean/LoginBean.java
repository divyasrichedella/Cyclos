package com.training.bean;

public class LoginBean {
	private String Member_Login;
	private String Title_textbox;
	private int Price;
	private String Description;

	public LoginBean() {
	}

	public LoginBean(String userName,String password) {
		super();
		this.Member_Login = Member_Login;
		this.Title_textbox = Title_textbox;
		this.Price = Price;
		this.Description = Description;
		//this.password = password;
	}

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
		this.Title_textbox = Title_textbox;
	}
    
    public int getPrice() {
		return Price;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}
	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	@Override
	public String toString() {
		return "LoginBean [Member_Login=" + Member_Login+ ",Title_textbox=" + Title_textbox+ ",Price=" + Price+ ",Description=" + Description+ "]";
	}

}
