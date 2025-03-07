package reports;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
	
private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal();
	
	private ExtentManager()
	{
		
	}
	
	static void setExtentTest(ExtentTest test)
	{
		extentTest.set(test);
	}
	
	static ExtentTest getExtentTest()
	{
		return extentTest.get();
	}
	
	static void unload()
	{
		extentTest.remove();
	}

}
