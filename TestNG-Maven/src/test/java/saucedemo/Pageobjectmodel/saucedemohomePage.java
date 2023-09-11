package saucedemo.Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class saucedemohomePage {

	
	WebDriver driver;
	
	
	public saucedemohomePage (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//public WebElement getUserName() {
	//	WebElement y = driver.findElement(By.id("user-name"));
	//	return y;
	 // }	or
	
	//public WebElement getUserName() {
	//	return driver.findElement(By.id("user-name"));
	//}
	
	public WebElement getUserName() {
		return driver.findElement(By.id("user-name"));
			  
	}
	
	public WebElement getPassWord() {
		return driver.findElement(By.id("password"));
		
	  }	
	
  public WebElement getlogIn() {
		return driver.findElement(By.id("login-button"));
		
	  }	
	
}
