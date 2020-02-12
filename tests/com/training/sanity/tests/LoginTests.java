package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("aman");
		loginPOM.password1();
		loginPOM.password2();
		loginPOM.password3();
		loginPOM.password4();
		//loginPOM.password5();
		loginPOM.clickLoginBtn(); 
		loginPOM.personalBtn();
		loginPOM.chpasswdBtn();
		loginPOM.oldPassword("1234");
		loginPOM.newPassword("12345");
		
		loginPOM.newPasswordConfirmation("123456");
		loginPOM.submitbutton();
		Thread.sleep(3000);
		loginPOM.AlertHandle();
	  /*	Actions act=new Actions(driver);
	  	WebElement personal=driver.findElement(By.xpath("//*[@id='menu1']//span[@class='menuText']"));
	  	Thread.sleep(2000);
	  	WebElement chpasswdBtn=driver.findElement(By.xpath("//li[@id='submenu1.7']"));
	  	act.moveToElement(personal).click().perform();
	  	act.moveToElement(chpasswdBtn).click().perform();
	  	
	  	driver.findElement(By.xpath("//input[@name='oldPassword']")).sendKeys("amank");
		driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='newPasswordConfirmation']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();*/
		//Thread.sleep(2000);
		//Alert a =driver.switchTo().alert();
		
		
		//loginPOM.alert();
		screenShot.captureScreenShot("First");
	}
}
