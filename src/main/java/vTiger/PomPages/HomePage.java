package vTiger.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.Generic_Libraries.WebUtilities;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutLink;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orgranizatonsLink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement homePageLink;
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreLink; 
	
	@FindBy(xpath="//a[text()='Purchase Order']")
	private WebElement purchaseOrderLink;
	
	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}

	public WebElement getHomePageLink() {
		return homePageLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOrgranizatonsLink() {
		return orgranizatonsLink;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getSignoutLink() {
		return signoutLink;
	}
	
	public void logoutFromApplication(WebDriver driver)
	{
		WebUtilities utilities=new WebUtilities();
		utilities.mouserHover(driver, logoutButton);
		signoutLink.click();
	}
	
	public void gotoPurchaseOrderModule(WebDriver driver)
	{
		WebUtilities utilities=new WebUtilities();
		utilities.mouserHover(driver, moreLink);
		purchaseOrderLink.click();
	}
	
	

}
