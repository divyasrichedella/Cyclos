package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
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
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM2 = new LoginPOM2(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);

	}

	
	/*public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM2 = new LoginPOM2(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}*/
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test(dataProvider="db-inputs", dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String Member_Login,String Title_textbox,int Price,String Description) throws InterruptedException, AWTException   {
		loginPOM2.sendUserName("admin");
		loginPOM2.Password1();
		loginPOM2.Password2();
		loginPOM2.Password3();
		loginPOM2.Password4();
		loginPOM2.clickLoginBtn(); 
		loginPOM2.sendmemberUsername(Member_Login);
		loginPOM2.mangesubmitBtn();
		loginPOM2.newButton();
		loginPOM2.sendtitle(Title_textbox);
		loginPOM2.category();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		loginPOM2.sendprice(Price);
		loginPOM2.check();
		loginPOM2.begin();
		loginPOM2.end();
		driver.switchTo().parentFrame();
		loginPOM2.sendbody(Description);
		loginPOM2. savebutton1();
		Alert b1=driver.switchTo().alert();
		b1.accept();
		loginPOM2.backbutton1();
		loginPOM2.logout();
		Alert b=driver.switchTo().alert();
		b.accept();
		
		//screenShot.captureScreenShot("First");
	}
	
	

	
}
