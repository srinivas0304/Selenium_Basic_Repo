package locaters;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class High_Ra {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("high radius");
		List <WebElement> ele=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li"));
		for(WebElement i:ele)
		{
			String s=i.getText();
			System.out.println(s);
		}
	}

}
