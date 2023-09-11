package saucedemo.Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class saucedemoInventory {
	
	WebDriver driver;
	
	public saucedemoInventory (WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getBackpack () {
		return driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]"));
				
	}
	
	public WebElement addToChartBackPack () {
		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		
	}
	
	
	public WebElement getFleeceJacket () {
		return driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
		
	}
	public WebElement addToChartFleeceJacket () {
		WebElement sam = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
	     return sam;
		
	}

	public WebElement getBoltTshirt() {
		return driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
	}
	
	public WebElement addToChartBoltTshirt () {
		return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
	}
	
	public WebElement getOnesie() {
		return driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
	}
	
	public WebElement addToCartOnesie() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
	}
	
	public WebElement getTshirtRed() {
		return driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
	}
	
	public WebElement addToChartTshirRed() {
		return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
	}
	
	public WebElement getBikeLight() {
		return driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
	}
	
	public WebElement addToChartBikeLight() {
	    return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	}
	
	public WebElement getChart () {
		return driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	}
}
