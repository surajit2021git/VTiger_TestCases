package vTiger.Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTiger.Generic_Libraries.AutoConstant;

public class GeneratingExtentReport {
	
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeSuite
	public void setup()
	{
		reporter=new ExtentHtmlReporter(AutoConstant.extentReportFolderPath+".html");
		reporter.config().setDocumentTitle("SDET19");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("smoke");
		
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Buildno", "1.0.1");
		report.setSystemInfo("platform", "window");
		report.setSystemInfo("env", "QA");
	}
	
	@Test
	public void testCase1()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
        test=report.createTest("testCase1");
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void testCase2()
	{
		test.createNode("testCase2");
		driver.get("http://www.flipkart.com");
		System.out.println(driver.getTitle());
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		report.flush();
	}

}
