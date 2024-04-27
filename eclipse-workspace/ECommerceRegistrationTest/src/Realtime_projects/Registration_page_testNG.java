package Realtime_projects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration_page_testNG {
	WebDriver driver;
    WebDriverWait wait;
   
   @BeforeTest
	public void verifyRegistrationPageLoadTime() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
		
	@Test
	public void registerUserAndVerifyConfirmation() throws InterruptedException {
		Long startTime = System.currentTimeMillis();
		driver.get("https://www.amazon.in/register");
		Long endTime = System.currentTimeMillis();
		Long loadTime = endTime - startTime;
		System.out.println("Page Load Time: " + loadTime + " milliseconds");
		assert (endTime - startTime) < 2000 : "Registration page load time exceeded 2 seconds";
		driver.findElement(By.id("ap_customer_name")).sendKeys("Saanvika@gmail.com");
		WebElement countrycodedropdown=driver.findElement(By.id("auth-country-picker-container"));
		countrycodedropdown.click();
		WebElement pickindia=driver.findElement(By.id("auth-country-picker_92"));
		pickindia.click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_phone_number")).sendKeys("585858585");
		driver.findElement(By.id("ap_password")).sendKeys("Gayaahdhjahajdh");
		driver.findElement(By.id("continue")).click();
	}
	
		@AfterMethod
		public void teardown() {
			driver.quit();
		
		
	}

}
