package velvetresidences.TestCases;

import org.testng.annotations.Test;

import velvetresidences.objectclass.Forgotpassword;

public class TC_Forgotpassword_003 extends Baseclass{

	
	@Test
	public void verifyforgotpasswordtextlink() throws InterruptedException {
		Forgotpassword fp=new Forgotpassword(driver);
		
		fp.clicksignintext();
		fp.clicklostyourpasswordtext();
		fp.setemail("anshulsaini853@gmail.com");
		fp.clicksubmitbutton();
		Thread.sleep(5000);
		String Act_emailresetlink=fp.getresetemaillink();
		System.out.println(Act_emailresetlink);
		String Exp_emailresetlink="Check your email for the confirmation link, then visit the login page.";
		 if(Act_emailresetlink.equals(Exp_emailresetlink)) {
			 System.out.println("Test case passed:" + "Act_emailresetlink:" + Act_emailresetlink +"="+ "Exp_emailresetlink:" + Exp_emailresetlink);      
		 }else {
			 System.out.println("Test case failed: email not sent to the email");      	 
		 }
		Thread.sleep(5000);
		
	}
	
	
}
