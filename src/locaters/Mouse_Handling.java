package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Handling {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\new edge\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).submit();
		//WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement ele=driver.findElement(By.xpath("//b[text()='Admin']"));
		ele.click();
		WebElement ele12=driver.findElement(By.id("menu_admin_UserManagement"));
		Actions act1=new Actions(driver);
		act1.moveToElement(ele12).perform();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("(//a[@id='menu_admin_UserManagement']/../..//ul//li//a)[1]"));
		ele1.click();
		
	}

}
