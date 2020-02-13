package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
/*admin*/	
	
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	//@FindBy(id="cyclosPassword")
	//private WebElement password; 
	
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
	
	@FindBy(xpath="//*[@id='menu8']/span[2]")
	private WebElement messagesBtn;
	
	@FindBy(xpath="//*[@id='submenu8.0']/span[2]")
	private WebElement messages1Btn;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn1;
	
	@FindBy(id="memberUsername")
	private WebElement username; 
	
	
	@FindBy(id="memberName")
	private WebElement name; 
	
	@FindBy(id="subjectText")
	private WebElement Text;
	
	@FindBy(xpath="//iframe[@title='Rich text editor, bodyText']")
	private WebElement body;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn2;
	
	@FindBy(xpath="//*[@id='menu15']/span[2]")
	private WebElement logoutBtn2;
	
/*member*/	
	@FindBy(id="cyclosUsername")
	private WebElement userName1; 
	
	//@FindBy(id="cyclosPassword")
	//private WebElement password; 
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement passwordd1;
	
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement passwordd2;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement passwordd3;
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement passwordd4;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn11;
	
	@FindBy(xpath="//*[@id='menu1']/span[2]")
	private WebElement personalBtn;
	
	@FindBy(linkText="Messages")
	private WebElement msgBtn;
	
	@FindBy(xpath="//a[@class='messageDetails']")
	private WebElement msgdetails;
	
	@FindBy(id="backButton")
	private WebElement back;
	
	@FindBy(xpath="//*[@id='menu6']/span[2]")
	private WebElement logoutt;
	
	
/*calling methods for admin*/	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void Password1() {
		this.password1.click(); 
		 }
	public void Password2() {
		this.password2.click(); 
		 }
	public void Password3() {
		this.password3.click(); 
		 }
	public void Password4() {
		this.password4.click(); 
		 }
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void messagesBtn() {
		this.messagesBtn.click(); 
	}
	
	public void messages1Btn() {
		this.messages1Btn.click(); 
	}
	
	public void loginBtn1() {
		this.loginBtn1.click(); 
	}
	
	public void sendusername(String username){
		this.username.sendKeys(username); 
	}
	
	public void sendname(String name){
		this.name.sendKeys(name); 
	}
	public void sendText(String Text){
		this.Text.sendKeys(Text); 
	}
	
	public void sendbody(String body){
		this.body.sendKeys(body); 
	}
	
	
    public void loginBtn2() {
	this.loginBtn2.click(); 
		}
    public void logoutBtn2() {
    	this.logoutBtn2.click(); 
    		}
    
 /*calling methods for member*/
    public void sendUserName1(String userName1) {
		this.userName1.clear();
		this.userName1.sendKeys(userName1);
	}
	
	public void Passwordd1() {
		this.passwordd1.click(); 
		 }
	public void Passwordd2() {
		this.passwordd2.click(); 
		 }
	public void Passwordd3() {
		this.passwordd3.click(); 
		 }
	public void Passwordd4() {
		this.passwordd4.click(); 
		 }
	public void clickLoginBtn11() {
		this.loginBtn11.click(); 
	}
	
	public void personalBtn() {
		this.personalBtn.click(); 
	}
	
	public void msgBtn() {
		this.msgBtn.click(); 
	}
	
	public void msgdetails() {
		this.msgdetails.click(); 
	}
	public void back() {
		this.back.click(); 
	}
	public void logoutt() {
		this.logoutt.click(); 
	}
    
    
}
	
	
