package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC007";
	testCaseDescription="To verify GST message while booking Hotel in Irctc page";
	author="Harshini";
	category="Smoke";
	browserName="chrome";
	appName="irctc";
	}
	
	@Test	
public void bookhotelGSTvalidation() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLastWindowIrctc()
		.clickOnHotels()
		.switchToLastWindowHotelpage()
		.clickOnLogin()
		.clickOnGuestUser()
		.enterEmail("harshini.ra@gmail.com")
		.enterMobileNo("9003720934")
		.waitforLogin(2000)
		.clickOnLogin()
		.waitpropertyHotelPage(5000)
		.enterHotelName("Bangalore")
		.waitpropertyHotelPage(2000)
		.clickonHotel()
		.waitpropertyHotelPage(2000)
		.clickOnCheckinDatefield()
		.clickOnCheckinMonthandYear()
		.clickOnCheckinYear("2021")
		.clickOnCheckinMonth("Aug")
		.clickOnCheckinDate("17")
		.clickOnCheckoutDatefield()
		.clickOnCheckoutMonthandYear()
		.clickOnCheckoutYear("2021")
		.clickOnCheckoutMonth("Aug")
		.clickOnCheckoutDate("30")
		.clickOnGuest()
		.selectRoom("1")
		.selectAdults("3")
		.clickOnDone()
		.clickOnFindHotel()
		.getHotelName()
		.getFare()
		.clickOnContinuetoBook()
		.selectTitle("Mrs")
		.enterFirstName("Harshini")
		.enterLastName("Sathesh")
		.selectState("TAMIL NADU")
		.selectGST("Yes")
		.enterGstNumber("90876")
		.enterCompanyName("HAR")
		.enterCompanyAddress("TSV")
		.clickOnContinue()
		.verifyGSTMsg("Please Enter Valid GSt number");
		
		
	}

}
