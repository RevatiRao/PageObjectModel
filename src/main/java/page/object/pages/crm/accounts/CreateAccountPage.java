package page.object.pages.crm.accounts;

import org.openqa.selenium.By;

import page.object.base.Page;

public class CreateAccountPage extends Page{

	public void createAccount(String accountName) {
		
		type("AccName_XPATH" , accountName);
		
	}
	
}
