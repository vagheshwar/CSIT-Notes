import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//header/div/button[1]")).getText();
		WebElement Staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(Staticdropdown);
		Thread.sleep(3000);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Option2");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("option1");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		

	}

}
