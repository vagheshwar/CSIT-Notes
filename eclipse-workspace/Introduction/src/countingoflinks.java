import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countingoflinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerlink=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerlink.findElements(By.tagName("a")).size());
		WebElement coloumntab=driver.findElement(By.xpath("(//table//tbody//tr//td//ul)[1]"));
		System.out.println(coloumntab.findElements(By.tagName("a")).size());
		
		for(int i=1;i<coloumntab.findElements(By.tagName("a")).size();i++)
		{
			String clickontab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumntab.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			Thread.sleep(5000);
		}
				Set<String> abc=driver.getWindowHandles();
				Iterator<String> it=abc.iterator();
			
				while (it.hasNext())
				{
					driver.switchTo().window(it.next());
					System.out.println(driver.getTitle());
				
				
			}
		}
		
		

	}


