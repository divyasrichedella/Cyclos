package com.training.bean;

public class LoginBean {
	//private String userName;
	//private String password;
	private String Member_Login;
	private String Amount;
	private String Transaction_Type;
	private String Description;

	public LoginBean() {
	}

	public LoginBean(String Member_Login,String Amount,String Transaction_Type,String Description) {
		super();
		this.Member_Login = Member_Login;
		this.Amount =  Amount;
		this.Transaction_Type =  Transaction_Type;
        this.Description =  Description;
	}

	public String getMember_Login(){
		return Member_Login;
	}

	public void setMember_Login(String Member_Login){
		this.Member_Login = Member_Login;
	}

	public String getAmount(){
		return Amount;
	}

	public void setAmount(String Amount) {
		this.Amount = Amount;
	}
		
	public String getTransaction_Type() {
		return getTransaction_Type();
	}
	public void setTransaction_Type(String Transaction_Type) {
		this.Transaction_Type = Transaction_Type;
	}
	public String getDescription() {
		return getDescription();
	}
	public void setDescription(String Description) {
		this.Description =Description;
	}
	
	@Override
	public String toString() {
	return "LoginBean [Member_Login=" + Member_Login + ", Amount=" + Amount + ",Transaction_Type=" + Transaction_Type +",Description=" +Description + "]";
	}

}
