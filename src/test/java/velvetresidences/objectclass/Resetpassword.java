package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resetpassword {

	WebDriver ldriver;
	public Resetpassword(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver , this);
	}

	@FindBy(xpath="//*[@id=\"header\"]/div/div[1]/div[3]/div/ul/li[5]/a")
	WebElement myprofile;
	
	@FindBy(xpath="//*[@id=\"post-127\"]/div/div[2]/div/div/div/form/input[1]")
	WebElement currentpsd;
	
	@FindBy(xpath="//*[@id=\"post-127\"]/div/div[2]/div/div/div/form/input[2]")
	WebElement newpsd;
	
	@FindBy(xpath="//*[@id=\"post-127\"]/div/div[2]/div/div/div/form/input[3]")
	WebElement confirmnewpsd;
	
	@FindBy(xpath="//*[@id=\"wp-submit\"]")
	WebElement savechangesbtn;
	
	@FindBy(xpath="[@id=\"post-127\"]/div/div[2]/div/div/div/div[2]/p")
	WebElement psdupdatetext;
	
	public void clickmyprofile() {
		myprofile.click();
	}
	
	public void setcurrentpsd(String currentpassword) {
		currentpsd.sendKeys(currentpassword);
	}
	
	public void setnewpsd(String newpassword) {
		newpsd.sendKeys(newpassword);
	}
	
	public void setconfirmnewpsd(String confirmnewpassword) {
		confirmnewpsd.sendKeys(confirmnewpassword);
	}
	
	public void clicksavechnagesbtn() {
		savechangesbtn.click();
	}
	
	public String getpsdupdatetext() {
		return psdupdatetext.getText();
	}
	
}
