package vTiger.Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;
import vTiger.Generic_Libraries.BaseClass;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;
//@Listeners(vTiger.Generic_Libraries.Listeners.class)
public class VTiger_Scenario2 extends BaseClass{
	
	@Test(retryAnalyzer = vTiger.Generic_Libraries.RetryAnalizer.class)
	public void testCase2() throws FileNotFoundException, IOException
	{
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
		
		HomePage pageHome=new HomePage(driver);
		pageHome.getOrgranizatonsLink().click();
		
		driver.findElement(By.xpath("(//a[text()='Test Yantra software solutions'])[2]")).click();
		String actualOrgName = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		String expectedOrgName="Test Yantra software solutions";
		
		Assert.assertEquals(expectedOrgName, actualOrgName);
		
		/*OrganizationsPage pageOrg=new OrganizationsPage(driver);
		pageOrg.getCreateOrganizationsButton().click();
		
		
		
		CreateNewOrganizationPage pageNewOrg=new CreateNewOrganizationPage(driver);
		
		AccessRandom randomAccess=new AccessRandom();
		pageNewOrg.getOrganizationNameTextfield().sendKeys("Tyss"+randomAccess.getRandomNumber(1000));
		
		utilities.dropDownByValue(pageNewOrg.getIndustryDropdown(), "Engineering");
		utilities.dropDownByValue(pageNewOrg.getTypeDropdown(), "Analyst");
		utilities.dropDownByValue(pageNewOrg.getRatingDropdown(), "Active");
		
		//pageNewOrg.getSaveButton().click();
		
		//pageNewOrg.getHomePageLink().click();*/
		
		pageHome.logoutFromApplication(driver);
		
	}

}
