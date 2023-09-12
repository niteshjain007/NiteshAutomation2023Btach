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

public class TestNGDemo1 {

	@Test(priority = 3,invocationCount = 1,enabled =true, groups = {"regression"},dependsOnGroups = {"sanity"})
	public void check1()
	{
		System.out.println("test1");
	}
	
	@Test(groups = {"regression"}, priority = 1, dependsOnGroups = {"sanity"},description = "verify forgot password link is available in login page")
	public void check2()
	{
		System.out.println("test2");
	}
	
	@Test(priority = 2, groups = {"sanity"})
	public void check3()
	{
		System.out.println("test3");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 4, groups = {"regression"},dependsOnGroups = {"sanity"})
	public void check4()
	{
		System.out.println("test4");
	}
	
	
	
	
	
	
	
}
