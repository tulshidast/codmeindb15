package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();

		WebElement textarea = driver.findElement(By.cssSelector("textarea#ta1"));

		// Use this method to simulate typing into an element, which may set its value.
		textarea.sendKeys("Welcome to codemind");

		// Thread.sleep(3000);

		// If this element is a form entry element, this will reset its value.
		textarea.clear();

		String property = textarea.getDomProperty("cols");
		System.out.println(property);

		String coneditable = textarea.getAttribute("contenteditable");
		System.out.println(coneditable);

		String cssValueBorderStyle = textarea.getCssValue("border-style");
		System.out.println(cssValueBorderStyle);

		String color = driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color");

		System.out.println(color);

		Rectangle ract = textarea.getRect();
		System.out.println(ract.getHeight());
		System.out.println(ract.getWidth());

		System.out.println(ract.getX());
		System.out.println(ract.getY());

		// Get the tag name of this element.
		String tagname = textarea.getTagName();
		System.out.println(tagname);

		boolean visible = textarea.isDisplayed();
		System.out.println("Element is visible = " + visible);

		System.out.println(
				"Text element is visible = " + driver.findElement(By.cssSelector("#delayedText")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#delayedText")).getCssValue("visibility"));

		Thread.sleep(10000);

		System.out.println(
				"Text element is visible = " + driver.findElement(By.cssSelector("#delayedText")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#delayedText")).getCssValue("visibility"));

		System.out.println("Text area is enabled = " + textarea.isEnabled());

		System.out.println("Button2 is enabled = " + driver.findElement(By.cssSelector("#but1")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("#but1")).getAttribute("disabled"));

		// driver.findElement(By.cssSelector("#but1")).click();

		// here getting elementnotinteractable exception
		// driver.findElement(By.xpath("//input[@id='tb2']")).sendKeys("test");

		System.out.println("Bike radio btn is selected = "
				+ driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());
		System.out.println("Bicycle radio btn is selected = "
				+ driver.findElement(By.cssSelector("input[value='Bicycle']")).isSelected());

		System.out.println(
				"Pen checkbox is checked = " + driver.findElement(By.cssSelector("input[value='Pen']")).isSelected());
		System.out.println(
				"Book checkbox is checked = " + driver.findElement(By.cssSelector("input[value='Book']")).isSelected());

		System.out.println(
				driver.findElement(By.xpath("//div[contains(text(),'This is a sample Text on this page')]")).getText());

		Dimension d = textarea.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());

		Point p = textarea.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());

		WebElement form = driver.findElement(By.xpath("//form[@name='form1']"));

		System.out.println("Input type elements inside form = "
				+ form.findElement(By.xpath("//button[@value='LogIn']")).getAttribute("value"));

	}

}
