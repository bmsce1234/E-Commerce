package online;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FindMultipleElements {
  @Test(groups= {"Regression"})
  public void multipleElements() 
  {
	 WebDriver driver= new FirefoxDriver() ;
	 Reporter.log("DemoQA", true);
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/text-box/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 List<WebElement> input = driver.findElements(By.tagName("input"));
	 
	 for(WebElement in:input)
	 {
		 System.out.println(in.getAttribute("placeholder"));
	 }
	
	 driver.quit();
	  
	  
	  
	  
	  
  }
}
