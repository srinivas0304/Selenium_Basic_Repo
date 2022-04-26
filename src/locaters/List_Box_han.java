package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box_han 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		//driver.findElement(By.id("empsearch_employee_status")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//option[text()='Full-Time Contract']")).click();
		WebElement ele=driver.findElement(By.id("empsearch_employee_status"));
		Select s=new Select(ele);
		//s.selectByVisibleText("Part-Time Contract");
		//s.selectByIndex(4);
		s.selectByValue("6");
	}
}
