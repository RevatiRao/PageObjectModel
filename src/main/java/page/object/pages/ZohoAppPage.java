package page.object.pages;

import org.openqa.selenium.By;
import page.object.base.Page;
import page.object.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{


	public CRMHomePage goToCRM() {
		click("CRMlink_XPATH");
		return new CRMHomePage();
	}

	public void goToCliq() {
		driver.findElement(By.xpath("//span[@class='_logo-chat _logo-x96 zod-app-logo']")).click();
	}

	public void goToMeeting() {
		driver.findElement(By.xpath("//span[@class='_logo-meeting _logo-x96 zod-app-logo']")).click();
	}

}
