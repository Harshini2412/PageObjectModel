package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers {
		
	public static String hotelName; 
	
	public static String fare;
	
	public HotelDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelDetailsPage getHotelName() {
		 hotelName = getTextByXpath(prop.getProperty("HotelDetailsPage.HotelName.XPath"));
		return this;
	}
	
	public HotelDetailsPage getFare() {
		fare = getTextByXpath(prop.getProperty("HotelDetailsPage.Fare.XPath"));
		return this;
	}
	
	public PassengerDetailsPage clickOnContinuetoBook() {
		clickByXpath(prop.getProperty("HotelDetailsPage.ContinuetoBook.XPath"));
		waitProperty(2000);
		return new PassengerDetailsPage(driver, test);
	}
	

}
