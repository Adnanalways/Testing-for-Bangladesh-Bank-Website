package verifyElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Elements {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver.get("https://www.bb.org.bd/");
	}
	
	@Test
	public void testSearchBarpresence() {
		// locate the search bar element
		WebElement searchbar=driver.findElement(By.name("srchtxt"));
		Assert.assertEquals(searchbar.isDisplayed(), "Search bar is not displayed");
		
		
			
		}
	@Test
	public void testContactInfoPresence() {
		WebElement contactInfo =driver.findElement(By.xpath("\"//a[contains(text(),'Contact')]"));
		Assert.assertTrue(contactInfo.isDisplayed(), "Contact info link is not displayed");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
