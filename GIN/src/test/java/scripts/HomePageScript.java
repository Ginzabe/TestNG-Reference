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

	@Test(priority = 0) // tests are prioritized by numbers always start with 0
	public void careerPath() {

		hpg.careerPath().click();

		String actual = driver.getCurrentUrl();
		String expected = "https://ginzabe.com/course-list/";

		assertEquals(actual, expected);

	}

	@Test(priority = 1, dependsOnMethods = {"careerPath"}) // To show one test depends on another test
	public void ownPace() {

		hpg.ownPace().click();

		String actual = driver.getCurrentUrl();
		String expected = "https://ginzabe.com/course-list/";

		assertEquals(actual, expected);
	}
     
	@Test(priority = 2, enabled = true) // enabled or disabled the test use = true/false
	public void payingJob() {

		hpg.payingJob().click();

		String expected = "https://ginzabe.com/course-list/";
		String actual = driver.getCurrentUrl();

		assertEquals(actual, expected);

	}
	
	@Test (enabled = true)
	public void enrollNow() {
		hpg.enrollNow().click();
		
		String expected = "https://ginzabe.com/dashboard/";
		String actual = driver.getCurrentUrl();
		
		assertEquals(actual, expected);
	}

	@Test
	public void browseCourse() {
		
		hpg.browseCourse().click();
		
	String expected = "https://ginzabe.com/course-list/";
	String actual = driver.getCurrentUrl();
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void displayCourseName() {
	
		String actual = hpg.displayCourseName().getText();
		String expected = "Be Quality Analyst";
				
		assertEquals(actual, expected);
		
	}
	
	@Test
	public void displayCourseDuration() {
		
		String actual = hpg.displayCourseDuration().getText();
		String expected = "24 hours";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void numberOfCourseSubscribers() {
		String actual = hpg.numberOfCourseSubscribers().getText();
		String expected = "3";
		
		assertEquals(actual, expected);
	}
	
	@Test 
	public void courseOwner() {
		String actual = hpg.courseOwner().getText();
		String expected = "ginzabe";
		
		assertEquals(actual, expected);
	}
	
	@Test 
	public void courseprice() {
		String actual = hpg.courseprice().getText();
		String expected = "$1,999.99";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void addToCart() {
		hpg.addToCart().click();
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ginzabe.com/dashboard/";
		
		assertEquals(actual, expected);
	}
	
	@AfterTest
	public void TearOut() {

		driver.quit();

	}
}
