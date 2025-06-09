package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownNotCommingUnderSelectTag {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/vistara-airlines.html");
		driver.manage().window().maximize();

		selectTripType("One Way");

		Thread.sleep(3000);

		selectTripType("Return trip");

	}

	public static void selectTripType(String tripType) throws InterruptedException {
		
		driver.findElement(By.cssSelector("#tripType")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> tripTypes = driver.findElements(By.cssSelector("div.tripTypeFilter li p"));

		for (WebElement trip : tripTypes) {
			if (trip.getText().equalsIgnoreCase(tripType)) {
				trip.click();
				break;
			}
		}
	}

}
