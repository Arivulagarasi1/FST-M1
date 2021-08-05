package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println("Title of the page:"+driver.getTitle());
		WebElement signinBtn=driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		builder.moveToElement(signinBtn).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = signinBtn.getAttribute("data-tooltip");
        System.out.println("Tooltip text: " + tooltipText);
		signinBtn.click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(),'in')]")).click();
		System.out.println(driver.findElement(By.id("action-confirmation")).getText());
		driver.close();
	}

}
