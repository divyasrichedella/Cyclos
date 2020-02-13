package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
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

	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//li[@id='menu1']")
	private WebElement personalBtn;
	
	@FindBy(xpath="//li[@id='submenu1.0']")
	private WebElement profileBtn;
	
	@FindBy(id="modifyButton")
	private WebElement changeBtn;
	
	@FindBy(xpath="//input[@value='Administrator']")
	private WebElement cleartxtBox;
	
	@FindBy(xpath="//input[@value='Administrator']")
	private WebElement sendAdministratorName;
	
	@FindBy(id="saveButton")
	private WebElement saveButton;
	
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

	public void personalBtn() {
		this.personalBtn.click();
		
	}

	public void profileBtn() {
		this.profileBtn.click();
		
	}

	public void changeBtn() {
		this.changeBtn.click();
		
	}

	
	public void cleartxtBox() {
		this.cleartxtBox.clear();
		
	}

	public void sendAdministratorName(String string) {
		this.sendAdministratorName.sendKeys(string);
		
	}

	public void saveButton() {
		this.saveButton.click();
		
	}
	
	public void alertHandle() {
	Alert alt=driver.switchTo().alert();
	String expected="Profile modified";
	String actual=alt.getText();
	Assert.assertEquals(expected, actual);
	alt.accept();

	}	
	
}
