package velvetresidences.TestCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import velvetresidences.objectclass.Login;
import velvetresidences.objectclass.Searchproperty;

public class TC_Searchproperty_005 extends Baseclass{

//	@Test
//	public void searchpropertyviaaddress() throws InterruptedException {
//		
//		Login li=new Login(driver);
//		li.clicksignintext();
//		li.setusername("anshulsaini853@gmail.com");
//		li.setpassword("anshul321@");
//		li.clickremembermecheckbox();
//		li.clickloginbtn();
//		Thread.sleep(2000);
//		
//		Searchproperty sp=new Searchproperty(driver);
//		sp.setlocationsearch("308, Plot No: H-2, Apra Northex Plaza, Netaji Subhash Place, Pitampura, New Delhi, Delhi, 110034");
//		Thread.sleep(2000);
//		sp.clicksearchbtn();
//		String inputlocation="308, Plot No: H-2, Apra Northex Plaza, Netaji Subhash Place, Pitampura, New Delhi, Delhi, 110034";
//		
//		String outputlocation=sp.getoutputlocationtext();
//		System.out.println(outputlocation);
//		if(outputlocation.contains("New Delhi")) {
//			Assert.assertTrue(true);
//			System.out.println(" Test case passed property displayed via location filter");
//		
//		}else {
//			Assert.assertFalse(false);
//			System.out.println("property not displayed via location filter");
//
//		}
//	}
//	
//	@Test
//	public void searchinvalidpropertyname() throws InterruptedException {
//		Login li=new Login(driver);
//		li.clicksignintext();
//		li.setusername("anshulsaini853@gmail.com");
//		li.setpassword("anshul321@");
//		li.clickremembermecheckbox();
//		li.clickloginbtn();
//		Thread.sleep(2000);
//		Searchproperty sp=new Searchproperty(driver);
//		sp.setlocationsearch("abc132345sfggd");
//		Thread.sleep(2000);
//		sp.clicksearchbtn();
//	String actualinvalidtext=sp.getinvalidsearchtext();
//	System.out.println(actualinvalidtext);
//	String expectedinvalidtext="We’re sorry but we do not have any listings matching your search, try to change you search settings";
//	
//	Assert.assertEquals(actualinvalidtext, expectedinvalidtext ,"We’re sorry but we do not have any listings matching your search, try to change you search settings");
//	
//	}
	
	@Test 
	public void verifypaginationonpropertylistingpage() throws InterruptedException {
		Login li=new Login(driver);
		li.clicksignintext();
		li.setusername("anshulsaini853@gmail.com");
		li.setpassword("anshul321@");
		li.clickremembermecheckbox();
		li.clickloginbtn();
		Thread.sleep(2000);
		Searchproperty sp=new Searchproperty(driver);
		Thread.sleep(2000);
		sp.clicksearchbtn();
	String	firstpagetext=sp.getpagetext();
	System.out.println(firstpagetext);
	sp.clicksecondpage();
	Thread.sleep(3000);
	
		String secondpagetext=sp.getpagetext();
		System.out.println(secondpagetext);
		if(!firstpagetext.equals(secondpagetext)) {
	Assert.assertNotSame(firstpagetext, secondpagetext, "not equal");
	System.out.println("test case passed");
		}else
		{
			System.out.println("test case failed");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
