import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentnineseven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		String copytext = checkbox.getAttribute("value");
		System.out.println(copytext);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select copy = new Select(dropdown);
		copy.selectByValue(copytext);
		driver.findElement(By.id("name")).sendKeys(copytext);
		driver.findElement(By.id("confirmbtn")).click();
		String text = driver.switchTo().alert().getText();
		if (text.contains(copytext)) {
			System.out.println("Success");

		} else {
			System.out.println("fail");
		}

	}

}
