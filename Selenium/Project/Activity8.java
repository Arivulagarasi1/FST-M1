package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmUserActions.UserActions;

public class Activity8 {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	UserActions actions;
	  
  @BeforeMethod
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
	  wait=new WebDriverWait(driver,5);
	  action=new Actions(driver);
	  actions= new UserActions(driver);
  }
  @Test
  public void traverseTable() {
	  actions.login();
	  actions.navigateToAccountsMenu();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Name')]")));
	  List<WebElement> namesList=driver.findElements(By.xpath("//td[@type='name']"));
	  int row=0;
	  for(WebElement value:namesList){
		  row++;
		  if(row%2!=0 && row<10) 
			  System.out.println("Name "+row+" : "+value.getText());
		}
  }
  
  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

}
