package vTiger.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPurchaseOrderPage {
	
	WebDriver driver;
	public CreateNewPurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingAddressTextfield;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingAddressTextfield;
	
	@FindBy(xpath="//input[@onclick='return copyAddressLeft(EditView)']")
	private WebElement copyShippingAddressRadioButton;
	
	@FindBy(xpath="//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement copyBillingAddressRadioButton;
	
	@FindBy(xpath="(//img[@align='absmiddle'])[3]")
	private WebElement addVenderNameButton;
	
	@FindBy(xpath="(//img[@align='absmiddle'])[4]")
	private WebElement addContactNameButton;
	
	@FindBy(xpath="(//input[@title='Clear'])[2]")
	private WebElement eraseContactNameButton;
	
	public WebElement getEraseContactNameButton() {
		return eraseContactNameButton;
	}

	public WebElement getAddContactNameButton() {
		return addContactNameButton;
	}

	public WebElement getAddVenderNameButton() {
		return addVenderNameButton;
	}

	public WebElement getCopyBillingAddressRadioButton() {
		return copyBillingAddressRadioButton;
	}

	public WebElement getCopyShippingAddressRadioButton() {
		return copyShippingAddressRadioButton;
	}

	public WebElement getShippingAddressTextfield() {
		return shippingAddressTextfield;
	}

	public WebElement getBillingAddressTextfield() {
		return billingAddressTextfield;
	}
	
	

}
