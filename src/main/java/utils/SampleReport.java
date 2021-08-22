package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	@Test
	public void generateReport() {
		
		// start Report
		
		ExtentReports report = new ExtentReports("./report/Result.html", false);
		
		//start test
		
		ExtentTest test = report.startTest("TC005", "To verify IRCTC Registration");
		
		test.assignAuthor("Harshini");
		test.assignCategory("Functional");
		
		
		//log test
		
		test.log(LogStatus.PASS, "The application got launched successfully");
		test.log(LogStatus.PASS, "The application got launched successfully");
		test.log(LogStatus.PASS, "The application got launched successfully");
		test.log(LogStatus.PASS, "The application got launched successfully");
		test.log(LogStatus.PASS, "The application got launched successfully");
		
		//end test
		
		report.endTest(test);
		
		//end report
		
		report.flush();
		
		
	}

}
