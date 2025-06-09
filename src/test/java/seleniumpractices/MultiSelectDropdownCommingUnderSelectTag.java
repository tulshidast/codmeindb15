package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		// below code will maximize browser window
		driver.manage().window().maximize();

		WebElement singleSelectionDropdown = driver.findElement(By.cssSelector("select#multiselect1"));
		Select select = new Select(singleSelectionDropdown);

		List<WebElement> allOptionsFromDropdown = select.getOptions();

		System.out.println("##############All options from dropdown ###################");

		for (WebElement option : allOptionsFromDropdown) {
			System.out.println(option.getText());
		}

		System.out.println("###################Is multiple ##################");

		System.out.println("Multi selection allowed = " + select.isMultiple());

		System.out.println("##############################");

		select.selectByContainsVisibleText("dai");

		Thread.sleep(2000);

		select.selectByIndex(0);

		System.out.println("$$$$$$$$$$$ get first selected option$$$$$$$$$$$$");

		System.out.println("First selected option = " + select.getFirstSelectedOption().getText());

		System.out.println("%%%%%%%%%%%%%% get All selected options");

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		for (WebElement option : allSelectedOptions) {
			System.out.println(option.getText());
		}

		System.out.println("################################");

		select.deselectAll();

		select.selectByContainsVisibleText("dai");

		select.selectByIndex(0);

		select.selectByValue("swiftx");

		select.selectByVisibleText("Audi");

		Thread.sleep(3000);

		select.deSelectByContainsVisibleText("vo");

		Thread.sleep(2000);

		select.deselectByIndex(1);

		Thread.sleep(2000);

		select.deselectByValue("Hyundaix");

		Thread.sleep(2000);

		select.deselectByVisibleText("Audi");

	}

}
