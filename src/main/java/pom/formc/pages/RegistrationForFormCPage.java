package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationForFormCPage extends GenericWrappers{
	
	public RegistrationForFormCPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationForFormCPage enterUserID(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.UserID.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.Password.XPath"), data);
		return this;	
	}
	
	public RegistrationForFormCPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage waitTime(long data) {
		waitProperty(data);
		return this;
	}
	
	public RegistrationForFormCPage selectSecQues(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.SecurityQuestion.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage enterSecAns(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.UserName.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage selectGender(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.Gender.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage enterDob(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.Dob.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterDestination(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.Destination.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterUserEmailID(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.UserEmailID.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterUserMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.UserMobileNumber.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterUserPhoneNo(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.UserPhoneNo.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage selectnationality(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.Nationality.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage enterName(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.Name.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterCapacity(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.Capacity.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.Address.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage selectState(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.State.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage waitPropertyFormC(long data) {
		waitProperty(data);
		return this;
	}
	
	public RegistrationForFormCPage selectCity(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.City.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage selectFrroDescription(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.FrroDescription.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage selectAccomoType(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.AccomodationType.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage selectAccomoGrade(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.AccomodationGrade.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage enterEmailID(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.EmailID.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.MobileNumber.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterPhoneNo(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.PhoneNo.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterOwnerName(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.OwnerName.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterOwnerAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.OwnerAddress.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage selectOwnerState(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.OwnerState.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage selectOwnerCity(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationForFormCPage.OwnerCity.XPath"), value);
		return this;
	}
	
	public RegistrationForFormCPage enterOwnerEmailID(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.OwnerEmailID.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterOwnerPhoneNo(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.OwnerPhoneNo.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage enterOwnerMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationForFormCPage.OwnerMobile.XPath"), data);
		return this;
	}
	
	public RegistrationForFormCPage clickOnSubmit() {
		clickByXpath(prop.getProperty("RegistrationForFormCPage.Submit.XPath"));
		return this;
	}
}
