import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtocartPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] Listofitems = { "Brocolli", "Cucumber", "Beetroot" };
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{
			String[] name = products.get(i).getText().split("-");
			String formatedname = name[0].trim();

			List<String> itemsNeededList = Arrays.asList(Listofitems);
			if (itemsNeededList.contains(formatedname))

			{

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == Listofitems.length)
				{

					break;
				}

			}

		}

	}
}
