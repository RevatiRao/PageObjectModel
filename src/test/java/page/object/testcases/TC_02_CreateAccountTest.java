package page.object.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import junit.framework.Assert;
import page.object.base.Page;
import page.object.pages.ZohoAppPage;
import page.object.pages.crm.accounts.AccountsPage;
import page.object.pages.crm.accounts.CreateAccountPage;
import page.object.utilities.TestUtil;

public class TC_02_CreateAccountTest {

	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void createAccountTest(Hashtable <String, String> data) {
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account =Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccount(data.get("accountname"));
		
		Assert.fail("Create account test failed");
	}
}
