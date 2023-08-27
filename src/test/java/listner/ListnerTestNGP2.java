package listner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listner.Listner.class)
public class ListnerTestNGP2 {
  
 @Test
  public void p() 
  {
	 Assert.fail();
	  Reporter.log("this is Method P", true);
	//  System.out.println(" a method");
	  
  }
  @Test
  public void q() 
  {
	  Reporter.log("this is Method q", true);
	  
	  
  }
  
  @Test
  public void r() 
  {
	  Reporter.log("this is Method r", true);
	 // System.out.println(" c method");
	  
  }
  
  @Test
  public void s() 
  {
	  Reporter.log("this is Method s", true);
	//  System.out.println(" d method");
	  
  }
}
