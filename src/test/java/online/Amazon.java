package online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test(groups= {"Sanity"})
  public void amazonTest() 
  {
	  
	  WebDriver driver= new FirefoxDriver();
	  Reporter.log("opening Amazon", true);
	  driver.get("https://www.amazon.in");
	  driver.manage().window().maximize();
	  //driver.quit();
	  
	  
	  
  }
  @Test(groups= {"Sanity"})
  public void print() 
  {
	  
	 System.out.println("print amazon");
	  
	  
	  
  }
}
  