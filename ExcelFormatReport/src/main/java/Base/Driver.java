package Base;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


public class Driver {
	
	static String driverPath = "C:\\Users\\vnikolic\\Downloads\\Selenium";
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		//    Open Chrome browser
		System.out.println("*******************");
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnikolic\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {

		// Close Browser
		if(driver!=null) {
			System.out.println("Closing Chrome browser");
			
			driver.quit();
		}
	}
	
	@AfterSuite
	public void generateReport() throws Exception {
		
		Xl.generateReport("Report_Excel.xlsx");
		
	}
	
}
