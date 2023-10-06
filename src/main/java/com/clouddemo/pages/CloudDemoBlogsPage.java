package com.clouddemo.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.PageUtility;
import com.clouddemo.utilities.TableUtility;
import com.clouddemo.utilities.WaitUtility;

public class CloudDemoBlogsPage {
	WebDriver driver;
	
	@FindBy(xpath="//h4[contains(text(), \"Blogs\")]")
	WebElement blogsPageMsg;	
//Add Blog	
	@FindBy(xpath="//a[contains(text(), \"Create Post\")]")
	WebElement createPostsButton;
	@FindBy(xpath="//h4[contains(text(), \"Add Blog\")]")
	WebElement addBlogPageMsg;
	@FindBy(xpath="//input[@name=\"type\" and @value=\"Public\"]")
	WebElement choosePublicButton;
	@FindBy(name="title")
	WebElement blogsTitle;
	@FindBy(name="category")
	WebElement blogCategoryField;
	@FindBy(name="products")
	WebElement blogProduct;
	@FindBy(xpath="//div[@name=\"meta-keywords\"]/div/div/textarea")
	WebElement blogMetaKeywords;
	@FindBy(xpath="//div[@name=\"meta-description\"]/div/div/textarea")
	WebElement blogMetaDescription;
	@FindBy(xpath="//*[@id=\"description\"]/div/div[1]")
	WebElement blogDescription;
	@FindBy(xpath="//div[@name=\"short-description\"]/div/div/textarea")
	WebElement blogShortDescription;
	@FindBy(name="document_url")
	WebElement blogDocument;
	@FindBy(name="image")
	WebElement blogImage;
	@FindBy(name="submit")
	WebElement blogSubmitButton;
	@FindBy(name="save-draft")
	WebElement blogSaveDraftButton;
	@FindBy(xpath="//table[@name=\"published-table\"]/tbody")
	WebElement blogsPublishTable;
	@FindBy(xpath="//button[contains(text(), \"Drafts\")]")
	WebElement blogsDraftButton;
	@FindBy(xpath="//table[@name=\"draft-table\"]/tbody")
	WebElement blogsDraftTable;
	
//Blog Category
	@FindBy(xpath="//a[contains(text(), \"Category\")]")
	WebElement blogCategoryButton;
	@FindBy(xpath="//h4[contains(text(), \"Blog Category\")]")
	WebElement blogCategoryPageMsg;
	@FindBy(xpath="//a[contains(text(), \"Category\")]")
	WebElement addBlogCategoryButton;
	@FindBy(id="add-Category")
	WebElement addBlogCategoryPageMsg;
	@FindBy(name="name")
	WebElement blogCategoryName;
	@FindBy(xpath="/html/body/div[2]/div[3]/div/form/div[1]/p/div/div[2]/div/div/textarea[1]")
	WebElement blogCategoryDescription;
	@FindBy(xpath="//button[contains(text(), \"Submit\")]")
	WebElement blogCategorySubMitButton;
	@FindBy(xpath="//table[@name=\"name-category\"]/tbody")
	WebElement blogCategoryTable;
	
	
	WaitUtility waitutility = new WaitUtility();
	PageUtility pageutility = new PageUtility();
	TableUtility tableutility = new TableUtility();
	
	public CloudDemoBlogsPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getBlogsPageMsg() {
		waitutility.waitForAnElement(blogsPageMsg, driver);
		String blogsPageMsgText = blogsPageMsg.getText();
		return blogsPageMsgText;
	}
	public void clickCreatePost() {
		createPostsButton.click();
	}
	public String getAddBlogsPageMsg() {
		waitutility.waitForAnElement(addBlogPageMsg, driver);
		String addBlogPageMsgText = addBlogPageMsg.getText();
		return addBlogPageMsgText;
	}
	public void clickPublicBtn() {
		choosePublicButton.click();
	}
	public void enterBlogTitle(String strTitle) {
		blogsTitle.sendKeys(strTitle);
	}
	public void enterBlogCate(String strCategory) throws InterruptedException {
		waitutility.waitForAnElement(blogCategoryField, driver);
		pageutility.selectFromAutoSuggestion(blogCategoryField, driver, strCategory);
	}
	public void enterBlogProduct(String strProduct) throws InterruptedException {
		waitutility.waitForAnElement(blogProduct, driver);
		pageutility.selectFromAutoSuggestion(blogProduct, driver, strProduct);
	}
	public void enterBlogMetaKeyword(String strMetaKeyword) {
		blogMetaKeywords.sendKeys(strMetaKeyword);
	}
	public void enterBlogMetaDescription(String strMetaDescription) {
		blogMetaDescription.sendKeys(strMetaDescription);
	}
	public void enterBlogDescription(String strDescription) {
		blogDescription.sendKeys(strDescription);
	}
	public void enterShortDescription(String strShortDescription) {
		blogShortDescription.sendKeys(strShortDescription);
	}
	public void selectBlogDocument(String strblogDoc) {
		waitutility.waitForAnElement(blogDocument, driver);
		pageutility.uploadFiles(blogDocument, driver, strblogDoc);
	}
	public void selectBlogImage(String strBlogImg) throws AWTException, InterruptedException {
		waitutility.waitForAnElement(blogImage, driver);
		pageutility.uploadImage(blogImage, driver, strBlogImg);
	}
	public void clickBlogSubmitBtn() {
		waitutility.waitForAnElement(blogSubmitButton, driver);
		blogSubmitButton.click();
	}
	public void clickBlogSaveToDraftBtn() {
		blogSaveDraftButton.click();
	}
	public void clickBlogsDraftBtn() {
		waitutility.waitForAnElement(blogsDraftButton, driver);
		blogsDraftButton.click();
	}
	public void createPrivatePost(String strTitle, String strCategory, String strProduct, String strMetaKeyword, String strMetaDescription, String strDescription, String strShortDescription, String strblogDoc, String strBlogImg) throws InterruptedException, AWTException{
		this.enterBlogTitle(strTitle);
		this.enterBlogCate(strCategory);
		this.enterBlogProduct(strProduct);
		this.enterBlogMetaKeyword(strMetaKeyword);
		this.enterBlogMetaDescription(strMetaDescription);
		this.enterBlogDescription(strDescription);
		this.enterShortDescription(strShortDescription);
		this.selectBlogDocument(strblogDoc);
		this.selectBlogImage(strBlogImg);
//		this.clickBlogSubmitBtn();
		this.clickBlogSaveToDraftBtn();
	}
	public void createPublicPost(String strTitle, String strCategory, String strMetaKeyword, String strMetaDescription, String strDescription, String strShortDescription, String strblogDoc, String strBlogImg) throws InterruptedException, AWTException{
		this.clickPublicBtn();
		this.enterBlogTitle(strTitle);
		this.enterBlogCate(strCategory);
		this.enterBlogMetaKeyword(strMetaKeyword);
		this.enterBlogMetaDescription(strMetaDescription);
		this.enterBlogDescription(strDescription);
		this.enterShortDescription(strShortDescription);
		this.selectBlogDocument(strblogDoc);
		this.selectBlogImage(strBlogImg);
		this.clickBlogSubmitBtn();
//		this.clickBlogSaveToDraftBtn();
	}
	
	public void searchForBlogsTable(String strBlogsTable) {
//		driver.navigate().to(driver.getCurrentUrl());
		waitutility.waitForAnElement(blogsPublishTable, driver);
		tableutility.searchInPublishedBlogsTable(blogsPublishTable, driver, strBlogsTable);
	}
	
	public void searchForDraftBlogsTable(String strBlogsTable) {
		waitutility.waitForAnElement(blogsDraftTable, driver);
		tableutility.searchInDraftBlogsTable(blogsDraftTable, driver, strBlogsTable);
	}
	public void clickblogCategoryBtn() {
		blogCategoryButton.click();
	}
	public String getBlogCategoryPageMsg() {
		waitutility.waitForAnElement(blogCategoryPageMsg, driver);
		String blogCategoryPageMsgText = blogCategoryPageMsg.getText();
		return blogCategoryPageMsgText;
	}
	public void clickaddBlogCategoryBtn() {
		addBlogCategoryButton.click();
	}
	public String getaddBlogCategoryPageMsg() {
		waitutility.waitForAnElement(addBlogCategoryPageMsg, driver);
		String addBlogCategoryPageMsgText = addBlogCategoryPageMsg.getText();
		return addBlogCategoryPageMsgText;
	}
	public void enterBlogCategoryName(String strBlogCateName) {
		blogCategoryName.sendKeys(strBlogCateName);
	}
	public void enterBlogCategoryDesc(String strBlogCateDesc) {
		blogCategoryDescription.sendKeys(strBlogCateDesc);
	}
	public void clickBlogCateSudmitBtn() {
		blogCategorySubMitButton.click();
	}
	public void enterNewBlogCate(String strBlogCateName, String strBlogCateDesc) {
		this.enterBlogCategoryName(strBlogCateName);
		this.enterBlogCategoryDesc(strBlogCateDesc);
		this.clickBlogCateSudmitBtn();
	} 
	public void searchInBlogCategoryTable(String strBlogCateName) {
		driver.navigate().to(driver.getCurrentUrl());
		waitutility.waitForAnElement(blogCategoryTable, driver);
		tableutility.searchInBlogCategoryTable(blogCategoryTable, driver, strBlogCateName);
	}

}