package page.object.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;


import page.object.pages.HomePage;
import page.object.pages.LoginPage;
import page.object.utilities.TestUtil;

public class TC_01_LoginTest {

	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void loginTest(Hashtable <String, String> data) throws InterruptedException {
		
		HomePage home = new HomePage();
		LoginPage lp = 	home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		
	}
	
}
