package seleniumpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkipTestExecution {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void verifyHomePageTitle() {

		String pageTitle = driver.getTitle();

		if (!(pageTitle.equalsIgnoreCase("omayo (QAFox.co)"))) {
			throw new SkipException("Home Page title is not correct");
		}

		Assert.assertEquals(pageTitle, "omayo (QAFox.com)", "Title is not matched");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
