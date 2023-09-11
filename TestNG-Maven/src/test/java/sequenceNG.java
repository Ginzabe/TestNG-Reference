import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sequenceNG {

	
@BeforeTest
	
	public void setUpTest() {
		
		// whatever you code you write will get execute
		System.out.println("setup test");
	}
	
	@AfterTest
	
	public void endTest() {
		
		System.out.println("end test");
		// whatever you want to put in after test 
		
	}
	
	// one test regarded as one test case, in short we call test
	
	@BeforeMethod
	public void beforeEachtest() {
		
		System.out.println("beforeEachtest");
		
	}
	
	@AfterMethod
	public void aftereachtest() {
		
		System.out.println("aftereachtest");	
		
	}
	
	@Test(priority=0)
	public void TestB() {
		
		System.out.println("TestB");
		
		Assert.assertEquals("fairfax", "fairfax");
		
	}
	
	@Test(priority=1)
	public void TestA() {
		
		System.out.println("TestA");
		Assert.assertEquals("virginia", "texas");
	}
	
	
	@Test(priority=2)
	public void TestC() {
		
		System.out.println("TestA");
		
		boolean flag = false; 
		
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void TestD() {
		
		System.out.println("TestA");
		
		boolean flag = false; 
		
		Assert.assertFalse(flag);
	}

}
	

