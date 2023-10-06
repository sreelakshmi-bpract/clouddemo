package com.clouddemo.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.clouddemo.pages.CloudDemoHomePage;
import com.clouddemo.pages.CloudDemoLoginPage;
import com.clouddemo.pages.CloudDemoToolsPage;

public class CloudDemoToolsTest extends CloudDemoTestHelper{
	
	CloudDemoLoginPage clouddemologinpage;
	CloudDemoHomePage clouddemohomepage;
	CloudDemoToolsPage clouddemotoolspage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}
//	@Test(priority=0)
	public void verifyNewToolsDocument() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickToolsBtn();
		clouddemohomepage.clickDocumentsBtn();
		clouddemotoolspage = new CloudDemoToolsPage(driver);
		Assert.assertTrue(clouddemotoolspage.getDocumentPageMsg().contains("Documents"));
		Reporter.log("You are now on Tools Document Page", true);
		clouddemotoolspage.clickDocumentFileUpload();
		Assert.assertTrue(clouddemotoolspage.getAddDocumentMsg().contains("Add Document"));
		Reporter.log("You are now on Tools Document Add Page", true);
		clouddemotoolspage.enterNewDocumentDetails("Testing29", "29", "C:\\Users\\bpract\\Downloads\\normal1.pdf");
//		clouddemotoolspage.searchInDocTable("Testing28");
	}
	@Test(priority=1)
	public void verifyToolsDocumentCreated() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickToolsBtn();
		clouddemohomepage.clickDocumentsBtn();
		clouddemotoolspage = new CloudDemoToolsPage(driver);
		Assert.assertTrue(clouddemotoolspage.getDocumentPageMsg().contains("Documents"));
		Reporter.log("You are now on Tools Document Page", true);
		clouddemotoolspage.searchInDocTable("Test");
	}
//	@Test(priority=2)
	public void verifyNewToolsVideos() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickToolsBtn();
		clouddemohomepage.clicktoolsVideoBtn();
		clouddemotoolspage = new CloudDemoToolsPage(driver);
		Assert.assertTrue(clouddemotoolspage.getToolsVideosMsg().contains("Videos"));
		Reporter.log("Your are on Tools Video Page", true);
		clouddemotoolspage.clickAddVideoBtn();
		Assert.assertTrue(clouddemotoolspage.getAddVideoMsg().contains("Add Video"));
		Reporter.log("You are on Tools Video Pop up", true);
		clouddemotoolspage.enterNewVideoDetails("Test Video", "https://vimeo.com/261731935");
		Assert.assertTrue(clouddemotoolspage.getToolsVideosMsg().contains("Videos"));
		Reporter.log("Redirected to videos page after creation", true);
	}
	
	
	

}
