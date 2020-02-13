package com.training.sanity.tests;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminloginPOM;
import com.training.pom.TransactionPOM;
import com.training.pom.AccinfoPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumTests {

	private WebDriver driver;
	private String baseUrl;
	private AdminloginPOM AdminloginPOM;
	private TransactionPOM TransactionPOM;
	private AccinfoPOM AccinfoPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		AdminloginPOM = new AdminloginPOM(driver);
		TransactionPOM = new TransactionPOM(driver); 
		AccinfoPOM = new AccinfoPOM(driver); 

		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);

	}



	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}

	@Test (priority=0)
	public void validLoginTest()   {
		AdminloginPOM.sendUserName("admin");
		AdminloginPOM.password1();
		AdminloginPOM.password2();
		AdminloginPOM.password3();
		AdminloginPOM.password4();
		AdminloginPOM.clickLoginBtn();
	}

	@Test (priority=1)
	public void transaction() throws InterruptedException {
		TransactionPOM.clickAccounts();
		TransactionPOM.clickMemberpayment();
		TransactionPOM.sendMemberuserName("sai");
		Thread.sleep(3000);
		TransactionPOM.sendAmount("1234");
		TransactionPOM.list();
		TransactionPOM.sendDescription("birth day gift");
		TransactionPOM.clickSubmit1();
		TransactionPOM.clickSubmit2();
		TransactionPOM.clickLogoutBtn();
		Alert d=driver.switchTo().alert();
		d.accept();
	}

	@Test (priority=2)
	public void validLoginTest1()   {
		AdminloginPOM.sendUserName("admin");
		AdminloginPOM.password1();
		AdminloginPOM.password2();
		AdminloginPOM.password3();
		AdminloginPOM.password4();
		AdminloginPOM.clickLoginBtn();

	}


	@Test (priority=3)
	public void accinfo()  {
		AccinfoPOM.sendMemberuser("sailaja");
		AccinfoPOM.clickAccinfo();
		//screenShot.captureScreenShot("First");       

		
	}
}
