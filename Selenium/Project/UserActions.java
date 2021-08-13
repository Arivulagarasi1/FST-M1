package crmUserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import crmElements.Elements;

public class UserActions {
	
	WebDriver driver;
	Elements pageElements;
	WebDriverWait wait;
	Actions action;
	
	public UserActions(WebDriver driver) {
		this.driver=driver;
		pageElements=new Elements(driver);
	}
	
	public void login() {
		pageElements.userName.sendKeys("admin");
		pageElements.password.sendKeys("pa$$w0rd");
		pageElements.loginBtn.click();	
	}
	
	public void navigateToLeadsMenu() {
		wait=new WebDriverWait(driver,5);
		action=new Actions(driver);
		action.moveToElement(pageElements.salesMenu).pause(1).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(pageElements.leadsMenu));
		pageElements.leadsMenu.click();
	}
	
	public void navigateToAccountsMenu() {
		wait=new WebDriverWait(driver,5);
		action=new Actions(driver);
		action.moveToElement(pageElements.salesMenu).pause(1).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(pageElements.accountsMenu));
		pageElements.accountsMenu.click();
	}

}
