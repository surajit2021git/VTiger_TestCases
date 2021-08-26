package vTiger.Test_Scripts;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import vTiger.Generic_Libraries.BaseClass;
import vTiger.PomPages.ContactChildWindowPage;
import vTiger.PomPages.CreateNewPurchaseOrderPage;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;
import vTiger.PomPages.PurchaseOrderPage;

public class VTiger_purchaseOrder_TC32 extends BaseClass{
	
	@Test
	public void testCase32() throws FileNotFoundException, IOException, AWTException, InterruptedException
	{
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
		
		HomePage pageHome=new HomePage(driver);
		pageHome.gotoPurchaseOrderModule(driver);
		
		PurchaseOrderPage pagePurchaseOrder=new PurchaseOrderPage(driver);
		pagePurchaseOrder.getCreateNewPurchaseOrderButton().click();
		
		CreateNewPurchaseOrderPage pageNewPurchaseOrder=new CreateNewPurchaseOrderPage(driver);
		pageNewPurchaseOrder.getAddContactNameButton().click();
		
		utilities.switchTab(driver, "Contacts");
		ContactChildWindowPage pageContactChildWindow=new ContactChildWindowPage(driver);
		pageContactChildWindow.getSearchBar().sendKeys("Manna");
		pageContactChildWindow.getSearchNowButton().click();
		pageContactChildWindow.getFirstMatchingElement().click();
		
		utilities.alertPopupAccept(driver);
		
		//Thread.sleep(4000);
		
		utilities.switchFrameByIndex(driver, 0);
		
		
        utilities.switchTab(driver, " Administrator - Purchase Order - vtiger CRM 5 - Commercial Open Source CRM");
		
		pageHome.logoutFromApplication(driver);
	}

}
