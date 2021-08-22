package Project;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    Actions action;
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
      // Set the Desired Capabilities
      DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "PixelEmulator");
      caps.setCapability("platformName", "android");
      caps.setCapability("appPackage", "com.google.android.keep");
      caps.setCapability("appActivity", ".activities.BrowseActivity");
      caps.setCapability("noReset", true);

      // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps);
      wait = new WebDriverWait(driver, 5);
      action=new Actions(driver);
}
  
  @Test
  public void googleKeep() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("New text note")));
	  MobileElement newNote=driver.findElementByAccessibilityId("New text note");
	  newNote.click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.keep:id/editable_title")));
	  MobileElement noteTitle=driver.findElementById("com.google.android.keep:id/editable_title");
	  action.moveToElement(noteTitle).click().sendKeys("Note").build().perform();
	  MobileElement note=driver.findElementById("com.google.android.keep:id/edit_note_text");
	  action.moveToElement(note).click().sendKeys("Title").build().perform();
	  MobileElement back=driver.findElementByAccessibilityId("Open navigation drawer");
	  back.click();
	  String addedNote=driver.findElementById("com.google.android.keep:id/index_note_title").getText();
	  Assert.assertEquals(addedNote, "Title");
	    
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
