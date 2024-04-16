import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		//driver.findElement(By.className("JFPqaw"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//driver.findElement(By.cssSelector("input[class='_18u87m _3WuvDp']")).sendKeys("8106525533");
		//driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		
	}

}
