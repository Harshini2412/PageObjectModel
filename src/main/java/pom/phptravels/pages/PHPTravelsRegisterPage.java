package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PHPTravelsRegisterPage extends GenericWrappers{
	
	public PHPTravelsRegisterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PHPTravelsRegisterPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.FirstName.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterLastName(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.LastName.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.Email.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage clickOnArrow() {
		clickByXpath(prop.getProperty("PHPTravelsRegisterPage.Arrow.XPath"));
		return this;
	}
	
	public PHPTravelsRegisterPage clickOnCountry(String option) {
		clickByXpath(prop.getProperty("PHPTravelsRegisterPage.Country.XPath"));
		return this;
	}
	
	public PHPTravelsRegisterPage enterPhoneNo(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.PhoneNo.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.CompanyName.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterStreetAddress1(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.StreetAddress1.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterStreetAddress2(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.StreetAddress2.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterCity(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.City.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterState(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.State.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterPincode(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.Pincode.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage selectCountry(String value) {
		selectVisibileTextByXpath(prop.getProperty("PHPTravelsRegisterPage.Country.XPath"), value);
		return this;
	}
	
	public PHPTravelsRegisterPage selectCustomField(String value) {
		selectVisibileTextByXpath(prop.getProperty("PHPTravelsRegisterPage.CustomField.XPath"), value);
		return this;
	}
	
	public PHPTravelsRegisterPage enterCustomFieldMobile(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.CustomFieldMobile.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterPassword(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegisterPage.Password.XPath"), data);
		return this;
	}
	
	public PHPTravelsRegisterPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("HPTravelsRegisterPage.ConfirmPassword.XPath"), data);
		return this;
	}

	public GeneratePasswordPage clickOnGeneratePassword() {
		clickByXpath(prop.getProperty("PHPTravelsRegisterPage.GeneratePassword.XPath"));
		return new GeneratePasswordPage(driver,test);
	}
	
	public PHPTravelsRegisterPage clickOnMailingOption(String option) {
		clickByXpath(prop.getProperty("PHPTravelsRegisterPage.MailingOption.XPath"));
		return this;
	}
	
	public PHPTravelsRegisterPage waitpropertyPhp(long data) {
		waitProperty(data);
		return this;
	}
	
	public PHPTravelsRegisterPage pageDownPhp() {
		pageDown();
		return this;
	}
	
	public PHPTravelsRegisterPage clickOnIamNotRobot() {
		clickByXpath(prop.getProperty("PHPTravelsRegisterPage.IamNotRobot.XPath"));
		return this;
	}
	
	public PHPTravelsRegisterPage clickOnRegister() {
		clickByXpath(prop.getProperty("PHPTravelsRegisterPage.Register.XPath"));
		return this;
	}
	

}

