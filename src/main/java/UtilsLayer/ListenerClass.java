package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ListenerClass extends BaseClass implements ITestListener {
	protected String dateandtime=CurruntDateAndTime.curruntdatetime();
	protected ExtentReports extentreport;
	protected ExtentTest extenttest;
	
	public void onStart(ITestContext context) {
		System.out.println("Suite is started");
		//below method takes class name of ITestCOntext i.e."org.testng.TestRunner"
		ExtentSparkReporter extentsprkreport=new ExtentSparkReporter(System.getProperty("user.dir")
				+"//Reports//"+context.getClass().getName()+".html");
//		ExtentSparkReporter extentsprkreport=new ExtentSparkReporter(System.getProperty("user.dir")
//				+"//Reports//"+dateandtime+".html");
		extentreport=new ExtentReports();
		extentreport.attachReporter(extentsprkreport);
	}

	public void onTestStart(ITestResult result) {
//		String a=result.getMethod().getMethodName();
//		System.out.println(a);
		System.out.println("Test cases started name is "+result.getMethod().getMethodName());
		extenttest=extentreport.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
//		String a=result.getMethod().getMethodName();
//		System.out.println(a);
		System.out.println("Test cases passed name is "+result.getMethod().getMethodName());
		extenttest.log(Status.PASS,"Test cases passed name is "+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
//		String a=result.getMethod().getMethodName();
//		System.out.println(a);
		System.out.println("Test cases failed name is "+result.getMethod().getMethodName());
		extenttest.log(Status.FAIL,"Test cases failed name is "+result.getMethod().getMethodName());
		extenttest.log(Status.FAIL, result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
//		String a=result.getMethod().getMethodName();
//		System.out.println(a);
		System.out.println("Test cases skipped name is "+result.getMethod().getMethodName());
		extenttest.log(Status.SKIP,"Test cases skipped name is "+result.getMethod().getMethodName());
	}

//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		
//	}
//
//	public void onTestFailedWithTimeout(ITestResult result) {
//		
//	}

	
	public void onFinish(ITestContext context) {
		System.out.println("Suite is completed");
		extentreport.flush();
		//should i use here or inside aftersuite?
		//System.gc();
	}
	

}
