package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Frame 1')]")).getText());
		WebElement frame1Button=driver.findElement(By.id("actionButton"));
		System.out.println("Text of the button: "+frame1Button.getText());
		System.out.println("Color of the button: "+frame1Button.getCssValue("background-color"));
		frame1Button.click();
		System.out.println("Text of the button: "+frame1Button.getText());
		System.out.println("Color of the button: "+frame1Button.getCssValue("background-color"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Frame 2')]")).getText());
		WebElement frame2Button=driver.findElement(By.id("actionButton"));
		System.out.println("Text of the button: "+frame2Button.getText());
		System.out.println("Color of the button: "+frame2Button.getCssValue("background-color"));
		Thread.sleep(10000);
		frame2Button.click();
		System.out.println("Text of the button: "+frame2Button.getText());
		System.out.println("Color of the button: "+frame2Button.getCssValue("background-color"));	
		driver.switchTo().defaultContent();
		driver.close();
	}

}
