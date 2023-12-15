package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URLTITE 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.Instagram.com");
		Thread.sleep(2000);
		//String title = driver.getTitle();
		//System.out.println(title);
		//String url=driver.getCurrentUrl();
	    //System.out.println(url);
	    String src=driver.getPageSource();
	    System.out.println(src);
	    
	    
	}
}
