package UtilsLayer;

import org.testng.IAnnotationTransformer;
import org.testng.IConfigurable;
import org.testng.IConfigurationListener;
import org.testng.IReporter;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		//BeforeTest
	}

	public void onTestSuccess(ITestResult result) {
		//@Test of passed
	}

	public void onTestFailure(ITestResult result) {
		//@Test of failed
	}

	public void onTestSkipped(ITestResult result) {
		//@Test of skipped
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//@Test of failed with percentage
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		//@Test of failed when elementNotFoundException
	}

	public void onStart(ITestContext context) {
		//@BeforeSuite
	}

	public void onFinish(ITestContext context) {
	//	@AfterSuite
	}

	
	
	
}
