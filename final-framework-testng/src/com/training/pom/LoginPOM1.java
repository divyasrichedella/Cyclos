package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM1 {
	private WebDriver driver; 
	
	public LoginPOM1(WebDriver driver) {
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
	private WebElement changepasswordbtn;
	
	
	@FindBy(xpath="//input[@name='oldPassword']")
	private WebElement oldPasswordtxt;
	
	
	@FindBy(xpath="//input[@name='newPassword']")
	private WebElement newPasswordtxt;
	
	@FindBy(xpath="//input[@name='newPasswordConfirmation']")
	private WebElement newPasswordConfirmationtxt;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submitbtn;
	
	
	
	
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
	
	public void changepasswordbtn() {
		this.changepasswordbtn.click(); 
	}
	
	
	public void sendoldPasswordtxt(String oldPasswordtxt ) {
		this.oldPasswordtxt.sendKeys(oldPasswordtxt); 
	}
	
	public void sendnewPasswordtxt(String newPasswordtxt ) {
		this.newPasswordtxt.sendKeys(newPasswordtxt); 
	}
	
	public void sendnewPasswordConfirmation(String newPasswordConfirmationtxt ) {
		this.newPasswordConfirmationtxt.sendKeys(newPasswordConfirmationtxt); 
	}
	public void  Submitbtn() {
		this. Submitbtn.click(); 
	}
	
	
	
	
}
