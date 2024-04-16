import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[text='Hyderabad (HYD)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hrefIncAdt")).click();
		
		for(int i=1;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement option = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown=new Select(option);
		Dropdown.selectByVisibleText("USD");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
		//Thread.sleep(3000);
		
		
	}

}
