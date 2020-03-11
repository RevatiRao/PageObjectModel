package page.object.pages.crm.accounts;

import org.openqa.selenium.By;

import page.object.base.Page;

public class AccountsPage extends Page{

	public CreateAccountPage goToCreateAccount() {
		click("CreateAccountBtn_XPATH");
		return new CreateAccountPage();
	}
	public void goToImportAccounts() {
		
	}
}
