package day01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTextCount {
	static WebDriver driver;
	static int textCount=0;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
		clickCheckBox();
		while(driver.findElements(By.xpath("//span[@style='display:block;margin-left:53px']")).size()!=0) 
		{
		driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
		clickCheckBox();
		}
		System.out.println(textCount);
		}

	
		public static void clickCheckBox()
		{
		//int count = driver.findElements(By.xpath("//body/descendant::*[contains(text(),'Selenium') or contains(text(),'selenium')]")).size();
		List<WebElement> elements = driver.findElements(By.xpath("//body/descendant::*"));
		for(WebElement k:elements)
		{
			if(k.getText().equalsIgnoreCase("selenium"))
			{
				textCount++;
		//textCount=textCount+count;
			}
		}
}
}