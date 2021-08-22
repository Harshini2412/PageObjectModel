package pom.facebook.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import pom.facebook.pages.FacebookHomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC009";
	testCaseDescription="To verify whether the user is able to create an account in Facebook application";
	author="Harshini";
	category="Functional";
	browserName="chrome";
	appName="facebook";
	}
	@Test
	public void facebookSignup() {
		
		new FacebookHomePage(driver,test)
		.clickonEnglish()
		.clickonCreateNewAccount()
		.enterFirstName("Harshini")
		.enterLastName("Nagarajan")
		.enterMobileNumber("9003720934")
		.enterPassword("Password!123")
		.selectDay("24")
		.selectMonth("Dec")
		.selectYear("1991")
		.clickonGender("Female");
	}

}
