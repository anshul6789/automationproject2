package velvetresidences.TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import velvetresidences.objectclass.Login;
import velvetresidences.objectclass.Logout;
import velvetresidences.objectclass.Resetpassword;
import velvetresidences.utilities.XLUtils;

public class TC_Resetpassword_008 extends Baseclass{

	
	@Test(dataProvider="resetpassword")
	public void verifyResetpassword(String currentpassword, String newpsd, String confirmnewpsd) throws InterruptedException {
		Login li=new Login(driver);
		li.clicksignintext();
		li.setusername("anshulsaini853@gmail.com");
			li.setpassword("Amshul321@");
			li.clickremembermecheckbox();
			li.clickloginbtn();
			Thread.sleep(5000);
			
		Logout	lo=new Logout(driver);
		
		lo.clickmyaccountdropdown();
		
		Resetpassword rp=new Resetpassword(driver);
		rp.clickmyprofile();
		rp.setcurrentpsd("currentpassword");
		rp.setnewpsd("newpsd");
		rp.setconfirmnewpsd("confirmnewpsd");
		rp.clicksavechnagesbtn();
		String exp_text="Your password has been updated";
		String act_text=rp.getpsdupdatetext();
		if(exp_text.equals(act_text)) {
			Assert.assertEquals(exp_text,act_text , "Your password has been updated");
			System.out.println("password changed successfully");
		}else {
			
			System.out.println("password not changed successfully");

		}
		
    
		
		lo.clickmyaccountdropdown();
		lo.clicklogoutbutton();
		//INVALID CURRENTPSD--//*[@id="post-127"]/div/div[2]/div/div/div/div[2]/p
		//valid currentpsd and same new psd & confirmnew psd--//*[@id="post-127"]/div/div[2]/div/div/div/div[2]/p
		//diffrent current and confirm new psd ---//*[@id="post-127"]/div/div[2]/div/div/div/div[2]/p
		//invalid current and diff new and confirm new pad---//*[@id="post-127"]/div/div[2]/div/div/div/div[2]/p--
		//Your current password does not match. Please retry.
		
	}
	
	@DataProvider(name="resetpassword")
	String[][]     getData() throws IOException 
	{
		String path="C:\\Users\\MVS-Designer\\eclipse-workspace\\velvetresidences\\src\\test\\java\\velvetresidences\\testData\\resetpassword.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "sheet1");
		int colcount=XLUtils.getCellCount(path, "sheet1", 1);
		
		String resetpassword[][]=new String[rownum][colcount];
		
		for(int i=1; i<=rownum; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				resetpassword[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return resetpassword;
	}
	
	
}
