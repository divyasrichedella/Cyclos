package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOM2;
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
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(dataProvider="db-inputs",dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String Member_Login,String Title_textbox,String Price,String Description) throws InterruptedException, AWTException {
		loginPOM2.sendUserName("admin");
		
		loginPOM2.password1();
		loginPOM2.password2();
		loginPOM2.password3();
		loginPOM2.password4();
		loginPOM2.clickLoginBtn();
		Thread.sleep(3000);
		
		loginPOM2.membername(Member_Login);
		Thread.sleep(3000);  
			      
		loginPOM2.exe();
		loginPOM2.clickMansubbtn();
		loginPOM2.clicknewButton();
		loginPOM2.title(Title_textbox);
		loginPOM2.clickCategory();
		  Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        loginPOM2.sendUnits(Price);
        loginPOM2.clicknotExpirableCheck();
        driver.switchTo().parentFrame();
        loginPOM2.sendbody(Description);
       loginPOM2.clicksaveButton();
        Alert d=driver.switchTo().alert();
		d.accept();
        loginPOM2.clickbackButton();

		

	}
}
