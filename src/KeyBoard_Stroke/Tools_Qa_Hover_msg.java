package KeyBoard_Stroke;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



public class Tools_Qa_Hover_msg
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Selenium\\\\\\\\Drivers\\\\\\\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("toolTipButton"));
		ele.click();
		String s=ele.getText();
		
	}
}
