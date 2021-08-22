package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers {
	
	public FacebookHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	public FacebookHomePage clickonEnglish() {
		clickByXpath(prop.getProperty("FacebookHomePage.English.XPath"));
		return this;
	}
	public FacebookSignUpPage clickonCreateNewAccount() {
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		return new FacebookSignUpPage(driver,test);
		
	}

}
