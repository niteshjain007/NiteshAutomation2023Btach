package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	
	@Test(enabled=false,dataProvider = "testDataForInvalidLogin")
	public void ValidateErrorMsgWhenInvalidCredential(String email,String passwd) throws InterruptedException
	{
		WebDriver dr= new ChromeDriver();
		dr.get("https://test.techlift.in/");
		dr.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		dr.findElement(By.id("login_email")).sendKeys(email); Thread.sleep(14000);
		dr.findElement(By.id("login_password")).sendKeys(passwd);Thread.sleep(14000);
		dr.findElement(By.cssSelector("button[class *= 'btn-login'][type='submit']")).click();
		
		Thread.sleep(4000);
		String actualErrorMsg = dr.findElement(By.cssSelector(".page-card-head .red.indicator")).getText();
		String expectedErrorMsg = "Invalid Login. Try again.";
		
		
		Assert.assertTrue(actualErrorMsg.equals(expectedErrorMsg) ,  "error msg not equal");
		
	}
	
	@DataProvider
	public Object[][] testDataForInvalidLogin()
	{
		// code to get data for a particular test from xls
		
		Object[][] data = {{"test@qaTestology.com","qwertyty"}
							,{"check@check.com","asdfghj"}};	
		/*data= {{"test@qaTestology.com","qwertyty"},
							{"check@check.com","asdfghj"}};*/
		
		return data;
	}
	
	
	@Test(enabled=false,dataProvider = "validCredentialForlogin", dataProviderClass = DataProviderUtility.class)
	public void ValidateloginWithValidCredential(String email,String passwd) throws InterruptedException
	{
		WebDriver dr= new ChromeDriver();
		dr.get("https://test.techlift.in/");
		dr.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		dr.findElement(By.id("login_email")).sendKeys(email); Thread.sleep(14000);
		dr.findElement(By.id("login_password")).sendKeys(passwd);Thread.sleep(14000);
		dr.findElement(By.cssSelector("button[class *= 'btn-login'][type='submit']")).click();
		
		
	}
	
	@Test(dataProvider = "experiment", dataProviderClass = DataProviderUtility.class)
	public void check(String x, String y)
	{
		System.out.println(x+ "\t" + y);
	}
	
	
	

}
