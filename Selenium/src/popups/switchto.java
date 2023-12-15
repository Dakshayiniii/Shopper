package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class switchto 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele3=driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele4=driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele5=driver.findElement(By.xpath("//span[text()='Blog']"));
      
        ArrayList<WebElement> l=new ArrayList<WebElement>();
        l.add(ele1);
        l.add(ele2);
        l.add(ele3);
        l.add(ele4);
        l.add(ele5);
        for(WebElement wh:l)
        {
        	Actions act =new Actions(driver);
        	act.contextClick(wh).perform();
        	Robot  r=new Robot();
        	r.keyPress(KeyEvent.VK_T);
        	r.keyRelease(KeyEvent.VK_T);
        }
        Set<String> allwh=driver.getWindowHandles();
        ArrayList<String> a=new ArrayList<String>(allwh);
        String w=a.get(3);
        driver.switchTo().window(w);

}
}