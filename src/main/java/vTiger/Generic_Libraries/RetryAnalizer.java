package vTiger.Generic_Libraries;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizer implements IRetryAnalyzer{
	
	int count=0;
	int retryCount=3;

	public boolean retry(ITestResult result) {
		
		while(count<retryCount)
		{
			count++;
			return true;
		}
	
		return false;
	}

}
