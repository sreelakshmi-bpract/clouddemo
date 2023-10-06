package com.clouddemo.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableUtility {
	
	public void searchInUserTicketTable(WebElement userTicketTable, WebDriver driver, String value) {
		List<WebElement> r_table = userTicketTable.findElements(By.tagName("tr"));
		String b_xpath = "//*[@name=\"all-tickets\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath + r + a_xpath)).getText();
			if(n.contains(value)){
				String celtxt=driver.findElement(By.xpath("//*[@name=\"all-tickets\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("The subject of ticket created is :" + celtxt);
				break;
				}
			}
		}	
	public void searchInDocumentTable(WebElement docTable, WebDriver driver, String docValue) {
		List<WebElement> r_table = docTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"tools-documents\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(docValue)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"tools-documents\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("Document created is :" + celtxt);
				break;
				}
			}
		}
	public void searchInCannedResponseTable(WebElement cannedResponseTable, WebDriver driver, String titleValue) {
		List<WebElement> r_table = cannedResponseTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"canned-table\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(titleValue)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"canned-table\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("Canned Response created is :" + celtxt);
				break;
				}
			}
		}
	public void searchInCategoryTable(WebElement CategoryTable, WebDriver driver, String cateTitle) {
		List<WebElement> r_table = CategoryTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"category-table\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(cateTitle)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"category-table\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("Category created is :" + celtxt);
				break;
				}
			}
		}
	public void searchInDepartmentTable(WebElement DepartmentTable, WebDriver driver, String departName) {
		List<WebElement> r_table = DepartmentTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"department-table\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(departName)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"department-table\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("Department created is :" + celtxt);
				break;
				}
			}
		}
//Article Category	
	public void searchInArticleCategoryTable(WebElement ArticleCateTable, WebDriver driver, String articleCateName) {
		List<WebElement> r_table = ArticleCateTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"category-table\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(articleCateName)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"category-table\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("Article Category created is :" + celtxt);
				break;
				}
			}
		}
//Article		
		public void searchInArticleTable(WebElement ArticleTable, WebDriver driver, String articleTitle) {
			List<WebElement> r_table = ArticleTable.findElements(By.tagName("tr"));
			String b_xpath = "//table[@name=\"article-table\"]/tbody/tr[";
			String a_xpath = "]/td[2]";
			int rs_c = r_table.size();
			for (int r = 1;r <= rs_c; r++) {
				String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
				if(n.contains(articleTitle)){
					String celtxt=driver.findElement(By.xpath("//table[@name=\"article-table\"]/tbody/tr["+r+"]/td[2]")).getText();
					System.out.println("Article created is :" + celtxt);
					break;
					}
				}
			}
//Faq Category	
	public void searchInFaqCategoryTable(WebElement FaqCategoryTable, WebDriver driver, String faqCateName) {
		List<WebElement> r_table = FaqCategoryTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"faq-category\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(faqCateName)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"faq-category\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("faqCategory created is :" + celtxt);
				break;
				}
			}
		}
//Faq 	
	public void searchInFaqTable(WebElement FaqTable, WebDriver driver, String faqQuestion) {
		List<WebElement> r_table = FaqTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"faq-table\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.equals(faqQuestion)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"faq-table\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("FAQ found :" + celtxt);
				return;
			}
		}
		System.out.println("FAQ not found");
	}
	public void actionInFaqTable(WebElement FaqTable, WebDriver driver, String faqQuestion) {
		List<WebElement> r_table = FaqTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"faq-table\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(faqQuestion)){
				driver.findElement(By.xpath("//table[@name=\"faq-table\"]/tbody/tr["+r+"]/td[4]/button")).click();
				break;
				}
			}
		}
//Blog 	
	public void searchInPublishedBlogsTable(WebElement blogTable, WebDriver driver, String blogTitle) {
		List<WebElement> r_table = blogTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"published-table\"]/tbody/tr[";
		String a_xpath = "]/td[3]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(blogTitle)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"published-table\"]/tbody/tr["+r+"]/td[3]")).getText();
				System.out.println("New Blog created is :" + celtxt);
				break;
				}
			}
		}

	public void searchInDraftBlogsTable(WebElement draftBlogTable, WebDriver driver, String draftBlogTitle) {
		List<WebElement> r_table = draftBlogTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"draft-table\"]/tbody/tr[";
		String a_xpath = "]/td[3]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(draftBlogTitle)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"draft-table\"]/tbody/tr["+r+"]/td[3]")).getText();
				System.out.println("New Draft Blog latest"
						+ " :" + celtxt);
				break;
				}
			}
		}
	public void searchInBlogCategoryTable(WebElement BlogCategoryTable, WebDriver driver, String blogCateName) {
		List<WebElement> r_table = BlogCategoryTable.findElements(By.tagName("tr"));
		String b_xpath = "//table[@name=\"name-category\"]/tbody/tr[";
		String a_xpath = "]/td[2]";
		int rs_c = r_table.size();
		for (int r = 1;r <= rs_c; r++) {
			String n = driver.findElement(By.xpath(b_xpath+r+a_xpath)).getText();
			if(n.contains(blogCateName)){
				String celtxt=driver.findElement(By.xpath("//table[@name=\"name-category\"]/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("blogCategory created is :" + celtxt);
				break;
				}
			}
		}
}