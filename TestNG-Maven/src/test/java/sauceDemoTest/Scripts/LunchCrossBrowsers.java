package sauceDemoTest.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//psst: this code works for 4.6.0 version & onwards only
public class LunchCrossBrowsers {

	public static void main(String[] args) {

		String browser = "Edge";
		WebDriver driver;

		switch (browser.toUpperCase()) {
		case "Edge":
			driver = new EdgeDriver();

			break;

		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "IEdriver":
			driver = new InternetExplorerDriver();
			break;
		default:
			driver = new ChromeDriver();
		}

		driver.get("https://www.yahoo.com/");
		driver.getTitle();
		driver.close();
	}

}
