package com.clouddemo.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.clouddemo.pages.CloudDemoHelpCenterAdminPage;
import com.clouddemo.pages.CloudDemoHomePage;
import com.clouddemo.pages.CloudDemoLoginPage;
import com.clouddemo.pages.CloudDemoSupportTicketUserPage;

public class CloudDemoSupportTicketUserTest extends CloudDemoTestHelper{
	CloudDemoLoginPage clouddemologinpage;
	CloudDemoHomePage clouddemohomepage;
	CloudDemoSupportTicketUserPage clouddemosupportticketuserpage;
	CloudDemoHelpCenterAdminPage clouddemocreateticketadminpage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}
	 //User Side
//	@Test(priority=0)                                                                                       
	public void verifyCreatingNewTicket() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("sreelakshmi@bpract.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickUserHelpCenterBtn();
		clouddemohomepage.clickSupportTicketBtn();
		clouddemosupportticketuserpage = new CloudDemoSupportTicketUserPage(driver);
		Assert.assertTrue(clouddemosupportticketuserpage.getSupportTicketMsg().contains("Support Tickets"));
		Reporter.log("You are on Support Ticket Page", true);
		clouddemosupportticketuserpage.clickCreateTicketBtn();
		Assert.assertTrue(clouddemosupportticketuserpage.getCreateTicketMsg().contains("Create Ticket"));
		Reporter.log("Create Ticket Page", true);
		clouddemosupportticketuserpage.createNewTicket("HR", "normal", "bug", "Ticket subject1", "C:\\Users\\bpract\\Downloads\\normal1.pdf", "Desc");
		clouddemosupportticketuserpage.searchInUserTickets("Ticket subject1");
//		Assert.assertTrue(clouddemosupportticketuserpage.getSubjectFromTable().contains("Ticket subject"));
//		Reporter.log("Added Subject Found", true);
//		Assert.assertTrue(clouddemosupportticketuserpage.getPriorityFromTable().contains("normal"));
//		Reporter.log("Added priority Found", true);
//		Assert.assertTrue(clouddemosupportticketuserpage.getDepartmentFromTable().contains("HR"));
//		Reporter.log("Added department Found", true);
	}
	//User Side
//	@Test(priority=1)
	public void verifyValidationMsgOfTicket() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("sreelakshmi@bpract.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickUserHelpCenterBtn();
		clouddemohomepage.clickSupportTicketBtn();
		clouddemosupportticketuserpage = new CloudDemoSupportTicketUserPage(driver);
		Assert.assertTrue(clouddemosupportticketuserpage.getSupportTicketMsg().contains("Support Tickets"));
		Reporter.log("You are on Support Ticket Page", true);
		clouddemosupportticketuserpage.clickCreateTicketBtn();
		Assert.assertTrue(clouddemosupportticketuserpage.getCreateTicketMsg().contains("Create Ticket"));
		Reporter.log("Create Ticket Page", true);
//		clouddemosupportticketuserpage.clickSendRequestBtn();
		clouddemosupportticketuserpage.createNewTicket("IT", "low", "bug", "new sub", "C:\\\\Users\\\\bpract\\\\Downloads\\\\normal1.pdf", "");
//		Assert.assertTrue(clouddemosupportticketuserpage.getDepartValidationMsg().contains("Please Select a department"));
//		Reporter.log("Document validation msgs", true);
//		Assert.assertTrue(clouddemosupportticketuserpage.getPriorityValidationMsg().contains("Please Select a priority"));
//		Reporter.log("priority validation msgs", true);
//		Assert.assertTrue(clouddemosupportticketuserpage.getCategoryValidationMsg().contains("Please Select a category"));
//		Reporter.log("category validation msgs", true);
//		Assert.assertTrue(clouddemosupportticketuserpage.getSubjectValidationMsg().contains("Subject is required"));
//		Reporter.log("Subject validation msgs", true);
		Assert.assertTrue(clouddemosupportticketuserpage.getDescriptionValidationMsg().contains("Description Is Required"));
		Reporter.log("Description validation msgs", true);
	}
	
}
