package com.qa.opencart.tests;
import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class AccountPageTest extends BaseTest {
	
	@BeforeClass
	public void accPageSetup() {
		accPage=loginPage.doLogin("roshangiri@gmail.com", "Test@123");
	}
	@Test
	public void accountPageTitleTest() {
		String actualTitle=accPage.getAccountPageTitle();
		Assert.assertEquals(actualTitle, "My Account");
		
		
	}
	@Test
	public void accountpageUrlTest() {
		String actUrl=accPage.getAccountPageUrl();
		Assert.assertTrue(actUrl.contains("route=account/account"));
		
		
	}
	@Test
	public void isLogoutPageExistTest() {
		Assert.assertTrue(accPage.islogoutLinkExist());
	}
	@Test
	public void isAccountLinkExistTest() {
		Assert.assertTrue(accPage.isMyAccountLinkExist());
	}
	@Test
	public void isMyOrderLinkTest() {
		Assert.assertTrue(accPage.isMyOrderLinkExist());
	}
	

}
