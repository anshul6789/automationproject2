package velvetresidences.objectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddListing {

	WebDriver ldriver;
	public AddListing(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this );
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div[1]/div[3]/div/ul/li[3]")
	WebElement mylistings;
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div[2]/div/a")
	WebElement addlistingbtn;
	
	@FindBy(xpath="//*[@id=\"listing_title\"]")
	WebElement listingtitle;
	
	@FindBy(xpath="//*[@id=\"submit-listing-form\"]/div[1]/div[3]/div/label")
	WebElement uploadlogo;
	
	@FindBy(xpath="//*[@id=\"submit-listing-form\"]/div[1]/div[4]/span/span[1]/span")
	WebElement choosecategory;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[@class='select2-results__option select2-results__option--selectable']")
	List<WebElement> allcategory;
	
	@FindBy(xpath="//*[@id=\"keywords\"]")
	WebElement keywords;
	
	@FindBy(xpath="//*[@id=\"_address\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"select2-region-container\"]")
	WebElement chooseregion;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[@class='select2-results__option select2-results__option--selectable']")
	List<WebElement> regioncategory;
	
	@FindBy(xpath="//*[@id=\"media-uploader\"]")
	WebElement galleryupload;
	
	@FindBy(xpath="//*[@id=\"mceu_17\"]")
	WebElement description;
	
	@FindBy(xpath="//*[@id=\"submit-listing-form\"]/div[5]/div[1]/label/span")
	WebElement  openinghourssliderbtn;
	
	
	
	public void clickmylistings() {
		mylistings.click();
	}
	
	
	public void clickaddlistingbtn() {
		addlistingbtn.click();
	}
	
	public void setlistingtitle(String listtitle) {
		listingtitle.sendKeys(listtitle);
	}
	
	public void clickuploadlogo() {
		uploadlogo.click();
	}
	
	
	public void clickchoosecategory() {
		choosecategory.click(); 
	}
	
	   public void selectOptionByLoop(String visibleText) {
	        for (WebElement option : allcategory) {
	            if (option.getText().equals(visibleText)) {
	                option.click();
	                break;
	            }
	        }
	    }
	 
	
//	 public WebElement waitForElementToBeVisible() {
//	        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
//	        return wait.until(ExpectedConditions.visibilityOf(apartmentcategory));
//	    }
//	
	 
	
	public void setkeywords(String keyword) {
		listingtitle.sendKeys(keyword);
	}
	
	public void setaddress(String adrs) {
		address.sendKeys(adrs);
	}
	
	public void clickchooseregion() {
		chooseregion.click();
	}
	
	public void selectOptionofregion(String visibleText) {
        for (WebElement option : regioncategory) {
            if (option.getText().equals(visibleText)) {
                option.click();
                break;
            }
        }
    }
	
	public void clickgalleryupload() {
		galleryupload.click();
	}
	
	public void setdescription(String desc) {
		description.sendKeys(desc);
	}
	
	public void clickopeninghourssliderbtn() {
		openinghourssliderbtn.click();
	}
}
