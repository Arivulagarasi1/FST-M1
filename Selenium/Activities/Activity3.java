package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
	     driver.get("https://training-support.net/selenium/simple-form");
	     System.out.println("Title of the page:"+driver.getTitle());
	     WebElement firstName = driver.findElement(By.id("firstName"));
	     WebElement lastName = driver.findElement(By.id("lastName"));
	     firstName.sendKeys("ABC");
	     lastName.sendKeys("X");
	     driver.findElement(By.id("email")).sendKeys("test@example.com");
	     driver.findElement(By.id("number")).sendKeys("1234567890");
	     driver.findElement(By.cssSelector(".ui.green.button")).click();
	     driver.close();

	}

}
