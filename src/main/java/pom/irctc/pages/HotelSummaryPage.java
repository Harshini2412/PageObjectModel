package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelSummaryPage extends GenericWrappers{
	
	public HotelSummaryPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelSummaryPage verifyHotelName(String hotelName) {
		verifyTextByXpath(prop.getProperty("HotelSummaryPage.HotelName.XPath"), HotelDetailsPage.hotelName);
		return this;
	}
	
	public HotelSummaryPage verifyFare(String fare) {
		verifyTextByXpath(prop.getProperty("HotelSummaryPage.Fare.XPath"), HotelDetailsPage.fare);
		return this;
	}
	
	public HotelSummaryPage clickonAgree() {
		clickByXpath(prop.getProperty("HotelSummaryPage.Agree.XPath"));
		return this;
	}
	
	public OTPPage clickonMakePayment() {
		clickByXpath(prop.getProperty("HotelSummaryPage.MakePayment.XPath"));
		return new OTPPage(driver,test);
	}

}
