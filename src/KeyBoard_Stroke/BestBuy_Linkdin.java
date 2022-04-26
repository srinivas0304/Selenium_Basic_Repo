package KeyBoard_Stroke;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class BestBuy_Linkdin 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Selenium\\\\\\\\Drivers\\\\\\\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//h4[text()='United States'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='container'])[2]/../../../../..//button")).click();
	}
}
