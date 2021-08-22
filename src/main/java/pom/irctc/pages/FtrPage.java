package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers {
	
	public FtrPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FtrPage switchToLastWindowFtr() {
		switchToLastWindow();
		return new FtrPage(driver,test);
	}
	
	public FtrRegistrationPage clickonSignUp() {
		
		clickByXpath(prop.getProperty("FtrPage.SignUp.XPath"));
		
		return new FtrRegistrationPage(driver,test);
		
		
	}

}

