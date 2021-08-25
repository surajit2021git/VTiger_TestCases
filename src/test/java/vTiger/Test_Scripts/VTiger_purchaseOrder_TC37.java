package vTiger.Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import vTiger.Generic_Libraries.BaseClass;
import vTiger.PomPages.HomePage;
import vTiger.PomPages.LoginPage;
import vTiger.PomPages.PurchaseOrderPage;

public class VTiger_purchaseOrder_TC37 extends BaseClass{
	
	@Test
	public void testCase37() throws FileNotFoundException, IOException, InterruptedException
	{
		LoginPage pageLogin=new LoginPage(driver);
		pageLogin.loginToApplication(propertyAccess.getPropertyData("username"), propertyAccess.getPropertyData("password"));
		
		HomePage pageHome=new HomePage(driver);
		pageHome.gotoPurchaseOrderModule(driver);
		
		PurchaseOrderPage pagePurchaseOrder=new PurchaseOrderPage(driver);
		pagePurchaseOrder.getPurchaseOrderNo1_CheckBox().click();
		pagePurchaseOrder.getMassEditButton().click();
		
		Assert.assertEquals(pagePurchaseOrder.getTableMassEdit_recordField().getText(), "Mass Edit - Records Fields");
		
		int randomNumber=randomAccess.getRandomNumber(10000);
		
		pagePurchaseOrder.getEditPurchaseOrderInfo_trackNoTxt().sendKeys(""+randomNumber);
		Thread.sleep(2000);
		pagePurchaseOrder.getTableMassEdit_recordField_SavelButton().click();
		
		Thread.sleep(4000);
		
		pageHome.logoutFromApplication(driver);
		
		
		
	
	}

}
