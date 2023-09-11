package saucedemo.testscripts;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import saucedemo.Pageobjectmodel.checkOutSummary;
import saucedemo.Pageobjectmodel.saucedemoInventory;
import saucedemo.Pageobjectmodel.saucedemoMyCart;
import saucedemo.Pageobjectmodel.saucedemohomePage;



public class saucedemoTestScript {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting up property for browser
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sacon\\OneDrive\\Desktop\\workspace\\3rd party libraies\\chromedriver.exe");

//Create the object of webdriver class and open up the browser

		// Note
		// WebDriver driver = new ChromeDriver(); or

		// WebDriver driver;
		// driver = new ChromeDriver();

// Note related to calling the object
		// saucedemohomePage hp = new saucedemohomePage or
		// saucedemohomePage hp;
		// hp = new saucedemohomePage; .... but it should be the following format

		WebDriver driver;
		saucedemohomePage hp;
		saucedemoInventory iv;
		saucedemoMyCart mc;
		checkOutSummary ck;
		
		driver = new ChromeDriver();
		hp = new saucedemohomePage(driver);
		iv = new saucedemoInventory(driver);
		mc = new saucedemoMyCart(driver);
		ck = new checkOutSummary(driver);
		 
		driver.get("https://www.saucedemo.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().deleteAllCookies();
        
        driver.manage().window().maximize();
        
        String userName = hp.getUserName().getText();
        hp.getUserName().sendKeys("standard_user");
       // System.out.println(userName);
        
        String passWord = hp.getPassWord().getText();
        hp.getPassWord().sendKeys("secret_sauce");
                
        
        String loginbutton = hp.getlogIn().getText();
        hp.getlogIn().click();
        
        // whenever you add the new page in to the test script you have to use it 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String backPack = iv.getBackpack().getText();
		String item1 = iv.addToChartBackPack().getText();
		iv.addToChartBackPack().click();
		
		System.out.println(backPack);
		System.out.println(item1);

		String fleeceJacket = iv.getFleeceJacket().getText();
		String item2 = iv.addToChartFleeceJacket().getText();
		iv.addToChartFleeceJacket().click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iv.getChart().click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mc.getcheckOut().click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ck.getfirstName().sendKeys("sami");
		ck.getlastName().sendKeys("Mike");
		ck.getzipCode().sendKeys("33404");
		ck.getcontinue().click();
		ck.getFinish().click();
		
	
	}
}
