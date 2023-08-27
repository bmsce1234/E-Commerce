package online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataClick {
  @Test(groups= {"Regression"})
  public void tataclickTest() 
  {
	  
	  WebDriver driver= new FirefoxDriver();
	  Reporter.log("opening Tataclick", true);
	  driver.get("https://www.tatacliq.com/");
	  driver.manage().window().maximize();
	 // driver.quit();
	  
	  
	  
  }
}
  