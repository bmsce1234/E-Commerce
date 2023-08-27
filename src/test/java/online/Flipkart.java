package online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test(groups= {"Sanity"})
  public void flipkartTest() throws InterruptedException 
  {
	  
	  WebDriver driver= new FirefoxDriver();
	  Reporter.log("opening Flipkart", true);
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	//  driver.quit();
	  
	  
  }
  
  
  
  
}
