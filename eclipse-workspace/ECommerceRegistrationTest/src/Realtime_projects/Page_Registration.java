package Realtime_projects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// Test Case 1: Verify the registration page loads within 2 seconds
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

}
