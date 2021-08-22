package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC006";
	testCaseDescription="To verify OTP message while booking Hotel in Irctc page";
	author="Harshini";
	category="Smoke";
	browserName="chrome";
	appName="irctc";
	}
	
	@Test	
	public void bookhotelOTPvalidation() {
		
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
		.clickOnCheckinMonth("Sep")
		.clickOnCheckinDate("17")
		.clickOnCheckoutDatefield()
		.clickOnCheckoutMonthandYear()
		.clickOnCheckoutYear("2021")
		.clickOnCheckoutMonth("Sep")
		.clickOnCheckoutDate("27")
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
		.selectGST("No")
		.clickOnContinueOnError()
		.verifyHotelName("Ginger Bangalore IRR ")
		.verifyFare("₹ 67183.00 ")
		.clickonAgree()
		.clickonMakePayment()
		.clickonVerify()
		.verifyOTPMsg("otp is required.");
				
	}

}
