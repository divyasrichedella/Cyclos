package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AdvPOM {
private WebDriver driver; 
	
	public AdvPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cyclosUsername")
	private WebElement userName;
	public void sendUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	
	
	@FindBy(xpath="//input[@value='1']")	
	private WebElement password1; 
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;
	
	@FindBy(xpath="//input[@value='5']")
	private WebElement password5;
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginButn;
	
	public void password1() {
		this.password1.click(); 
	}
	public void password2() {
		this.password2.click(); 
	}
		public void password3() {
			this.password3.click(); 
		}
		
	public void password4() {
		this.password4.click(); 
	}	
	public void password5() {
		this.password5.click(); 
	}	
	
	public void clickLoginBtn() {
		this.loginButn.click(); 
	}
	@FindBy(xpath="//*[@id='menu1']/span[2]")
	private WebElement personal;
	public void personalBtn()
	{
		this.personal.click();
	}
	@FindBy(xpath="//*[@id='submenu1.2']/span[2]")
	private WebElement advertisement;
	public void advertisementBtn()
	{
		this.advertisement.click();
	}
	
	
}
