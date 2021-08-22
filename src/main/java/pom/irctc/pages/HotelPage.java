package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers{
	
	public HotelPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelPage switchToLastWindowHotelpage() {
		switchToLastWindow();
		return this;
	}
	
	public HotelPage waitpropertyHotelPage(long data) {
		waitProperty(2000);
		return this;
	}

	
	public GuestUserLoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("HotelPage.Login.XPath"));
		return new GuestUserLoginPage(driver, test);
	}
	
	public HotelPage enterHotelName(String data) {
		enterByXpath(prop.getProperty("HotelPage.HotelName.XPath"), data);
		return this;
	}
	
	public HotelPage clickonHotel() {
		clickByXpath(prop.getProperty("HotelPage.Hotel.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckinDatefield() {
		clickByXpath(prop.getProperty("HotelPage.CheckinDatefield.XPath"));
		waitProperty(2000);
		return this;
	}
	
	public HotelPage clickOnCheckinMonthandYear() {
		clickByXpath(prop.getProperty("HotelPage.CheckinMonthandYear.XPath"));
		waitProperty(1000);
		return this;
	}
	
	public HotelPage clickOnCheckinYear(String option) {
		clickByXpath(prop.getProperty("HotelPage.CheckinYear.XPath"), option);
		waitProperty(1000);
		return this;
	}
	
	public HotelPage clickOnCheckinMonth(String option) {
		clickByXpath(prop.getProperty("HotelPage.CheckinMonth.XPath"), option);
		return this;
	}
	
	public HotelPage clickOnCheckinDate(String option) {
		clickByXpath(prop.getProperty("HotelPage.CheckinDate.XPath"), option);
		waitProperty(2000);
		return this;
	}
	
	public HotelPage clickOnCheckoutDatefield() {
		clickByXpath(prop.getProperty("HotelPage.CheckoutDatefield.XPath"));
		waitProperty(2000);
		return this;
	}
	
	public HotelPage clickOnCheckoutMonthandYear() {
		clickByXpath(prop.getProperty("HotelPage.CheckoutMonthandYear.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckoutYear(String option) {
		clickByXpath(prop.getProperty("HotelPage.CheckoutYear.XPath"), option);
		return this;
	}
	
	public HotelPage clickOnCheckoutMonth(String option) {
		clickByXpath(prop.getProperty("HotelPage.CheckoutMonth.XPath"), option);
		return this;
	}
	
	public HotelPage clickOnCheckoutDate(String option) {
		clickByXpath(prop.getProperty("HotelPage.CheckoutDate.XPath"), option);
		waitProperty(2000);
		return this;
	}
	public HotelPage clickOnGuest() {
		clickByXpath(prop.getProperty("HotelPage.Guest.XPath"));
		return this;
	}
	
	public HotelPage selectRoom(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelPage.Room.XPath"), value);
		return this;
	}
	
	public HotelPage selectAdults(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelPage.Adults.XPath"), value);
		return this;
	}
	
	public HotelPage selectChildren(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelPage.Children.XPath"), value);
		return this;
	}
	
	public HotelPage clickOnDone() {
		clickByXpath(prop.getProperty("HotelPage.Done.XPath"));
		waitProperty(2000);
		return this;
	}
	
	public HotelDetailsPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("HotelPage.FindHotel.XPath"));
		waitProperty(5000);
		return new HotelDetailsPage(driver,test);
	}
	
		

}
