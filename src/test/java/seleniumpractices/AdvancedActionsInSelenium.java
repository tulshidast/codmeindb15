package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActionsInSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		WebElement textArea = driver.findElement(By.xpath("//textarea[@name='q']"));

		Actions actions = new Actions(driver);

		actions.click(textArea).build().perform();

		actions.keyDown("\uE008").keyDown("a").keyUp(Keys.SHIFT).keyUp("a").keyDown("p").keyUp("p").keyDown("p")
				.keyUp("p").build().perform();

		actions.sendKeys(textArea, Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();

		WebElement gappsLink = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));

		actions.moveToElement(gappsLink).build().perform();

		// actions.contextClick(gappsLink).build().perform();

		actions.contextClick().build().perform();

		driver.switchTo().newWindow(WindowType.TAB).get("https://omayo.blogspot.com/");

		WebElement textArea1 = driver.findElement(By.cssSelector("textarea[cols='80']"));

		WebElement textArea2 = driver.findElement(By.cssSelector("textarea[cols='30']"));

		// driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		actions.click(textArea2).keyDown(Keys.CONTROL).keyDown("a").keyUp("a").keyDown("x").moveToElement(textArea1)
				.keyUp("x").click(textArea1).keyDown("v").keyUp("v").keyUp(Keys.CONTROL).build().perform();

		actions.moveToElement(driver.findElement(By.cssSelector("#blogsmenu"))).build().perform();

		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		WebElement source = driver.findElement(By.cssSelector("#draggable"));

		WebElement target = driver.findElement(By.cssSelector("#droppable"));

		actions.clickAndHold(source).moveToElement(target).pause(Duration.ofSeconds(1)).release().build().perform();

	}

}
