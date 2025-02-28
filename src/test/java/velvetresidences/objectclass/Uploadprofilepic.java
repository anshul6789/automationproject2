package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uploadprofilepic {

	WebDriver ldriver;
	public Uploadprofilepic(WebDriver idriver) {
		ldriver=idriver;
		PageFactory.initElements(idriver , this);
	}
	
	@FindBy(xpath="//*[@id=\"avatar-uploader\"]/div/span")
	WebElement profilepic;
	
	@FindBy(xpath="//*[@id=\"avatar-uploader\"]/div[2]/a")
	WebElement removeprofilepic;
	
	@FindBy(xpath="//*[@id=\"edit_user\"]/div[2]/div/button")
	WebElement profilepicsavechanges;
	
	@FindBy(xpath="//*[@id=\"post-127\"]/div[1]/p")
	WebElement profileupdate;
	
	public void clickprofilepic() {
		profilepic.click();
	}
	
	public void clickremoveprofilepic() {
		removeprofilepic.click();
	}
	
	public String getprofileupdatetext() {
		return profileupdate.getText();
	}
	
	public void clickprofilepicsavechanges() {
		profilepicsavechanges.click();
	}
	
}
