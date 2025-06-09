package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

		javascriptExecutor.executeScript("window.scrollBy(0,1000);", "");

		Thread.sleep(3000);

		javascriptExecutor.executeScript("window.scrollBy(0,-500);", "");

		Thread.sleep(3000);

		javascriptExecutor.executeScript("window.scrollBy(100,0);", "");

		Thread.sleep(3000);

		javascriptExecutor.executeScript("window.scrollBy(-50,0);", "");

		Thread.sleep(3000);

		driver.navigate().refresh();

		javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,0)");

		Thread.sleep(3000);

		javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);

		// javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,document.body.scrollHeight)");

		WebElement serchTextField = driver.findElement(By.xpath("//input[@name='q']"));

		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", serchTextField);

		javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//button[text()='Dropdown']")));

		javascriptExecutor.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//button[text()='Dropdown']")));

	}

}
