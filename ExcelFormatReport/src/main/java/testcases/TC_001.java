package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Driver;

	public class TC_001 extends Driver{
		
		@Test
		public void tc_001() {
	
			driver.get("https://google.com");
			System.out.println("Navigate to URL");
			driver.findElement(By.name("q")).sendKeys("Hello Selenium!");
			Assert.assertTrue(true);
			driver.quit();
	
		}
	}
