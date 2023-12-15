package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ascendingtreeset 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt =s.getOptions();
		TreeSet<String> t=new TreeSet<String>();
		int count=opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{ 
			String text=we.getText();
			t.add(text);
		}
		for(String l:t)
		{
			System.out.println(l);
		}
		driver.close();	
	}
}
