package KeyBoard_Stroke;

import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook_Login 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Selenium\\\\\\\\Drivers\\\\\\\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
}
