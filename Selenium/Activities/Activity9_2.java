package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		WebElement chosen =driver.findElement(By.id("multi-value"));
		Select sel=new Select(driver.findElement(By.id("multi-select")));
		if(sel.isMultiple()) {
			sel.selectByVisibleText("Javascript");
			System.out.println(chosen.getText());
			sel.selectByValue("node");
			System.out.println(chosen.getText());
			for(int i=4; i<=6; i++) {
                sel.selectByIndex(i);
            }
			System.out.println(chosen.getText());
			sel.deselectByValue("node");
			System.out.println(chosen.getText());
			sel.deselectByIndex(7);
			System.out.println(chosen.getText());
			List<WebElement> options=sel.getAllSelectedOptions();
			for(WebElement opt:options)
				System.out.println("Option: "+opt.getText());
			sel.deselectAll();
			System.out.println(chosen.getText());			
		}
		driver.close();
	}

}
