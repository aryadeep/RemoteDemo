package day01;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSeleniumCount {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriver driver=Helper.selectBrowser("Chrome");
		Helper.launchUrl("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
//		while (driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).isDisplayed()) 
//		{
//			driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
//			clickCheckBox();
//		}
		int count = driver.findElements(By.xpath("//*[contains(text(),'selenium')]")).size();
    //WebElement element = driver.findElement(By.tagName("body"));
    //element.getText().size();
	    //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//	for(WebElement ele:elements)
	
//		{
	//		if(ele.getText().equalsIgnoreCase("Selenium"))
		//	{
			//	count++;
			//}
		//}
		System.out.println(count);
		
	}
	}
		

