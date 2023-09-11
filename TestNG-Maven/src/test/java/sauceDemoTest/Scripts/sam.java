package sauceDemoTest.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import saucedemo.Pageobjectmodel.saucedemoInventory;
import saucedemo.Pageobjectmodel.saucedemohomePage;

public class sam {

	
	WebDriver driver;	
	saucedemohomePage hp;
	saucedemoInventory iv;
		
		
		@BeforeTest
		public void setupTest() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sacon\\OneDrive\\Desktop\\workspace\\3rd party libraies\\chromedriver.exe");
			driver = new ChromeDriver();

			hp = new saucedemohomePage(driver);
			iv = new saucedemoInventory(driver);
			
			//Because we are going to use @Beforemethod, there is no need to use the following
			// two line of code -- we don't to use @BeforeMethod here
			
			
			driver.manage().deleteAllCookies();

			driver.manage().window().maximize();
					
		     Thread.sleep(1000);
				
		}
		
		@AfterTest
		public void endTest() {
			
			driver.quit();
		}
	
	
	
	@BeforeMethod 
	public void beforeEachTest() {
		
		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void ReadBackPackName() {
		
		hp.getUserName().sendKeys("standard_user");
	    hp.getPassWord().sendKeys("secret_sauce");
	    hp.getlogIn().click();
	    
	    String readBackPack = iv.getBackpack().getText();
	}
	  
	 @Test 
	 public void validateAddToChartBackPack() {
		 
		hp.getUserName().sendKeys("standard_user");
		hp.getPassWord().sendKeys("secret_sauce");
		hp.getlogIn().click();
		 
		 iv.addToChartBackPack().click();
	 }
	 
	    
	    
	}
		
