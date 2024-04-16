import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methodpractice1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[] listofitems = { "Mushroom", "Pumpkin", "Potato", "Corn", "Apple", "Onion" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		additems(driver,listofitems);
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}
	
	
	

	public static void additems(WebDriver driver,String[] listofitems)
	{
	int j = 0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	{

	for (int i = 0; i < products.size(); i++) {
		String[] name = products.get(i).getText().split("-");
		String formatedname = name[0].trim();

		List<String> itemneededlist = Arrays.asList(listofitems);

		if (itemneededlist.contains(formatedname)) 
		{

			j++;

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			if (j == listofitems.length) 
			{

				break;
				
			}
		}
	}
	}
	}
	

}
