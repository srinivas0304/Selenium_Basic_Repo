package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Selenium\\\\Drivers\\\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		String s1=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 128 GB)']")).getText();
		System.out.println(s1);
		Thread.sleep(2000);
		String s=driver.findElement(By.xpath("(//div[text()='APPLE iPhone 12 (Blue, 128 GB)']/../..//div//div//div//div)[1]")).getText();
		System.out.println(s);
		String s2=driver.findElement(By.xpath("(//div[text()='APPLE iPhone 12 (Blue, 128 GB)']/..//div//span[2]//span//span)[1]")).getText();
		System.out.println(s2);	
	}
}
