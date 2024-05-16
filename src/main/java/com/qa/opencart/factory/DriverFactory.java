package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initDriver(Properties prop) {
		
		String browsername=prop.getProperty("browser").toLowerCase().trim();
		System.out.println("browser name is :"+browsername);
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Plz pass the right browser"+browsername);
		}
		
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.get(prop.getProperty("url"));
	    return driver;
		
		
	}
	public Properties initprop() {
		prop=new Properties();
		try {
			FileInputStream ip= new FileInputStream("C:\\Users\\rosha\\eclipse-workspace\\HybridFramework\\src\\test\\resources\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
