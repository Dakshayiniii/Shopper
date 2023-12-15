package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class size 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement login_btn=driver.findElement(By.name("login"));
		Dimension size=login_btn.getSize();
		System.out.println(size);
		int h=size.getHeight();
		int w=size.getWidth();
		System.out.println(h+" "+w);
		Thread.sleep(2000);
		driver.quit();
}
}