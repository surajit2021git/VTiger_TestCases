package vTiger.Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import vTiger.Generic_Libraries.BaseClass;
import vTiger.PomPages.CreateNewPurchaseOrderPage;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;
import vTiger.PomPages.PurchaseOrderPage;
import vTiger.PomPages.VendorChildWindowPage;

public class VTiger_purchaseOrder_TC33 extends BaseClass {
	
	@Test
	public void testCase33() throws FileNotFoundException, IOException
	{
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
		
		HomePage pageHome=new HomePage(driver);
		pageHome.gotoPurchaseOrderModule(driver);
		
		PurchaseOrderPage pagePurchaseOrder=new PurchaseOrderPage(driver);
		pagePurchaseOrder.getCreateNewPurchaseOrderButton().click();
		
		CreateNewPurchaseOrderPage pageNewPurchaseOrder=new CreateNewPurchaseOrderPage(driver);
		pageNewPurchaseOrder.getAddVenderNameButton().click();
		
		utilities.switchTab(driver, "Vendors");
		VendorChildWindowPage pageVendorChildWindow=new VendorChildWindowPage(driver);
		pageVendorChildWindow.getSearchBar().sendKeys("Life Style");
		pageVendorChildWindow.getSerachNowButton().click();
		pageVendorChildWindow.getFirstMatchingElement().click();
		
		utilities.switchTab(driver, " Administrator - Purchase Order - vtiger CRM 5 - Commercial Open Source CRM");
		
		pageHome.logoutFromApplication(driver);
		
	}

}
