package velvetresidences.TestCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
public static WebDriver driver;
	
	@BeforeClass
		public void setup()
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MVS-Designer\\eclipse-workspace\\velvetresidences\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://velvetresidences.mvslab.com/");
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	
	@AfterClass
	public void teardown() {
	driver.close();
	}
	
	public String randomstring() {
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}
	
	public String randomnum() {
		String generatedstring2=RandomStringUtils.randomAlphanumeric(4);
		return (generatedstring2);
	}
	
	
	
	}

