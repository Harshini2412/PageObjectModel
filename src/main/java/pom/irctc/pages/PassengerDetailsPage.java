package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PassengerDetailsPage extends GenericWrappers {
	
	public PassengerDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PassengerDetailsPage switchtoLastWindowPassengerPage() {
		switchToLastWindow();
		return this;
	}
	
	public PassengerDetailsPage selectTitle(String value) {
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailsPage.Title.XPath"), value);
		return this;
	}
	
	public PassengerDetailsPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.FirstName.XPath"), data);
		return this;
	}
	
	public PassengerDetailsPage enterLastName(String data) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.LastName.XPath"), data);
		return this;
	}
	
	public PassengerDetailsPage selectState(String value) {
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailsPage.State.XPath"), value);
		return this;
	}
	
	public PassengerDetailsPage selectGST(String value) {
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailsPage.GST.XPath"), value);
		pageDown();
		waitProperty(5000);
		return this;
	}
	
	public PassengerDetailsPage enterGstNumber(String data) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.GstNumber.XPath"), data);
		return this;
	}
	
	public PassengerDetailsPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.CompanyName.XPath"), data);
		return this;
	}
	
	public PassengerDetailsPage enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.CompanyAddress.XPath"), data);
		pageDown();
		waitProperty(5000);
		return this;
	}
	
	
	public PassengerDetailsPage clickOnContinue() {
		clickByXpath(prop.getProperty("PassengerDetailsPage.Continue.XPath"));
		return  this;
	}
	
	public HotelSummaryPage clickOnContinueOnError() {
		clickByXpath(prop.getProperty("PassengerDetailsPage.ContinueOnError.XPath"));
		return new HotelSummaryPage(driver,test);
	}
	
	public PassengerDetailsPage verifyGSTMsg(String text) {
		verifyTextByXpath(prop.getProperty("PassengerDetailsPage.GSTMsg.XPath"), text);
		return this;
	}
	
}
