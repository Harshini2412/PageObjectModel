package pom.formc.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pom.formc.pages.FormCMenuPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC002";
	testCaseDescription="To verify whether the user is able to Register Form C";
	author="Harshini";
	category="Smoke";
	browserName="chrome";
	appName="formc";
	}
	@Test

	public void formCRegistration() {
		
		new FormCMenuPage(driver,test)
		.clickOnSignUp()
		.enterUserID("Harshini24")
		.enterPassword("Passowrd123!")
		.enterConfirmPassword("Passowrd123")
		.waitTime(2000)
		.selectSecQues("where did you meet your spouse?")
		.enterSecAns("BHEL")
		.enterUserName("Harshini")
		.waitTime(2000)
		.selectGender("Female")
		.enterDob("24/12/1991")
		.enterDestination("IT")
		.enterUserEmailID("harshini.ra@gmail.com")
		.enterUserMobile("9003720934")
		.enterUserPhoneNo("9003720934")
		.enterName("Harshini")
		.enterCapacity("4")
		.enterAddress("13/4")
		.selectState("TAMIL NADU")
		.waitPropertyFormC(2000)
		.selectCity("TIRUCHIRAPPALLI")
		.selectFrroDescription("FRO TRICHY URBAN")
		.selectAccomoType("Guest House")
		.selectAccomoGrade("Five Star")
		.enterEmailID("harshini.ra@gmail.com")
		.enterMobile("9003720934")
		.enterPhoneNo("9086534522")
		.enterOwnerName("Ezhil")
		.enterOwnerAddress("TSV")
		.waitPropertyFormC(2000)
		.selectOwnerState("KERALA")
		.waitPropertyFormC(2000)
		.selectOwnerCity("WAYANAD")
		.enterOwnerEmailID("ezhil.raja@gmail.com")
		.waitPropertyFormC(4000)
		.enterOwnerPhoneNo("04312557417")
		.enterOwnerMobile("8526665675")
		.clickOnSubmit();
		
		
		
	}
}
