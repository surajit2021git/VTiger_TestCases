package vTiger.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactChildWindowPage {
	WebDriver driver;
	
	public ContactChildWindowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchBar;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchNowButton;
	
	@FindBy(xpath="//a[text()='Pratik Manna']")
	private WebElement firstMatchingElement;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}

	public WebElement getFirstMatchingElement() {
		return firstMatchingElement;
	}
	

}
