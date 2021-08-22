package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
		
	public HotelPage clickOnHotels() {
		clickByXpath(prop.getProperty("AccommodationPage.Hotels.XPath"));
		return new HotelPage(driver,test);
	}
	
	public AccommodationPage clickOnSidebar() {
		clickByXpath(prop.getProperty("AccommodationPage.Sidebar.XPath"));
		return this;
	}
	
	public FtrPage clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("AccommodationPage.BookYourCoach.XPath"));
		return new FtrPage(driver,test);
	}
	
	public AccommodationPage switchToLastWindowIrctc() {
		switchToLastWindow();
		return this;
	}

	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.Charter.XPath"));
		return new CharterPage(driver,test);
	}

		
	
}
