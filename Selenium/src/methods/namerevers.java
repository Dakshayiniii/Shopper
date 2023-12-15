package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class namerevers {
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/name.html");
		Thread.sleep(2000);
		List<WebElement> text= driver.findElements(By.xpath("//input"));
		int count=text.size();
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			WebElement we=text.get(i);
			 we.sendKeys("Dakshayini");
			 Thread.sleep(500);
			we.clear();
		}
}

}
