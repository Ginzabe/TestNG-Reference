package sauceDemoTest.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import saucedemo.Pageobjectmodel.saucedemohomePage;

public class validateLogin {

WebDriver driver;	
saucedemohomePage hp;
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sacon\\OneDrive\\Desktop\\workspace\\3rd party libraies\\chromedriver.exe");
		driver = new ChromeDriver();

		hp = new saucedemohomePage(driver);
		
		//Because we are going to use @Beforemethod, there is no need to use the following
		// two line of code 
		
		//driver.get("https://www.saucedemo.com/");

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
				
	     Thread.sleep(1000);
			
	}
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
	}
	
	@BeforeMethod
	public void getToHomePage() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test(priority=0) 
	public void validatePositiveLogin() throws InterruptedException {
		
		hp.getUserName().sendKeys("standard_user");
		hp.getPassWord().sendKeys("secret_sauce");
		hp.getlogIn().click();
		
		String exepctedValue = "https://www.saucedemo.com/inventory.html";
		
		String actualValue = driver.getCurrentUrl(); 
		
		Thread.sleep(1000);
		
		Assert.assertEquals(actualValue, exepctedValue);
		
		
		
	}
	
	@Test(priority=1) 
	public void validateNegativeLogin() throws InterruptedException {
		
		
		
		hp.getUserName().sendKeys("locked_out_user");
		hp.getPassWord().sendKeys("secret_sauce");
		hp.getlogIn().click();
		
		
		String exepctedValue = "https://www.saucedemo.com/";
		
		String actualValue = driver.getCurrentUrl(); 
		
		Thread.sleep(1000);
		Assert.assertEquals(actualValue, exepctedValue);
		
		
		
	}
	
}
