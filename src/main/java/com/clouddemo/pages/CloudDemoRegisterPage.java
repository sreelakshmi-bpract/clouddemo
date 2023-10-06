package com.clouddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.WaitUtility;

public class CloudDemoRegisterPage {
	WebDriver driver;
	
	@FindBy(xpath="//h3[contains(text(),\"Register New Member \")]")
	WebElement registerPageMsg;
	@FindBy(name="email")
	WebElement emailField;
	@FindBy(name="username")
	WebElement usernameField;
	@FindBy(name="password")
	WebElement passwordField;
	@FindBy(name="repassword")
	WebElement confirmPassword;
	@FindBy(name="register")
	WebElement registerButton;
	@FindBy(xpath="//p[contains(text(),\"Email is required\")]")
	WebElement blankEmailField;
	@FindBy(xpath="//p[contains(text(),\"User Name is required\")]")
	WebElement blankUsername;
	@FindBy(xpath="//p[contains(text(),\"Password must be at least 8 characters\")]")
	WebElement blankPassword;
	@FindBy(xpath="//p[contains(text(),\"Password must match\")]")
	WebElement passwordMustMachMsg;
	
    WaitUtility waitutility = new WaitUtility();
	
	public CloudDemoRegisterPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getRegisterNewMemberMsg() {
		waitutility.waitForAnElement(registerPageMsg, driver);
		String registerNewMemberMsgText = registerPageMsg.getText();
		return registerNewMemberMsgText;
	}
	public void enterEmailAddress(String strEmail) {
		emailField.sendKeys(strEmail);
	}
	public void enterUsername(String strUsername) {
		usernameField.sendKeys(strUsername);
	}
	public void enterPassword(String strPassword) {
		passwordField.sendKeys(strPassword);
	}
	public void enterRepassword(String strRepassword) {
		confirmPassword.sendKeys(strRepassword);
	}
	public void clickRegisterBtn() {
		registerButton.click();
	}
	public void register(String strEmail, String strUsername, String strPassword, String strRepassword) {
		this.enterEmailAddress(strEmail);
		this.enterUsername(strUsername);
		this.enterPassword(strPassword);
		this.enterRepassword(strRepassword);
		this.clickRegisterBtn();		
	}
	public String getEmailRequiredMsgs() {
		waitutility.waitForAnElement(blankEmailField, driver);
		String emailRequiredMsgsText = blankEmailField.getText();
		return emailRequiredMsgsText;
	}
	public String getUsernameRequiredMsgs() {
		waitutility.waitForAnElement(blankUsername, driver);
		String usernameRequiredMsgsText = blankUsername.getText();
		return usernameRequiredMsgsText;
	}
	public String getPasswordRequiredMsgs() {
		waitutility.waitForAnElement(blankPassword, driver);
		String passwordRequiredMsgsText = blankPassword.getText();
		return passwordRequiredMsgsText;
	}
	public String getPasswordMismatchMsg() {
		waitutility.waitForAnElement(passwordMustMachMsg, driver);
		String passwordMismatchMsgText = passwordMustMachMsg.getText();
		return passwordMismatchMsgText;
	}

}
