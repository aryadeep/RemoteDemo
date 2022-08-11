package day01;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BrokenLinks {
	
	
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	List<WebElement> links = driver.findElements(By.tagName("img"));
	for(int i=0;i<links.size();i++)
	{
		String attribute = links.get(i).getAttribute("src");
		BrokenLinkChecker.LinkChecker("attribute");
	}
	
	
	
	
}
	
	
	
}

