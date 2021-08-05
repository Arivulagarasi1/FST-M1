package TestNGActivities;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
	
  @Test
  public void test1() {
	  System.out.println("Title of the Page: "+driver.getTitle());
	  Assert.assertEquals(driver.getTitle(),"Target Practice");
  }
  @Test
  public void test2() {
	  WebElement blackButton=driver.findElement(By.xpath("//button[contains(@class,'black')]"));
	  Assert.assertTrue(blackButton.isDisplayed());
      Assert.assertEquals(blackButton.getText(), "black");
  }
  
  @Test(enabled=false)
  public void test3() {
	  String subHeading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
  }
  
  @Test
  public void test4() {
	  throw new SkipException("Skip this case");
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
