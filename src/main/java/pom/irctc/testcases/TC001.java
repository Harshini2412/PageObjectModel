package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC001";
	testCaseDescription="To verify whether the user is able to Register in IRCTC page";
	author="Harshini";
	category="Smoke";
	browserName="chrome";
	appName="irctc";
	}
	@Test

	public void irctcRegistration() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("Harshini123")
		.enterUserPwd("Password123")
		.enterConfirmPwd("Password123")
		.clickOnPreferredLanguage()
		.clickOnLanguage("English")
		.clickOnSecurityQues()
		.clickOnSecurityQueOption("What is your fathers middle name?")
		.enterSecurityAns("Srini")
		.clickOnPersonalDetails()
		.enterFirstName("Harshini")
		.enterMiddleName("Sathesh")
		.enterLastName("Nagarajan")
		.clickOnSelectOccupation()
		.clickOnOccupation("PROFESSIONAL")
		.waitpropertyIrctc(3000)
		.clickonDob()
		.waitpropertyIrctc(2000)
		.selectMonth("December")
		.waitpropertyIrctc(2000)
		.selectYear("1991")
		.waitpropertyIrctc(2000)
		.clickonDate("24")
		.clickOnMaritalStatus("Married")
		.clickOnGender("Female")
		.enterEmail("harshini.rz@gmail.com")
		.enterMobileNo("9003720934")
		.selectNationality("India")
		.clickOnAddress()
		.enterFlatNo("90")
		.enterStreet("TSV")
		.enterArea("BHEL")
		.enterPincode("620014")
		.presstabIrctc()
		.selectCity("Tiruchirappalli")
		.selectPostOffice("C Sector (BHEL) - TR S.O")
		.enterPhone("9003720934")
		.clickOnCopyResidence("No")
		.enterOfficeFlatNo("34")
		.enterOfficeStreet("CDC")
		.enterOfficeArea("Kovil Street")
		.clickOnCountry()
		.clickOnCountryName("India")
		.enterOfficePincode("620005")
		.presstabIrctc()
		.enterOfficeCity("Tiruchirappalli")
		.enterOffPostOffice("TSV")
		.enterOfficePhone("9600292531");
		
		
	}

}
