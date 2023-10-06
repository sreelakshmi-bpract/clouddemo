package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.PageUtility;
import com.clouddemo.utilities.TableUtility;
import com.clouddemo.utilities.WaitUtility;

public class CloudDemoCommunicationPage {
	WebDriver driver; 
	
//Article Category	
	@FindBy(xpath="//h4[contains(text(), \"Articles\")]")
	WebElement articlesPageMsg;
	@FindBy(xpath="//span[contains(text(), \"Article Category\")]")
	WebElement articleCategoryButton;
	@FindBy(xpath="//p[contains(text(), \"All Categories\")]")
	WebElement articleCategoryPageMsg;
	@FindBy(xpath="//button[contains(text(), \"Article Category\")]")
	WebElement addArticleCategoryButton;
	@FindBy(xpath="//h2[contains(text(), \"Add Article Category\")]")
	WebElement addArticleCategoryPageMsg;
	@FindBy(name="name")
	WebElement articleCategoryName;
	@FindBy(xpath="//*[@id=\"description\"]/div/div[1]")
	WebElement articleCategoryDescription;
	@FindBy(name="submit")
	WebElement articleCategorySubmitButton;
	
//Validation Of Article Category	
	@FindBy(xpath="//p[contains(text(),\"Article Category Name is required\")]")
	WebElement articleCategoryNameValidation;
	@FindBy(xpath="//p[contains(text(),\"Description is required\")]")
	WebElement articleCategoryDescValidation;
	@FindBy(xpath="//table[@name=\"category-table\"]/tbody")
	WebElement articleCategoryTable;
	
//Article	
	@FindBy(xpath="//span[contains(text(), \"Articles\")]")
	WebElement articleButton;
	@FindBy(xpath="//p[contains(text(), \"All Articles\")]")
	WebElement articleIndexPageMsg;
	@FindBy(name="add-article")
	WebElement createArticleButton;
	@FindBy(xpath="//h2[contains(text(), \"Add Article\")]")
	WebElement createArticlePageMsg;
	@FindBy(name="title")
	WebElement articleName;
	@FindBy(name="category_id")
	WebElement SelectArticleCategory;
	@FindBy(xpath="//*[@id=\"description\"]/div/div[1]")
	WebElement articleDesc;
	@FindBy(name="submit")
	WebElement articleSubmitButton;
	@FindBy(xpath="//table[@name=\"article-table\"]/tbody")
	WebElement articleTable;
	
//Validation Msgs of Article
	@FindBy(xpath="//p[contains(text(), \"Title is required\")]")
	WebElement articleNameValidation;
	@FindBy(xpath="//p[contains(text(), \"Category is required\")]")
	WebElement articleCategoryValidation;
	@FindBy(xpath="//p[contains(text(), \"Description is required\")]")
	WebElement articleDescValidation;
	
//FAQ'S Category
	@FindBy(xpath="//h4[contains(text(), \"FAQ's\")]")
	WebElement faqsPageMsg;
	@FindBy(name="faq-category")
	WebElement faqCategoryButton;
	@FindBy(name="add-category")
	WebElement addFAQCategoryButton;
	@FindBy(xpath="//h2[contains(text(), \"Add FAQ's Category\")]")
	WebElement addFaqCategoryPageMsg;
	@FindBy(name="name")
	WebElement faqCategoryName;
	@FindBy(xpath="/html/body/div[2]/div[3]/div/form/div[1]/p/div/div[2]/div/textarea[1]")
	WebElement faqCateDesc;
	@FindBy(name="active")
	WebElement faqCateStatus;
	@FindBy(name="faq-submit")
	WebElement faqCateSubmitButton;
	@FindBy(xpath="//table[@name=\"faq-category\"]/tbody")
	WebElement faqCategoryTable;

//Validation msgs of Faq Category
	@FindBy(xpath="//p[contains(text(), \"Category Name is required\")]")
	WebElement faqCateNameValidation;
	@FindBy(xpath="//p[contains(text(), \"Description is required\")]")
	WebElement faqCateDescValidation;
	
//FAQ'S
	@FindBy(name="add-faq")
	WebElement addFaqButton;
	@FindBy(xpath="//h2[contains(text(), \"Add FAQ's\")]")
	WebElement addFaqPageMsg;
	@FindBy(name="category_id")
	WebElement addFaqCategoryField;
	@FindBy(xpath="/html/body/div[2]/div[3]/div/form/div[1]/p/div/div[2]/div/textarea[1]")
	WebElement addFaqQuestions;
	@FindBy(xpath="/html/body/div[2]/div[3]/div/form/div[1]/p/div/div[3]/div/div[2]/div/div[1]")
	WebElement addFaqAnswer;
	@FindBy(name="faq-submit")
	WebElement addFaqSubmitButton;
	@FindBy(xpath="//table[@name=\"faq-table\"]/tbody")
	WebElement faqTable;
	@FindBy(name="faq-delete")
	WebElement faqDeleteInAction;
//	assertion for delete pop-up page
	@FindBy(xpath="//button[@name=\"add-faq\" and contains(text(), \"Delete\")]")
	WebElement faqDeleteButton;
		
//Validation Msgs Of Faq
	@FindBy(xpath="//p[contains(text(), \"Category Name is required\")]")
	WebElement addFaqNameValidation;
	@FindBy(xpath="//p[contains(text(), \"Question is required\")]")
	WebElement addFaqQuestionValidation;
	@FindBy(xpath="//p[contains(text(), \"Answer is required\")]")
	WebElement addFaqAnswerValidation;
	
	WaitUtility waitutility = new WaitUtility();
    PageUtility pageutility = new PageUtility();
    TableUtility tableutility = new TableUtility();
	
	public CloudDemoCommunicationPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//Article	
	public String getArticlesPageMsg() {
		waitutility.waitForAnElement(articlesPageMsg, driver);
		String articlesPageMsgText = articlesPageMsg.getText();
		return articlesPageMsgText;
	}
	public void clickArticleCategory() {
		waitutility.waitForAnElement(articleCategoryButton, driver);
		articleCategoryButton.click();
	}
	public String getArticleCategoryPageMsg() {
		waitutility.waitForAnElement(articleCategoryPageMsg, driver);
		String articleCategoryPageMsgText = articleCategoryPageMsg.getText();
		return articleCategoryPageMsgText;
	}
	public void clickAddArticleCategoryBtn() {
		waitutility.waitForAnElement(addArticleCategoryButton, driver);
		addArticleCategoryButton.click();
	}
	public String getAddArticleCategoryPageMsg() {
		waitutility.waitForAnElement(addArticleCategoryPageMsg, driver);
		String addArticleCategoryPageMsgText = addArticleCategoryPageMsg.getText();
		return addArticleCategoryPageMsgText;
	}
	public void enterArticleCategoryName(String strCateName) {
		articleCategoryName.sendKeys(strCateName);
	}
	public void enterArticleCategoryDesc(String strCateDesc) {
		articleCategoryDescription.sendKeys(strCateDesc);
	}
	public void clickArticleCategorySubmitBtn() {
		articleCategorySubmitButton.click();
	}
	public void categoryValues(String strCateName, String strCateDesc) {
		this.enterArticleCategoryName(strCateName);
		this.enterArticleCategoryDesc(strCateDesc);
		this.clickArticleCategorySubmitBtn();
	}
	public String getCategoryNameValidation() {
		waitutility.waitForAnElement(articleCategoryNameValidation, driver);
		String articleCategoryNameValidationText = articleCategoryNameValidation.getText();
		return articleCategoryNameValidationText;
	}
	public String getCategoryDescValidation() {
		waitutility.waitForAnElement(articleCategoryDescValidation, driver);
		String articleCategoryDescValidationText = articleCategoryDescValidation.getText();
		return articleCategoryDescValidationText;
	}
	public void searchForArticleCategoryTable(String articleCateName) {
		waitutility.waitForAnElement(articleCategoryTable, driver);
		tableutility.searchInArticleCategoryTable(articleCategoryTable, driver, articleCateName);
	}
	public void clickArticleBtn() {
		articleButton.click();
	}
	public String getArticleIndexPageMsg() {
		waitutility.waitForAnElement(articleIndexPageMsg, driver);
		String articleIndexPageMsgText = articleIndexPageMsg.getText();
		return articleIndexPageMsgText;
	}
	public void clickAddArticleBtn() {
		createArticleButton.click();
	}
	public String getCreateArticlePageMsg() {
		waitutility.waitForAnElement(createArticlePageMsg, driver);
	    String createArticlePageMsgText = createArticlePageMsg.getText();
	    return createArticlePageMsgText;
	}
	public void enterArticleName(String strArticleName) {
		articleName.sendKeys(strArticleName);
	}
	public void selectArticleCategory(String strArticleCategory) {
		pageutility.selectByVisibleText(SelectArticleCategory, driver, strArticleCategory);
	}
	public void enterArticleDesc(String strArticleDescription) {
		articleDesc.sendKeys(strArticleDescription);
	}
	public void clickArticleSubmitBtn() {
		waitutility.waitForAnElement(articleSubmitButton, driver);
		articleSubmitButton.click();
	}
	public void articleValues(String strArticleName, String strArticleCategory, String strArticleDescription) {
		this.enterArticleName(strArticleName);
		this.selectArticleCategory(strArticleCategory);
		this.enterArticleDesc(strArticleDescription);
		this.clickArticleSubmitBtn();
	}
	public void searchForArticleTable(String strarticleTitle) {
		waitutility.waitForAnElement(articleTable, driver);
		tableutility.searchInArticleTable(articleTable, driver, strarticleTitle);
	}
	public String getArticleNameValidationMsg() {
		waitutility.waitForAnElement(articleNameValidation, driver);
		String articleNameValidationText = articleNameValidation.getText();
		return articleNameValidationText;
	}
	public String getArticleCategoryValidationMsg() {
		waitutility.waitForAnElement(articleCategoryValidation, driver);
		String articleCategoryValidationText = articleCategoryValidation.getText();
		return articleCategoryValidationText;
	}
	public String getArticleDescValidationMsg() {
		waitutility.waitForAnElement(articleDescValidation, driver);
		String articleDescValidationText = articleDescValidation.getText();
		return articleDescValidationText;
	}

//FAQ'S
	public String getFAQSPageMsg() {
		waitutility.waitForAnElement(faqsPageMsg, driver);
		String faqsPageMsgText = faqsPageMsg.getText();
		return faqsPageMsgText;
	}
	public void clickFAQsCategoryBtn() {
		waitutility.waitForAnElement(faqCategoryButton, driver);
		faqCategoryButton.click();
	}
	public void clickAddFAQCategoryBtn() {
		waitutility.waitForAnElement(addFAQCategoryButton, driver);
		addFAQCategoryButton.click();
	}
	public String getAddFaqsCategoryPageMsg() {
		waitutility.waitForAnElement(addFaqCategoryPageMsg, driver);
		String addFaqCategoryPageMsgText = addFaqCategoryPageMsg.getText();
		return addFaqCategoryPageMsgText;
	}
	public void enterFaqCategoryName(String strFaqCateName) {
		faqCategoryName.sendKeys(strFaqCateName);
	}
	public void enterFaqCategoryDesc(String strCateDesc) {
		faqCateDesc.sendKeys(strCateDesc);
	}
	public void selectFaqCategoryStatus(String strCateStatus) {
		pageutility.selectByVisibleText(faqCateStatus, driver, strCateStatus);
	}
	public void clickFaqCategorySubmitBtn() {
		faqCateSubmitButton.click();
	}
	public void faqCategoryValues(String strFaqCateName, String strCateDesc, String strCateStatus) {
		this.enterFaqCategoryName(strFaqCateName);
		this.enterFaqCategoryDesc(strCateDesc);
		this.selectFaqCategoryStatus(strCateStatus);
		this.clickFaqCategorySubmitBtn();
	}
	public void searchForFaqCategoryTable(String strFaqCateName) {
		waitutility.waitForAnElement(faqCategoryTable, driver);
		tableutility.searchInFaqCategoryTable(faqCategoryTable, driver, strFaqCateName);
	}
	public String getFaqCateNameValidationMsg() {
		waitutility.waitForAnElement(faqCateNameValidation, driver);
		String faqCateNameValidationText = faqCateNameValidation.getText();
		return faqCateNameValidationText;
	}
	public String getFaqCateDescValidation() {
		waitutility.waitForAnElement(faqCateDescValidation, driver);
		String faqCateDescValidationText = faqCateDescValidation.getText();
		return faqCateDescValidationText;
	}
	public void clickAddFaqBtn() {
		waitutility.waitForAnElement(addFaqButton, driver);
		addFaqButton.click();
	}
	public String getAddFaqPageMsg() {
		waitutility.waitForAnElement(addFaqPageMsg, driver);
		String addFaqPageMsgText = addFaqPageMsg.getText();
		return addFaqPageMsgText;
	}
	public void enterAddFaqCategoryField(String strAddFaqCateField) {
		pageutility.scrollToElement(addFaqCategoryField, driver);
		pageutility.selectByVisibleText(addFaqCategoryField, driver, strAddFaqCateField);
	}
	public void enterAddFaqQuestion(String strAddFaqQuestion) {
		addFaqQuestions.sendKeys(strAddFaqQuestion);
	}
	public void enterAddFaqAnswer(String strAddFaqAnswer) {
		addFaqAnswer.sendKeys(strAddFaqAnswer);
	}
	public void clickAddFaqSubmitBtn() {
		addFaqSubmitButton.click();
	}
	public void addFaqValues(String strAddFaqCateField, String strAddFaqQuestion, String strAddFaqAnswer) {
		this.enterAddFaqCategoryField(strAddFaqCateField);
		this.enterAddFaqQuestion(strAddFaqQuestion);
		this.enterAddFaqAnswer(strAddFaqAnswer);
		this.clickAddFaqSubmitBtn();
	}
	public void searchForFaqTable(String strFaqQuestion) {
		waitutility.waitForAnElement(faqTable, driver);
//		driver.navigate().to(driver.getCurrentUrl());
		driver.navigate().refresh();
		waitutility.waitForAnElement(faqTable, driver);
		tableutility.searchInFaqTable(faqTable, driver, strFaqQuestion);
	}
	public void deleteInFaqTable(String strFaqQuestion) {
		waitutility.waitForAnElement(faqTable, driver);
		tableutility.actionInFaqTable(faqTable, driver, strFaqQuestion);
		waitutility.waitForAnElement(faqDeleteInAction, driver);
		faqDeleteInAction.click();
		waitutility.waitForAnElement(faqDeleteButton, driver);
		faqDeleteButton.click();
	}
	public String getAddFaqNameValidation() {
		waitutility.waitForAnElement(addFaqNameValidation, driver);
		String addFaqNameValidationText = addFaqNameValidation.getText();
		return addFaqNameValidationText;
	}
	public String getAddFaqQuestionValidation() {
		waitutility.waitForAnElement(addFaqQuestionValidation, driver);
		String addFaqQuestionValidationText = addFaqQuestionValidation.getText();
		return addFaqQuestionValidationText;
	}
	public String getaddFaqAnswerValidation() {
		waitutility.waitForAnElement(addFaqAnswerValidation, driver);
		String addFaqAnswerValidationText = addFaqAnswerValidation.getText();
		return addFaqAnswerValidationText;
	}
}
