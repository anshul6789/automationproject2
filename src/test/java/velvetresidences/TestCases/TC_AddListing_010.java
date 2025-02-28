package velvetresidences.TestCases;

import java.util.NoSuchElementException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import velvetresidences.objectclass.AddListing;
import velvetresidences.objectclass.Login;
import velvetresidences.objectclass.Logout;

public class TC_AddListing_010 extends Baseclass{

	
	
	@Test
	public void verifyListing() throws InterruptedException, FindFailed {
		try {
		 Login li = new Login(driver);
         li.clicksignintext();
         li.setusername("abc0068coffee@gmail.com");
         li.setpassword("varun321");
         li.clickremembermecheckbox();
         li.clickloginbtn();
         
         Thread.sleep(5000);
         
         Logout lo = new Logout(driver);
         lo.clickmyaccountdropdown();
         Thread.sleep(3000);
         AddListing al=new AddListing(driver);
         al.clickmylistings();
         al.clickaddlistingbtn();
         al.setlistingtitle("1bhk shared apartment for man");
         al.clickuploadlogo();
         
         Thread.sleep(2000);
         
         String imagesfilepath = "C:\\";
         String inputfilepath = "C:\\";

         Screen s = new Screen();
         Pattern fileinputtextbox = new Pattern(imagesfilepath + "inputfiletextbox.png");
         Pattern openbutton = new Pattern(imagesfilepath + "openbutton.png");

         Thread.sleep(5000);

         // Assert that the file input textbox is displayed
         Assert.assertNotNull(s.wait(fileinputtextbox, 5), "File input textbox not found.");

         // Perform file input and open
         s.type(fileinputtextbox, inputfilepath + "images.jpg");
         s.click(openbutton);
         Thread.sleep(2000);
         al.clickchoosecategory();
         Thread.sleep(3000);
     
         al.selectOptionByLoop("Apartments");
         
        
         String keyword=randomstring();
         al.setkeywords(keyword);
         al.setaddress("pitampura, ranibagh mrket, delhi ,110034");
        al.clickchooseregion();
        Thread.sleep(3000);
        al.selectOptionofregion("India");
       
        al.clickgalleryupload();
        
        Thread.sleep(2000);
        

        Screen p = new Screen();
        Pattern fileinputextbox = new Pattern(imagesfilepath + "inputfiletextbox.png");
        Pattern openbuton = new Pattern(imagesfilepath + "openbutton.png");

        Thread.sleep(5000);

        // Assert that the file input textbox is displayed
        Assert.assertNotNull(p.wait(fileinputextbox, 5), "File input textbox not found.");

        // Perform file input and open
        p.type(fileinputtextbox, inputfilepath + "images.jpg");
        p.click(openbuton);
        Thread.sleep(3000);
        al.clickgalleryupload();
        p.type(fileinputtextbox, inputfilepath + "image2.jpg");
        p.click(openbuton);
        Thread.sleep(3000);
        al.setdescription("A BHK (Bedroom-Hall-Kitchen) shared apartment for men");
        
        al.clickopeninghourssliderbtn();
        
		 } catch (NoSuchElementException e) {
	            System.err.println("File input element not found: " + e.getMessage());
	            Assert.fail("Test failed due to NoSuchElementException.");

	        } catch (Exception e) {
	            System.err.println("An unexpected error occurred: " + e.getMessage());
	            Assert.fail("Test failed due to unexpected exception.");

	        } finally {
	            // Close the browser, regardless of success or exception
	            System.out.println("Browser closed.");
	        }
	    }
        

	}

