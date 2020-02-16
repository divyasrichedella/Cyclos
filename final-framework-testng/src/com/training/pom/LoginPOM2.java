package com.training.pom;

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
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn;
	
	@FindBy(id="memberUsername")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/input")
	private WebElement mangesubmitBtn;
	
	@FindBy(xpath="//input[@id='newButton']")
	private WebElement newButton;
	
	@FindBy(xpath="//input[@name='ad(title)']")
	private WebElement title;
	
	@FindBy(xpath="//select[@name='ad(category)']")
	private WebElement category;

	@FindBy(id="notExpirableCheck")
	private WebElement check;
	
	@FindBy(xpath="//input[@name='ad(price)']")
	private WebElement price;
	
	@FindBy(xpath="//input[@name='ad(publicationPeriod).begin']")
	private WebElement begin;
	
	@FindBy(xpath="//input[@name='ad(publicationPeriod).end']")
	private WebElement end;
	
	
	//@FindBy(xpath="//iframe[@title='Rich text editor, bodyText']")
	@FindBy(tagName="iframe")
	private WebElement body;

	/*@FindBy(xpath="//iframe[@title='Rich text editor, bodyText']")
	private WebElement body;
	*/
	
	/*@FindBy(xpath="//div[@id='container_descriptionText']")
	private WebElement body;*/
	
	@FindBy(id="saveButton")
	private WebElement button;
	

	@FindBy(id="backButton")
	private WebElement button1;
	
	@FindBy(xpath="//*[@id='menu15']/span[2]")
	private WebElement logout;
	
	
	
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
	
	public void sendmemberUsername(String username ) {
		this.username.clear();
		this.username.sendKeys(username); 
	}
	public void exe() throws InterruptedException{
	JavascriptExecutor a=(JavascriptExecutor)driver;
	Thread.sleep(3000);
	}
	public void mangesubmitBtn() {
		this.mangesubmitBtn.click(); 
	}
	public void newButton() {
		this.newButton.click(); 
	}
	public void sendtitle(String title) {
		this.title.clear(); 
		this.title.sendKeys(title); 
	}
	
	public void category(){
		this.category.click();
		Select sel=new Select(this.category);
		sel.selectByIndex(1);
		}
	
	
	
	
	
	public void sendprice(int price) {
		String str=Integer.toString(price);
		this.price.sendKeys(str); 
	}

	public void check() {
		this.check.click(); 
	}
	public void begin() {
		this.begin.click(); 
	}
	public void end() {
		this.end.click(); 
	}
	
	public void sendbody(String body){
		this.body.sendKeys(body); 
	}
	
	/*public void sendbody(String body){
		this.body.sendKeys(body); 
	}*/
	public void savebutton1() {
		this.button.click(); 
	}
	
	public void backbutton1() {
		this.button1.click(); 
	}
	
	public void logout() {
		this.logout.click(); 
	}
	
	
	
	
	
	
	
	
	
	

}
