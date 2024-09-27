package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Propertylisting {

	
	WebDriver ldriver;
	public Propertylisting(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this);
		
	}
	
	
      @FindBy(xpath="//div[@class='fw-carousel-item slick-slide slick-active']//a[@href='https://velvetresidences.mvslab.com/listing/2bhk-apartment-3/']")
	  WebElement propertylisting;
	
      @FindBy(xpath="//*[@class='listing-titlebar-tags']//span[2]")
      WebElement propertyprice;
	
      @FindBy(xpath="//*[@class='listing-titlebar-title']//h1")
      WebElement propertytitle;
      
      @FindBy(xpath="//*[@class='listing-titlebar-title']//a[@class='listing-address']")
      WebElement propertylocation;
	
//      @FindBy(xpath="")
//      WebElement ;
//	
//      @FindBy(xpath="")
//      WebElement ;
//	
//      @FindBy(xpath="")
//      WebElement ;
      
      public void clickpropertylisting() {
    	  propertylisting.click();
      }
      
     public String getpropertypricetext() { 
    	 return propertyprice.getText();
     }
      
     public String getpropertytitletext() { 
    	 return propertylocation.getText();
     }
      
     public String getpropertylocationtext() { 
    	 return propertylocation.getText();
     }  
      
      
      
	
}
