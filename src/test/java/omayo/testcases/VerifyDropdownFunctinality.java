package omayo.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayo.pages.HomePage;

public class VerifyDropdownFunctinality extends OmayoBaseTest {

	HomePage homePage;
	SoftAssert verify;

	@Test(description = "Verify older news letters dropdown functinality", groups = { "regression" }, enabled = true)
	public void verifyDropdownFunctinality() {
		homePage = new HomePage(driver);
		verify = new SoftAssert();

		verify.assertTrue(homePage.isOlderNewsLettersDropdownVisible(), "Dropdown is not visible on the page");

		Select select = new Select(homePage.getOlderNewLettersDropdown());

		verify.assertFalse(select.isMultiple(), "Dropdown allow multiple selection");

		List<String> expectedList = Arrays.asList("Older Newsletters", "doc 1", "doc 2", "doc 3", "doc 4");

		List<String> actuaList = new ArrayList<String>();

		select.getOptions().stream().forEach(e -> actuaList.add(e.getText()));

//		for (WebElement elm : select.getOptions()) {
//			actuaList.add(elm.getText());
//		}

		verify.assertEquals(actuaList, expectedList, "Dropdown options are missing");
		verify.assertAll();

	}

}
