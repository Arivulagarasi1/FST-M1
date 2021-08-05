package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1 {
	WebDriver driver;
  @Test
  public void test() {
	  System.out.println("Title of the Page: "+driver.getTitle());
	  Assert.assertEquals("Training Support", driver.getTitle());
	  driver.findElement(By.id("about-link")).click();
      System.out.println("New page title is: " + driver.getTitle());     
      Assert.assertEquals(driver.getTitle(), "About Training Support");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
