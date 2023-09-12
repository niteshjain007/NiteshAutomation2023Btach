package automation;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo4 {

	@Test()
	public void check1()
	{
		System.out.println("test1");
	}
	
	@Test()
	public void check2()
	{
		System.out.println("test2");
	}
	
	@Test()
	public void check3()
	{
		System.out.println("test3");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "check3")
	public void check4()
	{
		System.out.println("test4");
	}
	
	
	
}
