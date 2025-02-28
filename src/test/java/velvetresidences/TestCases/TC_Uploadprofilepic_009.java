package velvetresidences.TestCases;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import velvetresidences.objectclass.Login;
import velvetresidences.objectclass.Logout;
import velvetresidences.objectclass.Resetpassword;
import velvetresidences.objectclass.Uploadprofilepic;

public class TC_Uploadprofilepic_009 extends Baseclass {

    @Test
    public void uploadprofilepic() throws InterruptedException, AWTException, FindFailed {
        try {
            Login li = new Login(driver);
            li.clicksignintext();
            li.setusername("anshulsaini853@gmail.com");
            li.setpassword("Anshul321@");
            li.clickremembermecheckbox();
            li.clickloginbtn();
            
            Thread.sleep(5000);



            Logout lo = new Logout(driver);
            lo.clickmyaccountdropdown();

            Resetpassword rp = new Resetpassword(driver);
            rp.clickmyprofile();

            Uploadprofilepic up = new Uploadprofilepic(driver);
            up.clickprofilepic();

            String imagesfilepath = "C:\\";
            String inputfilepath = "C:\\";

            Screen s = new Screen();
            Pattern fileinputtextbox = new Pattern(imagesfilepath + "inputfiletextbox.png");
            Pattern openbutton = new Pattern(imagesfilepath + "openbutton.png");

            Thread.sleep(5000);

            // Assert that the file input textbox is displayed
            Assert.assertNotNull(s.wait(fileinputtextbox, 20), "File input textbox not found.");

            // Perform file input and open
            s.type(fileinputtextbox, inputfilepath + "images.jpg");
            s.click(openbutton);

            // Assert successful file input by checking profile picture update (custom verification needed)
//            Assert.assertTrue(up.isProfilePictureUpdated(), "Profile picture upload failed.");

          
         
           Thread.sleep(3000);
          up.clickprofilepicsavechanges();
          System.out.println("Profile picture uploaded successfully.");
      String profileupdatetext=     up.getprofileupdatetext();
      System.out.println(profileupdatetext);
      Assert.assertTrue(profileupdatetext.contains("Your profile has been updated"), "Profile update confirmation message not found or incorrect.");
      Thread.sleep(3000);
      up.clickremoveprofilepic();
      up.clickprofilepicsavechanges();
      System.out.println("Profile picture removed successfully.");
      String profileremovetext=     up.getprofileupdatetext();
      System.out.println(profileremovetext);
      Assert.assertTrue(profileremovetext.contains("Your profile has been updated"), "Profile update confirmation message not found or incorrect.");
//           driver.switchTo().alert().accept();
//           System.out.println("Profile picture removed successfully.");
//           
           
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



