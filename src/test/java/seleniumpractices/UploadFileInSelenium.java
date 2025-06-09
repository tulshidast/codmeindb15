package seleniumpractices;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().browserVersion("136.0.7103.114").setup();

		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://omayo.blogspot.com/");

		// driver.manage().window().maximize();

		WebElement fileUploader = driver.findElement(By.cssSelector("input#uploadfile"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", fileUploader);

		fileUploader.sendKeys("C:\\Users\\Admin\\Downloads\\TestingTest.java");

	}

}
