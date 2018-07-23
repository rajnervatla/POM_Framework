package BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	  static WebDriver driver;
	
	public static  WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Tasks\\Selenium Soft\\geckodriver-v0.11.1-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			
			driver=new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver() ;
		}
		
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
