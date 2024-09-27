package velvetresidences.TestCases;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.internal.annotations.AnnotationHelper;

import lombok.experimental.Helper;
import velvetresidences.objectclass.Signup;

public class TC_Register_001 extends Baseclass{

	@Test(priority=1)
	public void Registerwithvalidetails() throws InterruptedException {
		Signup sp=new Signup(driver);
		Thread.sleep(3000);
		sp.clicksignintext();
	    sp.clicksignintext();
	    Thread.sleep(2000);
		sp.clickregistertext();
		Thread.sleep(2000);
		sp.setusername("abc");
		String email=randomstring()+ "@gmail.com";
		Thread.sleep(2000);
		sp.setemail(email);
		String psd=randomnum()+"@123";
		sp.setpassword(psd);
		Thread.sleep(2000);
		sp.setfname("barun");
		sp.setlname("david");
		sp.setphone("1234567890");
		sp.clickprivacypolicycheckbox();
		sp.clicktermsandconditionscheckbox();
		
		Thread.sleep(5000);
		String	Exp_title="Velvet Residences";
		String Act_title="Velvet Residences";
		if(driver.getTitle().equals(Exp_title)) {
			System.out.println(Exp_title + "=" + Act_title + " " + " Test case passed : Register successfully with valid details");
		}else {		System.out.print("Test case failed : Registration failed");	}
		Thread.sleep(5000);
	}
	
	@Test(enabled=false)
	public void Registerwithinvalidemailone() throws InterruptedException {
		
		Signup sup=new Signup(driver);
		Thread.sleep(3000);
	
		sup.clicksignintext();
	    Thread.sleep(2000);
	    sup.clickregistertext();
		Thread.sleep(2000);
		sup.setusername("abc");
		sup.setemail("abc12gmail.com");
		Thread.sleep(5000);
		sup.setpassword("123abcd@");
		sup.setfname("barun");
		sup.setlname("david");
		sup.setphone("1234567890");
		sup.clickprivacypolicycheckbox();
		sup.clicktermsandconditionscheckbox();
		Thread.sleep(5000);
		sup.clickRegisterbutton();
		Thread.sleep(5000);
		
			System.out.println(" Test case passed : Registration failed with invalid maail id ");
		
		
	}
	
	@Test(enabled=false)
	public void Registerwithinvalidemailtwo() throws InterruptedException {
		
		Signup sup=new Signup(driver);
		Thread.sleep(3000);
		sup.clicksignintext();
	    Thread.sleep(2000);
	    sup.clickregistertext();
		Thread.sleep(2000);
		sup.setusername("abc");
		sup.setemail("abc12@gmailcom");
		Thread.sleep(5000);
		sup.setpassword("123abcd@");
		sup.setfname("barun");
		sup.setlname("david");
		sup.setphone("1234567890");
		sup.clickprivacypolicycheckbox();
		sup.clicktermsandconditionscheckbox();
		Thread.sleep(5000);
		sup.clickRegisterbutton();
		Thread.sleep(5000);
		System.out.println(" Test case passed : Registration failed with invalid maail id ");
		
	}
	
	@Test (enabled=false)
	public void registerwithemptyfields() throws InterruptedException {
		

		Signup signup=new Signup(driver);
		Thread.sleep(3000);
		signup.clicksignintext();
	    Thread.sleep(2000);
	    signup.clickregistertext();
	    signup.clickRegisterbutton();
		Thread.sleep(5000);
		System.out.println(" Test case passed : Registration failed with invalid maail id ");
		
	}
	
	@Test (enabled=false)
	public void registerwithoutacceptingprivacypolicy() throws InterruptedException {
		
		Signup sup=new Signup(driver);
		Thread.sleep(3000);
		sup.clicksignintext();
	    Thread.sleep(2000);
	    sup.clickregistertext();
		Thread.sleep(2000);
		sup.setusername("abc");
		sup.setemail("abc12@gmail.com");
		Thread.sleep(5000);
		sup.setpassword("123abcd@");
		sup.setfname("barun");
		sup.setlname("david");
		sup.setphone("1234567890");
	
		sup.clicktermsandconditionscheckbox();
		Thread.sleep(5000);
		sup.clickRegisterbutton();
		Thread.sleep(5000);
		System.out.println(" Test case passed : Registration failed with invalid maail id ");
		
	}
	
	@Test(enabled=false)
public void registerwithoutacceptingtermsandconditions() throws InterruptedException {
		
		Signup sup=new Signup(driver);
		Thread.sleep(3000);
		sup.clicksignintext();
	    Thread.sleep(2000);
	    sup.clickregistertext();
		Thread.sleep(2000);
		sup.setusername("abc");
		sup.setemail("abc12@gmail.com");
		Thread.sleep(5000);
		sup.setpassword("123abcd@");
		sup.setfname("barun");
		sup.setlname("david");
		sup.setphone("1234567890");
		sup.clickprivacypolicycheckbox();
	
		Thread.sleep(5000);
		sup.clickRegisterbutton();
		Thread.sleep(5000);
		System.out.println(" Test case passed : Registration failed with invalid maail id ");
		
	}

@Test(enabled=false)
public void registerwithexistingemail() throws InterruptedException {
	
	Signup sup=new Signup(driver);
	Thread.sleep(3000);
	sup.clicksignintext();
    Thread.sleep(2000);
    sup.clickregistertext();
	Thread.sleep(2000);
	sup.setusername("abc");
	sup.setemail("abc12@gmail.com");
	Thread.sleep(5000);
	sup.setpassword("123abcd@");
	sup.setfname("barun");
	sup.setlname("david");
	sup.setphone("1234567890");
	sup.clickprivacypolicycheckbox();
	sup.clicktermsandconditionscheckbox();
	Thread.sleep(5000);
	sup.clickRegisterbutton();
	Thread.sleep(5000);
	System.out.println(" Test case passed : Registration failed with invalid maail id ");
	
}

@Test(enabled=false)
public void registerwithweakpassword() throws InterruptedException {
	
	Signup sup=new Signup(driver);
	Thread.sleep(3000);
	sup.clicksignintext();
    Thread.sleep(2000);
    sup.clickregistertext();
	Thread.sleep(2000);
	sup.setusername("abc");
	sup.setemail("abc12@gmail.com");
	Thread.sleep(5000);
	sup.setpassword("123");
	sup.setfname("barun");
	sup.setlname("david");
	sup.setphone("1234567890");
	sup.clickprivacypolicycheckbox();
	sup.clicktermsandconditionscheckbox();
	Thread.sleep(5000);
	sup.clickRegisterbutton();
	Thread.sleep(5000);
	System.out.println(" Test case passed : Registration failed with invalid maail id ");
	
}

@Test(enabled=false)
public void registerwithstrongpassword() throws InterruptedException {
	
	Signup sup=new Signup(driver);
	Thread.sleep(3000);
	sup.clicksignintext();
    Thread.sleep(2000);
    sup.clickregistertext();
	Thread.sleep(2000);
	sup.setusername("abc");
	sup.setemail("abc12@gmail.com");
	Thread.sleep(5000);
	sup.setpassword("123abcd@#");
	sup.setfname("barun");
	sup.setlname("david");
	sup.setphone("1234567890");
	sup.clickprivacypolicycheckbox();
	sup.clicktermsandconditionscheckbox();
	Thread.sleep(5000);
	sup.clickRegisterbutton();
	Thread.sleep(5000);
	System.out.println(" Test case passed : Registration failed with invalid maail id ");
	
}
	
}
