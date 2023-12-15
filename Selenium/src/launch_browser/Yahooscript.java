package launch_browser;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Yahooscript
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='root_1']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[@href='/d/compose/']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[@target='_self' and @id='root_1']")).click();
		Thread.sleep(2000);	
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		
		//Thread.sleep(2000);
		driver.close();

	}
}
