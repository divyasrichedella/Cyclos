package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Medium_12 {
private WebDriver driver; 
	
	public Medium_12(WebDriver driver) {
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
	
	
	
	@FindBy(id="memberUsername")
	private WebElement memberlogin; 
	@FindBy(xpath="//input[@linkurl='accountOverview?memberId=10']")
	private WebElement accinfo; 



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

	public void sendMemberuser(String memberuser) {
		this.memberlogin.clear();
		this.memberlogin.sendKeys(memberuser);
	}

	public void clickAccinfo() {
		this.accinfo.click(); 
	}

}
 