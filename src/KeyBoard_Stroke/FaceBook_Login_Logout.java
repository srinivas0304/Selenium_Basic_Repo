package KeyBoard_Stroke;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook_Login_Logout 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		FileInputStream fs=new FileInputStream("C:\\Sql\\Section3\\facebook.PROPERTIES");
		Properties obj=new Properties();
		obj.load(fs);
		String url=obj.getProperty("url");
		String username=obj.getProperty("username");
		String password=obj.getProperty("password");
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password,Keys.ENTER);
	}
}


