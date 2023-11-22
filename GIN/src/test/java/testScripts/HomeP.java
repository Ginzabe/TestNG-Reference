package testScripts;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjectModel.HomePom;

public class HomeP {

// Declare WebDriver at class level to make it accessible across methods

	WebDriver driver;

	// create homePage object
	HomePom hp;  

	@BeforeTest
	public void Setup() {

		

		// Initialization & launch Chrome driver
		driver = new ChromeDriver();
		
		// initialization home page
		hp = new HomePom(driver);
		
		// enter AUT url

		driver.get("https://ginzabe.com/");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	
	@BeforeMethod

	public void Syncronization() {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void careerPath() {
   hp.careerPath().click();
   
   String expected = driver.getCurrentUrl();
   String actual = "https://ginzabe.com/course-list/";
   
   assertEquals(actual, expected);
	
	}

	@AfterTest
	public void TearOut() {

		
		driver.quit();
	}
}
