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

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.AdminLoginPOM;
import com.training.pom.AddAdvterPOM;
import com.training.pom.HomePOM;
import com.training.pom.MemberLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CatgAdvTests {

	private WebDriver driver;
	private String baseUrl;
	private AdminLoginPOM adminloginPOM;
	private AddAdvterPOM addadvterPOM;
	private HomePOM homePOM;
	private MemberLoginPOM memberLoginPOM;
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
		adminloginPOM = new AdminLoginPOM(driver); 
		addadvterPOM = new AddAdvterPOM(driver);
		homePOM = new HomePOM(driver);
		memberLoginPOM = new MemberLoginPOM(driver);
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
	public void validLoginTest(String sendMembername,String sendTitle,int sendPrice,String sendUserName) throws InterruptedException{
		adminloginPOM.sendUserName("admin");
		adminloginPOM.password1();
		adminloginPOM.password2();
		adminloginPOM.password3();
		adminloginPOM.password4();
		adminloginPOM.clickLoginBtn(); 
		
		addadvterPOM.clickAdv();
		addadvterPOM.clickCaty();
		addadvterPOM.insertCaty();
		addadvterPOM.catyName();
		addadvterPOM.clickSubBtn1();
		addadvterPOM.alertHandle1();
		addadvterPOM.clickSubBtn2();
		addadvterPOM.alertHandle2();
		
		homePOM.clickHome();
		homePOM.sendMembername("anil");
		homePOM.executorScroll();
		homePOM.insertAdvert();
		homePOM.sendTitle("anil");
		homePOM.selCaty();
		homePOM.selAdCaty();
		homePOM.sendPrice("7");
		homePOM.clickCheckBox();
		homePOM.iframe();
		homePOM.clickSubBtn2();
		homePOM.alertHandle3();
		homePOM.backBtn();
		homePOM.logoutBtn();
		homePOM.alertHandle4();
		
		memberLoginPOM.sendUserName("anil");
		memberLoginPOM.password1();
		memberLoginPOM.password2();
		memberLoginPOM.password3();
		memberLoginPOM.password4();
		memberLoginPOM.clickLoginBtn(); 
		memberLoginPOM.personalBtn();
		memberLoginPOM.advertisementsBtn();
	}
}
