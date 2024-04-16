import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.className("register-btn")).click();
		driver.findElement(By.id("email")).sendKeys("hello eshwar");
		driver.findElement(By.className("password")).sendKeys("hello123");
		driver.findElement(By.className("btn-primary"));
		System.out.println(driver.findElement(By.className("inline-error")).getText());	
		
	}

}