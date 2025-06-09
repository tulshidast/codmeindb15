package seleniumpractices;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingOfMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30000));

		WebElement openNewWindowLink = driver.findElement(By.xpath("//a[text()='Open a popup window']"));

		WebElement seleniumTutorialLink = driver.findElement(By.xpath("//a[text()='SeleniumTutorial']"));

		openNewWindowLink.click();

		Thread.sleep(10000);

		String parentWindow = driver.getWindowHandle();

		Set<String> windowsHandles = driver.getWindowHandles();

		System.out.println(windowsHandles.size());

		for (String windowHandle : windowsHandles) {
			if (!(windowHandle.equals(parentWindow))) {
				driver.switchTo().window(windowHandle);
				break;
			}

		}

		String newWindowText = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();

		System.out.println(newWindowText);

		driver.close();

		driver.switchTo().window(parentWindow);

		WebElement textArea = driver.findElement(By.cssSelector("#ta1"));

		textArea.sendKeys("Welcome back to parent page");

		seleniumTutorialLink.click();

		windowsHandles.clear();
		windowsHandles = driver.getWindowHandles();

		for (String handle : windowsHandles) {
			if (!(handle.equals(parentWindow))) {
				driver.switchTo().window(handle);
			}
		}

		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindow);

		textArea.clear();

	}

}
