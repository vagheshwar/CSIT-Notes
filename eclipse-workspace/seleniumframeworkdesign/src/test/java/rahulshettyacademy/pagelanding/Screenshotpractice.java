package rahulshettyacademy.pagelanding;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotpractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
        WebElement Element = driver.findElement(By.xpath("//input[@name='q']"));
        highlightElement(Element, driver);
        Thread.sleep(2000);
        takeScreenshot("GooglePage", driver);
        driver.quit();
    }

    public static void takeScreenshot(String fileName, WebDriver driver) throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("image location" + fileName + ".jpeg"));
    }

    public static void highlightElement(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '3px solid red'", element);

	}

}
