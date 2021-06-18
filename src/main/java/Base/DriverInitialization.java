package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialization 

{
	 
	 public WebDriver driver;

public WebDriver initialize() throws IOException
{
	
	Properties prop = new Properties();
	FileInputStream fs = new FileInputStream("C:\\Users\\Deepak Kumar Nayak\\eclipse-workspace\\Testing\\src\\main\\java\\Base\\data.properties");
	
	prop.load(fs);
	
	String Browser=prop.getProperty("Browser");
	
	System.out.println("The Browser is "+Browser);
	if (Browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak Kumar Nayak\\Desktop\\Automation Tutorial\\Selenium\\Selenium chrome driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	return driver;
}	


}
