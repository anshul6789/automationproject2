package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import velvetresidences.utilities.Helper;

public class Signup {
        WebDriver ldriver;
    public   Signup(WebDriver rdriver){
	    ldriver=rdriver;
	      PageFactory.initElements(rdriver, this);
}


  @FindBy(xpath="//a[@class='sign-in popup-with-zoom-anim']")
  WebElement signintext;

  @FindBy(id="listeo-registration-btn")
  WebElement registertext;
  
  @FindBy(xpath="//*[@id=\"username2\"]")
  WebElement usernameip;

  @FindBy(xpath="//*[@id=\"email\"]")
  WebElement emailip;
  
  @FindBy(xpath="//*[@id=\"password1\"]")
  WebElement passwordip;

  @FindBy(xpath="//*[@id=\"first-name\"]")
  WebElement firstnameip;
  
  @FindBy(xpath="//*[@id=\"last-name\"]")
  WebElement lastnameip;
  
  
  @FindBy(xpath="//*[@id=\"phone\"]")
  WebElement phoneip;

  @FindBy(xpath="//*[@id=\"register\"]/div[1]/p[6]/label")
  WebElement privacypolicycheckbox;
  
  @FindBy(xpath="//*[@id=\"register\"]/div[1]/p[7]")
  WebElement termsandconditionscheckbox;
  
  @FindBy(xpath="//*[@id=\"register\"]/input[3]")
  WebElement Registerbutton;
  
  public void clicksignintext() {
      signintext.click();
  }

public void clickregistertext() {
	registertext.click();
}

public void setusername(String uname) {
	usernameip.sendKeys(uname);
}

public void setemail(String email) {
emailip.sendKeys(email);
}

public void setpassword(String psd) {
	passwordip.sendKeys(psd);
}

public void setfname(String fname) {
	firstnameip.sendKeys(fname);
}

public void setlname(String lname) {
	lastnameip.sendKeys(lname);
}


public void setphone(String phone) {
	phoneip.sendKeys(phone);
}


public void clickprivacypolicycheckbox() {
	privacypolicycheckbox.click();
}

public void clicktermsandconditionscheckbox() {
	termsandconditionscheckbox.click();
}


public void clickRegisterbutton() {
	Registerbutton.click();
}




}
