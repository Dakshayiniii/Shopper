package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Map
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='off' and @placeholder='Choose starting point, or click on the map...' and @dir='ltr']")).sendKeys("Bangalore");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@autocomplete='off' and @dir='ltr' and @placeholder='Choose destination...']")).sendKeys("Murdeshwar");
        driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
