import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendarpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		WebElement calendar = driver.findElement(By.id("form-field-travel_comp_date"));
		
		//Bring WebElement within the Viewport (user's visible area of web page)
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();", calendar);
				
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(calendar));
						
		calendar.click();
	}
}
