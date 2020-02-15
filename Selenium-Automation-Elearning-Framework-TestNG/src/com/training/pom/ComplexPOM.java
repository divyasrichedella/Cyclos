package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplexPOM {
	private WebDriver driver; 
	
	public ComplexPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement cyclosUsername; 
	
	@FindBy(id="cyclosPassword")
	private WebElement cyclosPassword;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement btn1;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement btn2;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement btn3;
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement btn4;
	
	
	@FindBy(xpath="//tr//td//td//input[@value='Submit']")
	private WebElement submitlogin; 
	
	@FindBy(id="memberUsername")
	private WebElement memberUsername;
	
	
	@FindBy(xpath="//li[@id='menu3']/span[@class='menuText']")
	private WebElement Account; 
	
	@FindBy(xpath="//li[@id='submenu3.5']/span[@class='subMenuText']")
	private WebElement SystemPayment; 
	
	@FindBy(xpath="//input[@name='amount']")
	private WebElement Amount;
	
	@FindBy(id="type")
	private WebElement Transaction;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement Description; 
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submit; 
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement FinalSubmit; 
	
	
	public void sendUserName(String Nikita) {
		this.cyclosUsername.clear();
		this.cyclosUsername.sendKeys(Nikita);
	}

	public void sendUserPassword() {
		this.cyclosPassword.click();;
	}

	public void  bttn1() {
		this.btn1.click(); 
	}
	
	public void bttn2() {
		this.btn2.click(); 
	}
	
	public void bttn3() {
		this.btn3.click(); 
	}
	
	public void bttn4() {
		this.btn4.click(); 
	}
	
	public void clicksubmitbtn() {
		this.submitlogin.click(); 
	}
	
	public void memberUsername(String memUsername){
		this.memberUsername.sendKeys(memUsername);
	}
	
	public void Account() {
		this.Account.click(); 
	}
	public void SystemPayment() {
		this.SystemPayment.click(); 
	}
	public void Amount(String amount) {
		this.Amount.sendKeys(amount); 
	}
	public void Transaction( String transaction) {
		this.Transaction.sendKeys(transaction);
		}
	public void Description(String desc) {
		this.Description.sendKeys("I need 5000Loan"); 
	}
	public void Submit() {
		this.Submit.click(); 
	}

	public void FinalSubmit() {
		this.FinalSubmit.click(); 
	}

}
