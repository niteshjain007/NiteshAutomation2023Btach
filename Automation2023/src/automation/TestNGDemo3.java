package automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo3 {

	@BeforeMethod
	public void beforeMyTestcases()
	{
		System.out.println("start test");
	}
	
	@AfterMethod
	public void afterMyTestcases()
	{
		System.out.println("end test");
	}
	
	@Test(priority = 3)
	public void check1()
	{
		System.out.println("test1");
	}
	@Test(priority = 1)
	public void check2()
	{
		System.out.println("test2");
	}
	
	@Test(priority = 2)
	public void check3()
	{
		System.out.println("test3");
	}
	
	@BeforeClass
	public void beforeAtestClass()
	{
		System.out.println("starting of class");
	}
	
	@AfterClass
	public void afterATEstClass()
	{
		System.out.println("end of my test class execution");
	}
	
	@BeforeTest
	public void beforeAllTestClassOnce()
	{
		System.out.println("hey..");
	}
	
	@AfterTest
	public void afterAllTestClass()
	{
		System.out.println("bye..");
	}
	
	@BeforeSuite
	public void beforeAcompleteTestSuite()
	{
		System.out.println("good morning");
	}
	
	@AfterSuite
	public void afterAcompleteTestSuite()
	{
		System.out.println("good night");
	}
	
	
	
}
