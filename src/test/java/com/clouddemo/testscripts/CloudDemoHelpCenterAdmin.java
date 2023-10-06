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

public class CloudDemoHelpCenterAdmin extends CloudDemoTestHelper{
	
	CloudDemoLoginPage clouddemologinpage;
	CloudDemoHomePage clouddemohomepage;
	CloudDemoSupportTicketUserPage clouddemosupportticketuserpage;
	CloudDemoHelpCenterAdminPage clouddemohelpcenteradminpage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}
	
 //Admin Side 
	
//	@Test(priority=0)                                                                                     
	public void verifyCreateTicketPageForBlankFields() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudLumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		Assert.assertTrue(clouddemohelpcenteradminpage.getHelpCenterMsg().contains("Help Center"));
		Reporter.log("You are on Help Center", true);
		clouddemosupportticketuserpage.clickCreateTicketBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getAdminCreateTicketMsg().contains("Create Ticket"));
		Reporter.log("You are on Admin's create ticket page", true);
		clouddemohelpcenteradminpage.clickAdminTicketAddBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getUserRequiredMsg().contains("User is required"));
		Reporter.log("Username validation msg", true);
		Assert.assertTrue(clouddemohelpcenteradminpage.getSubjectRequiredMsg().contains("Subject is required"));
		Reporter.log("Subject validation msg", true);
		Assert.assertTrue(clouddemohelpcenteradminpage.getDescriptionRequiredMsg().contains("Description Name Is Required"));
		Reporter.log("Description validation msg", true);
		Assert.assertTrue(clouddemohelpcenteradminpage.getPriorityRequiredMsg().contains("Priority is required"));
		Reporter.log("Priority validation msg", true);
		Assert.assertTrue(clouddemohelpcenteradminpage.getDepartmentRequiredMsg().contains("Department is required"));
		Reporter.log("Department validation msg", true);
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoryRequiredMsg().contains("Category is required"));
		Reporter.log("Category validation msg", true);
		Assert.assertTrue(clouddemohelpcenteradminpage.getStatusRequiredMsg().contains("Status is required"));
		Reporter.log("Status validation msg", true);
	}
//	@Test(priority=1)
	public void verifyCreateTicketByAdmin() throws InterruptedException {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudLumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		Assert.assertTrue(clouddemohelpcenteradminpage.getHelpCenterMsg().contains("Help Center"));
		Reporter.log("You are on Help Center", true);
		clouddemosupportticketuserpage.clickCreateTicketBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getAdminCreateTicketMsg().contains("Create Ticket"));
		Reporter.log("You are on Admin's create ticket page", true);
		clouddemohelpcenteradminpage.enterTicketDetailsAdmin("sree", "Admin Ticket Sub", "new ticket", "low", "HR", "bug", "Open", "C:\\Users\\bpract\\Downloads\\normal1.pdf");
	}
//	@Test(priority=2)
	public void verifyCreateNewPriority() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudLumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		Assert.assertTrue(clouddemohelpcenteradminpage.getHelpCenterMsg().contains("Help Center"));
		Reporter.log("You are on Help Center", true);
		clouddemohelpcenteradminpage.clickPriorityBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getPriorityMsg().contains("Priorities"));
		Reporter.log("You are on Priority Page", true);
		clouddemohelpcenteradminpage.clickAddPriorityBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getAddPriorityPageMsg().contains("Add Priority"));
		Reporter.log("You are now on Add Priority Page", true);
		clouddemohelpcenteradminpage.enterPriorityDetrails("Critical", "#f25c1c", "Important");
		Assert.assertTrue(clouddemohelpcenteradminpage.getPriorityMsg().contains("Priorities"));
		Reporter.log("Redirected to Priority Index", true);
	}
//	@Test(priority=3)
	public void verifyValidationMsgsOfPriority() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudLumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		Assert.assertTrue(clouddemohelpcenteradminpage.getHelpCenterMsg().contains("Help Center"));
		Reporter.log("You are on Help Center", true);
		clouddemohelpcenteradminpage.clickPriorityBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getPriorityMsg().contains("Priorities"));
		Reporter.log("You are on Priority Page", true);
		clouddemohelpcenteradminpage.clickAddPriorityBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getAddPriorityPageMsg().contains("Add Priority"));
		Reporter.log("You are now on Add Priority Page", true);
		clouddemohelpcenteradminpage.clickPrioritySubmitBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getPriorityNameFieldBlankMsg().contains("Name is required"));
		Assert.assertTrue(clouddemohelpcenteradminpage.getPrioritycColorBlankFieldMsg().contains("Color is required"));
		Assert.assertTrue(clouddemohelpcenteradminpage.getPriorityDescBlankFieldMsg().contains("Description is required"));
		Reporter.log("Dissplayed All Validation Msgs", true);
	}
//	@Test(priority=4)
	public void verifyNewCannedResponse() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		clouddemohelpcenteradminpage.clickCannedResponsesBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCannedResponsePageMsg().contains("Canned Response"));
		Reporter.log("You are on Canned Response Page", true);
		clouddemohelpcenteradminpage.clickAddCannedResponseBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getAddCannedResponsePageMsg().contains("Add Canned Response"));
		Reporter.log("You are on Canned Response Add Page", true);
		clouddemohelpcenteradminpage.enterCannedResponse("Canned Response Title", "Canned Response SubJect", "Canned Response Message");
	}
//	@Test(priority=5)
	public void verifyValidationMsgsOfCannedResponse() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		clouddemohelpcenteradminpage.clickCannedResponsesBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCannedResponsePageMsg().contains("Canned Response"));
		Reporter.log("You are on Canned Response Page", true);
		clouddemohelpcenteradminpage.clickAddCannedResponseBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getAddCannedResponsePageMsg().contains("Add Canned Response"));
		Reporter.log("You are on Canned Response Add Page", true);
		clouddemohelpcenteradminpage.clickCannedResponseSubmitBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCannedResponseTitleValidation().contains("Title Name is required"));
		Reporter.log("Title Validation Msg", true);
		Assert.assertTrue(clouddemohelpcenteradminpage.getCannedResponseSubjectValidation().contains("Subject is required"));
		Reporter.log("Subject Validation Msg", true);
		Assert.assertTrue(clouddemohelpcenteradminpage.getCannedResponseDescValidation().contains("Description Is Required"));
		Reporter.log("Description Validation Msg", true);
	}
//	@Test(priority=6)
	public void verifyCannedResponseCreated() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		clouddemohelpcenteradminpage.clickCannedResponsesBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCannedResponsePageMsg().contains("Canned Response"));
		Reporter.log("You are on Canned Response Page", true);
		clouddemohelpcenteradminpage.searchInCannedResponseTable("Canned Response Title");
	}
//	@Test(priority=7)
	public void verifyNewCategory() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver); 
		clouddemohelpcenteradminpage.clickCategoriesBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoriesPageMsg().contains("Category"));
		Reporter.log("You are on Category Page", true);
		clouddemohelpcenteradminpage.clickCategoryAddBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoryAddPageMsg().contains("Add Category"));
		Reporter.log("You are on Add Category Page", true);
		clouddemohelpcenteradminpage.category("New Category", "Category Description", "Yes");
	}
//	@Test(priority=8)
	public void verifyValidationMsgsOfCategory() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver); 
		clouddemohelpcenteradminpage.clickCategoriesBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoriesPageMsg().contains("Category"));
		Reporter.log("You are on Category Page", true);
		clouddemohelpcenteradminpage.clickCategoryAddBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoryAddPageMsg().contains("Add Category"));
		Reporter.log("You are on Add Category Page", true);
		clouddemohelpcenteradminpage.clickCateSubmitBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoryNameValidation().contains("Name is required"));
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoryDescValidation().contains("Description is required"));
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoryStatusValidation().contains("Status is required"));
		Reporter.log("Displayed all validation msg", true);
	}
//	@Test(priority=9)
	public void verifyNewCategoryCreated() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver); 
		clouddemohelpcenteradminpage.clickCategoriesBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getCategoriesPageMsg().contains("Category"));
		Reporter.log("You are on Category Page", true);
		clouddemohelpcenteradminpage.searchInCategoryTable("New Category");
	}
//	@Test(priority=10)
	public void verifyNewDepartment() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		clouddemohelpcenteradminpage.clickDepartmentBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getDepartmentPageMsg().contains("Department"));
		Reporter.log("You are on Department", true);
		clouddemohelpcenteradminpage.clickDepartmentAddBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getAddDepartmentPageMsg().contains("Add Department"));
		Reporter.log("You are on Add Department Page", true);
//		clouddemosupportticketuserpage.clickDepartmentCloseBtn();
		clouddemohelpcenteradminpage.departDetails("Aug Department", "New Aug Department Details", "Yes", "10");
		clouddemohelpcenteradminpage.searchInDepartmentTable("Aug Department");
	}
	@Test(priority=11)
	public void verifyValidationMsgsOfDepartment() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		clouddemohelpcenteradminpage.clickDepartmentBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getDepartmentPageMsg().contains("Department"));
		Reporter.log("You are on Department", true);
		clouddemohelpcenteradminpage.clickDepartmentAddBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getAddDepartmentPageMsg().contains("Add Department"));
		Reporter.log("You are on Add Department Page", true);
		clouddemohelpcenteradminpage.clickDepartmentSubmitBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getDepartmentNameValidation().contains("Department Name is required"));
		Assert.assertTrue(clouddemohelpcenteradminpage.getDepartmentDescValidation().contains("Department Description is required"));
		Assert.assertTrue(clouddemohelpcenteradminpage.getDepartmentStatusValidation().contains("Status is required"));
		Assert.assertTrue(clouddemohelpcenteradminpage.getDepartmentSortOrderValidfation().contains("Sort Order is required"));
		Reporter.log("Displayed All Validation Msg", true);
	}
//	@Test(priority=12)
	public void verifyDepartmentCreated() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickAdminHelpCenterBtn();
		clouddemohelpcenteradminpage = new CloudDemoHelpCenterAdminPage(driver);
		clouddemohelpcenteradminpage.clickDepartmentBtn();
		Assert.assertTrue(clouddemohelpcenteradminpage.getDepartmentPageMsg().contains("Department"));
		Reporter.log("You are on Department", true);
		clouddemohelpcenteradminpage.searchInDepartmentTable("Aug Departmnet");
	}

}
