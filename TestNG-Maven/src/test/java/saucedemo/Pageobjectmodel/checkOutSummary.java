package saucedemo.Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class checkOutSummary {

	WebDriver driver;
	public checkOutSummary (WebDriver driver) {
	    this.driver = driver;
	}
	

	public WebElement getfirstName() {
		return driver.findElement(By.id("first-name"));
	}
	
	public WebElement getlastName() {
		return driver.findElement(By.id("last-name"));
	}
	
	public WebElement getzipCode() {
		return driver.findElement(By.id("postal-code"));
	
	}
	
   public WebElement getcontinue() {
	   return driver.findElement(By.id("continue"));
		
	}
   public WebElement getFinish() {
				return driver.findElement(By.id("finish"));

	}
  
}
