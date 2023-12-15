package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagramtitle
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.quit();
		String s2="Facebook page";
		if(s1.equals(s2))
		{
			System.out.println("title are matching");
		}
		else
		{
			System.out.println("title are not matching");
		}
		
		
		
		
		}
}