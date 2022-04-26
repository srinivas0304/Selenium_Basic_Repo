package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Selenium\\\\Drivers\\\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("addlasrinivas459@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sri@99025");
		driver.findElement(By.name("login")).click();
	}
}
