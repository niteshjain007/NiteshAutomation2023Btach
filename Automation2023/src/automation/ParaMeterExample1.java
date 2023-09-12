package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeterExample1 {
	
	@Parameters({ "browser"})
	@Test
	public void verifyTitleForLoginPage(String brw) throws InterruptedException
	{
		WebDriver dr=null;
		if(brw.equals("chrome"))
		{
			 dr= new ChromeDriver();
		}
		if(brw.equals("firefox"))
		{
			 dr= new FirefoxDriver();
		}
		if(brw.equals("edge"))
		{
			 dr= new EdgeDriver();
		}
	
	
		dr.get("https://test.techlift.in/");
		Thread.sleep(4000);
		dr.findElement(By.linkText("Login")).click();
	
		String actualTitle= dr.getTitle();
		String expectedTitle = "Login";
		
		System.out.println("actual title=" + actualTitle);
		boolean check = actualTitle.equals(expectedTitle);
			
		Assert.assertTrue(check,"title not matching");
		
	}
	
	@Parameters({"email","password"})
	@Test
	public void ValidateErrorMsgWhenInvalidCredential(String emailValue,String PasswordValue) throws InterruptedException
	{
		WebDriver dr= new ChromeDriver();
		dr.get("https://test.techlift.in/");
		dr.findElement(By.linkText("Login")).click();
	
		dr.findElement(By.id("login_email")).sendKeys(emailValue); Thread.sleep(4000);
		dr.findElement(By.id("login_password")).sendKeys(PasswordValue);Thread.sleep(4000);
		dr.findElement(By.cssSelector("button[class *= 'btn-login'][type='submit']")).click();
		
		Thread.sleep(4000);
		String actualErrorMsg = dr.findElement(By.cssSelector(".page-card-head .red.indicator")).getText();
		String expectedErrorMsg = "Invalid Login. Try again.";
		
		
		Assert.assertTrue(actualErrorMsg.equals(expectedErrorMsg) ,  "error msg not equal");
		
	}


}
