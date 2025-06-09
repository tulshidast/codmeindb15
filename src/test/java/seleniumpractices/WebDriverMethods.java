package seleniumpractices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();

		// The URL of the page currently loaded in the browser
		String url = driver.getCurrentUrl();
		System.out.println("Current page url = " + url);

		// Get the title of the current page.
		System.out.println("Page title = " + driver.getTitle());

		// Get the source of the last loaded page
		String pageSource = driver.getPageSource();

		WebElement textArea = driver.findElement(By.xpath("//textarea"));

		textArea.sendKeys("Welcome to codemind");

		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@id='radio1']"));
		maleRadioBtn.click();

		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println("Number of radio button = " + radioButtons.size());

		Iterator<WebElement> it = radioButtons.iterator();

		while (it.hasNext()) {

			System.out.println(it.next().getAttribute("value"));

		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		// System.out.println(pageSource);

		// Close the current window
		driver.close();

		// Quits this driver, closing every associated window
		driver.quit();
	}

}
