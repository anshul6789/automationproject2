package velvetresidences.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import velvetresidences.objectclass.Login;

public class TC_Login_002 extends Baseclass{

	
	@Test
	public void Loginwithvaliddetails() throws InterruptedException {		
		Login li=new Login(driver);
		li.clicksignintext();
	li.setusername("anshulsaini853@gmail.com");
		li.setpassword("abc321@");
		li.clickremembermecheckbox();
		li.clickloginbtn();
		Thread.sleep(5000);
		
String	Exp_title="Velvet Residences";
	String Act_title="Velvet Residences";
	if(driver.getTitle().equals(Exp_title)) {
		System.out.println(Exp_title + "=" + Act_title + " " + " Test case passed : Login successfully");
	}else {		System.out.print("Test case passed : Login failed");	}
	Thread.sleep(5000);
}
	
	@Test
	public void Loginwithinvalidpassword() throws InterruptedException {
		Login li=new Login(driver);
		li.clicksignintext();
		li.setusername("anshulsaini853@gmail.com");
		li.setpassword("anshul321");
		li.clickremembermecheckbox();
		li.clickloginbtn();
		Thread.sleep(5000);
		String errormessage=li.getloginerrortext();
		System.out.println("Login failed:"  + " " + errormessage);
		System.out.println("expected result: user should not be able to login with invalid password----Test case passed");
		
	}
	
	
}
