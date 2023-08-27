package dataProviderStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmLogin {
  @Test(dataProvider="loginwithinvaliddata",dataProviderClass =dataProviderStudy.DataProviderTest.class)
  public void validateLoginPageWithMultipleTestdata(String username, String password) throws InterruptedException 
  {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	  Thread.sleep(3000);
	  WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
	  Thread.sleep(3000);
	  loginButton.click();
	  Thread.sleep(4000);
	  boolean result = loginButton.isDisplayed();
	  System.out.println(result);
	  Thread.sleep(4000);
	/// Assert.assertTrue(result);
	  Thread.sleep(3000);
	  driver.quit();
	  Thread.sleep(2000);
	  
  }
}
