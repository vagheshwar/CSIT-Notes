import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkswithstatuscode {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.connect();
		int rescode=conn.getResponseCode();
		System.out.println(rescode);
		
		

	}

}
