package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://training-support.net/selenium/dynamic-controls");
	    System.out.println("Title of the page:"+driver.getTitle());
	    System.out.print("The checkbox is selected: ");
	    System.out.println(driver.findElement(By.cssSelector("input.willDisappear")).isSelected());
	    driver.findElement(By.cssSelector("input.willDisappear")).click();
	    System.out.print("The checkbox is selected: ");
	    System.out.println(driver.findElement(By.cssSelector("input.willDisappear")).isSelected());
	    driver.close();

	}

}
