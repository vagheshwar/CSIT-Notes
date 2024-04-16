import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("div[class='s-suggestion s-suggestion-ellipsis-direction'] span"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase(" 15 pro max"))
			{
		}
		   option.click();
		   break;
}
	}
	

	

}
