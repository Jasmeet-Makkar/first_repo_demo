package testpracticesuiteA;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void bef() {
		System.out.println("before test...........................");
	}
	
	@AfterTest
	public void aft() {
		System.out.println("after test............................");
	}
	
	
	@BeforeMethod
	public void befmet() {
		System.out.println("..................before method..............");
	}
	
	
	@AfterMethod
	public void aftmet() {
		System.out.println(".........after method...............");
	}
	
	
	@Test
	public void dologin() {
		 
		//String exp="ABCc";
		//String act="ABC";
		
		//Assert.assertEquals(exp, act);
		//Assert.assertTrue(exp==act, "not equal");
		//Assert.assertTrue(5>2, "error found");
		System.out.println("a...........test........................a");
		//Assert.fail();
		System.out.println("................test...b..............");
		//Assert.fail("custom message");
	}
	
	@Test
	public void logout() {
		System.out.println("logging out");
	}
}