package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers{
	
	public FacebookSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FacebookSignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.FirstName.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage enterLastName(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.LastName.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.MobileNumber.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FacebookSignUpPage.Password.XPath"), data);
		return this;
	}
	
	public FacebookSignUpPage selectDay(String value) {
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUpPage.Day.XPath"), value);
		return this;
	}
	
	public FacebookSignUpPage selectMonth(String value) {
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUpPage.Month.XPath"), value);
		return this;
	}
	
	public FacebookSignUpPage selectYear(String value) {
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUpPage.Year.XPath"), value);
		waitProperty(2000);
		return this;
	}
	
	public FacebookSignUpPage clickonGender(String option) {
		clickByXpath(prop.getProperty("FacebookSignUpPage.Gender.XPath"), option);
		return this;
	}
	
	public FacebookSignUpPage clickonSignUp() {
		clickByXpath(prop.getProperty("FacebookSignUpPage.SignUp.XPath"));
		return this;
	}

}
