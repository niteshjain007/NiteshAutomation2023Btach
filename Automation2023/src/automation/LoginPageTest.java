package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	@Test
	public void verifyLoginPageTitle()
	{
		WebDriver dr= new ChromeDriver();
		dr.get("https://test.techlift.in/");
		dr.findElement(By.linkText("Login")).click();
	
		String actualTitle= dr.getTitle();
		String expectedTitle = "Login";
		
		System.out.println("actual title=" + actualTitle);
		boolean check = actualTitle.equals(expectedTitle);
			
		Assert.assertTrue(check,"title not matching");
		
	}
	
	@Test
	public void validateContactLinkPrsent()
	{
		WebDriver dr= new ChromeDriver();
		dr.get("https://test.techlift.in/");
		dr.findElement(By.linkText("Login")).click();
	
		WebElement contactElm= dr.findElement(By.xpath("//div[@id='navbarSupportedContent']//li[@class='nav-item']//a[contains(text(),'Contact')]"));

		boolean check = contactElm.isDisplayed();
		Assert.assertTrue(check, "contact link not available");

	}
	
	@Test
	public void ValidateErrorMsgWhenInvalidCredential() throws InterruptedException
	{
		WebDriver dr= new ChromeDriver();
		dr.get("https://test.techlift.in/");
		dr.findElement(By.linkText("Login")).click();
	
		dr.findElement(By.id("login_email")).sendKeys("test@test.com"); Thread.sleep(4000);
		dr.findElement(By.id("login_password")).sendKeys("abcd");Thread.sleep(4000);
		dr.findElement(By.cssSelector("button[class *= 'btn-login'][type='submit']")).click();
		
		Thread.sleep(4000);
		String actualErrorMsg = dr.findElement(By.cssSelector(".page-card-head .red.indicator")).getText();
		String expectedErrorMsg = "Invalid Login. Try again.";
		
		
		Assert.assertTrue(actualErrorMsg.equals(expectedErrorMsg) ,  "error msg not equal");
		
	}
	
	

}
