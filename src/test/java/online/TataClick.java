package online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TataClick {
  @Test
  public void tataclickTest() 
  {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.close();
	  
	  
	  
  }
}
  