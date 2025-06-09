package omayo.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
		// this.driver = WebDriverManager.getDriver();
		// io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		this.driver = driver;
	}
}
