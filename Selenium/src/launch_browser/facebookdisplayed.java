package launch_browser;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookdisplayed {


		public static void main(String[] args) throws InterruptedException 
		{

			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
			boolean b=ele.isDisplayed();
			if(b)
			{
				System.out.println("Element displayed");
				
			}
			else
			{
				System.out.println("Element not displayed");
			}
			
}
}