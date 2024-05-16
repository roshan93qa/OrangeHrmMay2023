package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AccountsPage {
	WebDriver driver;
	
	 private By logoutLink=By.linkText("Logout");
	 private By myaccountlink=By.xpath("//h2[text()='My Account']");
	 private By myorderlink =By.xpath("//h2[text()='My Orders']");
	
	public AccountsPage(WebDriver driver) {
 	   this.driver=driver;
 }
	
	public String getAccountPageTitle() {
		String Title=driver.getTitle();
		System.out.println("This is get account Title page"+Title);
		return Title;
	}
	
	public String getAccountPageUrl() {
		String url=driver.getCurrentUrl();
		System.out.println("This is get current page url "+url);
		return url;
	}
	public boolean  islogoutLinkExist() {
		 return driver.findElement(logoutLink).isDisplayed();
		
	}
	public boolean  isMyAccountLinkExist () {
		 return driver.findElement(myaccountlink).isDisplayed();
		
	}
	public boolean isMyOrderLinkExist() {
		 return driver.findElement(myorderlink).isDisplayed();
		
	}
	
	
	
	
	
	
}
