package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleCalender {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");

		HowToHandleCalender.selectStartDate("2025", "May", "25");

	}

	public static void selectStartDate(String year, String month, String dateToSelect) {
		
		driver.findElement(By.xpath("//input[@id='datetimepicker1']")).click();

		driver.findElement(By.xpath("//input[@aria-label='Year']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys(year);

		Select select = new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
		select.selectByVisibleText(month);

		List<WebElement> dates = driver
				.findElements(By.xpath("(//div[@class='dayContainer'])[1]//span[@class='flatpickr-day']"));

		for (WebElement date : dates) {
			if (date.getText().equalsIgnoreCase(dateToSelect)) {
				date.click();
				break;
			}
		}

		Actions actions = new Actions(driver);

		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB)
				.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
	}

}
