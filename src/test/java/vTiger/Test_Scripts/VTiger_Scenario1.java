package vTiger.Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import vTiger.Generic_Libraries.BaseClass;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;

public class VTiger_Scenario1 extends BaseClass{
	
	
	@Test
	public void TestCase1() throws FileNotFoundException, IOException
	{
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
		
		HomePage pageHome=new HomePage(driver);
		pageHome.logoutFromApplication(driver);
	}

}
