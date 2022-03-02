package Google.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import myScreenRecorder.MyScreenRecorder;

public class GoogleTest 
{
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
	public void GoogleSiteTest() throws Exception
	{
		MyScreenRecorder.startRecording("GoogleSiteTest");
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement search =driver.findElement(By.name("q"));
		Thread.sleep(3000);
		search.sendKeys("Flipkart");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(3000);
		MyScreenRecorder.stopRecording();
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}
