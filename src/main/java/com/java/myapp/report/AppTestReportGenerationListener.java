package com.java.myapp.report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AppTestReportGenerationListener implements ITestListener {
	public static int testPassCount = 0;
	public static int testFailCount = 0;
	public static int testSkipCount = 0;

	public void onTestStart(ITestResult result) {
		System.out.println("Inside TestStart"+result.getTestName());
		
	}

	public void onTestSuccess(ITestResult result) {
		testPassCount++;
		System.out.println("Inside TestPass"+result.getTestName());
		
	}

	public void onTestFailure(ITestResult result) {
		testFailCount++;
		System.out.println("Inside TestFail"+result.getTestName());
		
	}

	public void onTestSkipped(ITestResult result) {
		testSkipCount++;
		System.out.println("Inside TestSkip"+result.getTestName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("inside success percentage");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Inside On suite start");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("..........inside suite Finish......");
		System.out.println("Total Pass Tests -- " +testPassCount);
		System.out.println("Total Fail Tests -- " +testFailCount);
		System.out.println("Total Skip Tests -- " +testSkipCount);
		GeneratePieChart.generateReportOfMyAppTestSuite(testPassCount, testFailCount, testSkipCount);
	}

	

}
