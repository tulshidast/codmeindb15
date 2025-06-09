package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage extends BasePage {

	// page constructor to initialize web elements using page factory
	public LoginSuccessPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}

	// WebElements
	@FindBy(xpath = "//h3[text()='Login Successfully']")
	WebElement loginSucessMsg;

	// WebElements
	@FindBy(xpath = "//b[normalize-space()='Thank you for Loggin.']")
	WebElement thankYouForLogin;

	// getters methods
	public WebElement getLoginSucessMsg() {
		return loginSucessMsg;
	}

	public WebElement getThankYouForLogin() {
		return thankYouForLogin;
	}

	// methods related to webelements
	public String getLoginSuccessMsgText() {
		return getLoginSucessMsg().getText();
	}

	public String getThankYouForLoginMsgText() {
		return getThankYouForLogin().getText();
	}

}
