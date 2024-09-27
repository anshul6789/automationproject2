package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver ldriver;
	
	public Logout(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div[1]/div[3]/div/div/span/img")
    WebElement myaccountdropdown;

	@FindBy(xpath="//*[@id=\"header\"]/div/div[1]/div[3]/div/ul/li[6]")
    WebElement logoutbutton;
	
	public void clickmyaccountdropdown() {
		myaccountdropdown.click();
	}
	
	public void clicklogoutbutton() {
		logoutbutton.click();
	}
	
}
