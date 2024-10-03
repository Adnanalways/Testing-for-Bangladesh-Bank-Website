package navigatetoSections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver.get("https://www.bb.org.bd/");
	}
	
	@Test
	public void testNavigateNotice() {
		// locate and click on Notices Link
	WebElement noticeslink =driver.findElement(By.linkText("notices"));
	noticeslink.click();
	
	}
	@Test
	public void testNavigateToCirculars() {
		WebElement circularslink=driver.findElement(By.linkText("Circulars"));
		circularslink.click();
		
		//Verify the URL after Navigation
		String expectedURL="https://www.bb.org.bd/openpdf.php";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedURL),"Navigated to incorrect URL for Circulars");
	}
	
	@AfterMethod
	public void tearDEown() {
		driver.quit();
	}
	

}
