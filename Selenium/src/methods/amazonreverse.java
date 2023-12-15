package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonreverse
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	List<WebElement> image= driver.findElements(By.xpath("//img"));
	int count=image.size();
	System.out.println(count);
	for(WebElement w:image)
	{
		System.out.println(w.getAttribute("src"));
	}
	
}
}