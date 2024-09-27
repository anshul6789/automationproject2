package velvetresidences.TestCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import velvetresidences.objectclass.Contactusform;
import velvetresidences.objectclass.Login;

public class TC_Contactusform_006 extends Baseclass{

//	
//	@Test
//	public void verifycontactusformwithalldetails() throws InterruptedException {
//		
//		Login li=new Login(driver);
//		li.clicksignintext();
//		li.setusername("anshulsaini853@gmail.com");
//		li.setpassword("anshul321@");
//		li.clickremembermecheckbox();
//		li.clickloginbtn();
//		Thread.sleep(3000);
//		
//		Contactusform cf= new Contactusform(driver);
//		
//		cf.clickdropmenu();
//		Thread.sleep(3000);
//		cf.clickcontactus();
//	    cf.setyourname("varun");
//		cf.setyouremail("anshulsaini853@gmail.com");
//		cf.setsubject("hi i want to rent a prop. but there is something wrong with rent price");
//		cf.clicksubmitbutton();
//		
//		String exp_message="Thank you for your message. It has been sent.";
//		String Act_message=cf.getconfirmationmessage();
//		
//		if(exp_message.equals(Act_message)) {
//			Assert.assertEquals(exp_message , Act_message , "Thank you for your message. It has been sent.");
//		System.out.println(Act_message + "Test case passed")	;
//				
//		}else {
//			Assert.assertNotSame(exp_message , Act_message , "Thank you for your message. It has been sent.");
//			System.out.println( "Test case failed:" + "exp_message is not equal to act_message")	;
//		}
//	}
//
//	
	
//	
//	@Test
//	public void verifyrequiredfieldsincontactusform() throws InterruptedException {
//		
//		Login li=new Login(driver);
//		li.clicksignintext();
//		li.setusername("anshulsaini853@gmail.com");
//		li.setpassword("anshul321@");
//		li.clickremembermecheckbox();
//		li.clickloginbtn();
//		Thread.sleep(3000);
//		
//		Contactusform cf= new Contactusform(driver);
//		
//		cf.clickdropmenu();
//		Thread.sleep(3000);
//		cf.clickcontactus();
//	 //   cf.setyourname("varun");
//	//	cf.setyouremail("anshulsaini853@gmail.com");
//		//cf.setsubject("hi i want to rent a prop. but there is something wrong with rent price");
//		cf.clicksubmitbutton();
//		Thread.sleep(3000);
//		String act_emailerrormsg=cf.getemailerrormessage();
//		String exp_emailerrormsg="Please fill out this form";
//		Thread.sleep(3000);
//		
//		System.out.println("Test case passed:email required field" + act_emailerrormsg);
//		Assert.assertEquals(act_emailerrormsg , exp_emailerrormsg ,"Please fill out this form");
//
//		Thread.sleep(3000);
//		String act_nameerrormsg=cf.getnameerrormessage();
//		String exp_nameerrormsg="Please fill out this form";
//		Thread.sleep(3000);
//		
//		System.out.println("Test case passed:name required field" + act_nameerrormsg);
//		Assert.assertEquals(act_nameerrormsg , exp_nameerrormsg ,"Please fill out this form");
//
//		
//		Thread.sleep(3000);
//		String act_suberrormsg=cf.getsubjecterrormessage();
//		String exp_suberrormsg="Please fill out this form";
//		Thread.sleep(3000);
//		
//		System.out.println("Test case passed:subject required fields" + act_suberrormsg);
//		Assert.assertEquals(act_suberrormsg , exp_suberrormsg ,"please fill out this form");
//
//		
//	}
	
	
	
	
		@Test
		public void submitcontactusformwithinvalidemail() throws InterruptedException {
			Login li=new Login(driver);
			li.clicksignintext();
			li.setusername("anshulsaini853@gmail.com");
			li.setpassword("anshul321@");
			li.clickremembermecheckbox();
			li.clickloginbtn();
			Thread.sleep(3000);
			
			Contactusform cf= new Contactusform(driver);
			
			cf.clickdropmenu();
			Thread.sleep(3000);
			cf.clickcontactus();
		    cf.setyourname("varun");
			cf.setyouremail("anshulsaini853gmail.com");
			cf.setsubject("hi i want to rent a prop. but there is something wrong with rent price");
			cf.clicksubmitbutton();
			Thread.sleep(3000);
			String act_invalidemailerrormsg=cf.getemailerrormessage();
			String exp_invalidemailerrormsg="Please enter an email address";
			Thread.sleep(3000);
			
			System.out.println("Test case passed:invalid email message " + act_invalidemailerrormsg);
		Assert.assertEquals(act_invalidemailerrormsg , exp_invalidemailerrormsg ,"Please enter an email address");
	
			
			
	}
	
	
	
	
}
