package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/textfield.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("Hii");
		//driver.findElement(By.id("a1")).sendKeys("Hii");
		//driver.findElement(By.name("n1")).sendKeys("Hii");
		driver.findElement(By.className("c1")).sendKeys("Hii");
		Thread.sleep(2000);
		driver.quit();
	}

}
