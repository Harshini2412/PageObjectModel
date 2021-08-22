package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OTPPage extends GenericWrappers{
	
	public OTPPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public OTPPage clickonVerify() {
		clickByXpath(prop.getProperty("OTPPage.Verify.XPath"));
		waitProperty(2000);
		return this;
	}
	
	public OTPPage verifyOTPMsg(String text) {
		verifyTextByXpath(prop.getProperty("OTPPage.OTPMsg.XPath"), text);
		return this;
	}

}
