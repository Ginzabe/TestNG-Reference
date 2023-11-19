package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	// declare the variable

	WebDriver driver;

	// Constructor

	public Home(WebDriver driver) {
		this.driver = driver;

		// home functional elements
	}

	public WebElement enrollNow() {
		return driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/section[1]/div[2]/div/div/section/div[3]/div[1]/div/div[2]/div/div/a/span/span"));
	}

	public WebElement browseCourse() {
		return driver
				.findElement(By.xpath("//*[@id=\"content\"]/div/section[2]/div/div[2]/div/div/div/div/a/span/span"));
	}

	public WebElement displayCourseName() {
		return driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/section[3]/div/div/div/div/div/div[1]/div[1]/div[1]/div/div[3]/div[1]/h3/a"));

	}

	public WebElement displayCourseDuration() {
		return driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/section[3]/div/div/div/div/div/div[1]/div[1]/div[1]/div/div[3]/div[1]/div[2]/div[2]/span[2]"));
	}

	public WebElement numberOfCourseSubscribers() {
		return driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/section[3]/div/div/div/div/div/div[1]/div[1]/div[1]/div/div[3]/div[1]/div[2]/div[1]/span[2]"));
	}

	public WebElement courseOwner() {
		return driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/section[3]/div/div/div/div/div/div[1]/div[1]/div[1]/div/div[3]/div[1]/div[3]/div/a"));
	}

	public WebElement addToCart() {
		return driver.findElement(By.xpath(
				"//*[@id=\"content\"]/div/section[3]/div/div/div/div/div/div[1]/div[1]/div[1]/div/div[3]/div[2]/div/div[2]/a/span[2]"));
	}
}
