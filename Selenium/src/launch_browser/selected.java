package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class selected 
{
		public static void main(String[] args) throws InterruptedException 
		{

			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/HP/Desktop/selected.html");
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.id("a1"));
			boolean b=ele.isSelected();
			if(b)
			{
				System.out.println("Element selected");
			}
			else
			{
				System.out.println("Element not selected");
			}
}
}