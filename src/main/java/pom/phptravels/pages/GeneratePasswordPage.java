package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GeneratePasswordPage extends GenericWrappers{
		
	public GeneratePasswordPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public GeneratePasswordPage enterPasswordLength(String data) {
		enterByXpath(prop.getProperty("GeneratePasswordPage.PasswordLength.XPath"), data);
		return this;
	}
	
	public GeneratePasswordPage clickonGenerateNewPassword() {
		clickByXpath(prop.getProperty("GeneratePasswordPage.GenerateNewPassword.XPath"));
		return this;
	}
	
	public PHPTravelsRegisterPage clickonCopyToClipboard() {
		clickByXpath(prop.getProperty("GeneratePasswordPage.CopyToClipboard.XPath"));
		return new PHPTravelsRegisterPage(driver,test);
	}

}