package com.clouddemo.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.clouddemo.pages.CloudDemoCommunicationPage;
import com.clouddemo.pages.CloudDemoHomePage;
import com.clouddemo.pages.CloudDemoLoginPage;

public class CloudDemoCommunicationTest extends CloudDemoTestHelper{
	
	CloudDemoLoginPage clouddemologinpage;
	CloudDemoHomePage clouddemohomepage;
	CloudDemoCommunicationPage clouddemocommunicationpage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String browser) { 
		driver = launchBrowser(browser);
	}
	
//Article	
//	@Test(priority=0)
	public void verifyCreateNewArticleCategory() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickArticlesBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getArticlesPageMsg().contains("Articles"));
		Reporter.log("You are on Articles Page", true);
		clouddemocommunicationpage.clickArticleCategory();
		Assert.assertTrue(clouddemocommunicationpage.getArticleCategoryPageMsg().contains("All Categories"));
		Reporter.log("You are on Article Category Page", true);
		clouddemocommunicationpage.clickAddArticleCategoryBtn();
		Assert.assertTrue(clouddemocommunicationpage.getAddArticleCategoryPageMsg().contains("Add Article Category"));
		Reporter.log("You are on Add Article Category Page", true);
		clouddemocommunicationpage.categoryValues("Article Category New2", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");		
	}
//	@Test(priority=1)
	public void verifyCreatedArticleCategory() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickArticlesBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getArticlesPageMsg().contains("Articles"));
		Reporter.log("You are on Articles Page", true);
		clouddemocommunicationpage.clickArticleCategory();
		Assert.assertTrue(clouddemocommunicationpage.getArticleCategoryPageMsg().contains("All Categories"));
		Reporter.log("You are on Article Category Page", true);
		clouddemocommunicationpage.searchForArticleCategoryTable("Article Category New2");
	}
	
//	@Test(priority=2)
	public void verifyCategoryValidationMsgs() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickArticlesBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getArticlesPageMsg().contains("Articles"));
		Reporter.log("You are on Articles Page", true);
		clouddemocommunicationpage.clickArticleCategory();
		Assert.assertTrue(clouddemocommunicationpage.getArticleCategoryPageMsg().contains("All Categories"));
		Reporter.log("You are on Article Category Page", true);
		clouddemocommunicationpage.clickAddArticleCategoryBtn();
		Assert.assertTrue(clouddemocommunicationpage.getAddArticleCategoryPageMsg().contains("Add Article Category"));
		Reporter.log("You are on Add Article Category Page", true);
		clouddemocommunicationpage.clickArticleCategorySubmitBtn();
		Assert.assertTrue(clouddemocommunicationpage.getCategoryNameValidation().contains("Article Category Name is required"));
		Assert.assertTrue(clouddemocommunicationpage.getCategoryDescValidation().contains("Description Is Required"));
		Reporter.log("Validation Msgs", true);
	}
	
//	@Test(priority=3)
	public void verifyCreateNewArticle() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickArticlesBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getArticlesPageMsg().contains("Articles"));
		Reporter.log("You are on Articles Page", true);
		clouddemocommunicationpage.clickArticleBtn();
		Assert.assertTrue(clouddemocommunicationpage.getArticleIndexPageMsg().contains("All Articles"));
		Reporter.log("Your are on Article Index Page", true);
		clouddemocommunicationpage.clickAddArticleBtn();
		Assert.assertTrue(clouddemocommunicationpage.getCreateArticlePageMsg().contains("Add Article"));
		Reporter.log("You are on Create Article Page", true);
		clouddemocommunicationpage.articleValues("Latest Article", "MLM", "Latest Article Description");
		Assert.assertTrue(clouddemocommunicationpage.getArticleIndexPageMsg().contains("All Articles"));
		Reporter.log("Redirected to Article Index After Creation", true);
	}
//	@Test(priority=4)
	public void verifyCreatedArticle() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickArticlesBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getArticlesPageMsg().contains("Articles"));
		Reporter.log("You are on Articles Page", true);
		Assert.assertTrue(clouddemocommunicationpage.getArticleIndexPageMsg().contains("All Articles"));
		Reporter.log("Your are on Article Index Page", true);
		clouddemocommunicationpage.searchForArticleTable("Latest Article");
	}
	
//	@Test(priority=5)
	public void verifyArticleValidationMsg() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickArticlesBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getArticlesPageMsg().contains("Articles"));
		Reporter.log("You are on Articles Page", true);
		clouddemocommunicationpage.clickArticleBtn();
		Assert.assertTrue(clouddemocommunicationpage.getArticleIndexPageMsg().contains("All Articles"));
		Reporter.log("Your are on Article Index Page", true);
		clouddemocommunicationpage.clickAddArticleBtn();
		Assert.assertTrue(clouddemocommunicationpage.getAddArticleCategoryPageMsg().contains("Add Article"));
		clouddemocommunicationpage.clickArticleSubmitBtn();
		Assert.assertTrue(clouddemocommunicationpage.getArticleNameValidationMsg().contains("Title is required"));
		Assert.assertTrue(clouddemocommunicationpage.getArticleCategoryValidationMsg().contains("Category is required"));
		Assert.assertTrue(clouddemocommunicationpage.getArticleDescValidationMsg().contains("Description Is Required"));
		Reporter.log("Displayed All Validation Msg", true);
	}
	
//FAQ'S
//	@Test(priority=6)
	public void verifyCreateNewFAQsCategory() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickFAQBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getFAQSPageMsg().contains("FAQ's"));
		Reporter.log("You are on FAQ'S Page", true);
		clouddemocommunicationpage.clickFAQsCategoryBtn();
		clouddemocommunicationpage.clickAddFAQCategoryBtn();
		Assert.assertTrue(clouddemocommunicationpage.getAddFaqsCategoryPageMsg().contains("Add FAQ's Category"));
		Reporter.log("You are on Add FAQ Category Page", true);
		clouddemocommunicationpage.faqCategoryValues("New Faq Category1", "New Faq Description", "Enabled");
	}
//	@Test(priority=7)
	public void verifyCreatedFAQsCategory() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickFAQBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getFAQSPageMsg().contains("FAQ's"));
		Reporter.log("You are on FAQ'S Page", true);
		clouddemocommunicationpage.clickFAQsCategoryBtn();
		clouddemocommunicationpage.searchForFaqCategoryTable("New Faq Category1");
	}
	
//	@Test(priority=8)
	public void verifyFAQsCategoryValidationMsg() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickFAQBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getFAQSPageMsg().contains("FAQ's"));
		Reporter.log("You are on FAQ'S Page", true);
		clouddemocommunicationpage.clickFAQsCategoryBtn();
		clouddemocommunicationpage.clickAddFAQCategoryBtn();
		Assert.assertTrue(clouddemocommunicationpage.getAddFaqsCategoryPageMsg().contains("Add FAQ's Category"));
		Reporter.log("You are on Add FAQ Category Page", true);
		clouddemocommunicationpage.clickFaqCategorySubmitBtn();
		Assert.assertTrue(clouddemocommunicationpage.getFaqCateNameValidationMsg().contains("Category Name is required"));
		Assert.assertTrue(clouddemocommunicationpage.getFaqCateDescValidation().contains("Description is required"));
		Reporter.log("Validation Msg OF Name and Desc", true);
	}
//	@Test(priority=9)
	public void verifyCreateNewFaq() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickFAQBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getFAQSPageMsg().contains("FAQ's"));
		Reporter.log("You are on FAQ'S Page", true);
		clouddemocommunicationpage.clickAddFaqBtn();
		Assert.assertTrue(clouddemocommunicationpage.getAddFaqPageMsg().contains("Add FAQ's"));
		Reporter.log("You are on Add Faq Page", true);
		clouddemocommunicationpage.addFaqValues("Faq Category Two", "Faq Question a5", "Faq Answer a5");
		clouddemocommunicationpage.searchForFaqTable("Faq Question a5");
	}

	
//	@Test(priority=10)
	public void verifyAddFaqValidation() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickFAQBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getFAQSPageMsg().contains("FAQ's"));
		Reporter.log("You are on FAQ'S Page", true);
		clouddemocommunicationpage.clickAddFaqBtn();
		Assert.assertTrue(clouddemocommunicationpage.getAddFaqPageMsg().contains("Add FAQ's"));
		Reporter.log("You are on Add Faq Page", true);
		clouddemocommunicationpage.clickAddFaqSubmitBtn();
		Assert.assertTrue(clouddemocommunicationpage.getAddFaqNameValidation().contains("Category Name is required"));
		Assert.assertTrue(clouddemocommunicationpage.getAddFaqQuestionValidation().contains("Question is required"));
		Assert.assertTrue(clouddemocommunicationpage.getaddFaqAnswerValidation().contains("Answer Is Require"));
		Reporter.log("Validation Msg of Category Name, Question and Answer", true);
	}
	@Test(priority=11)
	public void verifyDeleteFaq() {
		clouddemologinpage = new CloudDemoLoginPage(driver);
		clouddemologinpage.login("info@cloudlumen.com", "12345678");
		clouddemohomepage = new CloudDemoHomePage(driver);
		clouddemohomepage.clickCommunicationBtn();
		clouddemohomepage.clickFAQBtn();
		clouddemocommunicationpage = new CloudDemoCommunicationPage(driver);
		Assert.assertTrue(clouddemocommunicationpage.getFAQSPageMsg().contains("FAQ's"));
		Reporter.log("You are on FAQ'S Page", true);
		clouddemocommunicationpage.searchForFaqTable("Faq Question a3");
		clouddemocommunicationpage.deleteInFaqTable("Faq Question a3");
		clouddemocommunicationpage.searchForFaqTable("Faq Question a3");
	}
}
