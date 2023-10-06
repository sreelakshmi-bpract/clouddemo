package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.PageUtility;
import com.clouddemo.utilities.TableUtility;
import com.clouddemo.utilities.WaitUtility;

public class CloudDemoHelpCenterAdminPage {
	WebDriver driver;
	
	//Admin side
		@FindBy(xpath="//h4[contains(text(),\"Help Center\")]")                     
		WebElement helpCenterMsg;
		@FindBy(name="create-ticket")
		WebElement adminCreateTicketButton;
		@FindBy(xpath="//p[contains(text(), \"Create Ticket\")]")
		WebElement adminCreateTicketMsg;	
		@FindBy(name="user-search")
		WebElement searchUser;
		@FindBy(name="subject")
		WebElement adminSubjectField;
		@FindBy(xpath="//*[@id=\"description\"]/div/div[1]")
		WebElement adminDescriptionField;
		@FindBy(name="priority_id")
		WebElement adminPriorityField;
		@FindBy(name="department_id")
		WebElement adminDepartmentField;
		@FindBy(name="category_id")
		WebElement adminCategoryField;
		@FindBy(name="status")
		WebElement adminStatusField;
		@FindBy(name="attachments_url")
		WebElement adminTicketUrl;
		@FindBy(xpath="//button[contains(text(), \"Add\")]")
		WebElement addButton;                                              
		@FindBy(xpath="//p[contains(text(), \"User is required\")]")
		WebElement usernameRequiredMsg;
		@FindBy(xpath="//p[contains(text(), \"Subject is required\")]")
		WebElement subjectRequiredMsg;
		@FindBy(xpath="//p[contains(text(), \"Description Name is required\")]")
		WebElement descriptionRequiredMsg;
		@FindBy(xpath="//p[contains(text(), \"Priority is required\")]")
		WebElement priorityRequiredMsg;
		@FindBy(xpath="//p[contains(text(), \"Department is required\")]")
		WebElement departmentRequiredMsg;
		@FindBy(xpath="//p[contains(text(), \"Category is required\")]")
		WebElement categoryRequiredMsg;
		@FindBy(xpath="//p[contains(text(), \"Status is required\")]")
		WebElement statusRequiredMsg;
		@FindBy(xpath="//*[@name=\"all-tickets\"]/tbody/tr/td[2]")
		WebElement subjectFromTable;
		@FindBy(xpath="//*[@name=\"all-tickets\"]/tbody/tr/td[4]")
		WebElement priorityFromTable;
		@FindBy(xpath="//*[@name=\"all-tickets\"]/tbody/tr/td[5]")
		WebElement departmentFromTable;

		
	//Add Priorities	
		@FindBy(xpath="//span[contains(text(), \"Priorities\")]")
		WebElement priorityButton;
		@FindBy(xpath="//h6[contains(text(), \"Priorities\")]")
		WebElement priorityPage;
		@FindBy(name="priority")
		WebElement addPriorityButton;
		@FindBy(id="add-priority")
		WebElement addPriorityPageMsg;
		@FindBy(xpath="//input[@name=\"name\"]")
		WebElement priorityName;
		@FindBy(name="color")
		WebElement priorityColor;
		@FindBy(xpath="/html/body/div[2]/div[3]/div/form/div[1]/p/div[2]/div/div/textarea[1]")
		WebElement priorityDescription;
		@FindBy(name="submit")
		WebElement prioritySubmit;
		
	//Validation Msgs Of Priority	
		@FindBy(xpath="//p[contains(text(), \"Name is required\")]")
		WebElement priorityNameValidation;
		@FindBy(xpath="//p[contains(text(), \"Color is required\")]")
		WebElement priorityColorValidation;
		@FindBy(xpath="//p[contains(text(), \"Description is required\")]")
		WebElement priorityDescValidation;
		
	//Add Canned Response	
		@FindBy(xpath="//span[contains(text(), \"Canned Responses\")]")
		WebElement cannedResponsesButton;
		@FindBy(xpath="//h6[contains(text(), \"Canned Response\")]")
		WebElement cannedResponsePageMsg;
		@FindBy(name="canned-response")
		WebElement cannedResponseAddButton;
		@FindBy(xpath="//span[contains(text(), \"Add Canned Response\")]")
		WebElement addCannedResponsePageMsg;
		@FindBy(name="title")
		WebElement cannedResponseName;
		@FindBy(name="subject")
		WebElement cannedResponseSubject;
		@FindBy(xpath="/html/body/div[2]/div[3]/div/form/div[1]/p/div/div[3]/div/div[2]/div/div[1]")
		WebElement cannedResponseDescription;
		@FindBy(name="submit")
		WebElement cannedResponseSubmitButton;
		@FindBy(xpath="//table[@name=\"canned-table\"]/tbody")
		WebElement cannedResponseTable; 
		
	//Validation Msgs Of Canned Response	
		@FindBy(xpath="//p[contains(text(), \"Title Name is required\")]")
		WebElement cannedResponseNameValidation;
		@FindBy(xpath="//p[contains(text(), \"Subject is required\")]")
		WebElement cannedResponseSubValidation;
		@FindBy(xpath="//p[contains(text(), \"Description is required\")]")
		WebElement cannedResponseDescValidation;
		
	//Add Category	
		@FindBy(xpath="//span[contains(text(), \"Categories\")]")
		WebElement categoriesButton;
		@FindBy(xpath="//h6[contains(text(), \"Category\")]")
		WebElement categoriesPageMsg;
		@FindBy(name="category")
		WebElement categoryAddButton;
		@FindBy(xpath="//span[contains(text(), \"Add Category\")]")
		WebElement categoryAddPageMsg;
		@FindBy(name="name")
		WebElement categoryName;
		@FindBy(xpath="/html/body/div[2]/div[3]/div/form/div[1]/p/div/div[2]/div/textarea[1]")
		WebElement categoryDescription;
		@FindBy(name="active")
		WebElement categoryStatus;
		@FindBy(name="submit")
		WebElement categorySubmitButton;
		@FindBy(xpath="//table[@name=\"category-table\"]/tbody")
		WebElement categoryTable;
		
	//Validation Msgs Of Categories
		@FindBy(xpath="//p[contains(text(), \"Name is required\")]")
		WebElement categoryNameValidation;
		@FindBy(xpath="//p[contains(text(), \"Description is required\")]")
		WebElement categoryDescValidation;
		@FindBy(xpath="//p[contains(text(), \"Status is required\")]")
		WebElement categoryStatusValidation;
		
	//Add Departments	
		@FindBy(xpath="//span[contains(text(), \"Departments\")]")
		WebElement departmentButton;
		@FindBy(xpath="//h6[contains(text(), \"Department\")]")
		WebElement departmentPageMsg;
		@FindBy(name="department")
		WebElement departmentAddButton;
		@FindBy(xpath="//span[contains(text(), \"Add Department\")]")
		WebElement addDepartmentPageMsg;
		@FindBy(name="name")
		WebElement departmentName;
		@FindBy(xpath="/html/body/div[2]/div[3]/div/form/div[1]/p/div[1]/div[2]/div/textarea[1]")
		WebElement departmentDescription;
		@FindBy(name="active")
		WebElement departmentStatus;
		@FindBy(name="sort_order")
		WebElement departmentSortOrder;
		@FindBy(xpath="//button[contains(text(), \"Submit\")]")
		WebElement departmentSumitButton;
		@FindBy(xpath="//button[contains(text(), \"close\")]")
		WebElement departmentCloseButton;
		@FindBy(xpath="//table[@name=\"department-table\"]/tbody")
		WebElement departmentTable;
		
	//Validation Msgs Of Departments
	@FindBy(xpath="//p[contains(text(), \"Department Name is required\")]")
	WebElement departmentNameValidation;
	@FindBy(xpath="//p[contains(text(), \"Department Description is required\")]")
	WebElement departmentDescValidation;
	@FindBy(xpath="//p[contains(text(), \"Status is required\")]")
	WebElement departmentStatusValidation;
	@FindBy(xpath="//p[contains(text(), \"Sort Order is required\")]")
	WebElement departmentSortOrderValidation;	
	
    WaitUtility waitutility = new WaitUtility();
    PageUtility pageutility = new PageUtility();
    TableUtility tableutility = new TableUtility();
	
    public CloudDemoHelpCenterAdminPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	public String getHelpCenterMsg() {
		waitutility.waitForAnElement(helpCenterMsg, driver);
		String helpCenterMsgText = helpCenterMsg.getText();
		return helpCenterMsgText;
	}
	public void clickAdminCreateTicketBtn() {
		adminCreateTicketButton.click();
	}
	public String getAdminCreateTicketMsg() {
		waitutility.waitForAnElement(adminCreateTicketMsg, driver);
		String adminCreateTicketMsgText = adminCreateTicketMsg.getText();
		return adminCreateTicketMsgText;
	}
	public void clickAdminTicketAddBtn() {
		waitutility.waitForAnElement(addButton, driver);
		pageutility.scrollToElement(addButton, driver);
		addButton.click();
	}
	public String getUserRequiredMsg() {
		waitutility.waitForAnElement(usernameRequiredMsg, driver);
		String usernameRequiredMsgText = usernameRequiredMsg.getText();
		return usernameRequiredMsgText;
	}
	public String getSubjectRequiredMsg() {
		waitutility.waitForAnElement(subjectRequiredMsg, driver);
		String subjectRequiredMsgText = subjectRequiredMsg.getText();
		return subjectRequiredMsgText;
	}
	public String getDescriptionRequiredMsg() {
		waitutility.waitForAnElement(descriptionRequiredMsg, driver);
		String descriptionRequiredMsgText = descriptionRequiredMsg.getText();
		return descriptionRequiredMsgText;
	}
	
	public String getPriorityRequiredMsg() {
		waitutility.waitForAnElement(priorityRequiredMsg, driver);
		String priorityRequiredMsgText = priorityRequiredMsg.getText();
		return priorityRequiredMsgText;
	}
	public String getDepartmentRequiredMsg() {
		waitutility.waitForAnElement(departmentRequiredMsg, driver);
		String departmentRequiredMsgText = departmentRequiredMsg.getText();
		return departmentRequiredMsgText;
	}
	public String getCategoryRequiredMsg() {
		waitutility.waitForAnElement(categoryRequiredMsg, driver);
		String categoryRequiredMsgText = categoryRequiredMsg.getText();
		return categoryRequiredMsgText;
	}
	public String getStatusRequiredMsg() {
		waitutility.waitForAnElement(statusRequiredMsg, driver);
		String statusRequiredMsgText = statusRequiredMsg.getText();
		return statusRequiredMsgText;
	}
	public String getSubjectFromTable() {
		waitutility.waitForAnElement(subjectFromTable, driver);
		String SubjectFromTableText = subjectFromTable.getText();
		return SubjectFromTableText;
	}
	public String getPriorityFromTable() {
		waitutility.waitForAnElement(priorityFromTable, driver);
		String priorityFromTablText = priorityFromTable.getText();
		return priorityFromTablText;
	}
	public String getDepartmentFromTable() {
		waitutility.waitForAnElement(departmentFromTable, driver);
		String departmentFromTableText = departmentFromTable.getText();
		return departmentFromTableText;
	}
	public void searchUserForTicket(String strUser) throws InterruptedException {
		waitutility.waitForAnElement(searchUser, driver);
		pageutility.selectFromAutoSuggestion(searchUser, driver, strUser);
	}
	public void enterAdminSubjectForTicket(String strSub) {
		adminSubjectField.sendKeys(strSub);
	}
	public void enterAdminDescriptionForTicket(String strDesc) {
		adminDescriptionField.sendKeys(strDesc);
	}
	public void selectAdminPriorityForTicket(String strPriority) {
		pageutility.selectByVisibleText(adminPriorityField, driver, strPriority);
	}
	public void selectAdminDepartmentForTicket(String strDepart) {
		pageutility.selectByVisibleText(adminDepartmentField, driver, strDepart);
	}
	public void selectAdminCategoryForTicket(String strCate) {
		pageutility.selectByVisibleText(adminCategoryField, driver, strCate);
	}
	public void selectAdminStatusForTicket(String strStatus) {
		pageutility.selectByVisibleText(adminStatusField, driver, strStatus);
	}
	public void selectAdminDocumentForTicket(String strPath) {
		waitutility.waitForAnElement(adminTicketUrl, driver);
		pageutility.uploadFiles(adminTicketUrl, driver, strPath);
	}
	public void enterTicketDetailsAdmin(String strUser, String strSub, String strDesc, String strPriority, String strDepart, String strCate, String strStatus, String strPath) throws InterruptedException {
		this.searchUserForTicket(strUser);
		this.enterAdminSubjectForTicket(strSub);
		this.enterAdminDescriptionForTicket(strDesc);
		this.selectAdminPriorityForTicket(strPriority);
		this.selectAdminDepartmentForTicket(strDepart);
		this.selectAdminCategoryForTicket(strCate);
		this.selectAdminStatusForTicket(strStatus);
		this.selectAdminDocumentForTicket(strPath);
		this.clickAdminTicketAddBtn();
	}
	public void clickPriorityBtn() {
		priorityButton.click();
	}
	public String getPriorityMsg() {
		waitutility.waitForAnElement(priorityPage, driver);
		String priorityPageText = priorityPage.getText();
		return priorityPageText;
	}
	public void clickAddPriorityBtn() {
		addPriorityButton.click();
	}
	public String getAddPriorityPageMsg() {
		waitutility.waitForAnElement(addPriorityPageMsg, driver);
		String addPriorityPageMsgText = addPriorityPageMsg.getText();
		return addPriorityPageMsgText;
	}
	public void enterPriorityField(String strPriority) {
		waitutility.waitForAnElement(priorityName, driver);
		priorityName.sendKeys(strPriority);
	}
	public void selectPriorityColor(String strPriorityColor) {
		priorityColor.sendKeys(strPriorityColor);
	}
	public void enterPriorityDescription(String strPriorityDesc) {
		priorityDescription.sendKeys(strPriorityDesc);
	}
	public void clickPrioritySubmitBtn() {
		prioritySubmit.click();
	}
	public void enterPriorityDetrails(String strPriority, String strPriorityColor, String strPriorityDesc) {
		this.enterPriorityField(strPriority);
		this.selectPriorityColor(strPriorityColor);
		this.enterPriorityDescription(strPriorityDesc);
		this.clickPrioritySubmitBtn();
	}
	public String getPriorityNameFieldBlankMsg() {
		waitutility.waitForAnElement(priorityNameValidation, driver);
		String priorityNameValidationText = priorityNameValidation.getText();
		return priorityNameValidationText;
	}
	public String getPrioritycColorBlankFieldMsg() {
		waitutility.waitForAnElement(priorityColorValidation, driver);
		String priorityColorValidationtText = priorityColorValidation.getText();
		return priorityColorValidationtText;
	}
	public String getPriorityDescBlankFieldMsg() {
		waitutility.waitForAnElement(priorityDescValidation, driver);
		String priorityDescValidationText = priorityDescValidation.getText();
		return priorityDescValidationText;
	}
	public void clickCannedResponsesBtn() {
		waitutility.waitForAnElement(cannedResponsesButton, driver);
		cannedResponsesButton.click();
	}
	public String getCannedResponsePageMsg() {
		waitutility.waitForAnElement(cannedResponsePageMsg, driver);
		String cannedResponsePageMsgText = cannedResponsePageMsg.getText();
		return cannedResponsePageMsgText;
	}
	public void clickAddCannedResponseBtn() {
		cannedResponseAddButton.click();
	}
	public String getAddCannedResponsePageMsg() {
		waitutility.waitForAnElement(addCannedResponsePageMsg, driver);
		String addCannedResponsePageMsgText = addCannedResponsePageMsg.getText();
		return addCannedResponsePageMsgText;
	}
	public void enterCannedTitle(String strCannedName) {
		cannedResponseName.sendKeys(strCannedName);
	}
	public void enterCannedSubject(String strCannedSub) {
		cannedResponseSubject.sendKeys(strCannedSub);
	}
	public void enterCannedDescription(String strCannedDesc) {
		cannedResponseDescription.sendKeys(strCannedDesc);
	}
	public void clickCannedResponseSubmitBtn() {
		cannedResponseSubmitButton.click();
	}
	public void enterCannedResponse(String strCannedName, String strCannedSub, String strCannedDesc) {
		this.enterCannedTitle(strCannedName);
		this.enterCannedSubject(strCannedSub);
		this.enterCannedDescription(strCannedDesc);
		this.clickCannedResponseSubmitBtn();
	}
	public String getCannedResponseTitleValidation() {
		waitutility.waitForAnElement(cannedResponseNameValidation, driver);
		String cannedResponseNameValidationText = cannedResponseNameValidation.getText();
		return cannedResponseNameValidationText;
	}
	public String getCannedResponseSubjectValidation() {
		waitutility.waitForAnElement(cannedResponseSubValidation, driver);
		String cannedResponseSubValidationText = cannedResponseSubValidation.getText();
		return cannedResponseSubValidationText;
	}
	public String getCannedResponseDescValidation() {
		waitutility.waitForAnElement(cannedResponseDescValidation, driver);		
		String cannedResponseDescValidationText = cannedResponseDescValidation.getText();
		return cannedResponseDescValidationText;
	}
	public void searchInCannedResponseTable(String strTitleValue) {
		waitutility.waitForAnElement(cannedResponseTable, driver);
		tableutility.searchInCannedResponseTable(cannedResponseTable, driver, strTitleValue);
	}
	public void clickCategoriesBtn() {
		waitutility.waitForAnElement(categoriesButton, driver);
		categoriesButton.click();
	}
	public String getCategoriesPageMsg() {
		waitutility.waitForAnElement(categoriesPageMsg, driver);
		String categoriesPageMsgText = categoriesPageMsg.getText();
		return categoriesPageMsgText;
	}
	public void clickCategoryAddBtn() {
		categoryAddButton.click();
	}
	public String getCategoryAddPageMsg() {
		waitutility.waitForAnElement(categoryAddPageMsg, driver);
		String categoryAddPageMsgText = categoryAddPageMsg.getText();
		return categoryAddPageMsgText;
	}
	public void enterCategoryName(String strCateName) {
		categoryName.sendKeys(strCateName);
	}
	public void enterCategoryDescription(String strCateDesc) {
		categoryDescription.sendKeys(strCateDesc);
	}
	public void enterCategoryStatus(String strCateStatus) {
		pageutility.selectByVisibleText(categoryStatus, driver, strCateStatus);
	}
	public void clickCateSubmitBtn() {
		categorySubmitButton.click();
	}
	public void category(String strCateName, String strCateDesc, String strCateStatus) {
		this.enterCategoryName(strCateName);
		this.enterCategoryDescription(strCateDesc);
		this.enterCategoryStatus(strCateStatus);
		this.clickCateSubmitBtn();
	}
	public String getCategoryNameValidation() {
		waitutility.waitForAnElement(categoryNameValidation, driver);
		String categoryNameValidationText = categoryNameValidation.getText();
		return categoryNameValidationText;
	}
	public String getCategoryDescValidation() {
		waitutility.waitForAnElement(categoryDescValidation, driver);
		String categoryDescValidationText = categoryDescValidation.getText();
		return categoryDescValidationText;
	}
	public String getCategoryStatusValidation() {
		waitutility.waitForAnElement(categoryStatusValidation, driver);
		String categoryStatusValidationText = categoryStatusValidation.getText();
		return categoryStatusValidationText;
	}
	public void searchInCategoryTable(String strCateTitle) {
		waitutility.waitForAnElement(categoryTable, driver);
		tableutility.searchInCategoryTable(categoryTable, driver, strCateTitle);
	}
	public void clickDepartmentBtn() {
		waitutility.waitForAnElement(departmentButton, driver);
		departmentButton.click();
	}
	public String getDepartmentPageMsg() {
		waitutility.waitForAnElement(departmentPageMsg, driver);
		String departmentPageMsgText = departmentPageMsg.getText();
		return departmentPageMsgText;
	}
	public void clickDepartmentAddBtn() {
		departmentAddButton.click();
	}
	public String getAddDepartmentPageMsg() {
		waitutility.waitForAnElement(addDepartmentPageMsg, driver);
		String addDepartmentPageMsgText = addDepartmentPageMsg.getText();
		return addDepartmentPageMsgText;
	}
	public void enterDepartmentField(String strDepartName) {
		departmentName.sendKeys(strDepartName);
	}
	public void enterDepartmentDesc(String strDepartDesc) {
		departmentDescription.sendKeys(strDepartDesc);
	}
	public void enterDepartmentStatus(String strDepartStatus) {
		pageutility.selectByVisibleText(departmentStatus, driver, strDepartStatus);
	}
	public void enterDepartmnetSortOrder(String strDepartSortOrder) {
		departmentSortOrder.sendKeys(strDepartSortOrder);
	}
	public void clickDepartmentSubmitBtn() {
		departmentSumitButton.click();
	}
	public void clickDepartmentCloseBtn() {
		departmentCloseButton.click();
	}
	public void departDetails(String strDepartName, String strDepartDesc, String strDepartStatus, String strDepartSortOrder) {
		this.enterDepartmentField(strDepartName);
		this.enterDepartmentDesc(strDepartDesc);
		this.enterDepartmentStatus(strDepartStatus);
		this.enterDepartmnetSortOrder(strDepartSortOrder);
		this.clickDepartmentSubmitBtn();
		this.clickDepartmentCloseBtn();
	}
	public String getDepartmentNameValidation() {
		waitutility.waitForAnElement(departmentNameValidation, driver);
		String departmentNameValidationText = departmentNameValidation.getText();
		return departmentNameValidationText;
	}
	public String getDepartmentDescValidation() {
		waitutility.waitForAnElement(departmentDescValidation, driver);
		String departmentDescValidationText = departmentDescValidation.getText();
		return departmentDescValidationText;
	}
	public String getDepartmentStatusValidation() {
		waitutility.waitForAnElement(departmentStatusValidation, driver);
		String departmentStatusValidationText = departmentStatusValidation.getText();
		return departmentStatusValidationText;
	}
	public String getDepartmentSortOrderValidfation() {
		waitutility.waitForAnElement(departmentSortOrderValidation, driver);
		String departmentSortOrderValidationText = departmentSortOrderValidation.getText();
		return departmentSortOrderValidationText;
	}
	public void searchInDepartmentTable(String strDepartTable) {
		driver.navigate().to(driver.getCurrentUrl());
		waitutility.waitForAnElement(departmentTable, driver);
		tableutility.searchInDepartmentTable(departmentTable, driver, strDepartTable);
	}
}
