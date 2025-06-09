package seleniumpractices;

import org.testng.annotations.Test;

public class LoginFunctinality {

	@Test(priority = 1, groups = { "smoke" })
	public void verifyPageTitle() {

		System.out.println("Test D executed");

	}

	@Test(priority = 1, groups = { "sanity" })
	public void vefifyPageUrl() {
		System.out.println("Test b executed");
	}

	@Test(priority = 2, groups = { "regression" })
	public void verifyMonyTransfer() {
		System.out.println("Test c executed");
	}

	@Test(priority = 2, groups = { "regression", "sanity" })
	public void verifyMonyTransferToOwnAccount() {
		System.out.println("Test c executed");
	}

}
