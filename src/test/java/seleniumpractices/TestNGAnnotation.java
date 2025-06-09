package seleniumpractices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before each suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before each test plan");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before each class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before each test method");
	}

	@Test
	public void testCase() {
		System.out.println("Test case");
	}

	@Test
	public void testCase_1() {
		System.out.println("Test case 1");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After each test method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After each class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After each test plan");
	}

}
