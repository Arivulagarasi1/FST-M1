package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("Alert text is: "+confirmAlert.getText());
		confirmAlert.accept();
		driver.findElement(By.id("confirm")).click();
		confirmAlert.dismiss();
		driver.close();
	}

}
