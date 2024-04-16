import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rahulshetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		String[] allitems= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		Select d = new Select(driver.findElement(By.cssSelector("select[class='form-control']")));
		d.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-body']//a")));
		int j=0;
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='card-body']//a"));
		for(int i=0;i<options.size();i++)
		{
			options.get(i).getText().contains(allitems[j].toString());
			{
				j++;
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				if (j == allitems.length)
					break;
			}
			
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		driver.findElement(By.id("country")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[@class='checkbox checkbox-primary']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		
	}

}
