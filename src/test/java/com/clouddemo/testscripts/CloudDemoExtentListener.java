package com.clouddemo.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CloudDemoExtentListener implements ITestListener{
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	ExtentSparkReporter spark;

	public void onTestStart(ITestResult result) {
		//extent.createTest("MyFirstTest").log(Status.PASS, "This is a logging event for "+Result.getName()+", and it passed!");
		System.out.println(result.getName()+" is started");	
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest("from reports"+result.getName());
		 test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		 System.out.println("The name of the testcase passed is: "+result.getName());		
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest("from reports "+result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		System.out.println("The name of the testcase failed is: "+result.getName());	
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.BLUE));
	    System.out.println("The name of the testcase Skipped is: "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName());		
	}

	public void onStart(ITestContext result) {
		try {
			spark = new ExtentSparkReporter(System.getProperty("user.dir") +"/mlmCloudDemoReport.html");
			 extent = new ExtentReports();
			 extent.attachReporter(spark); 
			 }
			catch (Exception e) {
			 e.printStackTrace();
			}
			 System.out.println(result.getName()+" is started");		
	}

	public void onFinish(ITestContext result) {
		extent.flush();
		System.out.println(result.getName()+" is finished");		
	}	
}
