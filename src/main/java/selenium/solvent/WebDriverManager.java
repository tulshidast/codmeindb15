package selenium.solvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.Utilities;

public class WebDriverManager {

	// static WebDriver driver;
	static WebDriverManager webDriverManager;

	private WebDriverManager() {

	}

	public WebDriver initWebDriver() {

		WebDriver driver = null;

		String browserName = Utilities.readProperty("browser");

		switch (browserName) {
		case "chrome":
			io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			io.github.bonigarcia.wdm.WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please select valid browser");
			break;
		}
		return driver;
	}

	public static WebDriver getDriver() {
		WebDriver driver = null;
		if (driver == null) {
			webDriverManager = new WebDriverManager();
			driver = webDriverManager.initWebDriver();
		}
		return driver;
	}
}
