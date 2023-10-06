package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.WaitUtility;
import com.clouddemo.utilities.PageUtility;
import com.clouddemo.utilities.TableUtility;

public class CloudDemoSupportTicketUserPage {
	WebDriver driver;
	
//User Side
	@FindBy(xpath="//h4[contains(text(),\"Support Tickets\")]")                      
	WebElement supportTicketMsg;
	@FindBy(name="create-ticket")
	WebElement userCreateTicketButton;
	@FindBy(xpath="//h4[contains(text(),\"Create Ticket\")]")
	WebElement createTicketMsg;
	@FindBy(name="department_id")
	WebElement ticketDepartment;
	@FindBy(name="priority_id")
	WebElement ticketPriority;
	@FindBy(name="category_id")
	WebElement ticketCategory;
	@FindBy(name="subject")
	WebElement subjectField;
	@FindBy(name="attachments_url")
	WebElement fileUpload;
	@FindBy(xpath="//*[@id=\"description\"]/div/div[1]")
	WebElement discriptionField;
	@FindBy(name="sent-request")                           
	WebElement sentRequestButton;   
	@FindBy(xpath="//p[contains(text(), \"Please Select a department\")]")
	WebElement departValidationMsg;
	@FindBy(xpath="//p[contains(text(),\"Please Select a priority\")]")
	WebElement priorityValidationMsg;
	@FindBy(xpath="//p[contains(text(),\"Please Select a category\")]")
	WebElement categoryValidationMsg;
	@FindBy(xpath="//p[contains(text(),\"Subject is required\")]")
	WebElement subjectValidationMsg;
	@FindBy(xpath="//p[contains(text(), \"Description is required\")]")
	WebElement descriptionValidationMsg;
	@FindBy(xpath="//*[@name=\"all-tickets\"]/tbody")
	WebElement userTicketTable;
	
    WaitUtility waitutility = new WaitUtility();
    PageUtility pageutility = new PageUtility();
    TableUtility tableutility = new TableUtility();
	
	public CloudDemoSupportTicketUserPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getSupportTicketMsg() {
		waitutility.waitForAnElement(supportTicketMsg, driver);
		String supportTicketMsgText = supportTicketMsg.getText();
		return supportTicketMsgText;
	}
	public void clickCreateTicketBtn() {
		userCreateTicketButton.click();
	}
	public String getCreateTicketMsg() {
		waitutility.waitForAnElement(createTicketMsg, driver);
		String createTicketMsgText = createTicketMsg.getText();
		return createTicketMsgText;
	}
	public void selectDepartment(String strDepartment) {
		pageutility.selectByVisibleText(ticketDepartment, driver, strDepartment);		
	}
	public void selectPriority(String strPriority) {
		pageutility.selectByVisibleText(ticketPriority, driver, strPriority);
	}
	public void selectCategory(String strCategory) {
		pageutility.selectByVisibleText(ticketCategory, driver, strCategory);
	}
	public void enterSubject(String strSubject) {
		subjectField.sendKeys(strSubject);
	}
	public void attachedFiles(String strPath) {
		waitutility.waitForAnElement(fileUpload, driver);
		pageutility.uploadFiles(fileUpload, driver, strPath);
	}
	public void enterDiscription(String strDiscription) {
		discriptionField.sendKeys(strDiscription);
	}
	
	public void clickSendRequestBtn() {
		waitutility.waitForAnElement(sentRequestButton, driver);     //create ticket save button
		sentRequestButton.click();
	}
	public void createNewTicket(String strDepartment, String strPriority, String strCategory, String strSubject, String strPath, String strDiscription) {
		this.selectDepartment(strDepartment);
		this.selectPriority(strPriority);
		this.selectCategory(strCategory);
		this.enterSubject(strSubject);
		this.attachedFiles(strPath);
		this.enterDiscription(strDiscription);
		this.clickSendRequestBtn();
	}
	
	public void searchInUserTickets(String strTicketSub) {
		waitutility.waitForAnElement(userTicketTable, driver);
		tableutility.searchInUserTicketTable(userTicketTable, driver, strTicketSub);
	}
	public String getDepartValidationMsg() {
		waitutility.waitForAnElement(departValidationMsg, driver);
		String departValidationMsgText = departValidationMsg.getText();
		return departValidationMsgText;
	}
	public String getPriorityValidationMsg() {
		waitutility.waitForAnElement(priorityValidationMsg, driver);
		String priorityValidationMsgText = priorityValidationMsg.getText();
		return priorityValidationMsgText;
	}
	public String getCategoryValidationMsg() {
		waitutility.waitForAnElement(categoryValidationMsg, driver);
		String CategoryValidationMsgText = categoryValidationMsg.getText();
		return CategoryValidationMsgText;
	}
	public String getSubjectValidationMsg() {
		waitutility.waitForAnElement(subjectValidationMsg, driver);
		String subjectValidationMsgText = subjectValidationMsg.getText();
		return subjectValidationMsgText;
	}
	public String getDescriptionValidationMsg() {
		waitutility.waitForAnElement(descriptionValidationMsg, driver);
		String descriptionValidationMsgText = descriptionValidationMsg.getText();
		return descriptionValidationMsgText;
	}

}
