package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.WaitUtility;

public class CloudDemoHomePage {
	WebDriver driver;
	
	@FindBy(xpath="//div[contains(text(),\"Dashboard\")]")
	WebElement dashboardmessage;
	@FindBy(xpath="//div[contains(text(),\"My Profile\")]")
	WebElement myProfileButton;
	@FindBy(xpath="//div[contains(text(),\"help Center\")]")
	WebElement UserHelpCenterButton;
	@FindBy(xpath="//div[contains(text(),\"Support Tickets\")]")
	WebElement supportTicketButton;
	@FindBy(xpath="//div[contains(text(),\"Communication\")]")
	WebElement communicationButton;
	@FindBy(xpath="//div[contains(text(),\"Help Center\")]")
	WebElement adminHelpCenterButton;
	@FindBy(xpath="//div[contains(text(), \"Tools\")]")
	WebElement toolsButton;
	@FindBy(xpath="//div[contains(text(), \"Documents\")]")
	WebElement toolsDocumentsButton;
	@FindBy(xpath="//div[contains(text(), \"Videos\")]")
	WebElement toolsVideosButton;
	@FindBy(xpath="//div[contains(text(), \"Articles\")]")
	WebElement articlesButton;
	@FindBy(xpath="//div[contains(text(), \"FAQ's\")]")
	WebElement faqsButton;
	@FindBy(xpath="//div[contains(text() , \"Blogs\")]")
	WebElement blogsButton;
	@FindBy(xpath="//div[contains(text(), \"Reports\")]")
	WebElement reportsButton;
	@FindBy(xpath="//div[contains(text(), \"Joining Report\")]")
	WebElement joiningReportButton;
	
	
	WaitUtility waitutility = new WaitUtility();
	
	public CloudDemoHomePage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getDashboardMsg() {
		waitutility.waitForAnElement(dashboardmessage, driver);
		String dashboardMessageText = dashboardmessage.getText();
		return dashboardMessageText;
	}
	public void clickMyProfileBtn() {
		myProfileButton.click();
	}
	public void clickUserHelpCenterBtn() {
		waitutility.waitForAnElement(UserHelpCenterButton, driver);
		UserHelpCenterButton.click();
	}
	public void clickSupportTicketBtn() {
		waitutility.waitForAnElement(supportTicketButton, driver);
		supportTicketButton.click();
	}
	public void clickCommunicationBtn() {
		waitutility.waitForAnElement(communicationButton, driver);
		communicationButton.click();
	}
	public void clickAdminHelpCenterBtn() {
		waitutility.waitForAnElement(adminHelpCenterButton, driver);
		adminHelpCenterButton.click();		
	}
	public void clickToolsBtn() {
		waitutility.waitForAnElement(toolsButton, driver);
		toolsButton.click();
	}
	public void clickDocumentsBtn() {
		waitutility.waitForAnElement(toolsDocumentsButton, driver);
		toolsDocumentsButton.click();	
	}
	public void clicktoolsVideoBtn() {
		waitutility.waitForAnElement(toolsVideosButton, driver);
		toolsVideosButton.click();
	}
	public void clickArticlesBtn() {
		waitutility.waitForAnElement(articlesButton, driver);
		articlesButton.click();
	}
	public void clickFAQBtn() {
		waitutility.waitForAnElement(faqsButton, driver);
		faqsButton.click();
	}
	public void clickBlogsBtn() {
		waitutility.waitForAnElement(blogsButton, driver);
		blogsButton.click();
	}
	public void clickReportsBtn() {
		reportsButton.click();
	}
	public void clickJoiningReportBtn() {
		waitutility.waitForAnElement(joiningReportButton, driver);
		joiningReportButton.click();
	}
}
