package page.object.base;

import org.openqa.selenium.By;

import page.object.pages.crm.accounts.AccountsPage;

public class TopMenu {

	public void goToHome() {

	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public AccountsPage goToAccounts() {

		Page.click("AccountsTab_XPATH");
		return new AccountsPage();
	}
	
	public void goToDeals() {

	}

	public void goToActivities() {

	}

	public void goToReports() {

	}
	public void goToMarketplace() {

	}
	public void signOut() {

	}
}
