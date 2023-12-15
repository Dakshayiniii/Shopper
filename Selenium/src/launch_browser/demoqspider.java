package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoqspider 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Hiiiiii");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("daks272gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("daj76578");
		driver.findElement(By.cssSelector("a[type='button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='/button']")).click();
		driver.findElement(By.cssSelector("button[id='btn']")).click();
		driver.findElement(By.cssSelector("button[id='btn2']")).click();
		driver.findElement(By.cssSelector("button[id='btn6']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='/link']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='/radio']")).click();
		driver.findElement(By.cssSelector("input[value='Upi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='wallet']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='/checkbox']")).click();
		driver.findElement(By.cssSelector("input[name='Domain']")).click();
		driver.findElement(By.cssSelector("input[id='mode2']")).click();
		driver.findElement(By.cssSelector("input[id='mode5']")).click();
		driver.close();
		Thread.sleep(2000);

	}

}
