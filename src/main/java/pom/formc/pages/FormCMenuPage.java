package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCMenuPage extends GenericWrappers{
	
	public FormCMenuPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public RegistrationForFormCPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FormCMenuPage.SignUp.XPath"));
		return new RegistrationForFormCPage(driver,test);
	}
	
	

}

