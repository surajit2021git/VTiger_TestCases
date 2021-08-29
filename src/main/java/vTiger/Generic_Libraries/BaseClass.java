package vTiger.Generic_Libraries;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public WebDriver driver;
	public AccessPropety propertyAccess=new AccessPropety();
	public AccessPhoto photoAccess=new AccessPhoto();
	public WebUtilities utilities=new WebUtilities();
	public AccessRandom randomAccess=new AccessRandom();
	public static WebDriver staticDriver;
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setUp(String BrowserName) throws FileNotFoundException, IOException
	{
		//String BrowserName=System.getProperty("browser");
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		/*WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();*/
		
		driver.manage().window().maximize();
		driver.get(propertyAccess.getPropertyData("url"));
		driver.manage().deleteAllCookies();
		utilities.implicitTime(driver, 50);
		utilities.pageLoadTime(driver, 50);
		staticDriver=driver;
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		
		
			driver.quit();
		
	}
	
	public static String getScreenshot(String name) throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot) staticDriver;
		File sourceLocation = screenshot.getScreenshotAs(OutputType.FILE);
		String destinationLocation=System.getProperty("user.dir")+"/Screenshot/"+name+".png";
		File destnation=new File(destinationLocation);
		FileUtils.copyFile(sourceLocation, destnation);
		
		return destinationLocation;
	}

}
