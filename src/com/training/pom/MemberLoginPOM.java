package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberLoginPOM {
private WebDriver driver; 
	
	public  MemberLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement sendUserName; 
	
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

	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn;
	
	public void sendUserName(String userName) {
		this.sendUserName.clear();
		this.sendUserName.sendKeys(userName);
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

	@FindBy(xpath="//li[@id='menu1']")
	private WebElement personalBtn;
	public void personalBtn() {
		this.personalBtn.click();
		
	}

	@FindBy(xpath="//li[@id='submenu1.2']")
	private WebElement advertisementsBtn;
	public void advertisementsBtn() {
		this.advertisementsBtn.click();
	}


}
