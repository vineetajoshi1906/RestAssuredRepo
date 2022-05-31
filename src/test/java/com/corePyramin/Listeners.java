package com.corePyramin;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.corePyramid.base.ExtentReporting;
import com.corePyramid.base.TestBase;

public class Listeners extends TestBase implements ITestListener{
	ExtentTest test;
	WebDriver driver = null;
	ExtentReports extent=ExtentReporting.getReportObject();
//    ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
    
	public void onTestStart(ITestResult result) {
		System.out.println("test is starting");
      test=extent.createTest(result.getMethod().getMethodName());	
//      extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test is sucess");

//   extentTest.get().log(Status.PASS, "Test Passed");	
	test.log(Status.PASS, "Test Passed");		

	System.out.println("i have logged test in report");
	}

	@Override
	public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
		
		String testcasename=result.getMethod().getMethodName();
		System.out.println("test is failure-1");
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			getScreenshot(testcasename,driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			test.addScreenCaptureFromPath(getScreenshot(testcasename, driver),result.getMethod().getMethodName());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
    extent.flush();		
	}

}
