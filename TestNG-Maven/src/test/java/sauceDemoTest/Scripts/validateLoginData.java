package sauceDemoTest.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import saucedemo.Pageobjectmodel.saucedemohomePage;

public class validateLoginData {

	
	/** PSST: always testNG.xml is the one we need to run during data driven testing/
	 */
	
	WebDriver driver;	
	saucedemohomePage hp;
		
		
		@BeforeTest
		public void setupTest() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sacon\\OneDrive\\Desktop\\workspace\\3rd party libraies\\chromedriver.exe");
			driver = new ChromeDriver();

			hp = new saucedemohomePage(driver);
			
			/**since we are going to use @Beforemethod, there is no need to use the following
			// two line of code 
			//driver.get("https://www.saucedemo.com/");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

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
		/** Once we are going to create parameters and its value on testNG.xml
		 * then we need to pass that parameter here 🌾 */
		
		@Parameters({"userid","password","expectedvalue"})
		@Test 
		public void validateLogin(String userid, String password, String expectedvalue) throws InterruptedException {
			/** Here string first letter should be capital letter and we need to
			 * pass input types here*/
			
			hp.getUserName().sendKeys(userid);
			hp.getPassWord().sendKeys(password);
			hp.getlogIn().click();
			
			/** we don't this value String exepctedValue = "https://www.saucedemo.com/inventory.html";*/
			
			String actualValue = driver.getCurrentUrl(); 
			
			Thread.sleep(1000);
			
			Assert.assertEquals(actualValue, expectedvalue);
			
			
			
		}
		
		
	
}
