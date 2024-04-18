package rahulshettyacademy;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Mylearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("vaghmare");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("vijay");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Hyderabad,Telanagana-500008");
		driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("funnyvijay@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("8487881811");
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		driver.findElement(By.cssSelector("input[value='Cricket']")).click();
		WebElement language=driver.findElement(By.id("msdd"));
		language.click();
		WebElement selecthindi=driver.findElement(By.linkText("Hindi"));
		selecthindi.click();
		WebElement skills=driver.findElement(By.id("Skills"));
		Select Skillselect=new Select(skills);
		Skillselect.selectByVisibleText("Java");
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type='search']")).click();
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("input[type='search']")),"India").build().perform();

	}

}
