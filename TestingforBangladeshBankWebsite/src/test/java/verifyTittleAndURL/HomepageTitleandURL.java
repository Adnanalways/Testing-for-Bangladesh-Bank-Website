package verifyTittleAndURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTitleandURL {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe")	;
		driver=new ChromeDriver();
		driver.get("https://www.bb.org.bd/");
	}
	
	@Test
	public void verifyHomepageTitleAndURL() {
		//verify Home page title
		String expectedTitle="bangladesh bank home";
		String actualTitle=driver.getCurrentUrl();
		Assert.assertEquals(expectedTitle,actualTitle );
		
		// verify URL
		String expectedURL="https://www.bb.org.bd/";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
