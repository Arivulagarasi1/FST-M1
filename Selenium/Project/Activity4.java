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

public class Activity4 {
	WebDriver driver;
	UserActions actions;
	
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
	  actions=new UserActions(driver);
  }
  
  @Test
  public void verifyLogin() {
	  actions.login();
	  String currentURL=driver.getCurrentUrl();
	  String expectedURL="https://alchemy.hguy.co/crm/index.php?module=Home&action=index";
	  Assert.assertEquals(currentURL, expectedURL);
	  if(currentURL.equals(expectedURL))
		  System.out.println("Homepage is opened");
	  else
		  System.out.println("Homepage not opened");
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
