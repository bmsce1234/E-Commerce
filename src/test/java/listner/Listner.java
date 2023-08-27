package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listner implements ITestListener{
  
  
 @Override
public void onTestStart(ITestResult result) 
 {
	 String Tcname= result.getName();
	 Reporter.log("Test case " +Tcname+" started", true);
 }
 
 @Override
	public void onTestSuccess(ITestResult result) 
 {
	 String Tcname= result.getName();
	 Reporter.log("Test case " +Tcname+" is sucessfully", true);	
 }
 
 @Override
	public void onTestFailure(ITestResult result) {
	 String Tcname= result.getName();
	 Reporter.log("Test case " +Tcname+" got failed", true);
	 
	 // here we will add screenshot  code to take screen shot on Failure
	}
 
 
}
