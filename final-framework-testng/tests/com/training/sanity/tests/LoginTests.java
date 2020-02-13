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
	public void validLoginTest() throws InterruptedException{
		loginPOM.sendUserName("admin");
		loginPOM.But1();
		loginPOM.But2();
		loginPOM.But3();
		loginPOM.But4();
		loginPOM.submit();
		loginPOM.member1();
        Thread.sleep(3000);
       loginPOM.grant1();  
       loginPOM.loan1();
       loginPOM.dep();
       loginPOM.subm();
       loginPOM.subm1();
       Alert ae=driver.switchTo().alert();
	   ae.accept();
       loginPOM.viewloan1();
       loginPOM.logout1();
       Alert a=driver.switchTo().alert();
       a.accept();
		loginPOM.sendUserName("pavan");
		loginPOM.But11();
		loginPOM.But21();
		loginPOM.But31();
		loginPOM.But41();
        loginPOM.submit1();
		
		loginPOM.accountLink();
		loginPOM.loansLink();
		loginPOM.viewIcon();
		loginPOM.amountText();
		loginPOM.repayBtn();
		
		screenShot.captureScreenShot("First");
	}
}
