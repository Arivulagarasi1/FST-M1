package crmElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
	WebDriver driver;
	
	@FindBy(id="user_name") public WebElement userName;
	@FindBy(id="username_password") public WebElement password;
	@FindBy(id="bigbutton") public WebElement loginBtn;
	@FindBy(id="grouptab_0") public WebElement salesMenu;
	@FindBy(id="moduleTab_9_Leads") public WebElement leadsMenu;
	@FindBy(id="moduleTab_9_Accounts") public WebElement accountsMenu;
	
	public Elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
