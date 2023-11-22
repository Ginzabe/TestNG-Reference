package scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.HomePage;

public class HomePageScript {

	// Declare WebDriver at class level to make it accessible across methods

	WebDriver driver;

	// create homePage object
	
	HomePage hpg;

	@BeforeTest
	public void Setup() {

		// Initialization & launch Chrome driver
		driver = new ChromeDriver();

		// initialization home page
		hpg = new HomePage(driver);

		// enter AUT url

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@BeforeMethod

	public void Syncronization() {

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://ginzabe.com/");

	}

	@Test(priority = 0)
	public void careerPath() {

		hpg.careerPath().click();

		String actual = driver.getCurrentUrl();
		String expected = "https://ginzabe.com/course-list/";

		assertEquals(actual, expected);

	}

	@Test(priority = 1)
	public void ownPace() {

		hpg.ownPace().click();

		String actual = driver.getCurrentUrl();
		String expected = "https://ginzabe.com/course-list/";

		assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void payingJob() {

		hpg.payingJob().click();

		String expected = "https://ginzabe.com/course-list/";
		String actual = driver.getCurrentUrl();

		assertEquals(actual, expected);

	}

	@AfterTest
	public void TearOut() {

		driver.quit();

	}
}
