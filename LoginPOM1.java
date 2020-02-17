package com.training.pom;

import org.openqa.selenium.Alert;
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
	@FindBy(xpath="//li[@id='menu6']")
	private WebElement logoutBtn;
	
	
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
	
	public void clickLogoutBtn() {
		this.logoutBtn.click(); 
	}
	public void alert()
	{
		Alert d=driver.switchTo().alert();
		d.accept();
	}
}
