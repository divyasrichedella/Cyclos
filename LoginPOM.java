package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	@FindBy(id="memberUsername")
	private WebElement membername; 
	@FindBy(xpath="//input[@linkurl='grantLoan?memberId=12']")
	private WebElement grant;
	@FindBy(id="amount")
	private WebElement amount;
	@FindBy(id="description")
	private WebElement des;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sub;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sub1;
	@FindBy(xpath="//input[@linkurl='searchLoans?memberId=12']")
	private WebElement view;
	@FindBy(id=("menu15"))
	private WebElement view1;
	@FindBy(xpath="//li[@id='menu2']")
	private WebElement men;
	@FindBy(id="submenu2.3")
	private WebElement men1; 
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
	public void membername(String membername) {
		this.membername.clear();
		this.membername.sendKeys(membername);
	}
	public void exe() throws InterruptedException{
		JavascriptExecutor a = (JavascriptExecutor)driver;

	    a.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    Thread.sleep(3000);

	}
	public void grant(){
		this.grant.click();
	}
	public void amount(String amount) {
		this.amount.clear();
		this.amount.sendKeys(amount);
	}
	public void des(String des) {
		this.des.clear();
		this.des.sendKeys(des);
	}
	public void sub(){
		this.sub.click();
	}
	public void sub1(){
		this.sub1.click();
	}
	public void alertHandle1(){
		Alert d=driver.switchTo().alert();
		String expected="The loan was successfully granted";
		//String actual=driver.findElement(By.xpath("//td[@align='center']")).getText();
		String actual=d.getText();
		Assert.assertEquals(expected,actual);
		d.accept();
	}
	public void view(){
		this.view.click();
	}
	public void view1(){
		this.view1.click();
	}
	public void men(){
		this.men.click();
	}
	public void men1(){
		this.men1.click();
	}
	public void alertHandle2(){
		Alert d=driver.switchTo().alert();
		String expected="Please confirm to logout";
		//String actual=driver.findElement(By.xpath("//td[@align='center']")).getText();
		String actual=d.getText();
		Assert.assertEquals(expected,actual);
		d.accept();
	}
	
	
}
