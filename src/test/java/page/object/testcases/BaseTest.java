package page.object.testcases;


import org.testng.annotations.AfterTest;

import page.object.base.Page;

public class BaseTest {

	
	@AfterTest
	public void tearDown() {
		Page.quit();
	}
	
}
