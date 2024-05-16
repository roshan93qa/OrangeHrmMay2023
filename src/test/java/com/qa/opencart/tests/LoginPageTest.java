package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void LoginPageTitleTest() {
		String actualTitle=loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, "Account Login");
	}
	@Test
	public void LoginPageUrlTest() {
		String actualUrl=loginPage.getLoginPagrURL();
		Assert.assertTrue(actualUrl.contains("route=account/login"));
	}
	@Test
	public void ForgotPwdlinkExistTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}
	@Test
	public void loginTest() {
		accPage=loginPage.doLogin("roshangiri@gmail.com", "Test@123");
		Assert.assertTrue(accPage.islogoutLinkExist());
		
	}

}
