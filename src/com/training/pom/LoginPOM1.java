package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath="//input[@value='5']")
	private WebElement password5;
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginButn;
	
	@FindBy(id="memberUsername")
	private WebElement memberTextbox;
	
	@FindBy(xpath="//input[@linkurl='memberAds?memberId=10']")
 	private WebElement manageAdv;

     
     @FindBy(xpath="//img[@title='Remove']")
     private WebElement Remove;
     
	public void sendUserName(String userName) {
		this.userName.sendKeys(userName);
	}
		
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

	public void memberTextbox() {
		this.memberTextbox.sendKeys("aman");
		
	}

	public void scrollDown() throws InterruptedException {
		JavascriptExecutor a=(JavascriptExecutor)driver;
		Thread.sleep(3000);  
		a.executeScript("window.scrollBy(0,700)");
	}
	public void manageAdv() {
		this.manageAdv.click();
	}

	public void Remove() {
		
		this.Remove.click();
	}
	public void AlertHandleForRemove()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void AlertHandleToConfirm()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	@FindBy(xpath="//li[@linkurl='/do/logout?fromMenu=true']")
	private WebElement logout;
	public void logoutBtn()
	{
		this.logout.click();
	}
	public void AlertHandleToLogout()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
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
	
	
	


