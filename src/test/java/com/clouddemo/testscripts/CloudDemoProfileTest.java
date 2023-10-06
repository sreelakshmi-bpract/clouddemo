package com.clouddemo.testscripts;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.clouddemo.pages.CloudDemoHomePage;
import com.clouddemo.pages.CloudDemoLoginPage;
import com.clouddemo.pages.CloudDemoProfilePage;

public class CloudDemoProfileTest extends CloudDemoTestHelper{
	
	CloudDemoLoginPage clouddemologinpage;
	CloudDemoHomePage clouddemohomepage;
	CloudDemoProfilePage clouddemoprofilepage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}

//	@Test
	public void verifyValidDatas() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("sreelakshmi@bpract.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(clouddemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("You are on Dashboard", true);
		clouddemohomepage.clickMyProfileBtn();
		clouddemoprofilepage = new CloudDemoProfilePage(driver);
		Assert.assertTrue(clouddemoprofilepage.getYourActivityHistoryMsg().contains("Your Activity History"));
		Reporter.log("your are on profile", true);
		clouddemoprofilepage.clickEditInfoBtn();
		Assert.assertTrue(clouddemoprofilepage.getSocialMediaScopeMsg().contains("Social Media Scope"));
		Reporter.log("You are on profile edit info");
		clouddemoprofilepage.editInfo("Sreelakshmi", "Dinesh", "female", "India", "Kerala", "Kannur", "670704", "bpract", "9074896602");
		clouddemoprofilepage.clickProfileBtn();		
		Assert.assertTrue(clouddemoprofilepage.getFullNameFromProfile().contains("Sreelakshmi Dinesh"));
		Assert.assertTrue(clouddemoprofilepage.getGenderFromProfile().contains("female"));
		Assert.assertTrue(clouddemoprofilepage.getCityFromProfile().contains("Kannur"));
		Assert.assertTrue(clouddemoprofilepage.getZipcodeFromProfile().contains("670704"));
		Assert.assertTrue(clouddemoprofilepage.getaddressFromProfile().contains("bpract"));
		Assert.assertTrue(clouddemoprofilepage.getMobileFromProfile().contains("9074896602"));
		Reporter.log("Updated details are correct", true);
	}
//	@Test
	public void verifyUpdatingNewPasword() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("sreelakshmi@bpract.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(clouddemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("You are on Dashboard", true);
		clouddemohomepage.clickMyProfileBtn();
		clouddemoprofilepage = new CloudDemoProfilePage(driver);
		clouddemoprofilepage.clickSettingsBtn();
		Assert.assertTrue(clouddemoprofilepage.getAccountSettingsMsg().contains("Account Settings"));
		Reporter.log("You are on Account Settings Page", true);
		clouddemoprofilepage.enterNewPasswordUpdation("12345678", "");
//		Assert.assertTrue(clouddemoprofilepage.getPasswordValidationMsg().contains("Password must be at least 8 characters"));
//		Reporter.log("Validation For Password", true);
		Assert.assertTrue(clouddemoprofilepage.getConfirmPasswordValidationMsg().contains("Passwords must match"));
		Reporter.log("Confirm Password validation msg", true);
	}
//	@Test
	public void verifyCoinAddress() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("sreelakshmi@bpract.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(clouddemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("You are on Dashboard", true);
		clouddemohomepage.clickMyProfileBtn();
		clouddemoprofilepage = new CloudDemoProfilePage(driver);				
		clouddemoprofilepage.clickSettingsBtn();
		Assert.assertTrue(clouddemoprofilepage.getChangeCoinAddressMsg().contains("Change Coin Address"));
		Reporter.log("Went to coin address form", true);
		clouddemoprofilepage.coinAddress("1Lbcfr7sAHTD9CgdQo3HTMTkV8LK4ZnX71", "1Lbcfr7sAHTD9CgdQo3HTMTkV8LK4ZnX71", "1Lbcfr7sAHTD9CgdQo3HTMTkV8LK4ZnX71", "1Lbcfr7sAHTD9CgdQo3HTMTkV8LK4ZnX71");
	}
	@Test
	public void verifyUploadProfileImageUser() throws AWTException, InterruptedException {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("sreelakshmi@bpract.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(clouddemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("You are on Dashboard", true);
		clouddemohomepage.clickMyProfileBtn();
		clouddemoprofilepage = new CloudDemoProfilePage(driver);
		Assert.assertTrue(clouddemoprofilepage.getYourActivityHistoryMsg().contains("Your Activity History"));
		Reporter.log("your are on profile", true);	
		clouddemoprofilepage.clickEditInfoBtn();
		Assert.assertTrue(clouddemoprofilepage.getSocialMediaScopeMsg().contains("Social Media Scope"));
		Reporter.log("You are on profile edit info");
		clouddemoprofilepage.clickUploadImg("C:\\Users\\bpract\\Downloads\\gif5.gif");
	}
	
	
}
