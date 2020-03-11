package page.object.pages;

import org.openqa.selenium.By;

import page.object.base.Page;

public class LoginPage extends Page{

	
	public ZohoAppPage doLogin(String username, String password) throws InterruptedException {
		
		type("email_XPATH",username);
		click("nxtbtn_XPATH");
		type("password_XPATH",password);
		click("signinbtn_XPATH");
		return new ZohoAppPage();

	}
	
	public void goToForgotPassword() {
		driver.findElement(By.xpath("//a[@class='text16']")).click();
	}
	public void goToOneAuth() {
		driver.findElement(By.xpath("//a[contains(text(),'OneAuth')]")).click();
	}
}
