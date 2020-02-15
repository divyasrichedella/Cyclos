package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAdvterPOM {
	private WebDriver driver; 
		
		public AddAdvterPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//li[@id='menu6']")
		private WebElement clickAdv;
		
		@FindBy(xpath="//li[@id='submenu6.1']")
		private WebElement clickCaty;
		
		@FindBy(id="newButton")
		private WebElement insertCaty;
		
		@FindBy(name="category(name)")
		private WebElement catyName;
		
		@FindBy(id="saveButton")
		private WebElement clickSubBtn1;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement clickSubBtn2;
		
		public void clickAdv(){
			this.clickAdv.click();
		}

		public void clickCaty() {
			this.clickCaty.click();
			
		}

		public void insertCaty() {
			this.insertCaty.click();
			
		}

		public void catyName() {
			this.catyName.sendKeys("anil");
			
		}

		public void clickSubBtn1() {
			this.clickSubBtn1.click();
			
		}

		public void alertHandle1() {
			Alert alt1=driver.switchTo().alert();
			alt1.accept();
		}
		
		public void clickSubBtn2() {
			this.clickSubBtn2.click();
			
		}

		public void alertHandle2() {
			Alert alt2=driver.switchTo().alert();
			alt2.accept();
		}
		

	}

