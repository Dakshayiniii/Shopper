package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class facegoo 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("dakshayini",Keys.TAB+"12334",Keys.ENTER);
		
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_T);
	    Set<String> allwh=driver.getWindowHandles();
	    ArrayList<String> l=new ArrayList<String>(allwh);
	    String wh=l.get(1);
	    driver.switchTo().window(wh);
	    
		
		
}
}