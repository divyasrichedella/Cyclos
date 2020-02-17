package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM2 {
	private WebDriver driver; 
	
	public LoginPOM2(WebDriver driver) {
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
	@FindBy(xpath="//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/input")
	private WebElement Mansubbtn;

	@FindBy(id="newButton")
	private WebElement newButton;
	@FindBy(name="ad(title)")
	private WebElement title;

	@FindBy(name="ad(category)")
	private WebElement Category;

	@FindBy(xpath="//input[@name='ad(price)']")
	private WebElement Units;

	@FindBy(id="notExpirableCheck")
	private WebElement notExpirableCheck;
	
	
	@FindBy(tagName="iframe")
	private WebElement body;

	@FindBy(id="saveButton")
	private WebElement saveButton;

	@FindBy(id="backButton")
	private WebElement backButton;



	
	
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

	   // a.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		a.executeScript("window.scrollBy(0,700)");
	    Thread.sleep(3000);

	}
	
	public void clickMansubbtn() {
		this.Mansubbtn.click();
	}
	
	public void clicknewButton() {
		this.newButton.click();
	}
	public void title(String title) {
		this.title.clear();
		this.title.sendKeys(title);
	}
	
	public void clickCategory(){
		this.Category.click();
	}
	
	public void sendUnits(String Units) {
		this.Units.clear();
		this.Units.sendKeys(Units);
	}
	
	public void clicknotExpirableCheck() {
		this.notExpirableCheck.click();
	}
	
	public void sendbody(String body){
		this.body.sendKeys(body);
	}
	public  void clicksaveButton() {
		this.saveButton.click();
	}
	
	public void clickbackButton() {
		this.backButton.click();
	}
	
	
		
}
