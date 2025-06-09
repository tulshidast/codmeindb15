package omayo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import util.Utilities;

public class OmayoBaseTest {

	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setup() {

		// driver = WebDriverManager.getDriver();
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Utilities.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(Utilities.readProperty("timeout"))));
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}

	}

}
