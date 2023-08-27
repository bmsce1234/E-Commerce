package listner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listner.Listner.class)
public class ListnerTestNGP {
  
 @Test
  public void a() 
  {
	 Reporter.log("this is Method A", true);
	 Assert.fail();
	 
	//  System.out.println(" a method");
	  
  }
  @Test
  public void b() 
  {
	  Reporter.log("this is Method b", true);
	  
	  
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("this is Method c", true);
	 // System.out.println(" c method");
	  
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("this is Method d", true);
	//  System.out.println(" d method");
	  
  }
}
