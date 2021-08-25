package vTiger.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsChildWebPage {
	
	WebDriver driver;
	public OrganizationsChildWebPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchBar;
	
	@FindBy(xpath="//select[@name='search_field']")
	private WebElement inDropdown;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchButton;
	
	//@FindBy(xpath="(//table[@class='small'])[3]/tbody/tr[2]/td[1]")
	//private WebElement firstMatchingResult;
	
	@FindBy(xpath="//a[text()='Abc']")
	private WebElement firstMatchingResult;
	
	public WebElement getFirstMatchingResult() {
		return firstMatchingResult;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getInDropdown() {
		return inDropdown;
	}
	
	

}
