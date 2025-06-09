package seleniumpractices;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Utilities;

public class ImplicitWaitImpl {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().browserVersion("136.0.7103.114").setup();

		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.get(Utilities.readProperty("url"));

		// Thread.sleep(3000);

		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(Utilities.readProperty("timeout"))));

		// driver.findElement(By.xpath("//input[@id='virat']"));

		// Explicit wait
		WebElement delayedVisibleText = driver.findElement(By.cssSelector("#delayedText"));

		WebDriverWait wait = new WebDriverWait(driver,
				Duration.ofSeconds(Long.valueOf(Utilities.readProperty("timeout"))));
		wait.until(ExpectedConditions.visibilityOf(delayedVisibleText));

//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofSeconds(2)).ignoring(TimeoutException.class).pollingEvery(Duration.ofMillis(10))
//				.until(ExpectedConditions.visibilityOf(delayedVisibleText));

		System.out.println("Delaye text is visible = " + delayedVisibleText.isDisplayed());

		WebElement textToBeInvisible = driver.findElement(By.cssSelector("#deletesuccess"));

		System.out.println("Weblement is visible = " + textToBeInvisible.isDisplayed());

		wait.until(ExpectedConditions.invisibilityOf(textToBeInvisible));

		System.out.println("Weblement is visible = " + textToBeInvisible.isDisplayed());

	}

}
