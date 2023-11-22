package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModel.Delete;
import pageObjectModel.Home;
import pageObjectModel.HomePom;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ginzabe.com/");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//Home hp = new Home(driver);
		//hp.careerPath().click();
		
		Delete dl = new Delete(driver);
		dl.careerPath().click();
		
		Thread.sleep(2000);
		
		driver.get("https://ginzabe.com");
		
		HomePom hpd = new HomePom(driver);
		
		
		hpd.browseCourse().click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
