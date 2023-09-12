package automation;

import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	
	 @DataProvider(name = "experiment")
	  public static Object[][] experiment()
	 {
	    return new Object[][] {{"nitesh","jain"},
	    						{"selenium","training"}};
	  }

	 
	 @DataProvider(name = "validCredentialForlogin")
	  public static Object[][] logindata()
	 {
		 // get data from xls
	    return new Object[][] {{"testology.qa.learning@gmail.com","Testology@123"},
	    						};
	  }

}
