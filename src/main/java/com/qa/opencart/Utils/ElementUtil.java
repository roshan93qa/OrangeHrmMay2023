package com.qa.opencart.Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public void  dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public void doclick(By locator) {
		getElement(locator).click();
	}
//	public WebElement waitForElementVisible(By locator ,int timeout) {
//		WebDriverWait Wait =new WebDriverWait(driver,Duration.ofSeconds(timeout));
//		return Wait.until(ExpectedConditions.v);
//	}

}
