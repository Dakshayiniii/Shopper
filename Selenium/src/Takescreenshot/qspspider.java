package Takescreenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class qspspider {

	public static void main(String[] args) throws  AWTException, IOException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/search?client=firefox-b-d&q=qspiders+course");
		
		driver.findElement(By.xpath("//h3[.='Courses']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement details=driver.findElement(By.xpath("//p[text()='API Testing']"));
		Point loc=details.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x+" "+y);
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		WebElement ele=driver.findElement(By.xpath("(//span[text()='Details'])[6]"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allwh=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(allwh);
		String we=l.get(1);
		driver.switchTo().window(we);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
	    WebElement post= driver.findElement(By.xpath("//p[class='card-header-title has-text-persian'][3]"));		
	    Point tool=post.getLocation();
	    int x1=tool.getX();
	    int y1=tool.getY();
	    js1.executeScript("window.scrollBy("+x1+","+y1+")");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\TakesScreenshot\\act1.jpeg");
		FileHandler.copy(src, dst);
	
		driver.close();

		
	}

}
