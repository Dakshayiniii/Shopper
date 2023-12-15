package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dummypage 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Desktop/dummypage.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//a[text()='yahoo']"));
	boolean b=ele.isDisplayed();
	if(b)
	{
		System.out.println("element displayed");
	}
	else
	{
		System.out.println("element not displayed");
	}
	
	WebElement ele1=driver.findElement(By.id("a1"));
	boolean a=ele.isEnabled();
	if(a)
	{
		System.out.println("element enabled");
	}
	else
	{
		System.out.println("element disabled");
	}
}
}