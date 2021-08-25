package vTiger.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {
	
	WebDriver driver;
	public PurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement createNewPurchaseOrderButton;
	
	@FindBy(xpath="//input[@id='12']")
	private WebElement purchaseOrderNo1_CheckBox;
	
	@FindBy(xpath="(//input[@value='Mass Edit'])[2]")
	private WebElement massEditButton;
	
	@FindBy(xpath="//td[text()='Mass Edit - Records Fields']")
	private WebElement TableMassEdit_recordField;
	
	@FindBy(xpath="(//input[@class='crmbutton small cancel'])[2]")
	private WebElement TableMassEdit_recordField_CancelButton;
	
	@FindBy(xpath="//input[@class='crmbutton small cancel']")
	private WebElement purchaseOrderNo1_Action_Edit_CancelButton;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement TableMassEdit_recordField_SavelButton;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement purchaseOrderNo1_Action_Edit_SavelButton;
	
	public WebElement getPurchaseOrderNo1_Action_Edit_CancelButton() {
		return purchaseOrderNo1_Action_Edit_CancelButton;
	}

	public WebElement getPurchaseOrderNo1_Action_Edit_SavelButton() {
		return purchaseOrderNo1_Action_Edit_SavelButton;
	}

	@FindBy(xpath="//input[@id='tracking_no']")
	private WebElement editPurchaseOrderInfo_trackNoTxt;
	
	@FindBy(xpath="//a[text()='edit']")
	private WebElement purchaseOrderNo1_Action_Edit;
	
	
	
	
	
	public WebElement getPurchaseOrderNo1_Action_Edit() {
		return purchaseOrderNo1_Action_Edit;
	}

	public WebElement getEditPurchaseOrderInfo_trackNoTxt() {
		return editPurchaseOrderInfo_trackNoTxt;
	}

	public WebElement getTableMassEdit_recordField() {
		return TableMassEdit_recordField;
	}

	public WebElement getTableMassEdit_recordField_CancelButton() {
		return TableMassEdit_recordField_CancelButton;
	}

	public WebElement getTableMassEdit_recordField_SavelButton() {
		return TableMassEdit_recordField_SavelButton;
	}

	public WebElement getMassEditButton() {
		return massEditButton;
	}

	public WebElement getPurchaseOrderNo1_CheckBox() {
		return purchaseOrderNo1_CheckBox;
	}

	public WebElement getCreateNewPurchaseOrderButton() {
		return createNewPurchaseOrderButton;
	}
	
	

}
