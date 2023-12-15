package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class invocation {
@Test(invocationCount=3,priority = 1)
public void test1() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
}
@Test
public void test2() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
}
}


