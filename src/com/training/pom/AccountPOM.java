package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPOM {
	private WebDriver driver; 
	
	public AccountPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//li[@id='menu2']")
	private WebElement accountPOM;
	
	@FindBy(xpath="//li[@id='submenu2.3']")
	private WebElement loansLink;
	
	@FindBy(xpath="//td//img[@class='details view']")
	private WebElement viewIcon;
	
	@FindBy(id="amountText")
	private WebElement amountText;
	
	@FindBy(xpath="//input[@value='Repay']")
	private WebElement repayBtn;
	
	@FindBy(xpath="//li[@id='submenu2.0']")
	private WebElement accountInfo;
	
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

	public void accountLink() {
		this.accountPOM.click();
		
	}

	public void loansLink() {
		this.loansLink.click();
		
	}

	public void viewIcon() {
		this.viewIcon.click();
		
	}

	public void amountText() {
		this.amountText.clear();
		this.amountText.sendKeys("4567");
		
	}

	public void repayBtn() {
		this.repayBtn.click();
		
	}
	

	public void accoountInfo() {
		this.accountInfo.click();
		
	}
	
	public void alertHandle(){
		Alert alt=driver.switchTo().alert();
		alt.accept();
		alt.accept();
	}
}