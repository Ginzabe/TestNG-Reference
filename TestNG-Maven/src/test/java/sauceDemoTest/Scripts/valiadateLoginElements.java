package sauceDemoTest.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import saucedemo.Pageobjectmodel.saucedemohomePage;

public class valiadateLoginElements {

	
	WebDriver driver; 
	saucedemohomePage hp;
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sacon\\OneDrive\\Desktop\\workspace\\3rd party libraies\\chromedriver.exe");
		driver = new ChromeDriver();

		hp = new saucedemohomePage(driver);
		
		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
				
		Thread.sleep(1000);     
	    
	}
	
	@AfterTest
	public void endTest() {

		driver.quit();
	}

	@Test(priority=0)
	public void enableUsername() {

		boolean x = hp.getUserName().isEnabled();
		Assert.assertTrue(x);

	}

	@Test(priority=1)
	public void enablePassword() {

		boolean x = hp.getPassWord().isEnabled();
		
		Assert.assertTrue(x);
		

	}

	@Test(priority=2)
	public void enablelogin() {

		boolean x = hp.getlogIn().isEnabled();
		Assert.assertTrue(x);
	}
}
