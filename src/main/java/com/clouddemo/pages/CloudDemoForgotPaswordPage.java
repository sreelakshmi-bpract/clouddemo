package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.WaitUtility;

public class CloudDemoForgotPaswordPage {
	WebDriver driver;
	
	@FindBy(xpath="//p[contains(text(),\"Forgot your password?\")]")
	WebElement forgotPasswordMsg;
	@FindBy(name="email")
	WebElement emailField;
	@FindBy(name="ResetPassword")
	WebElement resetPasswordButton;
	@FindBy(xpath="//h3[contains(text(),\"Request sent successfully\")]")
	WebElement requestMailSentMsg;
	@FindBy(xpath="//a[contains(text(),\"Back\")]")
	WebElement backToLogin;
	
	
	WaitUtility waitutility = new WaitUtility();
	
	public CloudDemoForgotPaswordPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getForgotPasswordMsg() {
		waitutility.waitForAnElement(forgotPasswordMsg, driver);
		String forgotPasswordMsgText = forgotPasswordMsg.getText();
		return forgotPasswordMsgText;			
	}
	public void enterEmailAddress(String strEmail) {
		waitutility.waitForAnElement(emailField, driver);
		emailField.sendKeys(strEmail);
	}
	public void clickResetPasswordBtn() {
		resetPasswordButton.click();
	}
	public void clickBackBtn() {
		backToLogin.click();
	}
	public void forgotPassword(String strEmail) {
		this.enterEmailAddress(strEmail);	
		this.clickResetPasswordBtn();
	}
	public String getRequestMailMsg() {
		waitutility.waitForAnElement(requestMailSentMsg, driver);
		String RequestMailMsgText = requestMailSentMsg.getText();
		return RequestMailMsgText;
	}	
}
