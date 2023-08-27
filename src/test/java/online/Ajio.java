package online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test(groups={"Regression"})
  public void ajioTest() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  Thread.sleep(100);
	  Reporter.log("opening ajio", true);
	 
	  driver.get("https://www.ajio.com/");
	  driver.manage().window().maximize();
	//  driver.quit();	  
	  
  }
}
