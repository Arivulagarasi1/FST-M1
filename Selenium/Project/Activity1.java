package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	   driver=new FirefoxDriver();
	   driver.get("https://alchemy.hguy.co/crm/");
	  }
	
  @Test
  public void verifyWebsiteTitle() {
	  String title=driver.getTitle();
	  String expectedTitle="SuiteCRM";
	  Assert.assertEquals(title, expectedTitle);
	  if(title.equals("SuiteCRM")) {
		  System.out.println("Title matches");
		  driver.close();
	  }
	  else
		  System.out.println("Title not matches");
  }

}
