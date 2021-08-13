package Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
  }	
  
  @Test
  public void getCopyRightText() {
		WebElement frstCpyRightTxt=driver.findElement(By.id("admin_options"));
		String expectedText="© Supercharged by SuiteCRM";
		String actualText=frstCpyRightTxt.getText();
		Assert.assertEquals(actualText, expectedText);
		System.out.println("First copyright text: "+actualText);
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
