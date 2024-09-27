package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver ldriver;
public Login(WebDriver  rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="//i[@class='sl sl-icon-login']")
WebElement signintext;

@FindBy(xpath="//*[@id=\"user_login\"]")//username
WebElement usernameif;

@FindBy(xpath="//*[@id=\"user_pass\"]")//passowrd
WebElement passowrdif;

@FindBy(xpath="//*[@id=\"login\"]/div[1]/div/label")//remember me
WebElement remembermecheckbox;

@FindBy(xpath="//*[@id=\"login\"]/div[1]/input[3]")//submit button
WebElement loginbtn;

@FindBy(xpath="//*[@id=\"login\"]/div[2]")
WebElement loginerrortext;

public void clicksignintext() {
	signintext.click();
}

public void setusername(String uname) {
	usernameif.sendKeys(uname);
}

public void setpassword(String psd) {
	passowrdif.sendKeys(psd);
}

public void clickremembermecheckbox() {
	remembermecheckbox.click();
}

public void clickloginbtn() {
	loginbtn.click();
}

public String getloginerrortext() {
	return loginerrortext.getText();
}

}
