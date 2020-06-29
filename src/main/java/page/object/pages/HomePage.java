package page.object.pages;

import org.openqa.selenium.By;


import page.object.base.Page;

public class HomePage extends Page{
	
	public void goToSignUp() {
		driver.findElement(By.xpath("//a[@class='zh-signup']")).click();
	}
	
	public 	LoginPage goToLogin() {
		click("loginlink_XPATH");	
	return new LoginPage();
	
	}
	
	public void goToSupport() {
		driver.findElement(By.xpath("//a[@class='zh-support']")).click();
	}
	
	public void goToCustomers() {
		driver.findElement(By.xpath("//a[@class='zh-customers']")).click();
	}
	
	public void goToContactSales() {
		driver.findElement(By.xpath("//a[@class='zh-contact']")).click();
	}
	
	public void goToLearnMore() {
		driver.findElement(By.xpath("//a[@class='learn-more']")).click();
	}
	
	public void validateFooterLinks() {
		driver.findElement(By.xpath("//a[contains(text(),'Zoho Home')]")).click();
	}
	
}
