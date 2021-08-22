package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC003";
	testCaseDescription="To verify whether the user is able to do FTR Registration in IRCTC page";
	author="Harshini";
	category="Functional";
	browserName="chrome";
	appName="irctc";
	}
	@Test
	
	public void ftrRegistration() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLastWindowIrctc()
		.clickOnSidebar()
		.clickOnBookYourCoach()
		.switchToLastWindowFtr()
		.clickonSignUp()
		.enterUserName("harshini_24")
		.enterPassword("Password!223")
		.enterConfirmPassword("Password!223")
		.selectSecurityQues("What is your fathers middle name?")
		.enterSecurityAnswer("Raja")
		.clickonDob()
		.selectMonth("Dec")
		.selectYear("1991")
		.clickonBirthdate("24")
		.clickOnGender("F")
		.clickOnMaritalStatus("Married")
		.enterEmailID("harshini.ra@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("Harshini")
		.enterMiddleName("Raja")
		.enterLastName("Sathesh")
		.selectNationality("Indian")
		.enterFlatNo("24")
		.enterStreet("TV Kovil")
		.enterArea("TSV")
		.selectCountry("India")
		.enterMobileNo("9003720934")
		.enterPincode("620014")
		.presstabFtr()
		.selectPostOffice("C Sector (BHEL) - TR S.O")
		.clickOnNo()
		.enterOfficeFlatNo("90")
		.enterOfficeStreet("CDC")
		.enterOfficeArea("Mylapore")
		.selectOfficeCountry("India")
		.enterOfficeMobileNo("9600292531")
		.enterOfficePincode("600004")
		.presstabFtr()
		.selectOfficePostOffice("Mylapore H.O");
		
		
	}

}
