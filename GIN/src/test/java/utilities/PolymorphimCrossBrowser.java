package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PolymorphimCrossBrowser {

	

	    WebDriver driver; // Declare WebDriver at class level to make it accessible across methods

	    @BeforeTest
	    public void setup() {
	    	
	    String browser = "Edge";
	    WebDriver driver;
	    switch(browser.toUpperCase()) {
	    case "Edge":
	    	driver = new EdgeDriver();
	    	break;
	    case "FIREFOX":
	    	driver = new FirefoxDriver();
	    	break;
	    default: 	
	    	driver = new ChromeDriver();
	    }
	        /*System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\sacon\\Desktop\\workspace\\3rd party libraies\\chromedriver.exe");
	        driver = new ChromeDriver(); // Initialize WebDriver
	        
	        **/
	        driver.get("https://ginzabe.com/");
	   
	    }
	    @Test
	    public void test() {
	        // Your test logic goes here
	        // For example, you can add assertions or perform actions on the web page
	    }

	    @AfterTest
	    public void endTest() {
	       
	    	driver.close();
	        }
	    }
	
