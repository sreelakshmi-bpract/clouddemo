package com.clouddemo.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.clouddemo.pages.CloudDemoHomePage;
import com.clouddemo.pages.CloudDemoLoginPage;
import com.clouddemo.pages.CloudDemoRegisterPage;

public class CloudDemoRegisterTest extends CloudDemoTestHelper{
	
	CloudDemoLoginPage clouddemologinPage;
	CloudDemoRegisterPage clouddemoregisterpage;
	CloudDemoHomePage clouddemohomepage;
	
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}
//	@Test
	public void verifyValidDatas() {
		clouddemologinPage = new CloudDemoLoginPage(driver);
		clouddemologinPage.clickGetStartedBtn();
		clouddemoregisterpage = new CloudDemoRegisterPage(driver);
		Assert.assertTrue(clouddemoregisterpage.getRegisterNewMemberMsg().contains("Register New Member"));
		Reporter.log("You are on Register Page", true);
		clouddemoregisterpage.register("sreelakshmi@bpract.com", "sree", "12345678", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(clouddemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("You are on Dashboard", true);
	}
	@Test
	public void verifyBlankFields() {
		clouddemologinPage = new CloudDemoLoginPage(driver);
		clouddemologinPage.clickGetStartedBtn();
		clouddemoregisterpage = new CloudDemoRegisterPage(driver);
		Assert.assertTrue(clouddemoregisterpage.getRegisterNewMemberMsg().contains("Register New Member"));
		Reporter.log("You are on Register Page", true);
		clouddemoregisterpage.register("sreelakshmi@bpract.com", "sree", "12345678", "123456");
//		Assert.assertTrue(clouddemoregisterpage.getEmailRequiredMsgs().contains("Email is required"));
//		Reporter.log("Failed to Register", true);
//		Assert.assertTrue(clouddemoregisterpage.getUsernameRequiredMsgs().contains("User Name is required"));
//		Reporter.log("Failed to login without username", true);
//		Assert.assertTrue(clouddemoregisterpage.getPasswordRequiredMsgs().contains("Password must be at least 8 characters"));
//		Reporter.log("Failed to login without password", true);
		Assert.assertTrue(clouddemoregisterpage.getPasswordMismatchMsg().contains("Password must match"));
		Reporter.log("Confirm Password Should Match", true);
	}
}
