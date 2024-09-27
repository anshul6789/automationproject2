package velvetresidences.objectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchproperty {

	WebDriver ldriver;
	public Searchproperty(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	  @FindBy(xpath="//*[@id=\"location_search\"]")
	  WebElement locationsearch;
	
	  @FindBy(xpath="//*[@id=\"listeo_core-search-form\"]/div/button")
	  WebElement searchbtn;
	  
	  @FindBy(xpath="//div[@class='listing-item-inner']//span[contains(text(),'New Delhi')]")
	  WebElement outputlocation;
	  
	  @FindBy(xpath="//div[@id='listeo-listings-container']//p")
	  WebElement invalidsearch;
	  
	  @FindBy(xpath="//nav[@class='pagination margin-top-30']/ul/li[2]/a")
	  WebElement secondpage;
	  
	  @FindBy(xpath="//div[@class='listing-item-inner']//h3")
	  WebElement pagetext;
	  
	  public void  setlocationsearch(String enterlocation) {
		  locationsearch.sendKeys(enterlocation);
	  }
	  
		  public void clicksearchbtn() {
			  searchbtn.click();
		  }
		  
	public String getoutputlocationtext() {		  
		return outputlocation.getText();
	}
			

	public String getinvalidsearchtext () {		  
		return invalidsearch.getText();
	}
		
	public void clicksecondpage() {
		secondpage.click();
	}
	
	public String  getpagetext() {		  
		return pagetext.getText();
	}
	
}
