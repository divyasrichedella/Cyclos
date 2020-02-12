package com.training.pom;

import org.openqa.selenium.Alert;
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
	
	
	@FindBy(xpath="//*[@id='menu1']//span[@class='menuText']")
	private WebElement personalBtn;
	
	
	@FindBy(xpath="//li[@id='submenu1.7']")
	private WebElement chpasswdBtn;
	
	
	@FindBy(xpath="//input[@name='oldPassword']")
	private WebElement oldPassword ;

	@FindBy(xpath="//input[@name='newPassword']")
	private WebElement newPassword ;

	@FindBy(xpath="//input[@name='newPasswordConfirmation']")
	private WebElement newPasswordConfirmation ;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submitbutn;
	


	
	public void sendUserName(String userName) {
		//this.userName.clear();
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
		public void personalBtn() {
			this.personalBtn.click(); 
		}
		public void chpasswdBtn() {
			this.chpasswdBtn.click(); 
		}
			
			public void oldPassword(String str) {
				this.oldPassword.sendKeys(str); 
				}
			public void newPassword(String str) {
				this.newPassword.sendKeys(str); 
			}
			public void newPasswordConfirmation(String str) {
				this.newPasswordConfirmation.sendKeys(str); 
			}
			
			public void submitbutton() {
				this.submitbutn.click(); 
			}
			public void AlertHandle() {
				Alert d=driver.switchTo().alert();
				d.accept();
			}

		}
	
	
	


