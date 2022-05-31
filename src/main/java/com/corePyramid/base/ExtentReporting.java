package com.corePyramid.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporting {
	public  static ExtentReports extent;
	public static  ExtentReports getReportObject() {
		System.out.println("Extent reporting starts");
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("PyramidCore-Web Automation result");
		reporter.config().setDocumentTitle("Test Result");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vineeta Joshi");
		System.out.println("Extent reporting ends");
		return extent;
		
	}
	
}
