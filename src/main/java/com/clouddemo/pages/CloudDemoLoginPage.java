package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.WaitUtility;

public class CloudDemoLoginPage {
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement emailAddress;
	@FindBy(name="password")
	WebElement passwordField;
	@FindBy(name="login")
	WebElement loginButton;
	@FindBy(xpath="//p[contains(text(),\"Email is required\")]")
	WebElement blankEmailField;
	@FindBy(xpath="//p[contains(text(),\"Password is required\")]")
	WebElement blankPasswordField;
	@FindBy(name="remember")
	WebElement rememberMeCheckbox;
	@FindBy(xpath="//a[contains(text(),\"Forgot password?\")]")
	WebElement forgotPasswordButton;
	@FindBy(xpath="//h3[contains(text(),\"Hi, Welcome Back\")]")
	WebElement backToLoginMsg;
	@FindBy(xpath="//a[contains(text(),\"Get started\")]")
	WebElement registerPage;
	@FindBy(xpath="//p[contains(text(), \"Email must be a valid email address\")]")
	WebElement invalidEmailAddressMsg;
	@FindBy(xpath="//div[contains(text(), \"Wrong credentials!\")]")
	WebElement wrongCredentialsMsg;
	
	
	WaitUtility waitutility = new WaitUtility();
	
	public CloudDemoLoginPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String strEmail) {
		emailAddress.sendKeys(strEmail);
	}
	public void enterPassword(String strPassword) {
		passwordField.sendKeys(strPassword);
	}
	public void clickLoginBtn() {
		loginButton.click();		
	}
	public void clickRememberMeBox() {
		rememberMeCheckbox.click();
	}
	public void clickForgotPasswordBtn() {
		forgotPasswordButton.click();
	}
	public void clickGetStartedBtn() {
		registerPage.click();
	}
	public void login(String strEmail, String strPassword) {
		this.enterEmail(strEmail);
		this.enterPassword(strPassword);
		this.clickLoginBtn();
	}
	public String getEmailRequiredMsg() {
		waitutility.waitForAnElement(blankEmailField, driver);
		String emailRequiredMsgText = blankEmailField.getText();
		return emailRequiredMsgText;
	}
	public String getPasswordRequiredMsg() {
		String passwordRequiredMsgText = blankPasswordField.getText();
		return passwordRequiredMsgText;
	}
	public String getbackToLoginMsg() {
		waitutility.waitForAnElement(backToLoginMsg, driver);
		String backToLoginMsgText = backToLoginMsg.getText();
		return backToLoginMsgText;	
	}
	public String getInvalidEmailAddress() {
		waitutility.waitForAnElement(invalidEmailAddressMsg, driver);
		String invalidEmailAddressMsgText = invalidEmailAddressMsg.getText();
		return invalidEmailAddressMsgText;
	}
	public String getWrongCredentialsMsg() {
		waitutility.waitForAnElement(wrongCredentialsMsg, driver);
		String wrongCredentialsMsgText = wrongCredentialsMsg.getText();
		return wrongCredentialsMsgText;
	}
}
