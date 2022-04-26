package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Id_Locater {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\Selenium\\\\Drivers\\\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();		
	}
}
