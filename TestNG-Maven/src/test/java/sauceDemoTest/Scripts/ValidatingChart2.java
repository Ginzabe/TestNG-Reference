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

public class ValidatingChart2 {
	
	WebDriver driver;	
	saucedemohomePage hp;
	saucedemoInventory iv;
		
	/** Each web page should have one test script but may have different 
	 * test case like this and same time, one test case should be in one 
	 * @Test because if we have multiple test case in @Test then need to do
	 * pass and fail scenario, if one test case fail from the multiple test case
	 * in the @Test then it all test case consider failed. */
	
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
		
		hp.getUserName().sendKeys("standard_user");
	    hp.getPassWord().sendKeys("secret_sauce");
	    hp.getlogIn().click();

	}
	
	@Test(priority=4)
	public void getBackPackName() {
				
	    String getBackPack = iv.getBackpack().getText();
	}
	  
	 @Test(priority=1)
	 public void validateAddToChartBackPack() {
		 
		boolean expected = iv.getFleeceJacket().isEnabled();
		
		 iv.addToChartBackPack().click();
		 
		 Assert.assertTrue(expected);
		 
	
		 
	 }
	 
	 @Test(priority=0) 
	 public void getFleeceJacket() {
		 String readFleeceJacket = iv.getFleeceJacket().getText();
	 }
	    
     @Test(priority=3)
     public void validateaddToChartFleeceJacket() {
    	 /**isenable command should be first before click command unless it bring  
    	  * No such element exception */
    	boolean expected = iv.addToChartFleeceJacket().isEnabled();
    	iv.addToChartFleeceJacket().click();
    	
    	Assert.assertTrue(expected); 
    	}
     /**PSST: From Test 1 to Test 4 I put them messed up for priority test reason*/
     
     @Test(priority=5)
     public void getBoltTshirt() {
    	String readBoltTshirt = iv.getBoltTshirt().getText();
     }
     
     @Test(priority=6)
     public void validateaddToChartBoltTshirt() {
    	boolean expected = iv.addToChartBoltTshirt().isEnabled();
    	 iv.addToChartBoltTshirt().click();
    	 
      Assert.assertTrue(expected);
    	 
     }
}
