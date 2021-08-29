package vTiger.Generic_Libraries;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends BaseClass implements ITestListener{
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	

	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getMethod().getMethodName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+"is passed");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+"is failed");
		test.log(Status.FAIL, result.getThrowable());
		try
		{
			String path = BaseClass.getScreenshot(result.getName());
			 test.addScreenCaptureFromPath(path);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+"is skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		Date d=new Date();
		String date=d.toString().replaceAll(":", "-");
		
		reporter=new ExtentHtmlReporter(AutoConstant.extentReportFolderPath+date+".html");
		reporter.config().setDocumentTitle("SDET19");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("smoke");
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("AppUrl", "http://localhost8888");
		reports.setSystemInfo("Buildno", "1.0.1");
		reports.setSystemInfo("platform", "window");
		reports.setSystemInfo("env", "QA");
		
	}

	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

	
	
	
	
	
	

}
