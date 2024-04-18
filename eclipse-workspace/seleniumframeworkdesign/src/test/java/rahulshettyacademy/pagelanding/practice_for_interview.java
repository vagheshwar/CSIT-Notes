package rahulshettyacademy.pagelanding;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class practice_for_interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String pageTitle=driver.getTitle();
		Assert.assertEquals("Google", pageTitle);
		
		

	}

}
