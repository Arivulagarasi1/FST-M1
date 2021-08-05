package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
        System.out.println("Alert text is: " + promptAlert.getText());
		promptAlert.sendKeys("Yes, you are!");
		promptAlert.accept();
		driver.close();
	}

}
