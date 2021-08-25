package vTiger.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {
	
	WebDriver driver;
	public CreateNewContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement firstNameDropdown;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectOrganizationName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextfield;
	
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getFirstNameDropdown() {
		return firstNameDropdown;
	}

	public WebElement getSelectOrganizationName() {
		return selectOrganizationName;
	}
	
	

}
