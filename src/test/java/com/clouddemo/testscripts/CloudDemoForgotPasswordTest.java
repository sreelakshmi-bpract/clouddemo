package com.clouddemo.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.clouddemo.pages.CloudDemoForgotPaswordPage;
import com.clouddemo.pages.CloudDemoLoginPage;

public class CloudDemoForgotPasswordTest extends CloudDemoTestHelper{
	
	CloudDemoLoginPage clouddemologinpage;
	CloudDemoForgotPaswordPage clouddemoforgotpaswordPage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}
	@Test
	public void verifyValidEmailAddress() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.clickForgotPasswordBtn();
		clouddemoforgotpaswordPage = new CloudDemoForgotPaswordPage(driver);
		clouddemoforgotpaswordPage.forgotPassword("namita@bpract.com");
		Assert.assertTrue(clouddemoforgotpaswordPage.getRequestMailMsg().contains("Request sent successfully"));
		Reporter.log("confirmation of forgot password msg", true);
		clouddemoforgotpaswordPage.clickBackBtn();
		clouddemologinpage = new CloudDemoLoginPage(driver);
		Assert.assertTrue(clouddemologinpage.getbackToLoginMsg().contains("Hi, Welcome Back"));
		Reporter.log("Redirected to Login Page", true);
	}

}
