package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fontsize_cssvalue 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
		String font_size=text.getCssValue("font-size");
		System.out.println(font_size);
		Thread.sleep(2000);
		driver.quit();
}
}