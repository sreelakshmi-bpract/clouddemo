package com.clouddemo.testscripts;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.clouddemo.pages.CloudDemoBlogsPage;
import com.clouddemo.pages.CloudDemoHomePage;
import com.clouddemo.pages.CloudDemoLoginPage;

public class CloudDemoBlogsTest extends CloudDemoTestHelper{
	
	CloudDemoLoginPage clouddemologinpage;
	CloudDemoHomePage cloudemohomepage;
	CloudDemoBlogsPage clouddemoblogs;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}
	
//	@Test(priority=0)
	public void verifyCreateNewBlog() throws InterruptedException, AWTException {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		cloudemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(cloudemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("You are on Dashbpard", true);
		cloudemohomepage.clickCommunicationBtn();
		cloudemohomepage.clickBlogsBtn();
		clouddemoblogs = new CloudDemoBlogsPage(driver);
		Assert.assertTrue(clouddemoblogs.getBlogsPageMsg().contains("Blogs"));
		Reporter.log("You are on Blogs Page", true);
		clouddemoblogs.clickCreatePost();
		Assert.assertTrue(clouddemoblogs.getAddBlogsPageMsg().contains("Add Blog"));
		Reporter.log("You are on Add Blogs Page", true);
//		clouddemoblogs.createPrivatePost("Blog new latest", "sponsor", "jeep", "Blog Meta Keywords", "Blog Meta Description", "Blog Description", "Blog Short Description", "C:\\Users\\bpract\\Downloads\\normal1.pdf", "C:\\Users\\bpract\\Downloads\\img12.png");
		clouddemoblogs.createPublicPost("Blog one", "sponsor", "Blog Meta Keywords", "Blog Meta Description", "Blog Description", "Blog Short Description", "C:\\Users\\bpract\\Downloads\\normal1.pdf", "C:\\Users\\bpract\\Downloads\\img12.png");
		clouddemoblogs.searchForBlogsTable("Blog one");
	}
//	@Test(priority=1)
	public void verifyCreateNewDraftBlog() throws InterruptedException, AWTException {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		cloudemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(cloudemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("You are on Dashbpard", true);
		cloudemohomepage.clickCommunicationBtn();
		cloudemohomepage.clickBlogsBtn();
		clouddemoblogs = new CloudDemoBlogsPage(driver);
		Assert.assertTrue(clouddemoblogs.getBlogsPageMsg().contains("Blogs"));
		Reporter.log("You are on Blogs Page", true);
		clouddemoblogs.clickCreatePost();
		Assert.assertTrue(clouddemoblogs.getAddBlogsPageMsg().contains("Add Blog"));
		Reporter.log("You are on Add Blogs Page", true);
		clouddemoblogs.createPrivatePost("New Draft latest", "sponsor", "jeep", "Blog Meta Keywords", "Blog Meta Description", "Blog Description", "Blog Short Description", "C:\\Users\\bpract\\Downloads\\normal2.pdf", "C:\\Users\\bpract\\Downloads\\img1.png");
//		clouddemoblogs.createPublicPost("New Draft latest", "sponsor", "Blog Meta Keywords", "Blog Meta Description", "Blog Description", "Blog Short Description", "C:\\Users\\bpract\\Downloads\\normal2.pdf", "C:\\Users\\bpract\\Downloads\\img1.png");
		clouddemoblogs.clickBlogsDraftBtn();
		clouddemoblogs.searchForDraftBlogsTable("New Draft latest");
		
	}
	@Test(priority=2)
	public void verifyAddCategory() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		cloudemohomepage = new CloudDemoHomePage(driver);
		Assert.assertTrue(cloudemohomepage.getDashboardMsg().contains("Dashboard"));
		Reporter.log("You are on Dashbpard", true);
		cloudemohomepage.clickCommunicationBtn();
		cloudemohomepage.clickBlogsBtn();
		clouddemoblogs = new CloudDemoBlogsPage(driver);
		Assert.assertTrue(clouddemoblogs.getBlogsPageMsg().contains("Blogs"));
		Reporter.log("You are on Blogs Page", true);
		clouddemoblogs.clickblogCategoryBtn();
		Assert.assertTrue(clouddemoblogs.getBlogCategoryPageMsg().contains("Blog Category"));
		Reporter.log("You are on Blog Category Page", true);
		clouddemoblogs.clickaddBlogCategoryBtn();
		Assert.assertTrue(clouddemoblogs.getaddBlogCategoryPageMsg().contains("Category"));
		Reporter.log("You are on Add Blog Category Page");	
		clouddemoblogs.enterNewBlogCate("Aug 25th category", "publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available");
		clouddemoblogs.searchInBlogCategoryTable("Aug 25th category");
	}
}
