package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(xpath = "//input[@id='radio1']")
	WebElement maleRadioButton;

	@FindBy(xpath = "//input[@id='radio2']")
	WebElement femaleRadioButton;

	@FindBy(css = "#drop1")
	WebElement olderNewLettersDropdown;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getOlderNewLettersDropdown() {
		return olderNewLettersDropdown;
	}

	// methods
	public boolean isOlderNewsLettersDropdownVisible() {
		return getOlderNewLettersDropdown().isDisplayed();
	}

}
