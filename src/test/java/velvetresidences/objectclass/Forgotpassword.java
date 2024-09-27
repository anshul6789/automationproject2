package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {

	WebDriver ldriver;
	public Forgotpassword(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this);
	}

	  @FindBy(xpath="//i[@class='sl sl-icon-login']")
	  WebElement signintext;

	@FindBy(xpath="//*[@id=\"login\"]/p[2]/span/a")
	WebElement lostyourpasswordtext;
	  
	  @FindBy(xpath="//*[@id=\"user_login\"]")
	  WebElement emailif;
	
	  @FindBy(xpath="//*[@id=\"wp-submit\"]")
	  WebElement submitbutton;
	  
	  @FindBy(xpath="//*[@id=\"login-message\"]/p")
	  WebElement resetemaillink;
	  
	  public void clicksignintext() {
			signintext.click();
		}
	  
	  public void clicklostyourpasswordtext() {
		  lostyourpasswordtext.click();
		}
	  
	  
	  public void setemail(String email) {
		  emailif.sendKeys(email);
		}
	  
	  public void clicksubmitbutton() {
		  submitbutton.click();
	  }
	  
	  public String getresetemaillink() {
		  return resetemaillink.getText();
	  }
	  
	  
}
