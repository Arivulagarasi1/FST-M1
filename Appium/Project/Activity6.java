package Project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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

public class Activity6 {
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
  public void googleLoginPopupValid() {
	  driver.get("https://www.training-support.net/selenium");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Get Started!']")));
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  MobileElement popups=driver.findElementByXPath("//android.view.View[contains(@text,'Popups')]");
	  popups.click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[contains(@text,'Sign In')]")));
	  driver.findElementByXPath("//android.widget.Button[contains(@text,'Sign In')]").click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"username\")")));
	  MobileElement userName=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"username\")"));
	  userName.sendKeys("admin");
	  MobileElement password=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"password\")"));
	  password.sendKeys("password");
	  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"action-confirmation\")")));
	  String confirmation=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"action-confirmation\")")).getText();
	  Assert.assertEquals(confirmation, "Welcome Back, admin");
  }
  
  @Test
  public void googleLoginPopupInvalid() {
	  driver.get("https://www.training-support.net/selenium");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Get Started!']")));
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  MobileElement popups=driver.findElementByXPath("//android.view.View[contains(@text,'Popups')]");
	  popups.click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[contains(@text,'Sign In')]")));
	  driver.findElementByXPath("//android.widget.Button[contains(@text,'Sign In')]").click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"username\")")));
	  MobileElement userName=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"username\")"));
	  userName.sendKeys("admin1");
	  MobileElement password=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"password\")"));
	  password.sendKeys("password");
	  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"action-confirmation\")")));
	  String confirmation=driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"action-confirmation\")")).getText();
	  Assert.assertEquals(confirmation, "Invalid Credentials");
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}
