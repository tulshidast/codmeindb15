package seleniumpractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAlertInJava {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();
		
		// driver.switchTo().alert();

		driver.findElement(By.cssSelector("#prompt")).click();

		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());

		alt.sendKeys("Welcome");

		Thread.sleep(5000);

		// alt.accept();
		alt.dismiss();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Welcome");

	}

}
