package com.training.sanity.tests;

import java.io.FileInputStream;
//import java.io.FileInputStream;
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
import com.training.pom.LoginPOM1;
//import com.training.pom.VerifyAdvPOM1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests1 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM1 loginPOM1;
	//private VerifyAdvPOM1 verifyPOM;
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
		loginPOM1 = new LoginPOM1(driver); 
		  //verifyPOM =new VerifyAdvPOM1(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority=1)
	public void validLoginTest() throws InterruptedException {
		loginPOM1.sendUserName("admin");
		loginPOM1.password1();
		loginPOM1.password2();
		loginPOM1.password3();
		loginPOM1.password4();
		loginPOM1.password5();
		loginPOM1.clickLoginBtn(); 
		loginPOM1.memberTextbox();
		loginPOM1.scrollDown();
		loginPOM1.manageAdv();
		loginPOM1.Remove();
		loginPOM1.AlertHandleForRemove();
		loginPOM1.AlertHandleToConfirm();
		loginPOM1.logoutBtn();
		loginPOM1.AlertHandleToLogout();
	  
		
	
		loginPOM1.sendUserName("aman");
		loginPOM1.password1();
		loginPOM1.password2();
		loginPOM1.password3();
		loginPOM1.password4();
		loginPOM1.clickLoginBtn();
		loginPOM1.personalBtn();
		loginPOM1.advertisementBtn();
		//verifyPOM.close();
		screenShot.captureScreenShot("First");

		
		
	}
}
