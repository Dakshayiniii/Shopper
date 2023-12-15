package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getlocation_facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement help=driver.findElement(By.xpath("//a[text()='Help']"));
		Point loc=help.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x+" "+y);
		driver.quit();
	}
}
