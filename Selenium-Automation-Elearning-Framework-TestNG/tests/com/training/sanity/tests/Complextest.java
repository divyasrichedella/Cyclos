package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ComplexPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Complextest {

	private WebDriver driver;
	private String baseUrl;
	private ComplexPOM complexPOM;
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
		complexPOM = new ComplexPOM(driver); 
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
	@Test(dataProvider="cyclos",dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String Member_Login,String Amount,String Transaction_Type,String Description) throws InterruptedException {
		complexPOM.sendUserName("admin");
		complexPOM.sendUserPassword();
		complexPOM.bttn1();
		complexPOM.bttn2();
		complexPOM.bttn3();
		complexPOM.bttn4();
		complexPOM.clicksubmitbtn();
		 Thread.sleep(3000);
		 complexPOM.memberUsername(Member_Login);
		 complexPOM.Account();
		 complexPOM.SystemPayment();
		 complexPOM.Amount(Amount);
		 complexPOM.Transaction(Transaction_Type);
		 WebElement a=driver.findElement(By.id("type"));
		 Select sel=new Select(a);
		 sel.selectByValue("1");
		 complexPOM.Description(Description);
		 Thread.sleep(3000);
		 complexPOM.Submit();
		 Thread.sleep(2000);
		 complexPOM.FinalSubmit();
		
		
		
		
	}
}
