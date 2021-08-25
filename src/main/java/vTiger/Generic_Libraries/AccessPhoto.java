package vTiger.Generic_Libraries;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AccessPhoto {
	
	public File getPhoto(WebDriver driver,String name) throws IOException
	{
		Date d=new Date();
		String date = d.toString().replaceAll(":", "-");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourceLoaction = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationLocation=new File(AutoConstant.photoFolderPath+date+name+".png");
		
		 FileUtils.copyFile(sourceLoaction, destinationLocation);
		 
		 return destinationLocation;
	}

}
