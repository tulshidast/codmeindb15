package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("mobile");
//		
//		Thread.sleep(3000);
//
//		driver.findElements(By.xpath("//ul/li//div[@role='option']")).get(5).click();

		// driver.quit();

	}

}
