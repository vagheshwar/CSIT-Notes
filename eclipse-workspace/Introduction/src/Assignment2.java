import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String[] allitemlist = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
		// driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		Select d = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		d.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(3000);
		addCart(driver, allitemlist);
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		driver.findElement(By.id("country")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[@class='checkbox checkbox-primary']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());

	}

	public static void addCart(WebDriver driver, String[] allitemlist)

	{

		int count = 0;

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card-body']//a"));

		for (int i = 0; i < products.size(); i++) {

			for (int j = 0; j < allitemlist.length; j++)

				if (products.get(i).getText().contains(allitemlist[j].toString())) {

					count++;

					driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

					if (count == allitemlist.length)

						break;

				}
		}

	}

}
