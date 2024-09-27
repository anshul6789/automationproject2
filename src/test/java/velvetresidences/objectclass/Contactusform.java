package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.*;

public class Contactusform {

	WebDriver ldriver;
	public Contactusform(WebDriver  rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	 @FindBy(xpath="//div[@class=\"desktop-mmenu-trigger\"]")
	  WebElement dropmenu;
	
	 @FindBy(xpath="//*[@id=\"menu-item-441\"]//a")
	 WebElement contactus;
	
	 @FindBy(xpath="//*[@id=\"wpcf7-f6-p439-o1\"]/form/p[1]/label/span/input")
	 WebElement yourname;
	 
	 @FindBy(xpath="//*[@id=\"wpcf7-f6-p439-o1\"]/form/p[2]/label/span/input")
	 WebElement youremail;
	 
	 @FindBy(xpath="//*[@id=\"wpcf7-f6-p439-o1\"]/form/p[3]/label/span/input")
	 WebElement subject;	 
	 
	 @FindBy(xpath="//*[@id=\"wpcf7-f6-p439-o1\"]/form/p[5]/input")
	  WebElement submitbtn; 
	 
	 @FindBy(xpath="//*[@id=\"wpcf7-f6-p439-o1\"]/div/p")
	  WebElement confirmationmessage; 
	 
	 @FindBy(xpath="//*[@id=\"wpcf7-f6-p439-o1\"]/form/p[2]/label/span/span")
	 WebElement emailerrormessage;

     @FindBy(xpath="//*[@id=\"wpcf7-f6-p439-o1\"]/form/p[1]/label/span/span")
	 WebElement nameerrormessage;
	 
     @FindBy(xpath="//*[@id=\"wpcf7-f6-p439-o1\"]/form/p[3]/label/span/span")
	 WebElement subjecterrormessage;
	 
	 
	 
	 public void clickdropmenu() {
		 dropmenu.click();
	 }
	 
	 public void clickcontactus() {
		 contactus.click();
	 }
	 
	 public void setyourname(String uname) {
			yourname.sendKeys(uname);
		}
	 
	 public void setyouremail(String uemail) {
		 youremail.sendKeys(uemail);
	 }
	 
	 public void setsubject(String subjct) {
		 subject.sendKeys(subjct);
	 } 
	 
	 public void clicksubmitbutton() {
		 submitbtn.click();
	 }
	 
	 public String getconfirmationmessage() {
		 return confirmationmessage.getText();
		 
	 }
	 
	public String getemailerrormessage() { 
		return emailerrormessage.getText();
	}
	 
	public String getnameerrormessage() { 
		return nameerrormessage.getText();
	}
	
	public String getsubjecterrormessage() { 
		return subjecterrormessage.getText();
			
	}
	
	
}
