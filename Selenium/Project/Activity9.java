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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmUserActions.UserActions;

public class Activity9 {
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
	  actions=new UserActions(driver);
  }
  
  @Test
  public void traverseTable() {
	  actions.login();
	  actions.navigateToLeadsMenu();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Name')]")));
	  List<WebElement> namesList=driver.findElements(By.xpath("//td[@type='name']"));
	  List<WebElement> usersList=driver.findElements(By.xpath("//td[@type='relate']"));
	  int row=1;
	  for (WebElement value:namesList){
		  for (WebElement value1:usersList) {
			  if(row<=10) 
				  System.out.println("Name "+row+" : "+value.getText()+", UserName "+row+" : "+value1.getText());
			  break;
		  }
	  row++;
	  }
  }
		
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
