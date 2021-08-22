package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers {
	
	public GuestUserLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public GuestUserLoginPage clickOnGuestUser() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.GusetUser.XPath"));
		return this;
	}
	
	public GuestUserLoginPage enterEmail(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.Email.XPath"), data);
		return this;
	}
	
	public GuestUserLoginPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.MobileNo.XPath"), data);
		return this;
	}
	
	public GuestUserLoginPage waitforLogin(long data) {
		waitProperty(2000);
		return this;
	}
	public HotelPage clickOnLogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.Login.XPath"));
		return new HotelPage(driver, test);
	}

}
