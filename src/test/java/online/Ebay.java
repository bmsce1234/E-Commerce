package online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ebay {
  @Test(groups= {"Sanity"})
  public void ebayTest() 
  {
	  
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("opening Ebay", true);
	  driver.get("https://www.ebay.com/");
	  Reporter.log("opening Ebay", true);
	  driver.manage().window().maximize();
	 // driver.quit();
	  
	  
	  
  }
}
  