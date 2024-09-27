package velvetresidences.TestCases;

import org.testng.annotations.Test;



import velvetresidences.objectclass.Login;
import velvetresidences.objectclass.Logout;

public class TC_Logout_004 extends Baseclass{

	
	@Test
	public void verifylogoutfunctionality() throws InterruptedException {
		Login li=new Login(driver);
		li.clicksignintext();
		li.setusername("anshulsaini853@gmail.com");
			li.setpassword("anshul321@");
			li.clickremembermecheckbox();
			li.clickloginbtn();
			Thread.sleep(5000);
			
		Logout	lo=new Logout(driver);
		
		lo.clickmyaccountdropdown();
		lo.clicklogoutbutton();
		Thread.sleep(3000);
		String	Exp_title="Velvet Residences";
		String Act_title="Velvet Residences";
		if(driver.getTitle().equals(Exp_title)) {
			System.out.println(Exp_title + "=" + Act_title + " " + " Test case passed : Logout successfully");
		}else {		System.out.print("Test case passed : Logout failed");	}
		Thread.sleep(5000);
	}
		
	
	
	
}
