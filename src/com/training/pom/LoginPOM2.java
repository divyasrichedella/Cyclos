package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath="//input[@value='5']")
	private WebElement password5;
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginButn;
	
	@FindBy(id="memberUsername")
	private WebElement memberTextbox;
	
	@FindBy(xpath="//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr[2]/td[2]/input")
 	private WebElement chngpermission;
	
	@FindBy(xpath="//select[@name='newGroupId']")
 	private WebElement newgroup;
	
    @FindBy(xpath="//textarea[@name='comments']")
    private WebElement comment;
	
    @FindBy(xpath="//input[@value='Submit']")
    private WebElement submit1;
	
    
    
     
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

	public void memberTextbox(String memberLogin ) {
		this.memberTextbox.sendKeys(memberLogin);
		
	}

	public void scrollDown() throws InterruptedException {
		JavascriptExecutor a=(JavascriptExecutor)driver;
		Thread.sleep(3000);  
		a.executeScript("window.scrollBy(0,700)");
	}
	public void ChngPerm() {
		this.chngpermission.click();
	}
	public void list() {
		this.newgroup.click();
		Select s = new Select(this.newgroup);
		s.selectByIndex(2);
	}
	
	
	public void Comment(String comments){
		this.comment.sendKeys(comments);
		
	}
	
	public void clickSubmit1(){
		this.submit1.click();
	}
	
	public void AlertHandleToConfirm()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

	
	

}
	
	
	


