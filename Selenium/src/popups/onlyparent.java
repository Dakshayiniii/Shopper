package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class onlyparent 
{

		public static void main(String[] args) throws InterruptedException 
		{

			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(2000);
			driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(2000);
			String p_id=driver.getWindowHandle();
			Set<String> allwh=driver.getWindowHandles();
			for(String wh:allwh)
			{
				driver.switchTo().window(wh);
				System.out.println(driver.getTitle());
				if(wh.equals(p_id))
				{
				driver.close();
			}	

			}
		}
}


