package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {  
	
    //declare the variable
	
WebDriver driver;
	
    //Constructor

  public Home (WebDriver driver) {
	  this.driver = driver;
	  
	  // home functional elements
	}
  public WebElement enrollNow() {
	  return driver.findElement(By.id(""));
  }

}
