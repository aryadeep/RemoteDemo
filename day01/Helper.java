package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	static WebDriver driver;
	public static WebDriver selectBrowser(String browser)
	{
		switch(browser)
		{
		case "Chrome":
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		case "Firefox":
		{
			WebDriverManager.firefoxdriver().setup();
	        driver=new FirefoxDriver();
			break;
		}
		case "Edge":
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
		default:
		{
			System.out.println("Browser not available");
		}
		}
		return driver;
		}
  public static void launchUrl(String url)
  {
	  driver.get(url);
	  driver.manage().window().maximize();
	  
  }
  
}
