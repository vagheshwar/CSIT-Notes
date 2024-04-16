import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("hello@email");
		driver.findElement(By.name("inputPassword")).sendKeys("password123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("helloeshwar");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Helloeshwar@email.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("816528484");
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.className("infoMsg")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement(By.xpath("//form[@class='form']/input[1]")).sendKeys("Helloeshwar@email.com");
        driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("checkbox-container")).click();
        driver.findElement(By.xpath("//button[contains (@class,'submit')]")).click();
    	driver.findElement(By.xpath("//button[text() = 'Log Out']")).click();
		driver.close();
		
	}

}
