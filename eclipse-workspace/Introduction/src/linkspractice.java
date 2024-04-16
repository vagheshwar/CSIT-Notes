import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement coloumntab=driver.findElement(By.xpath("(//table//tbody//tr//td//ul)[1]"));
		coloumntab.findElements(By.tagName("a")).size();
		for(int i=1;i<coloumntab.findElements(By.tagName("a")).size();i++)
		{
			String linktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumntab.findElements(By.tagName("a")).get(i).sendKeys(linktab);
			Thread.sleep(5000);
		}
				Set<String> a=driver.getWindowHandles();
				Iterator<String> it=a.iterator();
				
				while(it.hasNext())
				{
					driver.switchTo().window(it.next());
					System.out.println(driver.getTitle());
				}
				
			}
		
		
		

	}


