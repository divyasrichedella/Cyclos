package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccinfoPOM {
	
private WebDriver driver; 
	
	public AccinfoPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="memberUsername")
	private WebElement memberlogin; 
	
	public void sendMemberuser(String memberuser) {
		this.memberlogin.clear();
		this.memberlogin.sendKeys(memberuser);
	}
	@FindBy(xpath="//input[@linkurl='accountOverview?memberId=10']")
	private WebElement accinfo; 


	public void clickAccinfo() {
		this.accinfo.click(); 
		String expected="birth day gift";
		String actual=driver.findElement(By.xpath("//*[@id='tdContents']/form/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")).getText();
		Assert.assertEquals(expected, actual);
	}

}
