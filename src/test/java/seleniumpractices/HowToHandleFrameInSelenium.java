package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFrameInSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();

		// driver.switchTo().frame(0);

		// driver.switchTo().frame("navbar-iframe");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='navbar-iframe']")));

		WebElement searchTextField = driver.findElement(By.xpath("//input[@name='q' and not(@title)]"));

		searchTextField.sendKeys("Codemind");

		// text field on main page
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to codemind");

		// parent frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframe2']")));

		// child frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aswift_1']")));

		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#ta1")).clear();

		// NoSuchFrameException
		// driver.switchTo().frame("xyz");

		// InvalidSelectorException
		// driver.switchTo().frame(driver.findElement(By.xpath("")));

	}

}
