package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.factory.DriverFactory;





public class BaseTest {
	DriverFactory df;
	WebDriver driver;
	Properties prop;
	
	public LoginPage loginPage;
	protected AccountsPage accPage;
	
	
	    @BeforeTest
		public void setup() {
		df=new DriverFactory();
		prop=df.initprop();
		driver=df.initDriver(prop);
	    loginPage=new LoginPage(driver);
			
	}
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
