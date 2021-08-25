package vTiger.Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import vTiger.Generic_Libraries.BaseClass;
import vTiger.PomPages.CreateNewPurchaseOrderPage;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;
import vTiger.PomPages.PurchaseOrderPage;

public class VTiger_purchaseOrder_TC31 extends BaseClass{
	
	@Test
	public void testCase31() throws FileNotFoundException, IOException
	{
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
		
		HomePage pageHome=new HomePage(driver);
		pageHome.gotoPurchaseOrderModule(driver);
		
		PurchaseOrderPage pagePurchaseOrder=new PurchaseOrderPage(driver);
		pagePurchaseOrder.getCreateNewPurchaseOrderButton().click();
		
		CreateNewPurchaseOrderPage pageCreateNewPurchaseOrder=new CreateNewPurchaseOrderPage(driver);
		pageCreateNewPurchaseOrder.getBillingAddressTextfield().sendKeys("Amritswar,punjab");
		
		pageCreateNewPurchaseOrder.getCopyBillingAddressRadioButton().click();
		
		pageHome.logoutFromApplication(driver);
				
	
	}

}
