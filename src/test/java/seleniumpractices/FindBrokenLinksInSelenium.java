package seleniumpractices;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinksInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of hyper links on the home page = " + links.size());

		for (WebElement link : links) {
			String linkText = link.getAttribute("href");
			System.out.println(linkText);

		}

		System.out.println("################################");
		verifyBrokenLink(links);
	}

	public static void verifyBrokenLink(List<WebElement> links) {

		int count = 0;
		for (WebElement link1 : links) {

			String link = link1.getAttribute("href");

			if (link != null) {

				try {
					URL url = new URL(link);
					HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
					httpURLConnection.setConnectTimeout(3000);
					httpURLConnection.connect();

					if (httpURLConnection.getResponseCode() == 200) {
						System.out.println(link + " " + httpURLConnection.getResponseMessage());
					} else {
						count++;
						System.out.println(link + " " + httpURLConnection.getResponseMessage() + " link is broken");
					}

				} catch (IOException e) {
					count++;
					System.out.println(link + " - " + "is a broken link");
				}
			}
		}
		System.out.println("Number of broken links = " + count);
	}

}
