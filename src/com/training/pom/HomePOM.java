package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	private WebDriver driver; 
	
	public HomePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@id='menu0']")
	private WebElement clickHome;
	public void clickHome() {
		this.clickHome.click();
	}

	@FindBy(id="memberUsername")
	private WebElement sendMembername;
	public void sendMembername(String membername) {
		this.sendMembername.sendKeys(membername);
	}
	
	public void executorScroll() throws InterruptedException {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,700)");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@linkurl='memberAds?memberId=15']")).click();
	}

	@FindBy(id="newButton")
	private WebElement insertAdvert;
	public void insertAdvert() {
		this.insertAdvert.click();
	}
	
	@FindBy(name="ad(title)")
	private WebElement sendTitle;
	public void sendTitle(String title) {
		this.sendTitle.sendKeys(title);
		
	}
	
	@FindBy(name="ad(category)")
	private WebElement selCaty;
	public void selCaty() {
		this.selCaty.click();
	}

	@FindBy(xpath="//td//select//option[@value='1']")
	private WebElement selAdCaty;
	public void selAdCaty() {
		this.selCaty.click();
	}
	
	@FindBy(name="ad(price)")
	private WebElement sendPrice;
	public void sendPrice(String price) {
		this.sendPrice.sendKeys(price);
	}
	
	@FindBy(id="notExpirableCheck")
	private WebElement clickCheckBox;
	public void clickCheckBox() {
		this.clickCheckBox.click();
		
	}

	public void iframe() {
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("iframe")).sendKeys("new offer");
	}
	
	
	@FindBy(id="saveButton")
	private WebElement clickSubBtn2;
	public void clickSubBtn2() {
		this.clickSubBtn2.click();
		
	}

	public void alertHandle3() {
		Alert alt3=driver.switchTo().alert();
		alt3.accept();
	}
	
	@FindBy(id="backButton")
	private WebElement backBtn;
	public void backBtn() {
		this.backBtn.click();
		
	}

	
	@FindBy(xpath="//li[@id='menu15']")
	private WebElement logoutBtn;
	public void logoutBtn() {
		this.logoutBtn.click();

		
	}

	public void alertHandle4() {
		Alert alt4=driver.switchTo().alert();
		alt4.accept();
		
	}
	
	

	
	
	
	

}
