package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminloginPOM {
private WebDriver driver; 
	
	public AdminloginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	@FindBy(id="cyclosPassword")
	private WebElement password;
	@FindBy(xpath="//input[@value='1']")
	private WebElement password1;
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
public void password1(){
	this.password1.click();
}

public void password2(){
	this.password2.click();
}

public void password3(){
	this.password3.click();
}

public void password4(){
	this.password4.click();
}

	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}



}
