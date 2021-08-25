package vTiger.Generic_Libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AccessPropety {
	
	public String getPropertyData(String key) throws FileNotFoundException, IOException
	{
		Properties property=new Properties();
		property.load(new FileInputStream(AutoConstant.propertyFilePath));
		String value = property.getProperty(key);
		return value;
	}

}
