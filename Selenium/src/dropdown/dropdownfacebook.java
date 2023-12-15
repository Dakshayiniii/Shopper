package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownfacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
	    WebElement drop_down1 = driver.findElement(By.xpath("//select[@id='day']"));
	    WebElement drop_down2 = driver.findElement(By.xpath("//select[@id='month']"));
	    WebElement drop_down3 = driver.findElement(By.xpath("//select[@id='year']"));
	    Select sel1=new Select(drop_down1);
	    sel1.selectByValue("27");
        Thread.sleep(1000);
        Select sel2=new Select(drop_down2);
	    sel2.selectByValue("11");
        Thread.sleep(1000);
        Select sel3=new Select(drop_down3);
	    sel3.selectByVisibleText("2001");
        Thread.sleep(1000);
	}
	}

