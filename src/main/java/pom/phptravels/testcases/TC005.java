package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PHPTravelsRegisterPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC005";
	testCaseDescription="To verify whether the user is able to Register in PHP Travels page";
	author="Harshini";
	category="Smoke";
	browserName="chrome";
	appName="php";
	}
	@Test
	
	public void phptravelsRegisterPage() {
		
		new PHPTravelsRegisterPage(driver,test)
		.enterFirstName("Harshini")
		.enterLastName("Sathesh")
		.enterEmail("harshini.ra@gmail.com")
		.clickOnArrow()
		.clickOnCountry("India (भारत)")
		.enterPhoneNo("9003720934")
		.enterCompanyName("Wipro")
		.enterStreetAddress1("24")
		.enterStreetAddress2("TSV")
		.enterCity("Trichy")
		.enterState("Tamil Nadu")
		.enterPincode("620014")
		.selectCountry("India")
		//.selectCustomField("Friend")
		.enterCustomFieldMobile("9600292531")
		.enterPassword("Password!123")
		.enterConfirmPassword("Password!123")
		.clickOnGeneratePassword()
		.clickonGenerateNewPassword()
		.clickonCopyToClipboard()
		.clickOnMailingOption("Yes")
		.pageDownPhp()
		.waitpropertyPhp(2000)
		.clickOnRegister();
		
		
	}

}
