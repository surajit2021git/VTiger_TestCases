package vTiger.Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import vTiger.Generic_Libraries.BaseClass;
import vTiger.PomPages.ContactsPage;
import vTiger.PomPages.CreateNewContactsPage;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;
import vTiger.PomPages.OrganizationsChildWebPage;

public class VTiger_Scenario3 extends BaseClass{
	
	@Test
	public void testCase3() throws FileNotFoundException, IOException
	{
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
		
		HomePage pageHome=new HomePage(driver);
		pageHome.getContactsLink().click();
		
		ContactsPage pageContacts=new ContactsPage(driver);
		pageContacts.getCreateNewContactsButton().click();
		
		CreateNewContactsPage pageNewContacts=new CreateNewContactsPage(driver);
		utilities.dropDownByVisibleText(pageNewContacts.getFirstNameDropdown(), "Mr.");
		pageNewContacts.getFirstNameTextField().sendKeys("Pratik");
		pageNewContacts.getLastNameTextfield().sendKeys("Manna");
		
		pageNewContacts.getSelectOrganizationName().click();
		
		utilities.switchTab(driver, "Accounts");
		
		OrganizationsChildWebPage pageChildOrg=new OrganizationsChildWebPage(driver);
		pageChildOrg.getSearchBar().sendKeys("abc");
		
		pageChildOrg.getSearchButton().click();
		pageChildOrg.getFirstMatchingResult().click();
		
		utilities.switchTab(driver, "Organizations");
		
		pageNewContacts.getSaveButton().click();
		
		
		
	}

}
