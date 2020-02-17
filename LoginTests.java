package com.training.sanity.tests;

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

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
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
		loginPOM = new LoginPOM(driver); 
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
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		
		loginPOM.password1();
		loginPOM.password2();
		loginPOM.password3();
		loginPOM.password4();
		loginPOM.clickLoginBtn();
		Thread.sleep(3000);
		//loginPOM.clickLogoutBtn();
		//driver.findElement(By.id("memberUsername")).sendKeys("sree");
		loginPOM.membername("sree");
		Thread.sleep(3000);  
			      
	    
	    //driver.findElement(By.xpath("//input[@linkurl='grantLoan?memberId=12']")).click();
		loginPOM.grant();
		loginPOM.amount("4567");
		//driver.findElement(By.id("amount")).sendKeys("4567");
			//driver.findElement(By.id("description")).sendKeys("Home Loan");
		loginPOM.des("Home Loan");
		loginPOM.sub();
			//driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		loginPOM.sub1();
		loginPOM.alertHandle1();
			//driver.findElement(By.xpath("//input[@linkurl='searchLoans?memberId=12']")).click();
		loginPOM.view();
			//driver.findElement(By.id("menu15")).click();
		loginPOM.view1();
		loginPOM.alertHandle2();
			
			loginPOM.sendUserName("sree");
			
			loginPOM.password1();
			loginPOM.password2();
			loginPOM.password3();
			loginPOM.password4();
			loginPOM.clickLoginBtn();
			//driver.findElement(By.xpath("//li[@id='menu2']")).click();
			loginPOM.men();
			//driver.findElement(By.id("submenu2.3")).click();
			
			loginPOM.men1();

			


		

		//screenShot.captureScreenShot("First");
	}
}
