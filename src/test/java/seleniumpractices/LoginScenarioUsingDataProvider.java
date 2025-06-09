package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utilities;

public class LoginScenarioUsingDataProvider {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Reporter.log("Webdriver initialised");
		driver.get(Utilities.readProperty("newtoursurl"));
		Reporter.log("Url launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@Test(dataProvider = "userData")
	public void loginTestUsingDataProvider(String uname, String password) {
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		Reporter.log("cliked on sign on link");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String loginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
		Assert.assertEquals(loginMsg, "Login Successfully");
	}

//	@Test
//	public void loginTestUsingDataProvider_1() {
//		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin1");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
//		driver.findElement(By.xpath("//input[@name='submit']")).click();
//
//		String loginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
//		Assert.assertEquals(loginMsg, "Login Successfully");
//	}
//
//	@Test
//	public void loginTestUsingDataProvider_2() {
//		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin2");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
//		driver.findElement(By.xpath("//input[@name='submit']")).click();
//
//		String loginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
//		Assert.assertEquals(loginMsg, "Login Successfully");
//	}

	@DataProvider(name = "userData")
	public String[][] dataProvider() {
		String users[][] = { { "admin", "admin@123" }, { "admin1", "admin@123" }, { "admin2", "admin@123" } };
		return users;
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
