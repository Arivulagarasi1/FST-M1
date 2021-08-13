package Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
  }
	
  @Test
  public void getHeaderUrl() {
	  WebElement headerImage=driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
	  String expectedUrl="https://alchemy.hguy.co/crm/themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g";
	  String actualUrl=headerImage.getAttribute("src");
	  Assert.assertEquals(actualUrl, expectedUrl);
	  System.out.println("URL of the header image: "+actualUrl);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
