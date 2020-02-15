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

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM2;
//import com.training.pom.VerifyAdvPOM1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests2 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM2 loginPOM2;
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
		loginPOM2 = new LoginPOM2(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		driver.quit();
	}
	@Test(dataProvider="db-inputs",dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String memberLogin,String comments) throws InterruptedException  {
		loginPOM2.sendUserName("admin");
		loginPOM2.password1();
		loginPOM2.password2();
		loginPOM2.password3();
		loginPOM2.password4();
		loginPOM2.password5();
		loginPOM2.clickLoginBtn(); 
		loginPOM2.memberTextbox(memberLogin);
		loginPOM2.scrollDown();
		loginPOM2.ChngPerm();
		loginPOM2.list();
		loginPOM2.Comment(comments);
		loginPOM2.clickSubmit1();
		loginPOM2.AlertHandleToConfirm();
		
		
	
		//screenShot.captureScreenShot("First");
		
		
		
	}
}
