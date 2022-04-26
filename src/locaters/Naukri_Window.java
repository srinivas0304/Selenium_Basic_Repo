package locaters;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_Window 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\\\Selenium\\\\Drivers\\\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String mainId=driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		for(String i:allId)
		{
			if(!mainId.equals(i))
			{
				driver.switchTo().window(i);
				driver.close();
			}
		}
		driver.switchTo().window(mainId);
		WebElement ele=driver.findElement(By.xpath("(//div[text()='Services'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//div[text()='Services'])[1]/../..//div//ul[3]//li[6]")).click();
		//driver.navigate().to("https://www.naukri.com/learning/business-analytics-courses-certification-training-st583?utm_source=naukri&utm_medium=naukri_gnb&utm_content=naukri_gnb&utm_campaign=naukri_gnb_top&fftid=naukri_gnb");
		Set<String> child=driver.getWindowHandles();
		for(String s:child) 
		{
			if(!mainId.equals(s))
			{
				driver.switchTo().window(s);
			}
		}
		String s=driver.findElement(By.className("tags-container")).getText();
		System.out.println(s);
	}
}
