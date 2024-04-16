import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Eshwar vaghmare");
		driver.findElement(By.name("email")).sendKeys("vaghmaree@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Vaghmare123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement GenderDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select selectdropdown = new Select(GenderDropdown);
		Thread.sleep(3000);
		selectdropdown.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("13/02/1997");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
