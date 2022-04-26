package locaters;

import java.awt.List;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ro_Sharma_Mult {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\msedgedriver.exe");
	EdgeDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("Rohit Sharma");
	java.util.List<WebElement> ele=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li"));
	for(WebElement i:ele)
	{
		String s=i.getText();
		System.out.println(s);
	}
	}
}
