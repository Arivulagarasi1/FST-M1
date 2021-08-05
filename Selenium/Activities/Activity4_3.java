package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.training-support.net/selenium/target-practice");
	    System.out.println("Title of the page:"+driver.getTitle());
	    System.out.println(driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
	    System.out.println(driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getCssValue("color"));
	    String violetButtonclass=driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class");
	    System.out.println(violetButtonclass);
	    System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());
	    driver.close();
	}

}
