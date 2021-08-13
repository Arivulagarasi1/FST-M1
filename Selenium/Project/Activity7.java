package Activities;

import org.testng.annotations.Test;

import crmUserActions.UserActions;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Activity7 {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	UserActions actions;
	
  @BeforeMethod
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
	  wait=new WebDriverWait(driver,5);
	  action=new Actions(driver);
	  actions=new UserActions(driver);
  }

  @Test
  public void readInfo() {
	  actions.login();
	  actions.navigateToLeadsMenu();
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@id,'adspan')]/child::*")));
	  WebElement AdditionalInfo=driver.findElement(By.xpath("//span[contains(@id,'adspan')]/child::*"));
	  AdditionalInfo.click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Additional Details')]")));
	  if(driver.findElements(By.cssSelector("span.phone")).size() !=0) {
	  String actualNo=driver.findElement(By.cssSelector("span.phone")).getText();
	  System.out.println("Phone no details: "+actualNo);
	  }
	  else
		  System.out.println("Phone no not there");
  }

  @AfterMethod
  public void afterClass() {
	  driver.close();
  }
  
}
