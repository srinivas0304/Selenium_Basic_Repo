package locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Rohit_S {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Selenium\\\\Drivers\\\\new edge\\\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Rohit Sharma");
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//ul"));
		for(WebElement i:ele) {
				String s=i.getText();
				if(s.contains("age")) 
				{
					i.click();
				}
		}
	}
}
