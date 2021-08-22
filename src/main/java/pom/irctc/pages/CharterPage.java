package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public CharterPage switchToLastWindowCharter() {
		switchToLastWindow();
		return this;
	}

	
	public CharterPage clickonRightArrow() {
		clickByXpath(prop.getProperty("CharterPage.RightArrow.XPath"));
		return this;
	}
	
	public CharterPage clickonEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.XPath"));
		return this;
	}
	
	public CharterPage enterName(String data) {
		enterByXpath(prop.getProperty("CharterPage.Name.XPath"), data);
		return this;
	}
	
	public CharterPage enterNameofOrganisation(String data) {
		enterByXpath(prop.getProperty("CharterPage.NameofOrganisation.XPath"), data);
		return this;
	}
	
	public CharterPage enterAddress(String data) {
		enterByXpath(prop.getProperty("CharterPage.Address.XPath"), data);
		return this;
	}
	
	public CharterPage enterMobile(String data) {
		enterByXpath(prop.getProperty("CharterPage.Mobile.XPath"), data);
		return this;
	}
	
	public CharterPage enterEmail(String data) {
		enterByXpath(prop.getProperty("CharterPage.Email.XPath"), data);
		return this;
	}
	
	public CharterPage selectRequestFor(String value) {
		selectVisibileTextByXpath(prop.getProperty("CharterPage.RequestFor.XPath"), value);
		return this;
	}
	
	public CharterPage enterOriginStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.OriginStation.XPath"), data);
		return this;
	}
	
	public CharterPage enterDestination(String data) {
		enterByXpath(prop.getProperty("CharterPage.Destination.XPath"), data);
		return this;
	}
	
	public CharterPage clickonCheckInDate() {
		clickByXpath(prop.getProperty("CharterPage.CheckInDate.XPath"));
		return this;
	}
	
	public CharterPage clickonCheckinDate(String option) {
		clickByXpath(prop.getProperty("CharterPage.CheckinDate.XPath"), option);
		return this;
	}
	
	public CharterPage pressDownArrowCharter() {
		pressDownArrow();
		return this;
	}
	
	public CharterPage clickonCheckOutDate() {
		clickByXpath(prop.getProperty("CharterPage.CheckOutDate.XPath"));
		return this;
	}
	
	public CharterPage clickonCheckoutDate(String option) {
		clickByXpath(prop.getProperty("CharterPage.CheckoutDate.XPath"), option);
		return this;
	}
	
	public CharterPage enterDuration(String data) {
		enterByXpath(prop.getProperty("CharterPage.Duration.XPath"), data);
		return this;
	}
	
	public CharterPage enterCoachDetails(String data) {
		enterByXpath(prop.getProperty("CharterPage.CoachDetails.XPath"), data);
		return this;
	}
	
	public CharterPage enterPassengerNumber(String data) {
		enterByXpath(prop.getProperty("CharterPage.PassengerNumber.XPath"), data);
		return this;
	}
	
	public CharterPage enterCharerPurpose(String data) {
		enterByXpath(prop.getProperty("CharterPage.CharerPurpose.XPath"), data);
		return this;
	}
	
	public CharterPage enterAdditionalServices(String data) {
		enterByXpath(prop.getProperty("CharterPage.AdditionalServices.XPath"), data);
		return this;
	}
	
	public CharterPage clickonSubmit() {
		clickByXpath(prop.getProperty("CharterPage.Submit.XPath"));
		return this;
	}
	
	public CharterPage verifyMobileMsg(String text) {
		verifyTextByXpath(prop.getProperty("CharterPage.MobileMsg.XPath"), text);
		return this;
	}
	
	
	
}
