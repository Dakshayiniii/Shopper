package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooookkk {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("C:/Users/HP/Desktop/facebook.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("2024")).click();
		
		
	}

}
