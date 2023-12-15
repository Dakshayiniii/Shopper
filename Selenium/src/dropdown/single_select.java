package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class single_select 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/singledropdown.html");
		Thread.sleep(2000);
	    WebElement drop_down = driver.findElement(By.xpath("//select[@id='city_dropdown']"));
        Select sel=new Select(drop_down);
        sel.selectByIndex(3);
        Thread.sleep(2000);
        sel.deselectAll();
	}
}