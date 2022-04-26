package KeyBoard_Stroke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Rohit 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\new edge\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Rohit Sharma");
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//ul"));
		for(WebElement i:ele) {
			//System.out.println(i.getText());
			Thread.sleep(1000);
			try{
		         i.click();
		      }
		      catch(StaleElementReferenceException e)
			{
		    	  String s=i.getText();
			         if(s.contains("ipl")) {
					i.click();
	
		         
			}
	}
	}
}
}
