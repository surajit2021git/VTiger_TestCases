package vTiger.Generic_Libraries;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;

public class BaseClass2 {
	
	public AccessPhoto photoAccess=new AccessPhoto();
	public AccessPropety propertyAccess=new AccessPropety();
	public WebUtilities utilities=new WebUtilities();
	public AccessRandom randomAccess=new AccessRandom();
	public WebDriver driver;
	
	
	@BeforeSuite
	public void Open_JBBC_ExtendResult()
	{
		System.out.println("JDBC connection opened");
	
	}
	
	@BeforeClass
	public void setUp() throws FileNotFoundException, IOException
	{
		if(propertyAccess.getPropertyData("Browser").equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(propertyAccess.getPropertyData("Browser").equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(propertyAccess.getPropertyData("url"));
	}
	
	@BeforeMethod
	public void loginApp() throws FileNotFoundException, IOException
	{
		utilities.pageLoadTime(driver, 40);
		utilities.implicitTime(driver, 40);
		
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
	}
	
	@AfterMethod
	public void logOutApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==2)
		{
			photoAccess.getPhoto(driver, result.getName());
		}
		else
		{
			HomePage pageHome=new HomePage(driver);
		    pageHome.logoutFromApplication(driver);
		}
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void Close_JBBC_ExtendResult()
	{
		System.out.println("JDBC connection closed");
	}

}
