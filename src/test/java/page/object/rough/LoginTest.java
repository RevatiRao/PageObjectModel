package page.object.rough;

import page.object.base.Page;
import page.object.pages.HomePage;
import page.object.pages.LoginPage;
import page.object.pages.ZohoAppPage;
import page.object.pages.crm.accounts.AccountsPage;
import page.object.pages.crm.accounts.CreateAccountPage;

public class LoginTest{
		
	public static void main(String[] args) throws InterruptedException {
		//this is a rough package
		HomePage home = new HomePage();
		LoginPage lp = 	home.goToLogin();
		ZohoAppPage zp = lp.doLogin("revatidrao222@gmail.com", "revati123$");
		zp.goToCRM();
		
		AccountsPage account =Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccount("Revati");
	}

}
