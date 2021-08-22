package Project;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "PixelEmulator");
	        caps.setCapability("platformName", "android");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");
	        caps.setCapability("noReset", true);
	 
	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 5);
  }
  @Test
  public void googleTask() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Create new task")));
	  MobileElement newTask=driver.findElementByAccessibilityId("Create new task");
	  newTask.click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
	  MobileElement taskName = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
	  MobileElement save= driver.findElementById("com.google.android.apps.tasks:id/add_task_done");
	  String[] tasks= {"Complete Activity with Google Tasks","Complete Activity with Google Keep","Complete the second Activity Google Keep"};
	  for(int i=0;i<tasks.length;i++)
	  {
		  if(i!=0) {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Create new task")));
		  newTask.click();
		  }
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
		  taskName.sendKeys(tasks[i]);
		  save.click();
	  }
	  String savedTaskName1=driver.findElementByXPath("//android.widget.TextView[@text='Complete Activity with Google Tasks']").getText();
	  String savedTaskName2=driver.findElementByXPath("//android.widget.TextView[@text='Complete Activity with Google Keep']").getText();
	  String savedTaskName3=driver.findElementByXPath("//android.widget.TextView[@text='Complete the second Activity Google Keep']").getText();
	  Assert.assertEquals(savedTaskName1, "Complete Activity with Google Tasks");
	  Assert.assertEquals(savedTaskName2, "Complete Activity with Google Keep");
	  Assert.assertEquals(savedTaskName3, "Complete the second Activity Google Keep");  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
