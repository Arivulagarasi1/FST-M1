package Project;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity4 {
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    Actions action;
    
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
      // Set the Desired Capabilities
      DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "PixelEmulator");
      caps.setCapability("platformName", "android");
      caps.setCapability("appPackage", "com.android.chrome");
      caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
      caps.setCapability("noReset", true);

      // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps);
      wait = new WebDriverWait(driver, 5);
      action=new Actions(driver);
  }
  
  @Test
  public void googleList() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.training-support.net/selenium");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Get Started!']")));
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  MobileElement toDoList=driver.findElementByXPath("//android.view.View[contains(@text,'To-Do List')]");
	  toDoList.click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")")));
	  MobileElement input=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")"));
	  input.sendKeys("Add tasks to list");
	  Thread.sleep(5000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Add Task\")")).click();
	  input.sendKeys("Get number of tasks");
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Add Task\")")).click();
	  input.sendKeys("Clear the list");
	  Thread.sleep(5000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Add Task\")")).click();
	  driver.findElementByXPath("//android.view.View[contains(@text,'Add tasks')]").click();
	  driver.findElementByXPath("//android.view.View[contains(@text,'Get')]").click();
	  driver.findElementByXPath("//android.view.View[contains(@text,'Clear')]").click();
	  driver.findElementByXPath("//android.view.View[contains(@text,'Clear List')]").click(); 
	  Assert.assertTrue((driver.findElementsByXPath("//android.view.View[contains(@text,'Add more')]").size()==0));
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
