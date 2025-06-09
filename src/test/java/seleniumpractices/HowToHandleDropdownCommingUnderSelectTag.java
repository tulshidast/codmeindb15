package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowToHandleDropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();

		WebElement singleSelectionDropdown = driver.findElement(By.cssSelector("select#drop1"));
		Select select = new Select(singleSelectionDropdown);

		// select.deselectAll();

		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}

		System.out.println("##############################");

		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First selected option = " + firstSelectedOption.getText());

		System.out.println("############################");

		List<WebElement> allOptionsFromDropdown = select.getOptions();

		for (WebElement option : allOptionsFromDropdown) {
			System.out.println(option.getText());
		}

		System.out.println("###############################");

		WebElement wrapedElement = select.getWrappedElement();
		System.out.println(wrapedElement.getText());

		System.out.println("########################");

		System.out.println("Multi select = " + select.isMultiple());

		System.out.println("#########################");

		select.selectByContainsVisibleText("4");

		Thread.sleep(2000);

		select.selectByIndex(0);

		Thread.sleep(2000);

		select.selectByValue("ghi");

		Thread.sleep(2000);

		// recommended way to select drop down option
		select.selectByVisibleText("doc 3");

	}

}
