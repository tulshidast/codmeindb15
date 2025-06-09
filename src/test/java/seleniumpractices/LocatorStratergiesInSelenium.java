package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStratergiesInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();

		// By.id
		WebElement maleRadiButton = driver.findElement(By.id("radio1"));
		maleRadiButton.click();

		// By.name
		WebElement searchThisBlogTextFiled = driver.findElement(By.name("q"));
		searchThisBlogTextFiled.sendKeys("Welcome to codemind");
		Thread.sleep(3000);
		searchThisBlogTextFiled.clear();

		// By.class
		WebElement titleOfThePage = driver.findElement(By.className("title"));
		String title = titleOfThePage.getText();

		System.out.println(title);

		// By.linktext
		driver.findElement(By.linkText("SeleniumTutorial")).click();

		// By.partiallinktext
		driver.findElement(By.partialLinkText("niumTut")).click();

		// By.tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of hyper links on the home page = " + links.size());

		for (WebElement link : links) {
			String linkText = link.getAttribute("href");
			System.out.println(linkText);
		}

	}

}
