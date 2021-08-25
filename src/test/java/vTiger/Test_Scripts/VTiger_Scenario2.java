package vTiger.Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import vTiger.Generic_Libraries.AccessRandom;
import vTiger.Generic_Libraries.BaseClass;
import vTiger.PomPages.CreateNewOrganizationPage;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;
import vTiger.PomPages.OrganizationsPage;

public class VTiger_Scenario2 extends BaseClass{
	
	@Test
	public void testCase2() throws FileNotFoundException, IOException
	{
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
		
		HomePage pageHome=new HomePage(driver);
		pageHome.getOrgranizatonsLink().click();
		
		OrganizationsPage pageOrg=new OrganizationsPage(driver);
		pageOrg.getCreateOrganizationsButton().click();
		
		
		
		CreateNewOrganizationPage pageNewOrg=new CreateNewOrganizationPage(driver);
		
		AccessRandom randomAccess=new AccessRandom();
		pageNewOrg.getOrganizationNameTextfield().sendKeys("Tyss"+randomAccess.getRandomNumber(1000));
		
		utilities.dropDownByValue(pageNewOrg.getIndustryDropdown(), "Engineering");
		utilities.dropDownByValue(pageNewOrg.getTypeDropdown(), "Analyst");
		utilities.dropDownByValue(pageNewOrg.getRatingDropdown(), "Active");
		
		//pageNewOrg.getSaveButton().click();
		
		//pageNewOrg.getHomePageLink().click();
		
		pageHome.logoutFromApplication(driver);
		
	}

}
