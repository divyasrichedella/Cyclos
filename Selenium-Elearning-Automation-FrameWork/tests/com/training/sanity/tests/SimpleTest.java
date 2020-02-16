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
import com.training.pom.SimplePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SimpleTest{

	private WebDriver driver;
	private String baseUrl;
	private SimplePOM simplePOM;
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
		simplePOM = new SimplePOM(driver); 
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
	public void validSimpleTest() {
		simplePOM.sendUserName("admin");
		simplePOM.Password1();
		simplePOM.Password2();
		simplePOM.Password3();
		simplePOM.Password4();
		simplePOM.clickLoginBtn(); 
		simplePOM.personalBtn();
		simplePOM.changepasswordbtn();
		simplePOM.sendoldPasswordtxt("1234");
		simplePOM.sendnewPasswordtxt("12345");
		simplePOM.sendnewPasswordConfirmation("654321");
		simplePOM.Submitbtn(); 
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}
