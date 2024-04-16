import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcertificationpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
	    option.setAcceptInsecureCerts(true);
	    //option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://expired.badssl.com/");
	    System.out.println(driver.getTitle());
	    driver.manage().deleteAllCookies();
	    
	    

	}

}
