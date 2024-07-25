package results;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
public class ExtentReport {

		
		static ExtentTest logger;
		static ExtentReports report;
		@BeforeClass
		public static void startTest() {
			report=new ExtentReports();
		}

	


}
