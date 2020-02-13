package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests1 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM1 loginPOM;
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
		loginPOM = new LoginPOM1(driver); 
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
	public void validLoginTest() {
		loginPOM.sendUserName("admin");
		loginPOM.Password1();
		loginPOM.Password2();
		loginPOM.Password3();
		loginPOM.Password4();
		loginPOM.clickLoginBtn(); 
		loginPOM.personalBtn();
		loginPOM.changepasswordbtn();
		loginPOM.sendoldPasswordtxt("maha123");
		loginPOM.sendnewPasswordtxt("maha@123");
		loginPOM.sendnewPasswordConfirmation("maha@123");
		loginPOM.Submitbtn(); 
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}
