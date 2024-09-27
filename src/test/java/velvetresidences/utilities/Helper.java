package velvetresidences.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;





public class Helper {

	    // Method to wait for overlay (or modal) to disappear
	    public static void waitForOverlayToDisappear(WebDriver driver) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Wait up to 10 seconds
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("mfp-content")));  // Adjust this locator if needed
	    }
	}

