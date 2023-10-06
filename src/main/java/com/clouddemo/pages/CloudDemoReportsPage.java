package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.WaitUtility;

public class CloudDemoReportsPage {
	WebDriver driver;
	
	@FindBy(xpath="//h4[contains(text(), \"Joining Report\")]")
	WebElement joiningReportPageMsg;
	
	WaitUtility waitutility = new WaitUtility();
	
	public CloudDemoReportsPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getJoiningReportPageMsg() {
		waitutility.waitForAnElement(joiningReportPageMsg, driver);
		String joiningReportPageMsgText = joiningReportPageMsg.getText();
		return joiningReportPageMsgText;		
	}

}
