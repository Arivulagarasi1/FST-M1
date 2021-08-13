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

public class Activity5 {
	WebDriver driver;
	UserActions actions;
	
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
	  actions=new UserActions(driver);
  }
  
  @Test
  public void getColor() {
	  actions.login();
	  WebElement toolBar=driver.findElement(By.id("toolbar"));
	  String actualColor=toolBar.getCssValue("color");
	  String expectedColor="rgb(83, 77, 100)";
	  Assert.assertEquals(actualColor, expectedColor);
	  System.out.println("Color of the navigation menu: "+actualColor);  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
