package com.clouddemo.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.clouddemo.pages.CloudDemoHomePage;
import com.clouddemo.pages.CloudDemoLoginPage;

public class CloudDemoLoginTest extends CloudDemoTestHelper{
	CloudDemoLoginPage clouddemologinpage;
	CloudDemoHomePage clouddemohomepage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}
	
	@Test(priority=0)
	public void verifyValidLogin() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("sreelakshmi@bpract.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(clouddemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("Login Successfull", true);	
	}
	@Test(priority=1)
	public void verifyBlankEmailPasswordMsg() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("", "");
		Assert.assertTrue(clouddemologinpage.getEmailRequiredMsg().contains("Email is required"));
		Reporter.log("Email Required Msg displayed", true);
		Assert.assertTrue(clouddemologinpage.getPasswordRequiredMsg().contains("Password is required"));
		Reporter.log("Password Required Msg displayed", true);
		clouddemologinpage.clickRememberMeBox();
		clouddemologinpage.clickForgotPasswordBtn();
	}
	@Test(priority=2)
	public void verifyInvalidEmailAddress() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("fff@ggg.com", "12345678");
//		Assert.assertTrue(clouddemologinpage.getInvalidEmailAddress().contains("Email must be a valid email address"));
//		Reporter.log("Unable to login due to invalid email", true);
		Assert.assertTrue(clouddemologinpage.getWrongCredentialsMsg().contains("Wrong credentials!"));
		Reporter.log("Wrong email", true);
	}

}
