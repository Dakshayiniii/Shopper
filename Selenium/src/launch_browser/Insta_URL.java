package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta_URL 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String u1=driver.getCurrentUrl();
		System.out.println(u1);
		driver.quit();
		String u2="https://www.facebook.com/";
		if(u1.equals(u2))
		{
			System.out.println("title are matching");
		}
		else
		{
			System.out.println("title are not matching");
		}
		
		
}
}