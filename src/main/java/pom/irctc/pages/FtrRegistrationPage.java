package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrRegistrationPage extends GenericWrappers {
	
	public FtrRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FtrRegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.UserName.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage selectSecurityQues(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.SecurityQuestion.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage clickonDob() {
		clickByXpath(prop.getProperty("FtrRegistrationPage.Dob.XPath"));
		return this;
	}
	
	public FtrRegistrationPage selectMonth(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.Month.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage selectYear(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.Year.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage clickonBirthdate(String option) {
		clickByXpath(prop.getProperty("FtrRegistrationPage.Birthdate.XPath"), option);
		return this;	
	}
	
	public FtrRegistrationPage clickOnGender(String option) {
		clickByXpath(prop.getProperty("FtrRegistrationPage.Gender.XPath"), option);
		return this;
	}
	
	public FtrRegistrationPage clickOnMaritalStatus(String option) {
		clickByXpath(prop.getProperty("FtrRegistrationPage.MaritalStatus.XPath"), option);
		return this;
	}
	
	public FtrRegistrationPage enterEmailID(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.EmailID.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage selectOccupation(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.Occupation.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.FirstName.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.MiddleName.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.LastName.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage selectNationality(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.Nationality.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.FlatNo.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.Street.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.Area.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage selectCountry(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.Country.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.MobileNo.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.Pincode.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage selectPostOffice(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.PostOffice.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage clickOnNo() {
		clickByXpath(prop.getProperty("FtrRegistrationPage.No.XPath"));
		return this;
	}
	
	public FtrRegistrationPage enterOfficeFlatNo(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.OfficeFlatNo.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage selectOfficeCountry(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.OfficeCountry.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage enterOfficeMobileNo(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.OfficeMobileNo.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("FtrRegistrationPage.OfficePincode.XPath"), data);
		return this;
	}
	
	public FtrRegistrationPage selectOfficePostOffice(String value) {
		selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.OfficePostOffice.XPath"), value);
		return this;
	}
	
	public FtrRegistrationPage clickOnCreateProfile() {
		clickByXpath(prop.getProperty("FtrRegistrationPage.CreateProfile.XPath"));
		return this;
	}
	
	public FtrRegistrationPage presstabFtr() {
		pressTab();
		return this;
	}


}
