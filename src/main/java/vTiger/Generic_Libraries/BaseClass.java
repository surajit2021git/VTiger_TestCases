package vTiger.Generic_Libraries;

import java.io.FileNotFoundException;
import java.io.IOException;

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
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(result.getStatus()==2)
		{
			photoAccess.getPhoto(driver, result.getName());
		}
		
		
			driver.quit();
		
	}

}
