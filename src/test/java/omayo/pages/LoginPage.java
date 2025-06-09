package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	// page constructor to initialize web elements
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// WebElements
	@FindBy(name = "userName")
	WebElement userNameTextField;

	@FindBy(name = "password")
	WebElement passwordTextField;

	@FindBy(name = "submit")
	WebElement submitButton;

	// getter methods to get web elements
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	// Methods related to web elements
	public void setUserName(String uname) {
		getUserNameTextField().clear();
		getUserNameTextField().sendKeys(uname);
	}

	public void setPassword(String password) {
		getPasswordTextField().clear();
		getPasswordTextField().sendKeys(password);
	}

	public void clickOnSubmitBtn() {
		getSubmitButton().click();
	}

}
