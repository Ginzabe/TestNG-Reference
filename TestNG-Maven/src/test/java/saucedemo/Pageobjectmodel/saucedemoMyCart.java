package saucedemo.Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class saucedemoMyCart {
	
	
WebDriver driver;
	
	public saucedemoMyCart (WebDriver driver) {
		
				this.driver =driver;
	}
	
	
	public WebElement getcheckOut() {
		return driver.findElement(By.id("checkout"));
	}

}
