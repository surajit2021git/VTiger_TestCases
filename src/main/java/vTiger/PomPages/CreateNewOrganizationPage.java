package vTiger.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	
	WebDriver driver;
	
	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organizationNameTextfield;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDropdown;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement typeDropdown;
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement ratingDropdown;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectMemberOfTextField;
	
	@FindBy(xpath="//input[@name='button']")
	private WebElement saveButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement homePageLink;
	
	public WebElement getHomePageLink() {
		return homePageLink;
	}


	public WebElement getOrganizationNameTextfield() {
		return organizationNameTextfield;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getTypeDropdown() {
		return typeDropdown;
	}

	public WebElement getRatingDropdown() {
		return ratingDropdown;
	}

	public WebElement getSelectMemberOfTextField() {
		return selectMemberOfTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createNewOrganization()
	{
		
	}

}
