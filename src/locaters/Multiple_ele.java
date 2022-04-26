package locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_ele {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		List<WebElement> ele=driver.findElements(By.xpath("//div"));
		int count=0;
		for(WebElement i:ele) {
			String s=i.getText();
			count++;
			System.out.println(s);
		}
		System.out.println(count);
		
	}

}
