package dataProviderStudy;

import org.testng.annotations.DataProvider;

public class DataProviderTest 
{


@DataProvider(name="loginwithinvaliddata")
public String[][] testdata()
{
	String[][] data= {{"Admin","admin12"},{"Adminn","admin123"}, {"Admin","admin1234"}    };
	return data;
}
	
@DataProvider(name="valid data")

public String[][] data()
{
	String [][] data2= {{"Admin","admin123"}};
	return data2;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
