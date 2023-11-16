package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {

	

	    WebDriver driver; // Declare WebDriver at class level to make it accessible across methods

	    @BeforeTest
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\sacon\\Desktop\\workspace\\3rd party libraies\\chromedriver.exe");
	        driver = new ChromeDriver(); // Initialize WebDriver
	        driver.get("https://ginzabe.com/");
	    }

	    @Test
	    public void test() {
	        // Your test logic goes here
	        // For example, you can add assertions or perform actions on the web page
	    }

	    @AfterTest
	    public void endTest() {
	       
	    	driver.quit();
	        }
	    }
	
