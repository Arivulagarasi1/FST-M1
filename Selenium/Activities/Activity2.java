package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of the page:"+driver.getTitle());
        WebElement id=driver.findElement(By.id("about-link"));
        System.out.println("Text of Element identified by ID: "+id.getText());
        WebElement class1=driver.findElement(By.className("inverted"));
        System.out.println("Text of Element identified by Class: "+class1.getText());
        WebElement linktext=driver.findElement(By.linkText("About Us"));
        System.out.println("Text of Element identified by linkText: "+linktext.getText());
        WebElement css=driver.findElement(By.cssSelector("a.green"));
        System.out.println("Text of Element identified by CSS: "+css.getText());
        driver.close();
	}

}
