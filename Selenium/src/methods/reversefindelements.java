package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reversefindelements 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/check.html");
		Thread.sleep(2000);
		List<WebElement> check= driver.findElements(By.xpath("//input"));
		int count=check.size();
		System.out.println(count);
		
		for(int i=count-1;i>=0;i--)
		{
			WebElement we=check.get(i);
			 we.click();
			 Thread.sleep(500);
			
		}
}
}

