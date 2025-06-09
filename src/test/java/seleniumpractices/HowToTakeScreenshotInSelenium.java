package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToTakeScreenshotInSelenium {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		HowToTakeScreenshotInSelenium howToTakeScreenshotInSelenium = new HowToTakeScreenshotInSelenium();
		howToTakeScreenshotInSelenium.takesScreShoot(String.valueOf(System.currentTimeMillis()));

		WebElement multiSelectDropdown = driver.findElement(By.cssSelector("#multiselect1"));
		File file = multiSelectDropdown.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("src/test/resources/snapshots/multiSelectDropdown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void takesScreShoot(String name) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("src/test/resources/snapshots/" + name + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
