package velvetresidences.TestCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import velvetresidences.objectclass.Login;
import velvetresidences.objectclass.Propertylisting;

public class TC_Propertylisting_007 extends Baseclass{

	@Test
	public void verifypropertylisting() throws InterruptedException {
		Login li=new Login(driver);
		li.clicksignintext();
		li.setusername("anshulsaini853@gmail.com");
		li.setpassword("anshul321@");
		li.clickremembermecheckbox();
		li.clickloginbtn();
		Thread.sleep(3000);
		
		Propertylisting pl=new Propertylisting(driver);
		pl.clickpropertylisting();
		Thread.sleep(2000);
		String exp_propertypricetext="Rs.1,000.00 - Rs.2,000.00"   ;
		Thread.sleep(2000);
		String exp_propertytitletext="nsp metro s";
		Thread.sleep(2000);
		String exp_propertylocationtext=	"2bhk apartment";
		Thread.sleep(2000);
		//System.out.println(exp_propertypricetext + " "+exp_propertytitletext +" "+  exp_propertylocationtext);
	   Assert.assertEquals(pl.getpropertypricetext() , exp_propertypricetext, "Rs.1,000.00 - Rs.2,000.00");
		Assert.assertEquals(pl.getpropertytitletext() , exp_propertytitletext, "nsp metro s");
		Assert.assertEquals(pl.getpropertylocationtext() , exp_propertylocationtext, "2bhk apartment");
		System.out.println("exp_propertypricetext: " +pl.getpropertypricetext());
		System.out.println("exp_propertytitletext: " +pl.getpropertytitletext());
		System.out.println("exp_propertylocationtext: " +pl.getpropertylocationtext());
		
		
		
	}
	
	
	
	
	
	
	
}
