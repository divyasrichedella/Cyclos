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
import com.training.pom.MediumPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumTest {

	private WebDriver driver;
	private String baseUrl;
	private MediumPOM mediumPOM;
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
		mediumPOM = new MediumPOM(driver); 
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
	public void validMediumTest() throws InterruptedException {
		mediumPOM.sendUserName("admin");
		mediumPOM.But1();
		mediumPOM.But2();
		mediumPOM.But3();
		mediumPOM.But4();
		mediumPOM.submit();
		mediumPOM.member1();
        Thread.sleep(3000);
        mediumPOM.grant1();  
        mediumPOM.loan1();
        mediumPOM.dep();
        mediumPOM.subm();
        mediumPOM.subm1();
       Alert ae=driver.switchTo().alert();
	   ae.accept();
	   mediumPOM.viewloan1();
	   mediumPOM.logout1();
       Alert a=driver.switchTo().alert();
       a.accept();
       mediumPOM.sendUserName("pavan");
		mediumPOM.But11();
		mediumPOM.But21();
		mediumPOM.But31();
		mediumPOM.But41();
	

		mediumPOM.submit1();
		
		mediumPOM.accountLink();
		mediumPOM.loansLink();
		mediumPOM.viewIcon();
		mediumPOM.amountText();
		mediumPOM.repayBtn();
		//loginPOM.alertHandle();
		//loginPOM.alertHandle2();

		

	}
	
	
	
}
