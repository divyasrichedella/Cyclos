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
import com.training.pom.AccountPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
public class AccountTests {
 
	private WebDriver driver;
	private String baseUrl;
	private AccountPOM accountPOM;
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
		accountPOM = new AccountPOM(driver); 
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
		accountPOM.sendUserName("anil");
		accountPOM.password1();
		accountPOM.password2();
		accountPOM.password3();
		accountPOM.password4();
		accountPOM.clickLoginBtn(); 
		
		accountPOM.accountLink();
		accountPOM.loansLink();
		accountPOM.viewIcon();
		accountPOM.amountText();
		accountPOM.repayBtn();
		accountPOM.alertHandle();
		accountPOM.assertHandle();
		accountPOM.accoountInfo();
	

}
}