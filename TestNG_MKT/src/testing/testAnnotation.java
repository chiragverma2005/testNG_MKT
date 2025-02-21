package testing;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testAnnotation {
	
	
	@BeforeSuite
	public static void bsuite() {
		System.out.println("@BeforeSuite");
		
	}	
	
	@BeforeClass
	public static void bclass() {
		System.out.println("@BeforeClass");
	}	
	
	@BeforeTest
	public static void btest() {
		System.out.println("@BeforeTest");
	}	
	
	
	@Test(priority=1,invocationCount=1)
	public static void TC2() {
		System.out.println("@Test2");
		
	}
	@Test(priority=2)
	public static void TC1() {
		//Assert.fail();
		System.out.println("@Test1");
		
		
	}
	
	
	@AfterTest
	public static void atest() {
		System.out.println("@AfterTest");
	}

	@AfterClass
	public static void aclass() {
		System.out.println("@AfterClass");
	}

	@AfterSuite
	public static void asuite() {
		System.out.println("@AfterSuite");
	}

}
