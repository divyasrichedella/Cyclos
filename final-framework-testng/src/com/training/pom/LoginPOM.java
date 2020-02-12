package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	//@FindBy(id="cyclosPassword")
	//private WebElement password; 
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement password1;
	
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[@id='menu1']/span[2]")
	private WebElement personalBtn;
	
	@FindBy(xpath="//*[@id='submenu1.1']/span[2]")
	private WebElement changepasswordBtn;
	
	

	
	@FindBy(xpath="//input[@name='oldPassword']")
	private WebElement oldPassword1; 
	
	@FindBy(xpath="//input[@name='newPassword']")
	private WebElement newPassword; 
	
	@FindBy(xpath="//input[@name='newPasswordConfirmation']")
	private WebElement newPasswordConfirmation;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn1;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void Password1() {
		this.password1.click(); 
		 }
	public void Password2() {
		this.password2.click(); 
		 }
	public void Password3() {
		this.password3.click(); 
		 }
	public void Password4() {
		this.password4.click(); 
		 }
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void personalBtn() {
		this.personalBtn.click(); 
	}
	public void changepasswordBtn() {
		this.changepasswordBtn.click(); 
	}
	
	public void sendoldPassword(String oldPassword1){
		this.oldPassword1.sendKeys(oldPassword1); 
	}
	
	public void sendnewPassword(String newPassword){
		this.newPassword.sendKeys(newPassword); 
	}
	
	public void sendnewPasswordConfirmation(String newPasswordConfirmation){
		this.newPasswordConfirmation.sendKeys(newPasswordConfirmation);  
	}
	
    public void loginBtn1() {
	this.loginBtn1.click(); 
		}
}
	
	
