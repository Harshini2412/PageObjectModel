package pom.pan.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class NewPANApplicationFormPage extends GenericWrappers {
	
	public NewPANApplicationFormPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public NewPANApplicationFormPage selectTitle(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.Title.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.FirstName.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.MiddleName.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterLastName(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.LastName.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterFatherFirstName(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.FatherFirstName.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterFatherMiddleName(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.FatherMiddleName.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterFatherLastName(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.FatherLastName.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.MobileNo.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterEmail(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.Email.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage selectSourceofIncome(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.SourceofIncome.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage clickOnOffice() {
		clickByXpath(prop.getProperty("NewPANApplicationFormPage.Office.XPath"));
		return this;
	}
	
	public NewPANApplicationFormPage enterDob(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.Dob.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage pageDownPAN() {
		pageDown();
		return this;
	}
	
	public NewPANApplicationFormPage enterResHouseNo(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.ResidentialHouseNo.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterResArea(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.ResidentialArea.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterResCity(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.ResidentialCity.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage selectResState(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.ResidentialState.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage enterResPincode(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.ResidentialPincode.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterOfficeName(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.OfficeName.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterOfficeHouseNo(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.OfficeHouseNo.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.OfficeArea.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage enterOfficeCity(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.OfficeCity.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage selectOfficeState(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.OfficeState.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("NewPANApplicationFormPage.OfficePincode.XPath"), data);
		return this;
	}
	
	public NewPANApplicationFormPage waitPropertyPAN(long data) {
		waitProperty(data);
		return this;
	}
	
	public NewPANApplicationFormPage selectIdentityProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.IdentityProof.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage selectAddressProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.AddressProof.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage selectDOBProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.DOBProof.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage selectAadhaarProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.AadhaarProof.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage selectOfficeAddressProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("NewPANApplicationFormPage.OfficeAddressProof.XPath"), value);
		return this;
	}
	
	public NewPANApplicationFormPage clickOnTermsAndConditions() {
		clickByXpath(prop.getProperty("NewPANApplicationFormPage.TermsAndConditions.XPath"));
		return this;
	}
	

}
