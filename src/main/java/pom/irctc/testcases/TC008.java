package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC008";
	testCaseDescription="To verify Saloon Mandatory check in Irctc page";
	author="Harshini";
	category="Functional";
	browserName="chrome";
	appName="irctc";
	}
	
	@Test
	
	public void saloonMandatoryCheck() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLastWindowIrctc()
		.clickOnSidebar()
		.clickOnCharter()
		.switchToLastWindowCharter()
		.clickonRightArrow()
		.clickonEnquiryForm()
		.enterName("Harshini")
		.enterNameofOrganisation("Wipro")
		.enterAddress("TV Kovil")
		.enterMobile("90037209")
		.enterEmail("harshini.ra@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginStation("Chennai")
		.enterDestination("Bangalore")
		.clickonCheckInDate()
		.clickonCheckinDate("17")
		.clickonCheckOutDate()
		.pressDownArrowCharter()
		.pressDownArrowCharter()
		.pressDownArrowCharter()
		.clickonCheckoutDate("30")
		.enterDuration("15")
		.enterCoachDetails("D5")
		.enterPassengerNumber("3")
		.enterPassengerNumber("3")
		.enterCharerPurpose("Work")
		.enterAdditionalServices("No")
		.clickonSubmit()
		.verifyMobileMsg("Mobile no. not valid");
		
	}

}
