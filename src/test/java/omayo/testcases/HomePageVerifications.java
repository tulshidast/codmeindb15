package omayo.testcases;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import omayo.pages.HomePage;

public class HomePageVerifications extends OmayoBaseTest {

	@Test
	public void verifyHomePage() {

		HomePage homePage = new HomePage(driver);
		assertFalse(homePage.getMaleRadioButton().isSelected(), "By default male radi button is selected");
		assertFalse(homePage.getFemaleRadioButton().isSelected(), "By default male radi button is selected");

	}

}
