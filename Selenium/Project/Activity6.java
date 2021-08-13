package Activities;

import org.testng.annotations.Test;

import crmUserActions.UserActions;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
	WebDriver driver;
	UserActions actions;
	
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
	  actions=new UserActions(driver);
  }
  
  @Test
  public void menuChecking() {
	  actions.login();
	  WebElement activitiesMenu=driver.findElement(By.id("grouptab_3"));
	  Assert.assertTrue(activitiesMenu.isDisplayed());
	  if(activitiesMenu.isDisplayed()){
		activitiesMenu.click();
		System.out.println("Activities Menu item exists and clickable");
	  }
	  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
