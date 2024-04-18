package rahulshettyacademy.pagelanding;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTestng {
	
	@Test
	public void testEcommerceSite() throws InterruptedException {
		String Productname= "ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("dimplevagh@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Dimple@123");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod=products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(Productname)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerLink*='cart']")).click();
		List<WebElement> cartproduct=driver.findElements(By.cssSelector(".cartSection h3"));
		boolean Match=cartproduct.stream().anyMatch(cartselect-> cartselect.getText().equalsIgnoreCase(Productname));
		Assert.assertTrue(Match);
		driver.findElement(By.cssSelector(".totalRow button")).click();
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
		a.moveToElement(driver.findElement(By.cssSelector(".btnn"))).click().perform();
		String confirmmessage =driver.findElement(By.xpath("//h1[contains(text(),'Thankyou for the order.')]")).getText();
		Assert.assertTrue(confirmmessage.equalsIgnoreCase("Thankyou for the order."));
		System.out.println(confirmmessage);
		driver.quit();
	}
}
