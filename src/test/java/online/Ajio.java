package online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTest() 
  {
	  WebDriver driver= new FirefoxDriver();
	  Reporter.log("opening Ajio", true);
	  driver.get("https://www.ajio.com/");
	  driver.manage().window().maximize();
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
