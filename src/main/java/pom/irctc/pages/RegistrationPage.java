package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterUserPwd(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterConfirmPwd(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnPreferredLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguage.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnLanguage(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.Language.XPath"), option);
		return this;
	}
	
	public RegistrationPage clickOnSecurityQues() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnSecurityQueOption(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestionOption.XPath"), option);
		return this;
	}
	
	public RegistrationPage enterSecurityAns(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnPersonalDetails() {
		clickByXpath(prop.getProperty("RegistrationPage.PersonalDetails.XPath"));
		return this;
	}
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnSelectOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.XPath"));
		return this;
	}
	public RegistrationPage clickOnOccupation(String option) {
		//clickByXpath(prop.getProperty("RegistrationPage.Occupation.XPath"));
		clickByXpath(prop.getProperty("RegistrationPage.Occupation.XPath"), option);
		
		return this;
	}
	
	public RegistrationPage clickonDob() {
		clickByXpath(prop.getProperty("RegistrationPage.Dob.XPath"));
		return this;
	}
	
	public RegistrationPage waitpropertyIrctc(long data) {
		waitProperty(data);
		return this;
	}
	
	public RegistrationPage selectMonth(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Month.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectYear(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Year.XPath"), value);
		return this;
	}
	
	public RegistrationPage clickonDate(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.Date.XPath"), option);
		return this;
	}
	
	public RegistrationPage clickOnMaritalStatus(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.MaritalStatus.XPath"), option);
		return this;
	}
	
	public RegistrationPage clickOnGender(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.Gender.XPath"), option);
		return this;
	}
	
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MobileNo.XPath"), data);
		return this;
	}
	
	public RegistrationPage selectNationality(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Nationality.XPath"), value);
		return this;
	}
	
	public RegistrationPage clickOnAddress() {
		clickByXpath(prop.getProperty("RegistrationPage.Address.XPath"));
		return this;
	}
	
	public RegistrationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FlatNo.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Street.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Area.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Pincode.XPath"), data);
		return this;
	}
	
	public RegistrationPage presstabIrctc() {
		pressTab();
		return this;
	}
	
	public RegistrationPage selectCity(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.City.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectPostOffice(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.PostOffice.XPath"), value);
		return this;
	}
	
	public RegistrationPage enterPhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnCopyResidence(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.CopyResidence.XPath"), option);
		return this;
	}
	
	public RegistrationPage enterOfficeFlatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeFlatNo.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	
	
	public RegistrationPage clickOnCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.Country.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnCountryName(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.CountryName.XPath"), option);
		return this;
	}
	
	public RegistrationPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePincode.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeCity(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeCity.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterOffPostOffice(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffPostOffice.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficePhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePhone.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnConfirmCheckbox() {
		clickByXpath(prop.getProperty("RegistrationPage.ConfirmCheckbox.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnTermCondition() {
		clickByXpath(prop.getProperty("RegistrationPage.TermCondition.XPath"));
		return this;
	}
}
