package com.clouddemo.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clouddemo.utilities.PageUtility;
import com.clouddemo.utilities.WaitUtility;

public class CloudDemoProfilePage {
	WebDriver driver;
	
	@FindBy(xpath="//h6[contains(text(),\"Your Activity History\")]")
	WebElement activeHistoryMsg;
	@FindBy(name="edit-info")
	WebElement editInfoButton;
	@FindBy(xpath="//h6[contains(text(),\"Social Media Scope\")]")
	WebElement socialMediaScopeMsg;
	@FindBy(id="profile-image-upload")
	WebElement uploadImage;
	@FindBy(name="first_name")
	WebElement firstNameField;
	@FindBy(name="last_name")
	WebElement lastNameField;
	@FindBy(name="gender")
	WebElement genderField;
	@FindBy(name="country")
	WebElement countryField;
	@FindBy(name="state")
	WebElement stateField;
	@FindBy(name="city")
	WebElement cityField;
	@FindBy(name="zipcode")
	WebElement zipcodeField;
	@FindBy(name="address")
	WebElement addressField;
	@FindBy(name="mobile")
	WebElement mobileField;
	@FindBy(name="save")
	WebElement saveButton;
	@FindBy(xpath="//button[contains(text(),\"Profile\")]")
	WebElement profilePageButton;
	@FindBy(xpath="//span[contains(text(),\"Sponsor Information\")]")
	WebElement sponsorInfoMsg;
	@FindBy(name="settings")
	WebElement settingsButton;
	@FindBy(xpath="//h6[contains(text(),\"Account Settings\")]")
	WebElement accountSettingsMsg;
	@FindBy(name="password")
	WebElement newPasswordField;
	@FindBy(name="confirmNewPassword")
	WebElement confirmNewPasswordField;
	@FindBy(name="submit")
	WebElement saveChangesButton;
	@FindBy(xpath="//p[contains(text(),\"Password must be at least 8 characters\")]")
	WebElement passwordValidationMsg;
	@FindBy(xpath="//p[contains(text(),\"Passwords must match\")]")
	WebElement confirmPasswordValidationMsg;
	@FindBy(xpath="//h6[contains(text(),\"Change Coin Address\")]")
	WebElement changeCoinAddressMsg;
	@FindBy(xpath="//input[@name=\"1\" and @type=\"text\"]")
	WebElement liteCoinField;
	@FindBy(xpath="//input[@name=\"2\" and @type=\"text\"]")
	WebElement ethereumField;
	@FindBy(xpath="//input[@name=\"3\" and @type=\"text\"]")
	WebElement bitCoinField;
	@FindBy(xpath="//input[@name=\"4\" and @type=\"text\"]")
	WebElement bitCoinCashField;
	@FindBy(name="coin-address")
	WebElement coinAddressSaveButton;
	@FindBy(xpath="//h4[contains(text(),\"Profile\")]")
	WebElement profileTitleMsg;
	@FindBy(name="firstnameLastname")
	WebElement fullNameCorrect;
	@FindBy(name="gender")
	WebElement genderCorrect;
	@FindBy(name="city")
	WebElement cityCorrect;
	@FindBy(name="zipcode")
	WebElement zipcodeCorrect;
	@FindBy(name="address")
	WebElement addressCorrect;
	@FindBy(name="mobile")
	WebElement mobileCorrect;
	
	
    WaitUtility waitutility = new WaitUtility();
    PageUtility pageutility = new PageUtility();
	
	public CloudDemoProfilePage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getYourActivityHistoryMsg() {
		waitutility.waitForAnElement(activeHistoryMsg, driver);
		String yourActivityHistoryMsgText = activeHistoryMsg.getText();
		return yourActivityHistoryMsgText;
	}
	public void clickEditInfoBtn() {
		editInfoButton.click();
	}
	public String getSocialMediaScopeMsg() {
		waitutility.waitForAnElement(socialMediaScopeMsg, driver);
		String socialMediaScopeMsgText = socialMediaScopeMsg.getText();
		return socialMediaScopeMsgText;
	}
	
	public void clickUploadImg(String strUploadImage) throws AWTException, InterruptedException {
		pageutility.uploadImage(uploadImage, driver, strUploadImage);
	}
	public void enterFirstName(String strFirstName) {
		waitutility.waitForAnElement(firstNameField, driver);
		firstNameField.sendKeys(strFirstName);
	}
	public void enterLastName(String strLastName) {
		lastNameField.sendKeys(strLastName);
	}
	public void selectGender(String strGender) {
		pageutility.selectByVisibleText(genderField, driver, strGender);
	}
	public void selectCountry(String strCountry) {
		pageutility.selectByVisibleText(countryField, driver, strCountry);
	}
	public void enterState(String strState) {
		waitutility.waitForAnElement(stateField, driver);
		stateField.sendKeys(strState);
	}
	public void enterCity(String strCity) {
		waitutility.waitForAnElement(cityField, driver);
		cityField.sendKeys(strCity);
	}
	public void enterZipcode(String strZipcode) {
		waitutility.waitForAnElement(zipcodeField, driver);
		zipcodeField.sendKeys(strZipcode);
	}
	public void enterAddress(String strAddress) {
		waitutility.waitForAnElement(addressField, driver);
		addressField.sendKeys(strAddress);
	}
	public void enterMobile(String strMobile) {
		mobileField.sendKeys(strMobile);
	}
	public void clickSaveChangesBtn() {
		saveButton.click();
	}
	public void clearFirstName() {
		waitutility.waitForAnElement(firstNameField, driver);
		pageutility.clearWebField(firstNameField);
	}
	public void clearLastName() {
		pageutility.clearWebField(lastNameField);
	}
	public void clearState() {
		pageutility.clearWebField(stateField);
	}
	public void clearCity() {
		pageutility.clearWebField(cityField);
	}
	public void clearZipcode() {
		pageutility.clearWebField(zipcodeField);
	}
	public void clearAdress() {
		pageutility.clearWebField(addressField);
	}
	public void clearMobile() {
		pageutility.clearWebField(mobileField);
	}
	public void editInfo(String strFirstName, String strLastName, String strGender, String strCountry, String strState, String strCity, String strZipcode, String strAddress, String strMobile) {
		this.clearFirstName();
		this.enterFirstName(strFirstName);
		this.clearLastName();
		this.enterLastName(strLastName);
		this.selectGender(strGender);
		this.selectCountry(strCountry);
		this.clearState();
		this.enterState(strState);
		this.clearCity();
		this.enterCity(strCity);
		this.clearZipcode();
		this.enterZipcode(strZipcode);
		this.clearAdress();
		this.enterAddress(strAddress);
		this.clearMobile();
		this.enterMobile(strMobile);
		this.clickSaveChangesBtn();
	}
	public void clickProfileBtn() {
		pageutility.scrollToElement(profileTitleMsg, driver);
		profilePageButton.click();
		pageutility.scrollToElement(activeHistoryMsg, driver);  //just to view the details
	}
	public String getSponsorInfoMsg() {
		waitutility.waitForAnElement(sponsorInfoMsg, driver);
		String sponsorInfoMsgText = sponsorInfoMsg.getText();
		return sponsorInfoMsgText;
	}
	public void clickSettingsBtn() {
		waitutility.waitForAnElement(settingsButton, driver);
		settingsButton.click();
	}
	public String getAccountSettingsMsg() {
		waitutility.waitForAnElement(accountSettingsMsg, driver);
		String accountSettingsMsgText = accountSettingsMsg.getText();
		return accountSettingsMsgText;
	}
	public void enterNewPassword(String strPassword) {
		newPasswordField.sendKeys(strPassword);
	}
	public void enterNewConfirmPassword(String strConfirmPassword) {
		confirmNewPasswordField.sendKeys(strConfirmPassword);
	}
	public void clickSubmitBtn() {
		waitutility.waitForAnElement(saveChangesButton, driver);
		saveChangesButton.click();
	}
	public void enterNewPasswordUpdation(String strPassword, String strConfirmPassword) {
		this.enterNewPassword(strPassword);
		this.enterNewConfirmPassword(strConfirmPassword);
		this.clickSubmitBtn();
	}
	public String getPasswordValidationMsg() {
		waitutility.waitForAnElement(passwordValidationMsg, driver);
		String passwordValidationMsgText = passwordValidationMsg.getText();
		return passwordValidationMsgText;
	}
	public String getConfirmPasswordValidationMsg() {
		waitutility.waitForAnElement(confirmPasswordValidationMsg, driver);
		String confirmPasswordValidationMsgText = confirmPasswordValidationMsg.getText();
		return confirmPasswordValidationMsgText;
	}
	public String getChangeCoinAddressMsg() {
		waitutility.waitForAnElement(changeCoinAddressMsg, driver);
		String changeCoinAddressMsgText = changeCoinAddressMsg.getText();
		return changeCoinAddressMsgText;
	}
	public void enterLiteCoinField(String strLiteCoin) {
		liteCoinField.sendKeys(strLiteCoin);
	}
	public void enterEthereumField(String strethereum) {
		ethereumField.sendKeys(strethereum);
	}
	public void enterBitCoinField(String strbitCoin) {
		bitCoinField.sendKeys(strbitCoin);
	}
	public void enterBitCoinCashField(String strBitCoinCash) {
		bitCoinCashField.sendKeys(strBitCoinCash);
	}
	public void clickCoinAddressSaveBtn() {
		coinAddressSaveButton.click();
	}
	public void clearLiteCoinField() {
		waitutility.waitForAnElement(liteCoinField, driver);
		pageutility.scrollToElement(changeCoinAddressMsg, driver);
		pageutility.clearWebField(liteCoinField);
	}
	public void clearEthereumField() {
		pageutility.clearWebField(ethereumField);
	}
	public void clearBitCoinField() {
		pageutility.clearWebField(bitCoinField);
	}
	public void clearBitCoinCashField() {
		pageutility.clearWebField(bitCoinCashField);
	}
	public void coinAddress(String strLiteCoin, String strethereum, String strbitCoin, String strBitCoinCash) {
		this.clearLiteCoinField();
		this.enterLiteCoinField(strLiteCoin);
		this.clearEthereumField();
		this.enterEthereumField(strethereum);
		this.clearBitCoinField();
		this.enterBitCoinField(strbitCoin);
	    this.clearBitCoinCashField();
		this.enterBitCoinCashField(strBitCoinCash);
		this.clickCoinAddressSaveBtn();
	}
	public String getFullNameFromProfile() {
		waitutility.waitForAnElement(fullNameCorrect, driver);
		String FullNameText = fullNameCorrect.getText();
		return FullNameText;
	}
	public String getGenderFromProfile() {
		waitutility.waitForAnElement(genderCorrect, driver);
		String genderCorrectText = genderCorrect.getText();
		return genderCorrectText;
	}
	public String getCityFromProfile() {
		waitutility.waitForAnElement(cityCorrect, driver);
		String cityCorrectText = cityCorrect.getText();
		return cityCorrectText;
	}
	public String getZipcodeFromProfile() {
		waitutility.waitForAnElement(zipcodeCorrect, driver);
		String zipcodeCorrectText = zipcodeCorrect.getText();
		return zipcodeCorrectText;
	}
	public String getaddressFromProfile() {
		waitutility.waitForAnElement(addressCorrect, driver);
		String addressCorrectText = addressCorrect.getText();
		return addressCorrectText;
	}
	public String getMobileFromProfile() {
		waitutility.waitForAnElement(mobileCorrect, driver);
		String mobileCorrectText = mobileCorrect.getText();
		return mobileCorrectText;
	}
}
