package vTiger.Generic_Libraries;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebUtilities {
	
	public void dropDownByIndex(WebElement dropdownAdress,int index)
	{
		Select select=new Select(dropdownAdress);
		select.selectByIndex(index);
	}
	
	public void dropDownByVisibleText(WebElement dropdownAdress,String text)
	{
		Select select=new Select(dropdownAdress);
		select.selectByVisibleText(text);
	}
	
	public void dropDownByValue(WebElement dropdownAdress,String value)
	{
		Select select=new Select(dropdownAdress);
		select.selectByValue(value);
	}
	
	public void switchTab(WebDriver driver,String title)
	{
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator=windowId.iterator();
		while(iterator.hasNext())
		{
			String currentTitle = driver.switchTo().window(iterator.next()).getTitle();
			if(currentTitle.equals(title))
			{
				break;
			}
		}
	}
	
	public void switchToParentTab(WebDriver driver)
	{
		//driver.getWindowHandle();
		//driver.switchTo().window(driver.getWindowHandle());
		
		
	}
	
	
	
	
	public void switchFrameByIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchFrameByElement(WebDriver driver,WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	public void switchFrameByName(WebDriver driver,String frameName)
	{
		driver.switchTo().frame(frameName);
	}
	
	
	public void mouserHover(WebDriver driver,WebElement targetElement)
	{
		Actions action=new Actions(driver);
		action.moveToElement(targetElement).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement targetElement)
	{
		Actions action=new Actions(driver);
		action.contextClick(targetElement).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement targetElement)
	{
		Actions action=new Actions(driver);
		action.doubleClick(targetElement).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement target)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}
	
	public void scrollBar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(x,y)");
	}
	
	public void alertPopupAccept(WebDriver driver) throws AWTException
	{
		
	
			driver.switchTo().alert().accept();
		
		
	}
	
	public void alertPopupDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void implicitTime(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void pageLoadTime(WebDriver driver,int time)
	{
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}

}
