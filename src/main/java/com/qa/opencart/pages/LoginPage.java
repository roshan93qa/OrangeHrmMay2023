package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.Utils.ElementUtil;

public class LoginPage {
	  
     private WebDriver driver;
     private ElementUtil eleUtil;
	
	  
	//1.private By locator
		private By emailId =By.xpath("//input[@name=\"email\"]");
		private By password =By.xpath("//input[@name=\"password\"]");
		private By loginbtn =By.xpath("//input[@value=\"Login\"]");
		private By forgotpwdlink =By.xpath("(//a[text()='Forgotten Password'])[1]");
		
	    
	//page constructor
		public LoginPage(WebDriver driver) {
	    	   this.driver=driver;
	    	   eleUtil=new ElementUtil(driver);
	    }
		
	//page method //page Action Behaviour of the specific page 
		
	  public String getLoginPageTitle() {	
		 String title = driver.getTitle();
		 System.out.println("Login page title is :" + title);
		 return title;
		  
	  }
	  public String getLoginPagrURL() {	
			 String URL = driver.getCurrentUrl();
			 System.out.println("Login page  is URL :" + URL);
			 return URL;
			  
		  }
			
	  public boolean isForgotPwdLinkExist() {
		   return driver.findElement(forgotpwdlink).isDisplayed();
			 }	
	  
	  public AccountsPage doLogin(String un , String pwd) {
		  eleUtil.dosendkeys(emailId, "roshangiri@gmail.com");
		  eleUtil.dosendkeys(password, "Test@123");
		  eleUtil.doclick(loginbtn);
		  return new AccountsPage(driver);
	  }
}
     
       
