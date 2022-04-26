package KeyBoard_Stroke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pnr_Status 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("inputPnrNo")).sendKeys("4423178319");
		driver.findElement(By.xpath("(//input[@value='Submit'])[3]")).click();
		
	}
}
