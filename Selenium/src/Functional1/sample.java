package Functional1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {
	@Test(priority=1)
	public void Test1() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> links= driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);
		for(WebElement w:links)
		{
			System.out.println(w.getAttribute("href"));
		}
		
}

	
	@Test
	public void Test2() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> image= driver.findElements(By.xpath("//img"));
		int count=image.size();
		System.out.println(count);
		for(WebElement w:image)
		{
			System.out.println(w.getAttribute("src"));
		}
		
	}

	}
