package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_Hand {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("Rohit Sharma");
		ele.submit();
		Thread.sleep(2000);
		driver.findElement(By.id("gsr")).sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN);
	}

}
