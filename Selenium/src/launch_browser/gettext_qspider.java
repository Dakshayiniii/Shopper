package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettext_qspider 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/button");
		Thread.sleep(2000);
		driver.findElement(By.id("btn")).click();
		WebElement confirm_message=driver.findElement(By.xpath("//span[contains(text(),'You selected')]"));
		String text=confirm_message.getText();
		System.out.println(text);
		Thread.sleep(2000);
		if(text.equals("You selected\"yes\""))
		{
	     System.out.println("TC pass");
		}
		else
		{
		System.out.println("TC Fail");
		}
		driver.quit();
}
}