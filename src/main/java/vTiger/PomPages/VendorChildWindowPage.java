package vTiger.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorChildWindowPage {
	WebDriver driver;
	
	public VendorChildWindowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchBar;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement serachNowButton;
	
	@FindBy(xpath="//a[text()='Life Style']")
	private WebElement firstMatchingElement;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSerachNowButton() {
		return serachNowButton;
	}

	public WebElement getFirstMatchingElement() {
		return firstMatchingElement;
	}

}
