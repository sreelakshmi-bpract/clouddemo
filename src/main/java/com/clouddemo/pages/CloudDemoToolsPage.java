package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.PageUtility;
import com.clouddemo.utilities.TableUtility;
import com.clouddemo.utilities.WaitUtility;

public class CloudDemoToolsPage {
	WebDriver driver;
	
	@FindBy(xpath="//h4[contains(text(), \"Documents \")]")
	WebElement documentPageMsg;
	@FindBy(name="add")
	WebElement addDocumentButton;
	@FindBy(xpath="//h2[contains(text(), \"Add Document\")]")
	WebElement popupOfAddDocumentMsg;
	@FindBy(name="title")
	WebElement documentTitle;
	@FindBy(name="sort_order")
	WebElement documentSortOrder;
	@FindBy(name="document_url")
	WebElement documentUrl;
	@FindBy(name="submit")
	WebElement documentSubmitButton;
	@FindBy(xpath="//table[@name=\"tools-documents\"]/tbody")
	WebElement documentTable;
	@FindBy(xpath="//h4[contains(text(), \"Videos\")]")
	WebElement toolsVideoMsg;
	@FindBy(name="add")
	WebElement addVideoButton;
	@FindBy(xpath="//h2[contains(text(), \"Add Video\")]")
	WebElement popupOfAddVideoMsg;
	@FindBy(name="title")
	WebElement videoTitle;
	@FindBy(name="video_tool_url")
	WebElement videoUrl;
	@FindBy(name="submit")
	WebElement videoSubmitButton;

	
	 WaitUtility waitutility = new WaitUtility();
	 PageUtility pageutility = new PageUtility(); 
	 TableUtility tableutility = new TableUtility();
	 
	
	public CloudDemoToolsPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getDocumentPageMsg() {
		waitutility.waitForAnElement(documentPageMsg, driver);
		String documentPageMsgText = documentPageMsg.getText();
		return documentPageMsgText;
	}
	public void clickDocumentFileUpload() {
		addDocumentButton.click();
	}
	public String getAddDocumentMsg() {
		waitutility.waitForAnElement(popupOfAddDocumentMsg, driver);
		String popupOfAddDocumentMsgText = popupOfAddDocumentMsg.getText();
		return popupOfAddDocumentMsgText;
	}
	public void enterDocumentTitle(String strDocTitle) {
		documentTitle.sendKeys(strDocTitle);
	}
	public void enterDocumentSortOrder(String strDocSortOrder) {
		documentSortOrder.sendKeys(strDocSortOrder); 
	}
	public void uploadDocument(String strDocPath) {
		waitutility.waitForAnElement(documentUrl, driver);
		pageutility.uploadFiles(documentUrl, driver, strDocPath);
	}
	public void clickDocSubmitBtn() {
		waitutility.waitForAnElement(documentSubmitButton, driver);
		documentSubmitButton.click();
	}
	public void enterNewDocumentDetails(String strDocTitle, String strDocSortOrder, String strDocPath) {
		this.enterDocumentTitle(strDocTitle);
		this.enterDocumentSortOrder(strDocSortOrder);
		this.uploadDocument(strDocPath);
		this.clickDocSubmitBtn();
	}
	public void searchInDocTable(String strDocPath) {
//		driver.navigate().to(driver.getCurrentUrl());
		waitutility.waitForAnElement(documentTable, driver);
		tableutility.searchInDocumentTable(documentTable, driver, strDocPath);
	}
	public String getToolsVideosMsg() {
		waitutility.waitForAnElement(toolsVideoMsg, driver);
		String toolsVideoMsgText = toolsVideoMsg.getText();
		return toolsVideoMsgText;
	}
	public void clickAddVideoBtn() {
		addVideoButton.click();
	}
	public String getAddVideoMsg() {
		waitutility.waitForAnElement(popupOfAddVideoMsg, driver);
		String popupOfAddVideoMsgText = popupOfAddVideoMsg.getText();
		return popupOfAddVideoMsgText;
	}
	public void enterVideoTitle(String strVdoTitle) {		
		videoTitle.sendKeys(strVdoTitle);
	}
	public void enterVideoUrl(String strVdoUrl) {
		videoUrl.sendKeys(strVdoUrl);
	}
	public void clickVideoSubmitBtn() {
		videoSubmitButton.click();
	}
	public void enterNewVideoDetails(String strVdoTitle, String strVdoUrl) {
		this.enterVideoTitle(strVdoTitle);
		this.enterVideoUrl(strVdoUrl);
		this.clickVideoSubmitBtn();
	}	
}
