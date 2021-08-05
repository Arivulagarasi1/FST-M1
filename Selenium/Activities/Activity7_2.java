package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("admin1");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password1");
		driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password1");;
        driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("abc@xyz.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        driver.close();
	}	

}
