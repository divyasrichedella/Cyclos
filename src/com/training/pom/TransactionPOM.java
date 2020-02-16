package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransactionPOM {
	
private WebDriver driver; 
	
	public TransactionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='menu3']/span[2]")
	private WebElement accounts;	
	@FindBy(xpath="//*[@id='submenu3.6']/span[2]")
	private WebElement memberpayment;
	@FindBy(id="memberUsername")
	private WebElement login; 
	@FindBy(xpath="//input[@type='text']")
	private WebElement amount;
	@FindBy(xpath="//select[@id='type']")
	private WebElement transactiontype;
	@FindBy(id="description")
	private WebElement description;
	@FindBy(id="submitButton")
	private WebElement submit1;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit2;
	@FindBy(xpath="//*[@id='menu15']/span[2]")
	private WebElement logoutBtn; 


	public void clickAccounts() {
		this.accounts.click(); 
	}

	public void clickMemberpayment() {
		this.memberpayment.click(); 
	}

	public void sendMemberuserName(String memberusername) {
		this.login.sendKeys(memberusername);
	}
	
	public void sendMemberuserName() {
		this.login.click(); 
	}
	
	public void sendAmount(String amounts) {
		this.amount.sendKeys(amounts);
	}
	
	public void list(){
		this.transactiontype.click();
		Select s=new Select(this.transactiontype);
		s.selectByIndex(1);
	}

	public void sendDescription(String desc) {
		this.description.sendKeys(desc);
	}
     
	public void clickSubmit1() {
		this.submit1.click(); 
	}
	
	public void clickSubmit2() {
		this.submit2.click(); 
	}

	public void clickLogoutBtn() {
		this.logoutBtn.click(); 
	}

}
