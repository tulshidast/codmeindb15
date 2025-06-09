package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utilities;

public class SoftAssertInTestNg {

	WebDriver driver;
	SoftAssert verify;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		verify = new SoftAssert();
		Reporter.log("Webdriver initialised");
		driver.get(Utilities.readProperty("newtoursurl"));
		Reporter.log("Url launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@Test
	public void loginTestUsingDataProvider() {
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		Reporter.log("cliked on sign on link");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String expectedResult = "Login Successfully";

		String loginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();

		// verify.assertEquals(loginMsg, expectedResult);

		verify.assertEquals(loginMsg, expectedResult, "User not logged in successfully");

		String thanksYouText = driver.findElement(By.xpath("//b[normalize-space()='Thank you for Loggin.']")).getText();

		System.out.println("Before first verification");

		verify.assertTrue(thanksYouText.trim().equalsIgnoreCase("Thank you for Loggin."));

		System.out.println("After both verifications");

		// verify.assertNotEquals(loginMsg, expectedResult);

		// verify.assertNotEquals(loginMsg, expectedResult, "Message is equal");

		// verify.assertTrue(expectedResult.equals(loginMsg));
		// verify.assertTrue(expectedResult.equals(loginMsg), "User not logged in
		// successfully");

		// verify.assertFalse(expectedResult.equals(loginMsg));
		// verify.assertFalse(expectedResult.equals(loginMsg), "User not logged in
		// successfully");

		verify.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
