package pom.pan.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pan.pages.NewPANApplicationFormPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TC004";
	testCaseDescription="To verify whether the user is able to create new PAN application";
	author="Harshini";
	category="Functional";
	browserName="chrome";
	appName="pan";
	}
	@Test
	
	public void applicationformPAN(){
		
		new NewPANApplicationFormPage(driver,test)
		.selectTitle("MRS.")
		.enterFirstName("Harshini")
		.enterMiddleName("Sathesh")
		.enterLastName("Nagarajan")
		.enterFatherFirstName("Naga")
		.enterFatherMiddleName("Raja")
		.enterFatherLastName("Srini")
		.enterMobileNo("9003720934")
		.enterEmail("harshini.ra@gmail.com")
		.selectSourceofIncome("Salary")
		.clickOnOffice()
		.enterDob("24121991")
		.pageDownPAN()
		.enterResHouseNo("24")
		.enterResArea("TSV")
		.enterResCity("Trihcy")
		.selectResState("Tamil Nadu")
		.enterResPincode("620014")
		.enterOfficeName("Wipro")
		.enterOfficeHouseNo("34")
		.enterOfficeArea("CDC")
		.enterOfficeCity("Chennai")
		.selectOfficeState("Tamil Nadu")
		.enterOfficePincode("600004")
		.pageDownPAN()
		.waitPropertyPAN(2000)
		.selectIdentityProof("VOTER ID card which is having complete Date of Birth (In Copy)")
		.selectAddressProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectDOBProof("Matriculation certificate or mark sheet of recognised board (In Copy)")
		.selectAadhaarProof("Copy of Aadhaar Card / Letter")
		.selectOfficeAddressProof("Employer Certificate carrying Office Address")
		.clickOnTermsAndConditions();
		
	}

}
